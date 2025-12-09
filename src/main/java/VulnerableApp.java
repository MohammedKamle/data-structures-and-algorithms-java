/**
 * WARNING: This file contains intentionally insecure Java code.
 * It is ONLY for testing security scanners like JFrog Xray.
 * DO NOT USE IN PRODUCTION.
 */

import java.io.*;
import java.net.*;
import java.security.MessageDigest;
import java.sql.*;
import java.util.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

public class VulnerableApp {

    // ---- HARD-CODED SECRETS ----
    private static final String DB_PASSWORD = "SuperSecret123!";
    private static final String API_KEY = "API-KEY-1234567890";
    private static final String JWT_SECRET = "myjwtsecretkey";

    // ---- OUTDATED CRYPTO ----
    public static String weakHash(String input) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5"); // Weak hashing
        return Base64.getEncoder().encodeToString(md.digest(input.getBytes()));
    }

    // ---- SQL INJECTION EXAMPLE ----
    public static void getUser(Connection conn, String username) throws Exception {
        // UNSAFE: direct string concatenation
        String query = "SELECT * FROM users WHERE username = '" + username + "'";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            System.out.println("User: " + rs.getString("username"));
        }
    }

    // ---- COMMAND INJECTION EXAMPLE ----
    public static void runPing(String host) throws Exception {
        // UNSAFE: attacker-controlled input
        String command = "ping -c 3 " + host;
        Process p = Runtime.getRuntime().exec(command);

        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }

    // ---- PATH TRAVERSAL ----
    public static void readFile(String filename) throws Exception {
        File file = new File("./uploads/" + filename); // No sanitization
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String text;
        while ((text = reader.readLine()) != null) {
            System.out.println(text);
        }
    }

    // ---- INSECURE DESERIALIZATION ----
    public static void deserialize(byte[] data) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
        Object obj = ois.readObject(); // Unsafe: gadget attacks possible
        System.out.println("Deserialized: " + obj);
    }

    // ---- INSECURE NETWORK CALL ----
    public static void insecureHttpCall() throws Exception {
        URL url = new URL("http://example.com"); // No HTTPS
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
    }

    // ---- BAD KEY MANAGEMENT ----
    public static String weakEncryption(String text) throws Exception {
        String key = "1234567812345678"; // Hardcoded AES key (weak)
        Cipher cipher = Cipher.getInstance("AES");
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        return Base64.getEncoder().encodeToString(cipher.doFinal(text.getBytes()));
    }

    // ---- MAIN METHOD ----
    public static void main(String[] args) {
        try {
            System.out.println("Running vulnerable Java application...");

            weakHash("hello");
            weakEncryption("secret");

            // Simulate insecure actions
            runPing("google.com");
            readFile("../../../etc/passwd");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

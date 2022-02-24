import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JSONReader {

    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            FileReader fileReader = new FileReader("src/test/java/test-data/employee.json");
            Object obj = parser.parse(fileReader);
            System.out.println(obj);

            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);

            System.out.println(jsonObject.get("address"));

            JSONArray jsonArray = (JSONArray) jsonObject.get("address");

            System.out.println(jsonArray);

            JSONObject jsonObject1 = (JSONObject) jsonArray.get(0);
            System.out.println(jsonObject1);

            System.out.println(jsonObject1.get("city"));

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}


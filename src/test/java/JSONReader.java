import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class JSONReader {

    public static final void meth(){
        JSONParser parser = new JSONParser();
        try {
            FileReader fileReader = new FileReader("");
            Object obj = parser.parse(fileReader);
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("");
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            FileReader file = new FileReader("src/test/java/test-data/employee.json");
            Object obj = parser.parse(file);
            //System.out.println(obj);
//
            JSONObject jsonObject = (JSONObject) obj;
          //  System.out.println(jsonObject);

      //     System.out.println(jsonObject.get("address"));
//
            JSONArray jsonArray = (JSONArray) jsonObject.get("address");

          //  System.out.println(jsonArray);
//
            JSONObject jsonObject1 = (JSONObject) jsonArray.get(0);
            System.out.println(jsonObject1);
//
//            System.out.println(jsonObject1.get("city"));

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}


import java.util.HashMap;
import java.util.Map;
import net.sf.json.JSONObject;
public class Test {
     public static void main(String[] args) {
         String json = "{name:reiz}";
         JSONObject jsonObj = JSONObject.fromObject(json);
         String name = jsonObj.getString("name");
         jsonObj.put("initial", name.substring(0, 1).toUpperCase());
         String[] likes = new String[] { "JavaScript", "Skiing", "Apple Pie" };
         jsonObj.put("likes", likes);
         Map <String, String> ingredients = new HashMap <String, String>();
         ingredients.put("apples", "3kg");
         ingredients.put("sugar", "1kg");
         ingredients.put("pastry", "2.4kg");
         ingredients.put("bestEaten", "outdoors");
         jsonObj.put("ingredients",ingredients);
         System.out.println(jsonObj);
     }
} 
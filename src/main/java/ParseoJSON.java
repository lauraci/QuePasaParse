import org.json.JSONArray;
import org.json.JSONObject;

public class ParseoJSON {
    static String json = "\n" +
            "{\n" +
            "    \"pageInfo\": {\n" +
            "            \"pageName\": \"Homepage\",\n" +
            "            \"logo\": \"https://www.example.com/logo.jpg\"\n" +
            "    },\n" +
            "    \"posts\": [\n" +
            "            {\n" +
            "                \"post_id\": \"0123456789\",\n" +
            "                \"actor_id\": \"1001\",\n" +
            "                \"author_name\": \"Jane Doe\",\n" +
            "                \"post_title\": \"How to parse JSON in Java\",\n" +
            "                \"comments\": '[\"Esto es un primer cometario\", \"Y esto un segundo\"]',\n" +
            "                \"time_of_post\": \"1234567890\"\n" +
            "            }\n" +
            "    ]\n" +
            "}";
    public static void main(String[] args) {
        JSONObject obj = new JSONObject(json);
        String pageName = obj.getJSONObject("pageInfo").getString("pageName");

        System.out.println(pageName);

        JSONArray arr = obj.getJSONArray("posts");
        for (int i = 0; i < arr.length(); i++) {
            String post_id = arr.getJSONObject(i).getString("post_id");
            String comentario = arr.getJSONObject(i).getString("comments");
            System.out.println(post_id+" --> "+comentario);
        }
    }
}

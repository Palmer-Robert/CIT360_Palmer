package json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJSON {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		obj.put("name", "Robert");
		obj.put("Location", "Show Low");
		obj.put("state", "AZ");
		
		JSONArray list = new JSONArray();
		list.add("CCNA");
		list.add("CCIE");
		list.add("CCNP");
		
		obj.put("Certifications", list);
		
		System.out.println(list);
		System.out.println(obj);
		
	}
}

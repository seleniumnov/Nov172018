package generalTestCase;

import java.util.HashMap;
import java.util.Map;

public class MapConcept {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();

		map.put("01", "Suresh");
		map.put("02", "Yogi");
		map.put("03", "hari");
		map.put("03", "Lakshmi");
		map.put("01", "Anusha");

		System.out.println(map.get("03"));

		String name = map.get("01");

		System.out.println(name);

	}

}

package codingBat;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
	public Map<String, Integer> word0(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < strings.length; i++) {
			map.put(strings[i], 0);
		}
		return map;
	}

	public Map<String, Integer> wordLen(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < strings.length; i++) {
			map.put(strings[i], strings[i].length());
		}
		return map;
	}

	public Map<String, String> pairs(String[] strings) {
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < strings.length; i++) {
			map.put(strings[i].charAt(0) + "", strings[i].substring(strings[i].length() - 1));
		}
		return map;
	}

	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < strings.length; i++) {
			if (map.containsKey(strings[i])) {
				int count = map.get(strings[i]) + 1;
				map.put(strings[i], count);
			} else {
				map.put(strings[i], 1);
			}
		}
		return map;
	}
}

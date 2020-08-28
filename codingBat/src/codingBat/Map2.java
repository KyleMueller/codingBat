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

	public Map<String, String> firstChar(String[] strings) {
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < strings.length; i++) {
			if (map.containsKey(strings[i].charAt(0) + "")) {
				map.put(strings[i].charAt(0) + "", map.get(strings[i].charAt(0) + "") + strings[i]);
			} else {
				map.put(strings[i].charAt(0) + "", strings[i]);
			}
		}
		return map;
	}

	public String wordAppend(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String ret = "";
		for (int i = 0; i < strings.length; i++) {
			if (map.containsKey(strings[i])) {
				map.put(strings[i], map.get(strings[i]) + 1);
				if (map.get(strings[i]) % 2 == 0) {
					ret = ret + strings[i];
				}
			} else {
				map.put(strings[i], 1);
			}
		}
		return ret;
	}

	public Map<String, Boolean> wordMultiple(String[] strings) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		for (int i = 0; i < strings.length; i++) {
			if (map.containsKey(strings[i])) {
				map.put(strings[i], true);
			} else {
				map.put(strings[i], false);
			}
		}
		return map;
	}

	public String[] allSwap(String[] strings) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].length() > 0) {
				if (map.containsKey(strings[i].charAt(0))) {
					int tempInd = map.get(strings[i].charAt(0));
					String temp = strings[tempInd];
					strings[tempInd] = strings[i];
					strings[i] = temp;
					map.remove(strings[i].charAt(0));
				} else {
					map.put(strings[i].charAt(0), i);
				}
			}
		}
		return strings;
	}

	public String[] firstSwap(String[] strings) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].length() > 0) {
				if (map.containsKey(strings[i].charAt(0))) {
					int tempInd = map.get(strings[i].charAt(0));
					if (tempInd == -1) {
						continue;
					}
					String temp = strings[tempInd];
					strings[tempInd] = strings[i];
					strings[i] = temp;
					map.put(strings[i].charAt(0), -1);
				} else {
					map.put(strings[i].charAt(0), i);
				}
			}
		}
		return strings;
	}
}

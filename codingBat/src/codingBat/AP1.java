package codingBat;

import java.util.ArrayList;

public class AP1 {
	public boolean scoresIncreasing(int[] scores) {
		for (int i = 0; i < scores.length - 1; i++) {
			if (scores[i] > scores[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public boolean scores100(int[] scores) {
		for (int i = 0; i < scores.length - 1; i++) {
			if (scores[i] == scores[i + 1] && scores[i] == 100) {
				return true;
			}
		}
		return false;
	}

	public boolean scoresClump(int[] scores) {
		for (int i = 0; i < scores.length - 2; i++) {
			if (Math.abs(scores[i] - scores[i + 2]) <= 2) {
				return true;
			}
		}
		return false;
	}

	public int scoresAverage(int[] scores) {
		int half = scores.length / 2;
		int fr = 0;
		int sc = 0;
		for (int i = 0; i < scores.length; i++) {
			if (i < half) {
				fr = fr + scores[i];
			} else {
				sc = sc + scores[i];
			}
		}
		int large = Math.max(fr, sc);
		return large / half;
	}

	public int wordsCount(String[] words, int len) {
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() == len) {
				count++;
			}
		}
		return count;
	}

	public String[] wordsFront(String[] words, int n) {
		String[] ret = new String[n];
		for (int i = 0; i < n; i++) {
			ret[i] = words[i];
		}
		return ret;
	}

	public ArrayList<String> wordsWithoutList(String[] words, int len) {
		ArrayList<String> ret = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() != len) {
				ret.add(words[i]);
			}
		}
		return ret;
	}

	public boolean hasOne(int n) {
		while (n > 0) {
			if (n % 10 == 1) {
				return true;
			}
			if (n < 10) {
				break;
			}
			n = n / 10;
		}
		return false;
	}

	public boolean dividesSelf(int n) {
		int temp = n;
		while (true) {
			if (temp % 10 == 0) {
				return false;
			}
			if (n % (temp % 10) != 0) {
				return false;
			}
			if (temp < 10) {
				break;
			}
			temp = temp / 10;
		}
		return true;
	}

	public int[] copyEvens(int[] nums, int count) {
		int[] ret = new int[count];
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				ret[j] = nums[i];
				j++;
				if (j == count) {
					break;
				}
			}
		}
		return ret;
	}

	public int[] copyEndy(int[] nums, int count) {
		int j = 0;
		int[] ret = new int[count];
		for (int i = 0; i < nums.length; i++) {
			if (isEndy(nums[i])) {
				ret[j] = nums[i];
				j++;
				if (j == count) {
					break;
				}
			}
		}
		return ret;
	}

	public boolean isEndy(int n) {
		if (n >= 90 && n <= 100) {
			return true;
		}
		if (n >= 0 && n <= 10) {
			return true;
		}
		return false;
	}

	public int matchUp(String[] a, String[] b) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			char as = '-';
			char bs = '_';
			if (a[i].length() != 0) {
				as = a[i].charAt(0);
			}
			if (b[i].length() != 0) {
				bs = b[i].charAt(0);
			}
			if (as == bs) {
				count++;
			}
		}
		return count;
	}

	public int scoreUp(String[] key, String[] answers) {
		int score = 0;
		for (int i = 0; i < key.length; i++) {
			if (answers[i].equals("?")) {
				continue;
			} else if (answers[i].equals(key[i])) {
				score = score + 4;
			} else {
				score = score - 1;
			}
		}
		return score;
	}

	public String[] wordsWithout(String[] words, String target) {
		int len = words.length;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(target)) {
				len = len - 1;
			}
		}
		String[] ret = new String[len];
		int j = 0;
		for (int i = 0; i < words.length; i++) {
			if (!words[i].equals(target)) {
				ret[j] = words[i];
				j++;
			}
		}
		return ret;
	}

	public int scoresSpecial(int[] a, int[] b) {
		int alar = 0;
		int blar = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 10 == 0) {
				alar = Math.max(alar, a[i]);
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] % 10 == 0) {
				blar = Math.max(blar, b[i]);
			}
		}
		return alar + blar;
	}

	public int sumHeights(int[] heights, int start, int end) {
		int sum = 0;
		for (int i = start; i < end; i++) {
			sum = sum + Math.abs(heights[i] - heights[i + 1]);
		}
		return sum;
	}

	public int sumHeights2(int[] heights, int start, int end) {
		int sum = 0;
		for (int i = start; i < end; i++) {
			if (heights[i + 1] > heights[i]) {
				sum = sum + 2 * Math.abs(heights[i] - heights[i + 1]);
			} else {
				sum = sum + Math.abs(heights[i] - heights[i + 1]);
			}
		}
		return sum;
	}

	public int bigHeights(int[] heights, int start, int end) {
		int count = 0;
		for (int i = start; i < end; i++) {
			if (Math.abs(heights[i] - heights[i + 1]) >= 5) {
				count++;
			}
		}
		return count;
	}

	public int userCompare(String aName, int aId, String bName, int bId) {
		if (aName.equals(bName)) {
			if (aId < bId) {
				return -1;
			} else if (bId < aId) {
				return 1;
			} else {
				return 0;
			}
		}
		if (aName.compareTo(bName) >= 1) {
			return 1;
		} else {
			return -1;
		}
	}

	public String[] mergeTwo(String[] a, String[] b, int n) {
		String[] ret = new String[n];
		int ain = 0;
		int bin = 0;
		for (int i = 0; i < n; i++) {
			if (a[ain].equals(b[bin])) {
				ret[i] = a[ain];
				bin++;
				ain++;
				continue;
			}
			if (a[ain].compareTo(b[bin]) < 0) {
				ret[i] = a[ain];
				ain++;
			} else {
				ret[i] = b[bin];
				bin++;
			}

		}
		return ret;
	}

	public int commonTwo(String[] a, String[] b) {
		int ain = 0;
		int bin = 0;
		int count = 0;
		while (true) {
			if (a[ain].compareTo(b[bin]) < 0) {
				ain++;
			} else if (b[bin].compareTo(a[ain]) < 0) {
				bin++;
			} else if (a[ain].equals(b[bin])) {
				boolean flag = true;
				for (int i = 0; i < bin; i++) {
					if (b[i].equals(b[bin])) {
						flag = false;
						break;
					}
				}
				if (flag) {
					count++;
				}
				ain++;
				bin++;
			}
			if (ain == a.length || bin == b.length) {
				break;
			}
		}
		return count;
	}
}

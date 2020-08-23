package codingBat;

public class Recursion1 {
	public int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public int bunnyEars(int bunnies) {
		if (bunnies == 0) {
			return 0;
		}
		if (bunnies == 1) {
			return 2;
		}
		return 2 + bunnyEars(bunnies - 1);
	}

	public int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public int bunnyEars2(int bunnies) {
		if (bunnies == 0) {
			return 0;
		}
		if (bunnies % 2 == 0) {
			return 3 + bunnyEars2(bunnies - 1);
		} else {
			return 2 + bunnyEars2(bunnies - 1);
		}
	}

	public int triangle(int rows) {
		if (rows == 0) {
			return 0;
		}
		if (rows == 1) {
			return 1;
		}
		return rows + triangle(rows - 1);
	}

	public int sumDigits(int n) {
		if (n < 10) {
			return n;
		}
		return (n % 10) + sumDigits(n / 10);
	}

	public int count7(int n) {
		if (n == 7) {
			return 1;
		} else if (n < 10) {
			return 0;
		}
		if (n % 10 == 7) {
			return 1 + count7(n / 10);
		} else {
			return count7(n / 10);
		}
	}

	public int count8(int n) {
		if (n < 10) {
			if (n == 8) {
				return 1;
			}
			return 0;
		}
		if (n % 100 == 88) {
			return 2 + count8(n / 10);
		} else if (n % 10 == 8) {
			return 1 + count8(n / 10);
		} else {
			return count8(n / 10);
		}
	}

	public int powerN(int base, int n) {
		if (n == 1) {
			return base;
		}
		return base * powerN(base, n - 1);
	}

	public int countX(String str) {
		if (str.length() == 0) {
			return 0;
		}
		if (str.length() == 1) {
			if (str.equals("x")) {
				return 1;
			} else {
				return 0;
			}
		}
		if (str.charAt(0) == 'x') {
			return 1 + countX(str.substring(1));
		} else {
			return countX(str.substring(1));
		}
	}

	public int countHi(String str) {
		if (str.length() < 2) {
			return 0;
		}
		if (str.equals("hi")) {
			return 1;
		}
		if (str.substring(0, 2).equals("hi")) {
			return 1 + countHi(str.substring(2));
		} else {
			return countHi(str.substring(1));
		}
	}

	public String changeXY(String str) {
		if (str.length() == 0) {
			return "";
		}
		if (str.length() == 1) {
			if (str.equals("x")) {
				return "y";
			}
			return str;
		}
		if (str.charAt(0) == 'x') {
			return "y" + changeXY(str.substring(1));
		}
		return str.charAt(0) + changeXY(str.substring(1));
	}

	public String changePi(String str) {
		if (str.length() < 2) {
			return str;
		}
		if (str.equals("pi")) {
			return "3.14";
		}
		if (str.substring(0, 2).equals("pi")) {
			return "3.14" + changePi(str.substring(2));
		}
		return str.charAt(0) + changePi(str.substring(1));
	}

	public String noX(String str) {
		if (str.length() == 0) {
			return str;
		}
		if (str.equals("x")) {
			return "";
		}
		if (str.length() == 1) {
			return str;
		}
		if (str.charAt(0) == 'x') {
			return noX(str.substring(1));
		}
		return str.charAt(0) + noX(str.substring(1));
	}

	public boolean array6(int[] nums, int index) {
		if (index == nums.length) {
			return false;
		}
		if (nums[index] == 6) {
			return true;
		}
		if (array6(nums, index + 1)) {
			return true;
		}
		return false;
	}

	public int array11(int[] nums, int index) {
		if (index == nums.length) {
			return 0;
		}
		if (nums[index] == 11) {
			return 1 + array11(nums, index + 1);
		}
		return array11(nums, index + 1);
	}

	public boolean array220(int[] nums, int index) {
		if (index >= nums.length - 1) {
			return false;
		}
		if (nums[index] * 10 == nums[index + 1]) {
			return true;
		}
		return array220(nums, index + 1);
	}

	public String allStar(String str) {
		if (str.length() <= 1) {
			return str;
		}
		return str.charAt(0) + "*" + allStar(str.substring(1));
	}

	public String pairStar(String str) {
		if (str.length() <= 1) {
			return str;
		}
		if (str.charAt(0) == str.charAt(1)) {
			return str.charAt(0) + "*" + pairStar(str.substring(1));
		}
		return str.charAt(0) + pairStar(str.substring(1));
	}

	public String endX(String str) {
		if (str.length() <= 1) {
			return str;
		}
		if (str.charAt(0) == 'x') {
			return endX(str.substring(1)) + "x";
		}
		return str.charAt(0) + endX(str.substring(1));
	}

	public int countPairs(String str) {
		if (str.length() < 3) {
			return 0;
		}
		if (str.charAt(0) == str.charAt(2)) {
			return 1 + countPairs(str.substring(1));
		}
		return 0 + countPairs(str.substring(1));
	}
}

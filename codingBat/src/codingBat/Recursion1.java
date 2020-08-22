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

	public String endX(String str) {
		if (str.length() <= 1) {
			return str;
		}
		if (str.charAt(0) == 'x') {
			return endX(str.substring(1)) + "x";
		}
		return str.charAt(0) + endX(str.substring(1));
	}
}

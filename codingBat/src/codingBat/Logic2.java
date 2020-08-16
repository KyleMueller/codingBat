package codingBat;

public class Logic2 {
	public boolean makeBricks(int small, int big, int goal) {
		if (small + 5 * big < goal) {
			return false;
		}
		if (goal > big * 5) {
			goal = goal - (big * 5);
			if (goal > small) {
				return false;
			}
			return true;
		}
		for (int i = 0; i <= small; i++) {
			for (int j = 0; j <= big; j++) {
				if (5 * j + i == goal) {
					return true;
				}
			}
		}
		return false;
	}

	public int loneSum(int a, int b, int c) {
		if (a == b && b == c) {
			return 0;
		}
		if (a == b) {
			return c;
		}
		if (a == c) {
			return b;
		}
		if (b == c) {
			return a;
		}
		return a + b + c;
	}

	public int luckySum(int a, int b, int c) {
		int sum = 0;
		if (a != 13) {
			sum = sum + a;
		} else {
			return 0;
		}
		if (b != 13) {
			sum = sum + b;
		} else {
			return sum;
		}
		if (c == 13) {
			return sum;
		}
		return sum + c;
	}

	public int noTeenSum(int a, int b, int c) {
		return fixTeen(a) + fixTeen(b) + fixTeen(c);
	}

	public int fixTeen(int a) {
		if (a == 15 || a == 16) {
			return a;
		}
		if (a <= 19 && a >= 13) {
			return 0;
		}
		return a;
	}

	public int roundSum(int a, int b, int c) {
		return round10(a) + round10(b) + round10(c);
	}

	public int round10(int a) {
		if (a % 10 >= 5) {
			return a - a % 10 + 10;
		}
		return a - a % 10;
	}

	public boolean closeFar(int a, int b, int c) {
		if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) {
			return true;
		}
		if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2) {
			return true;
		}
		return false;
	}

	public int blackjack(int a, int b) {
		if (a > 21) {
			a = 0;
		}
		if (b > 21) {
			b = 0;
		}
		return Math.max(a, b);
	}

	public boolean evenlySpaced(int a, int b, int c) {
		int small = Math.min(a, Math.min(b, c));
		int big = Math.max(a, Math.max(b, c));
		if ((small + big) % 2 == 0) {
			int med = (small + big) / 2;
			if (med == a || med == b || med == c) {
				return true;
			}
		}
		return false;
	}

	public int makeChocolate(int small, int big, int goal) {
		if (goal > big * 5 + small) {
			return -1;
		}
		if (big * 5 >= goal) {
			goal = goal % 5;
			if (goal > small) {
				return -1;
			}
			return goal;
		} else {
			goal = goal - (big * 5);
			if (goal > small) {
				return -1;
			}
			return goal;
		}
	}

}

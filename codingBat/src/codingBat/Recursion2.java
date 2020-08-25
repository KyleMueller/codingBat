package codingBat;

public class Recursion2 {
	public boolean groupSum(int start, int[] nums, int target) {
		if (target == 0) {
			return true;
		}
		if (start < nums.length) {
			if (target == 0) {
				return true;
			}
			if (groupSum(start + 1, nums, target - nums[start]) || groupSum(start + 1, nums, target)) {
				return true;
			}
		}
		return false;
	}

	public boolean groupSum6(int start, int[] nums, int target) {
		if (start >= nums.length) {
			if (target == 0) {
				return true;
			}
			return false;
		}
		if (groupSum6(start + 1, nums, target - nums[start])) {
			return true;
		}
		if (nums[start] == 6) {
			if (groupSum6(start + 1, nums, target - nums[start]) != true) {
				return false;
			} else {
				return true;
			}
		} else {
			return (groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start + 1, nums, target));
		}
	}

	public boolean groupNoAdj(int start, int[] nums, int target) {
		if (start >= nums.length) {
			if (target == 0) {
				return true;
			}
			return false;
		}
		if (groupNoAdj(start + 1, nums, target)) {
			// not adding current
			return true;
		}
		if (groupNoAdj(start + 2, nums, target - nums[start])) {
			// added, skips next
			return true;
		}
		return false;
	}

	public boolean groupSum5(int start, int[] nums, int target) {
		if (start >= nums.length) {
			if (target == 0) {
				return true;
			}
			return false;
		}
		if (nums[start] % 5 == 0) {
			return groupSum5(start + 1, nums, target - nums[start]);
		}
		if (nums[start] == 1) {
			if (start > 0 && nums[start - 1] % 5 == 0) {
				return groupSum5(start + 1, nums, target);
			} else {
				return (groupSum5(start + 1, nums, target) || groupSum5(start + 1, nums, target - nums[start]));
			}
		}
		return (groupSum5(start + 1, nums, target) || groupSum5(start + 1, nums, target - nums[start]));
	}

	public boolean groupSumClump(int start, int[] nums, int target) {
		if (start >= nums.length) {
			if (target == 0) {
				return true;
			}
			return false;
		}
		int count = 1;
		if (start < nums.length - 1) {
			while (nums[start + count] == nums[start]) {
				count++;
				if (start + count == nums.length) {
					break;
				}
			}
		}
		return (groupSumClump(start + count, nums, target)
				|| groupSumClump(start + count, nums, target - (count * nums[start])));
	}

	public boolean splitArray(int[] nums) {
		return splitArray(0, nums, 0);
	}

	public boolean splitArray(int start, int[] nums, int target) {
		if (start >= nums.length) {
			if (target == 0) {
				return true;
			}
			return false;
		}
		return (splitArray(start + 1, nums, target + nums[start]) || splitArray(start + 1, nums, target - nums[start]));
	}

	public boolean splitOdd10(int[] nums) {
		return splitOdd10(0, nums, 0, 0);
	}

	public boolean splitOdd10(int i, int[] nums, int left, int right) {
		if (i >= nums.length) {
			if (left % 10 == 0 && right % 2 == 1) {
				return true;
			}
			return false;
		}
		return (splitOdd10(i + 1, nums, left + nums[i], right) || splitOdd10(i + 1, nums, left, right + nums[i]));
	}

	public boolean split53(int[] nums) {
		return split53(0, nums, 0, 0);
	}

	public boolean split53(int i, int[] nums, int fives, int threes) {
		if (i >= nums.length) {
			if (fives == threes) {
				return true;
			}
			return false;
		}
		if (nums[i] % 5 == 0) {
			return split53(i + 1, nums, fives + nums[i], threes);
		}
		if (nums[i] % 3 == 0) {
			return split53(i + 1, nums, fives, threes + nums[i]);
		}
		return (split53(i + 1, nums, fives + nums[i], threes) || split53(i + 1, nums, fives, threes + nums[i]));
	}
}

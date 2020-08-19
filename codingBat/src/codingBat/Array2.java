package codingBat;

public class Array2 {
	public int countEvens(int[] nums) {
		  int count = 0;
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i]%2 == 0){
		      count++;
		    }
		  }
		  return count;
		}
	public int bigDiff(int[] nums) {
		  int max = nums[0];
		  int min = nums[0];
		  for(int i = 0; i < nums.length; i++){
		    max = Math.max(nums[i],max);
		    min = Math.min(nums[i],min);
		  }
		  return max - min;
		}
	public int centeredAverage(int[] nums) {
		  int max = nums[0];
		  int min = nums[0];
		  int sum = 0;
		  for(int i = 0; i < nums.length; i++){
		    max = Math.max(max,nums[i]);
		    min = Math.min(min,nums[i]);
		    sum = sum + nums[i];
		  }
		  sum = sum - min - max;
		  return sum / (nums.length - 2);
		}
	public int sum13(int[] nums) {
		  int sum = 0;
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i] != 13){
		      sum = sum + nums[i];
		    } else{
		      i++;
		    }
		  }
		  return sum;
		}
	public int sum67(int[] nums) {
		  int sum = 0;
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i] != 6){
		      sum = sum + nums[i];
		    } else{
		      for(int j = i + 1; j < nums.length; j++){
		        if(nums[j] == 7){
		          i = j;
		          break;
		        }
		      }
		    }
		  }
		  return sum;
		}
	public boolean has22(int[] nums) {
		  for(int i = 0; i < nums.length - 1; i++){
		    if(nums[i] == 2 && nums[i+1] == 2){
		      return true;
		    }
		  }
		  return false;
		}
	public boolean lucky13(int[] nums) {
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i] == 1 || nums[i] == 3){
		      return false;
		    }
		  }
		  return true;
		}
	public boolean sum28(int[] nums) {
		  int count = 0;
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i] == 2){
		      count++;
		    }
		  }
		  if(count == 4){
		    return true;
		  }
		  return false;
		}
	public boolean more14(int[] nums) {
		  int count1 = 0;
		  int count4 = 0;
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i] == 1){
		      count1++;
		    } else if(nums[i] == 4){
		      count4++;
		    }
		  }
		  if(count1 > count4){
		    return true;
		  }
		  return false;
		}
	public int[] fizzArray(int n) {
		  int[] ret = new int[n];
		  for(int i = 0; i < n; i++){
		    ret[i] = i;
		  }
		  return ret;
		}
	public boolean only14(int[] nums) {
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i] == 1 || nums[i] == 4){
		      continue;
		    } else{
		      return false;
		    }
		  }
		  return true;
		}
	public String[] fizzArray2(int n) {
		  String[] ret = new String[n];
		  for(int i = 0; i < n; i++){
		    ret[i] = i + "";
		  }
		  return ret;
		}
	public boolean no14(int[] nums) {
		  boolean has1 = false;
		  boolean has4 = false;
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i] == 1){
		      has1 = true;
		    } else if(nums[i] == 4){
		      has4 = true;
		    }
		  }
		  if(!has1 || !has4){
		    return true;
		  }
		  return false;
		}
	public boolean isEverywhere(int[] nums, int val) {
		  if(nums.length < 2){
		    return true;
		  }
		  for(int i = 0; i < nums.length; i = i + 1){
		    int a;
		    int b;
		    if(i + 1 < nums.length){
		      a = nums[i];
		      b = nums[i+1];
		    } else{
		      a = nums[i - 1];
		      b = nums[i];
		    }
		    if(a == val || b == val){
		      continue;
		    } else{
		      return false;
		    }
		  }
		  return true;
		}
	public boolean either24(int[] nums) {
		  boolean b224 = false;
		  boolean b44 = false;
		  for(int i = 0; i < nums.length - 1; i++){
		    if(nums[i] == 2){
		      if(nums[i+1] == 2 || nums[i+1] == 4){
		        b224 = true;
		      }
		    }
		    else if(nums[i] == 4){
		      if(nums[i+1] == 4){
		        b44 = true;
		      }
		    }
		  }
		  if(b224 && b44){
		    return false;
		  }
		  if(b224 || b44){
		    return true;
		  }
		  return false;
		}
	public int matchUp(int[] nums1, int[] nums2) {
		  int count = 0;
		  for(int i = 0; i < nums1.length; i++){
		    int dif = Math.abs(nums1[i] - nums2[i]);
		    if(dif <= 2 && dif != 0){
		      count++;
		    }
		  }
		  return count;
		}
	public boolean has77(int[] nums) {
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i] == 7){
		      if(i + 1 < nums.length){
		        if(nums[i+1] == 7){
		          return true;
		        }
		      }
		      if(i+2 < nums.length){
		        if(nums[i+2] == 7){
		          return true;
		        }
		      }
		    }
		  }
		  return false;
		}
	public boolean has12(int[] nums) {
		  boolean has1 = false;
		  boolean has2 = false;
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i] == 1){
		      has1 = true;
		    }
		    if(nums[i] == 2 && has1){
		      has2 = true;
		    }
		  }
		  if(has2){
		    return true;
		  }
		  return false;
		}
	public boolean modThree(int[] nums) {
		  int oddCount = 0;
		  int evenCount = 0;
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i] % 2 == 0){
		      oddCount = 0;
		      evenCount++;
		    } else{
		      evenCount = 0;
		      oddCount++;
		    }
		    if(oddCount == 3 || evenCount == 3){
		      return true;
		    }
		  }
		  return false;
		}
	public boolean haveThree(int[] nums) {
		  int treCount = 0;
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i] == 3){
		      treCount++;
		      if(i+1 < nums.length && nums[i+1] == 3){
		        return false;
		      }
		    }
		  }
		  if(treCount == 3){
		    return true;
		  }
		  return false;
		}
	public boolean twoTwo(int[] nums) {
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i] == 2){
		      if(i - 1 > 0 && nums[i-1] == 2){
		        continue;
		      }
		      if(i+1 < nums.length && nums[i+1] == 2){
		        i++;
		      } else{
		        return false;
		      }
		    }
		  }
		  return true;
		}
	public boolean sameEnds(int[] nums, int len) {
		  int[] a = new int[len];
		  int[] b = new int[len];
		  for(int i = 0; i < len; i++){
		    a[i] = nums[i];
		  }
		  int j = 0;
		  for(int i = nums.length - len; i < nums.length; i++){
		    b[j] = nums[i];
		    j++;
		  }
		  for(int i = 0; i < len; i++){
		    if(a[i] != b[i]){
		      return false;
		    }
		  }
		  return true;
		}
	public boolean tripleUp(int[] nums) {
		  for(int i = 0; i < nums.length - 2; i++){
		    if(nums[i] +1 == nums[i+1] && nums[i+1] + 1 == nums[i+2]){
		      return true;
		    }
		  }
		  return false;
		}
	public int[] fizzArray3(int start, int end) {
		  int[] ret = new int[end - start];
		  int j = 0;
		  for(int i = start; i < end; i++){
		    ret[j] = i;
		    j++;
		  }
		  return ret;
		}
	public int[] shiftLeft(int[] nums) {
		  if(nums.length == 0){
		    return nums;
		  }
		  int temp = nums[0];
		  for(int i = 0; i < nums.length -1; i++){
		    nums[i] = nums[i+1];
		  }
		  nums[nums.length -1] = temp;
		  return nums;
		}
	public int[] tenRun(int[] nums) {
		  boolean tenF = false;
		  int currMult = 0;
		  for(int i = 0; i < nums.length; i++){
		    if(tenF){
		      if(nums[i]%10 == 0){
		        currMult = nums[i];
		      } else{
		        nums[i] = currMult;
		      }
		    } else if(nums[i]%10 == 0){
		      tenF = true;
		      currMult = nums[i];
		    }
		  }
		  return nums;
		}
	public int[] pre4(int[] nums) {
		  int count = 0;
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i] == 4){
		      break;
		    }
		    count++;
		  }
		  int[] ret = new int[count];
		  for(int i = 0; i < count; i++){
		    ret[i] = nums[i];
		  }
		  return ret;
		}
	public int[] post4(int[] nums) {
		  int fourInd = 0;
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i] == 4){
		      fourInd = i;
		    }
		  }
		  int[] ret = new int[nums.length - fourInd - 1];
		  int j = 0;
		  for(int i = fourInd + 1; i < nums.length; i++){
		    ret[j] = nums[i];
		    j++;
		  }
		  return ret;
		}
	public int[] notAlone(int[] nums, int val) {
		  for(int i = 1; i < nums.length - 1; i++){
		    if(nums[i] == val && nums[i-1] != val && nums[i+1] != val){
		      if(i > 0 && i < nums.length - 1){
		        nums[i] = Math.max(nums[i-1],nums[i+1]);
		      }
		    }
		  }
		  return nums;
		}
	public int[] zeroFront(int[] nums) {
		  int zeroCount = 0;
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i] == 0){
		      zeroCount++;
		    }
		  }
		  int[] ret = new int[nums.length];
		  for(int i = zeroCount; i < nums.length; i++){
		    for(int k = 0; k < nums.length; k++){
		      if(nums[k] != 0){
		        ret[i] = nums[k];
		        nums[k] = 0;
		        break;
		      }
		    }
		  }
		  return ret;
		}
	public int[] withoutTen(int[] nums) {
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i] == 10){
		      for(int j = i; j < nums.length - 1; j++){
		        nums[j] = nums[j+1];
		      }
		      nums[nums.length-1] = 0;
		      i--;
		    }
		  }
		  return nums;
		}
	public int[] zeroMax(int[] nums) {
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i] == 0){
		      int maxOdd = 0;
		      for(int j = i + 1; j < nums.length; j++){
		        if(nums[j]%2 == 1){
		          maxOdd = Math.max(nums[j], maxOdd);
		        }
		      }
		      nums[i] = maxOdd;
		    }
		  }
		  return nums;
		}
	public int[] evenOdd(int[] nums) {
		  int[] ret = new int[nums.length];
		  int j = 0;
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i]%2 == 0){
		      ret[j] = nums[i];
		      j++;
		    }
		  }
		    for(int i = 0; i < nums.length; i++){
		    if(nums[i]%2 == 1){
		      ret[j] = nums[i];
		      j++;
		    }
		  }
		  return ret;
		}
	public String[] fizzBuzz(int start, int end) {
		  String[] ret = new String[end - start];
		  int j = 0;
		  for(int i = start; i < end; i++){
		    String retS = "";
		    if(i%3 == 0){
		      retS = "Fizz";
		    }
		    if(i%5 == 0){
		      retS = retS + "Buzz";
		    }
		    if(retS.length() == 0){
		      ret[j] = i + "";
		    } else{
		      ret[j] = retS;
		    }
		    j++;
		  }
		  return ret;
		}
}

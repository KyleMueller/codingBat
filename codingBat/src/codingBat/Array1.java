package codingBat;

public class Array1 {
	public boolean firstLast6(int[] nums) {
		  if(nums[0] == 6 || nums[nums.length -1] == 6){
		    return true;
		  }
		  return false;
		}
	public boolean sameFirstLast(int[] nums) {
		  if(nums.length < 1){
		    return false;
		  }
		  if(nums[0] == nums[nums.length -1]){
		    return true;
		  }
		  return false;
		}
	public int[] makePi() {
		  int[] pi = {3,1,4};
		  return pi;
		}
	public boolean commonEnd(int[] a, int[] b) {
		  if(a[0] == b[0]){
		    return true;
		  }
		  if(a[a.length -1] == b[b.length-1]){
		    return true;
		  }
		  return false;
		}
	public int sum3(int[] nums) {
		  int sum = 0;
		  for(int i = 0; i < nums.length; i++){
		    sum = sum + nums[i];
		  }
		  return sum;
		}
	public int[] rotateLeft3(int[] nums) {
		  int temp = nums[0];
		  nums[0] = nums[1];
		  nums[1] = nums[2];
		  nums[2] = temp;
		  return nums;
		}
	public int[] reverse3(int[] nums) {
		  int[] ret = new int[nums.length];
		  int j = 0;
		  for(int i = nums.length-1; i >= 0; i--){
		    ret[j] = nums[i];
		    j++;
		  }
		  return ret;
		}
	public int[] maxEnd3(int[] nums) {
		  int max;
		  if(nums[0] > nums[nums.length-1]){
		    max = nums[0];
		  }else{
		    max = nums[nums.length-1];
		  }
		  for(int i = 0; i < nums.length; i++){
		    nums[i] = max;
		  }
		  return nums;
		}
	public int sum2(int[] nums) {
		  int sum = 0;
		  for(int i = 0; i < nums.length; i++){
		    sum = sum + nums[i];
		    if(i == 1){
		      break;
		    }
		  }
		  return sum;
		}
	public int[] middleWay(int[] a, int[] b) {
		  int[] ret = new int[2];
		  ret[0] = a[1];
		  ret[1] = b[1];
		  return ret;
		}
	public int[] makeEnds(int[] nums) {
		  int[] ret = new int[2];
		  ret[0] = nums[0];
		  ret[1] = nums[nums.length -1];
		  return ret;
		}
	public boolean has23(int[] nums) {
		  for(int i = 0; i < 2; i++){
		    if(nums[i] == 2 || nums[i] == 3){
		      return true;
		    }
		  }
		  return false;
		}
	public boolean no23(int[] nums) {
		  for(int i = 0; i < 2; i++){
		    if(nums[i] == 2 || nums[i] == 3){
		      return false;
		    }
		  }
		  return true;
		}
	public int[] makeLast(int[] nums) {
		  int[] ret = new int[nums.length * 2];
		  ret[ret.length-1] = nums[nums.length-1];
		  return ret;
		}
	public boolean double23(int[] nums) {
		  if(nums.length < 2){
		    return false;
		  }
		  if(nums[0] == 2 || nums[0] == 3){
		    if(nums[0] == nums[1]){
		      return true;
		    }
		  }
		  return false;
		}
	public int[] fix23(int[] nums) {
		  for(int i = 0; i < nums.length -1 ;i++){
		    if(nums[i] == 2 && nums[i+1] == 3){
		      nums[i+1] = 0;
		    }
		  }
		  return nums;
		}
	public int start1(int[] a, int[] b) {
		  int ret = 0;
		  if(a.length >= 1){
		    if(a[0] == 1){
		      ret++;
		    }
		  }
		  if(b.length >= 1){
		    if(b[0] == 1){
		      ret++;
		    }
		  }
		  return ret;
		}
	public int[] biggerTwo(int[] a, int[] b) {
		  int sumA = 0;
		  int sumB = 0;
		  for(int i = 0; i < 2; i++){
		    sumA += a[i];
		    sumB += b[i];
		  }
		  if(sumA >= sumB){
		    return a;
		  }
		  return b;
		}
	public int[] makeMiddle(int[] nums) {
		  int half = nums.length/2;
		  int[] ret = new int[2];
		  ret[0] = nums[half -1];
		  ret[1] = nums[half];
		  return ret;
		}
	public int[] plusTwo(int[] a, int[] b) {
		  int[] ret = {a[0],a[1],b[0],b[1]};
		  return ret;
		}
	public int[] swapEnds(int[] nums) {
		  int temp = nums[0];
		  nums[0] = nums[nums.length - 1];
		  nums[nums.length-1] = temp;
		  return nums;
		}
	public int[] midThree(int[] nums) {
		  int half = nums.length/2;
		  int[] ret = {nums[half-1],nums[half],nums[half +1]};
		  return ret;
		}
	public int maxTriple(int[] nums) {
		  int fir = nums[0];
		  int la = nums[nums.length-1];
		  int mid = nums[nums.length/2];
		  return Math.max(fir,Math.max(la,mid));
		}
	public int[] frontPiece(int[] nums) {
		  if(nums.length <= 2){
		    return nums;
		  }
		  int[] ret = {nums[0],nums[1]};
		  return ret;
		}
	public boolean unlucky1(int[] nums) {
		  if(nums.length < 2){
		    return false;
		  }
		  for(int i = 0; i < nums.length-1; i++){
		    if(nums[i] == 1 && nums[i+1] == 3){
		      return true;
		    }
		    if(i == 1){
		      break;
		    }
		  }
		  if(nums[nums.length-2] == 1 && nums[nums.length-1] == 3){
		    return true;
		  }
		  return false;
		}
	public int[] make2(int[] a, int[] b) {
		  int[] ret = new int[2];
		  int j = 0;
		  for(int i = 0; i < a.length; i++){
		    ret[j] = a[i];
		    j++;
		    if(j == 2){
		      break;
		    }
		  }
		  int k = 0;
		  while(j < 2){
		    ret[j] = b[k];
		    j++;
		    k++;
		  }
		  return ret;
		}
	public int[] front11(int[] a, int[] b) {
		  int len = 2;
		  if(a.length == 0){
		    len--;
		  }
		  if(b.length == 0){
		    len--;
		  }
		  int[] ret = new int[len];
		  int k = 0;
		  if(a.length != 0){
		    ret[k]= a[0];
		    k++;
		  }
		  if(b.length != 0){
		    ret[k] = b[0];
		  }
		  return ret;
		}
}

package codingBat;

public class Warmup2 {
	public String stringTimes(String str, int n) {
		  String ret = "";
		  for(int i = 0; i < n; i++){
		    ret = ret + str;
		  }
		  return ret;
		}
	public String frontTimes(String str, int n) {
		  String start = "";
		  if(str.length() <= 3){
		    start = str;
		  } else{
		    start = str.substring(0,3);
		  }
		  String ret = "";
		  for(int i = 0; i < n; i++){
		    ret = ret + start;
		  }
		  return ret;
		}
	int countXX(String str) {
		  int exs = 0;
		  for(int i = 0; i < str.length()-1; i++){
		    if(str.substring(i, i+2).equals("xx")){
		      exs++;
		    }
		  }
		  return exs;
		}
	boolean doubleX(String str) {
		  for(int i = 0; i < str.length()-1; i++){
		    if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x'){
		      return true;
		    }
		    else if (str.charAt(i) == 'x'){
		      return false;
		    }
		  }
		  return false;
		}
	public String stringBits(String str) {
		  String ret = "";
		  for(int i = 0; i < str.length(); i = i + 2){
		    ret = ret + str.charAt(i);
		  }
		  return ret;
		}
	public String stringSplosion(String str) {
		  String ret = "";
		  for(int i = 0; i < str.length(); i++){
		    ret = ret + str.substring(0,i + 1);
		  }
		  return ret;
		}
	public int last2(String str) {
		  if(str.length() <= 2){
		    return 0;
		  }
		  String last = str.substring(str.length()-2);
		  int count = 0;
		  for(int i = 0; i < str.length() -2; i++){
		    if(str.substring(i, i + 2).equals(last)){
		      count++;
		    }
		  }
		  return count;
		}
	public int arrayCount9(int[] nums) {
		  int count = 0;
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i] == 9){
		      count++;
		    }
		  }
		  return count;
		}
	public boolean arrayFront9(int[] nums) {
		  for(int i = 0; i < nums.length && i <= 3; i++){
		    if(nums[i] == 9){
		      return true;
		    }
		  }
		  return false;
		}
	public boolean array123(int[] nums) {
		  if(nums.length < 3){
		    return false;
		  }
		  for(int i = 0; i < nums.length - 2; i++){
		    if(nums[i] == 1 && nums[i+1] == 2
		        && nums[i+2] == 3){
		          return true;
		        }
		  }
		  return false;
		}
	public int stringMatch(String a, String b) {
		  int shortest = Math.min(a.length(),b.length());
		  int count = 0;
		  for(int i = 0; i < shortest -1; i++){
		    if(a.charAt(i) == b.charAt(i) && 
		        a.charAt(i+1) == b.charAt(i+1)){
		          count++;
		        }
		  }
		  return count;
		}
	public String stringX(String str) {
		  String ret = "";
		  for(int i = 0; i < str.length(); i++){
		    if(i == 0 || i == str.length() -1){
		      ret = ret + str.charAt(i);
		    }
		    else if(str.charAt(i) != 'x'){
		      ret = ret + str.charAt(i);
		    }
		  }
		  return ret;
		}
	public String altPairs(String str) {
		  String ret = "";
		  for(int i = 0; i < str.length(); i = i + 4){
		    ret = ret + str.charAt(i);
		    if(i + 1 < str.length()){
		      ret = ret + str.charAt(i + 1);
		    }
		  }
		  return ret;
		}
	public String stringYak(String str) {
		  String ret = "";
		  for(int i = 0; i < str.length(); i++){
		    if((i +2 < str.length()) && 
		        (str.charAt(i) == 'y' && str.charAt(i+2) == 'k')){
		      i = i + 2;
		    }
		    else{
		      ret = ret+ str.charAt(i);
		    }
		  }
		  return ret;
		}
	public int array667(int[] nums) {
		  int count = 0;
		  for(int i = 0; i < nums.length-1;i++){
		    if(nums[i] == 6){
		      if(nums[i+1] == 6 || nums[i+1] == 7){
		        count++;
		      }
		    }
		  }
		  return count;
		}
	public boolean noTriples(int[] nums) {
		  for(int i = 0; i < nums.length; i++){
		    int count = 0;
		    for(int j = i; j < nums.length; j++){
		      if(nums[i] == nums[j]){
		        count++;
		      } else{
		        break;
		      }
		    }
		    if(count >= 3){
		      return false;
		    }
		  }
		  return true;
		}
	public boolean has271(int[] nums) {
		  for(int i = 0; i < nums.length-2;i++){
		    int fir = nums[i];
		    if(nums[i+1] == fir + 5){
		      if(Math.abs(nums[i+2] - (fir-1)) <= 2){
		        return true;
		      }
		    }
		  }
		  return false;
		}
}

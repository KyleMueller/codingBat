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
}

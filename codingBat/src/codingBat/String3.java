package codingBat;

public class String3 {
	public int countYZ(String str) {
		  str = str.toLowerCase();
		  for(int i = 0; i < str.length(); i++){
		    if(!Character.isLetter(str.charAt(i))){
		      if(i < str.length() - 1){
		        str = str.substring(0,i) + " " + str.substring(i+1);
		      } else{
		        str = str.substring(0,i) + " ";
		      }
		    }
		  }
		  int count = 0;
		  for(int i = 0; i < str.length(); i++){
		    if(i == str.length() -1){
		      if(str.charAt(i) == 'y' || str.charAt(i) == 'z'){
		        count++;
		      }
		    } else {
		      if(str.charAt(i+1) == ' '){
		        if(str.charAt(i) == 'y' || str.charAt(i) == 'z'){
		          count++;
		        }
		      }
		    }
		  }
		  return count;
		}
	public String withoutString(String base, String remove) {
		  for(int i = 0; i <= base.length() - remove.length(); i++){
		    if(base.equals(remove)){
		      return "";
		    }
		    if(base.length() < remove.length()){
		      break;
		    }
		    if(base.substring(i,i+ remove.length()).equalsIgnoreCase(remove)){
		      if(i == 0){
		        base = base.substring(i+ remove.length());
		        i = -1;
		      } else{
		        base = base.substring(0,i) + base.substring(i + remove.length());
		        i = -1;
		      }
		    }
		  }
		  return base;
		}
	public boolean equalIsNot(String str) {
		  int isC = 0;
		  int notC = 0;
		  for(int i = 0; i < str.length(); i++){
		    if(i + 2 < str.length() && str.substring(i,i+3).equals("not")){
		      notC++;
		    }
		    if(i + 1 < str.length() && str.substring(i,i+2).equals("is")){
		      isC++;
		    }
		  }
		  if(isC == notC){
		    return true;
		  }
		  return false;
		}
	public boolean gHappy(String str) {
		  if(str.equals("g")){
		    return false;
		  }
		  for(int i = 0; i < str.length(); i++){
		    if(str.charAt(i) == 'g'){
		      if(i == 0 && i+1 < str.length()){
		        if(str.charAt(i+1) != 'g'){
		          return false;
		        }
		      } else if(i == str.length() - 1 && i > 0){
		        if(str.charAt(i-1) != 'g'){
		          return false;
		        }
		      } else {
		        if(str.charAt(i-1) == 'g' || str.charAt(i+1) == 'g'){
		          continue;
		        }
		        return false;
		      }
		    }
		  }
		  return true;
		}
	public int countTriple(String str) {
		  int count = 0;
		  for(int i = 0; i < str.length() - 2; i++){
		    if(str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2)){
		      count++;
		    }
		  }
		  return count;
		}
	public int sumDigits(String str) {
		  int sum = 0;
		  for(int i = 0; i < str.length(); i++){
		    if(Character.isDigit(str.charAt(i))){
		      sum = sum + Integer.parseInt(str.charAt(i) + "");
		    }
		  }
		  return sum;
		}
	public String sameEnds(String str) {
		  String ret = "";
		  for(int i = 1; i < str.length()/ 2 + 1; i++){
		    if(str.substring(0,i).equals(str.substring(str.length()-i))){
		      ret = str.substring(0,i);
		    }
		  }
		  return ret;
		}
	public String mirrorEnds(String string) {
		  String ret = "";
		  for(int i = 0; i < string.length(); i++){
		    if(string.charAt(i) == string.charAt(string.length() - i -1)){
		      ret = ret + string.charAt(i);
		    } else{
		      break;
		    }
		  }
		  return ret;
		}
	public int maxBlock(String str) {
		  if(str.length() == 0){
		    return 0;
		  }
		  if(str.length() == 1){
		    return 1;
		  }
		  int lrun = 1;
		  int crun = 1;
		  for(int i = 0; i < str.length()-1; i++){
		    if(str.charAt(i) == str.charAt(i+1)){
		      crun++;
		    } else{
		      crun = 1;
		    }
		    lrun = Math.max(lrun,crun);
		  }
		  return lrun;
		}
	public int sumNumbers(String str) {
		  String ret = "";
		  for(int i = 0; i < str.length(); i++){
		    if(Character.isDigit(str.charAt(i))){
		      ret = ret + str.charAt(i);
		    } else{
		      ret = ret + " ";
		    }
		  }
		  String[] strNums = ret.split("\\s+");
		  int sum = 0;
		  for(int i = 0; i < strNums.length; i++){
		    if(strNums[i].equals("")){
		      continue;
		    }
		    sum = sum + Integer.parseInt(strNums[i]);
		  }
		  return sum;
		}
	public String notReplace(String str) {
		  String ret = "";
		  for(int i = 0; i < str.length(); i++){
		    if(i + 1 < str.length()){
		      if(str.substring(i,i+2).equals("is")){
		        if(isIsIsolated(str,i)){
		          ret = ret + "is not";
		          i++;
		          continue;
		        }
		      }
		    }
		    ret = ret + str.charAt(i);
		  }
		  return ret;
		}
		public boolean isIsIsolated(String str, int ind){
		  if(ind == 0){
		    if(str.length() == 2){
		      return true;
		    }
		    if(!Character.isLetter(str.charAt(2))){
		      return true;
		    }
		    return false;
		  }
		  if(ind + 1 == str.length() -1){
		    if(!Character.isLetter(str.charAt(ind-1))){
		      return true;
		    }
		    return false;
		  }
		  if(!Character.isLetter(str.charAt(ind-1)) && 
		    !Character.isLetter(str.charAt(ind+2))){
		    return true;
		  }

		  return false;
		}
}

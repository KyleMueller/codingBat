package codingBat;

public class String2 {
	public String doubleChar(String str) {
		  String ret = "";
		  for(int i = 0; i < str.length(); i++){
		    ret = ret + str.charAt(i) + str.charAt(i);
		  }
		  return ret;
		}
	public int countHi(String str) {
		  int count = 0;
		  for(int i = 0; i < str.length() - 1; i++){
		    if(str.charAt(i) == 'h'){
		      if(str.charAt(i+1) == 'i'){
		        count++;
		      }
		    }
		  }
		  return count;
		}
	public boolean catDog(String str) {
		  int cats = 0;
		  int dogs = 0;
		  for(int i = 0; i < str.length() - 2; i++){
		    if(str.substring(i, i + 3).equals("cat")){
		      cats++;
		    }
		    if(str.substring(i, i + 3).equals("dog")){
		      dogs++;
		    }
		  }
		  if(cats == dogs){
		    return true;
		  }
		  return false;
		}
	public int countCode(String str) {
		  int count = 0;
		  for(int i = 0; i < str.length() - 3; i++){
		    if(str.substring(i,i+2).equals("co") && str.charAt(i+3) == 'e'){
		      count++;
		    }
		  }
		  return count;
		}
	public boolean endOther(String a, String b) {
		  a = a.toLowerCase();
		  b = b.toLowerCase();
		  if(a.equals(b)){
		    return true;
		  }
		  if(a.length() >= b.length()){
		    if(a.substring(a.length()-b.length()).equals(b)){
		      return true;
		    }
		  }
		  else{
		    if(b.substring(b.length()-a.length()).equals(a)){
		      return true;
		    }
		  }
		  return false;
		}
	public boolean xyzThere(String str) {
		  for(int i = 0; i < str.length() - 2; i++){
		    if(str.substring(i,i+3).equals("xyz")){
		      if(i == 0 || str.charAt(i-1) != '.'){
		        return true;
		      }
		    }
		  }
		  return false;
		}
	public boolean bobThere(String str) {
		  for(int i = 0; i < str.length() - 2; i++){
		    if(str.charAt(i) == 'b' && str.charAt(i+2) == 'b'){
		      return true;
		    }
		  }
		  return false;
		}
	public boolean xyBalance(String str) {
		  int lasty = -1;
		  int lastx = -1;
		  for(int i = 0; i < str.length(); i++){
		    if(str.charAt(i) == 'x'){
		      lastx = i;
		    }
		    if(str.charAt(i) == 'y'){
		      lasty = i;
		    }
		  }
		  if(lasty >= lastx){
		    return true;
		  }
		  return false;
		}
	public String mixString(String a, String b) {
		  String ret = "";
		  while(a.length() != 0 || b.length() != 0){
		    if(a.length() == 1){
		      ret = ret + a;
		      a = "";
		    }
		    else if(a.length() > 1){
		      ret = ret + a.charAt(0);
		      a = a.substring(1);
		    }
		    if(b.length() == 1){
		      ret = ret + b;
		      b = "";
		    }
		    else if(b.length() > 1){
		      ret = ret + b.charAt(0);
		      b = b.substring(1);
		    }
		  }
		  return ret;
		}
	public String repeatEnd(String str, int n) {
		  String en = str.substring(str.length() - n);
		  String ret = "";
		  for(int i = 1; i <= n; i++){
		    ret = ret + en;
		  }
		  return ret;
		}
	public String repeatFront(String str, int n) {
		  str = str.substring(0,n);
		  String ret = "";
		  while(str.length() > 1){
		    ret = ret + str;
		    str = str.substring(0,str.length()-1);
		  }
		  ret = ret + str;
		  return ret;
		}
	public boolean prefixAgain(String str, int n) {
		  String pre = str.substring(0,n);
		  if(n == 1){
		    for(int i = 1; i < str.length(); i++){
		      if(pre.equals(str.charAt(i) + "")){
		        return true;
		      }
		    }
		  }
		  for(int i = 1; i < str.length()- n; i++){
		    if(str.substring(i,i+n).equals(pre)){
		      return true;
		    }
		  }
		  return false;
		}
	public boolean xyzMiddle(String str) {
		  for(int i = 0; i <= str.length()-3; i++){
		    if(str.substring(i, i+3).equals("xyz")){
		      int left = i;
		      int right = str.length() - (i+3);
		      if(Math.abs(left-right) < 2){
		        return true;
		      }
		    }
		  }
		  return false;
		}
	public String getSandwich(String str) {
		  int count = 0;
		  int frBreEnd = 0;
		  int scBreSt = 0;
		  for(int i = 0; i < str.length() - 4; i++){
		    if(str.substring(i,i+5).equals("bread")){
		      count++;
		      if(count == 1){
		        frBreEnd = i+5;
		      } else if(count >= 2){
		        scBreSt = i;
		      }
		    }
		  }
		  if(count < 2){
		    return "";
		  }
		  return str.substring(frBreEnd,scBreSt);
		}
	public boolean sameStarChar(String str) {
		  for(int i = 1; i < str.length() - 1; i++){
		    if(str.charAt(i) == '*'){
		      if(str.charAt(i-1) != str.charAt(i+1)){
		        return false;
		      }
		    }
		  }
		  return true;
		}
	public String oneTwo(String str) {
		  String ret = "";
		  for(int i = 2; i < str.length(); i = i + 3){
		    ret = ret + str.charAt(i-1) + str.charAt(i) + str.charAt(i - 2);
		  }
		  return ret;
		}
	public String zipZap(String str) {
		  String ret = "";
		  for(int i = 0; i < str.length(); i++){
		    ret = ret + str.charAt(i);
		    if(i  < str.length() - 2){
		      if(str.charAt(i) == 'z' && str.charAt(i+2) == 'p'){
		        i++;
		      }
		    }
		  }
		  return ret;
		}
	public String starOut(String str) {
		  String ret = "";
		  for(int i = 0; i < str.length(); i++){
		    if(i == str.length() - 1 && i > 0){
		      if(str.charAt(i) != '*' && str.charAt(i-1) != '*'){
		        ret = ret + str.charAt(i);
		        continue;
		      }
		    }
		    if(str.charAt(i) == '*'){
		      continue;
		    }
		    if(i == 0 && str.length() == 1 && str.charAt(i) != '*'){
		      return str;
		    }
		    if(i == 0 && str.charAt(i) != '*' && str.charAt(i + 1) != '*'){
		      ret = ret + str.charAt(i);
		      continue;
		    }
		    if(i != 0 && i != str.length() - 1 && str.charAt(i) != '*' && 
		      str.charAt(i-1) != '*' 
		      && str.charAt(i+1) != '*'){
		      ret= ret + str.charAt(i);
		    }
		  }
		  return ret;
		}
	public String plusOut(String str, String word) {
		  String ret = "";
		  for(int i = 0; i < str.length(); i++){
		    if(str.substring(i).length() < word.length()){
		      ret = ret + '+';
		    }
		    else if(str.substring(i, i + word.length()).equals(word)){
		      ret = ret + word;
		      i = i + word.length() - 1;
		    } else{
		      ret = ret + "+";
		    }
		  }
		  return ret;
		}
	public String wordEnds(String str, String word) {
		  String ret = "";
		  for(int i = 0; i < str.length(); i++){
		    if(str.substring(i).length() < word.length()){
		      break;
		    }
		    if(str.substring(i,i + word.length()).equals(word)){
		      if(i-1 >= 0){
		        ret = ret + str.charAt(i-1);
		      }
		      if(i + word.length() < str.length()){
		        ret = ret + str.charAt(i + word.length());
		      }
		    }
		  }
		  return ret;
		}
}

package codingBat;

public class String1 {

	public String helloName(String name) {
		  return "Hello " + name + "!";
		}
	public String makeAbba(String a, String b) {
		  return a + b + b + a;
		}
	public String makeTags(String tag, String word) {
		  return "<"+tag+">"+word+"</"+tag+">";
		}
	public String makeOutWord(String out, String word) {
		  return out.substring(0,2) + word + out.substring(2);
		}
	public String extraEnd(String str) {
		  String chars = str.substring(str.length()-2);
		  return chars+ chars+ chars;
		}
	public String firstTwo(String str) {
		  if(str.length() <= 2){
		    return str;
		  }
		  return str.substring(0,2);
		}
	public String firstHalf(String str) {
		  int half = str.length()/2;
		  return str.substring(0,half);
		}
	public String withoutEnd(String str) {
		  return str.substring(1, str.length()-1);
		}
	public String comboString(String a, String b) {
		  if(a.length() > b.length()){
		    return b + a + b;
		  }
		  return a + b + a;
		}
	public String nonStart(String a, String b) {
		  return a.substring(1) + b.substring(1);
		}
	public String left2(String str) {
		  return str.substring(2) + str.substring(0,2);
		}
	public String right2(String str) {
		  return str.substring(str.length()-2) + str.substring(0,str.length()-2);
		}
	public String theEnd(String str, boolean front) {
		  if(front){
		    return str.charAt(0) + "";
		  }
		  return str.charAt(str.length()-1) + "";
		}
	public String withouEnd2(String str) {
		  if(str.length() <= 2){
		    return "";
		  }
		  return str.substring(1,str.length()-1);
		}
	public String middleTwo(String str) {
		  int len = str.length()/2;
		  return str.charAt(len- 1) +  "" + str.charAt(len);
		}
	public boolean endsLy(String str) {
		  if(str.length() < 2){
		    return false;
		  }
		  if(str.substring(str.length()-2).equals("ly")){
		    return true;
		  }
		  return false;
		}
	public String nTwice(String str, int n) {
		  return str.substring(0,n) + str.substring(str.length()-n);
		}
	public String twoChar(String str, int index) {
		  if(index < 0){
		    return str.substring(0,2);
		  }
		  if(index + 1 < str.length()){
		    return str.substring(index,index+2);
		  }
		  return str.substring(0,2);
		}
	public String middleThree(String str) {
		  int half = str.length()/2 + 1;
		  return str.substring(half - 2, half+1);
		}
	public boolean hasBad(String str) {
		  if(str.length() < 3){
		    return false;
		  }
		  if(str.substring(0,3).equals("bad")){
		    return true;
		  }
		  if(str.length() >= 4){
		    if(str.substring(1,4).equals("bad")){
		      return true;
		    }
		  }
		  return false;
		}
	public String atFirst(String str) {
		  if(str.length() == 0){
		    return "@@";
		  }
		  if(str.length() == 1){
		    return str + "@";
		  }
		  return str.substring(0,2);
		}
	public String lastChars(String a, String b) {
		  if(a.length() == 0){
		    a = "@";
		  }
		  if(b.length() == 0){
		    b = "@";
		  }
		  return a.charAt(0) + "" + b.charAt(b.length()-1);
		}
	public String conCat(String a, String b) {
		  if(a.length() == 0 || b.length() == 0){
		    return a + b;
		  }
		  if(a.charAt(a.length()-1) == b.charAt(0)){
		    return a.substring(0,a.length()-1) + b;
		  }
		  return a + b;
		}
	public String lastTwo(String str) {
		  if(str.length() < 2){
		    return str;
		  }
		  return str.substring(0,str.length()-2) + str.charAt(str.length()-1) +
		    str.charAt(str.length()-2);
		}
	public String seeColor(String str) {
		  if(str.length() < 3){
		    return "";
		  }
		  if(str.substring(0,3).equals("red")){
		    return "red";
		  }
		  if(str.length() >= 4){
		    if(str.substring(0,4).equals("blue")){
		      return "blue";
		    }
		  }
		  return "";
		}
	public boolean frontAgain(String str) {
		  if(str.length() < 2){
		    return false;
		  }
		  if(str.substring(0,2).equals(str.substring(str.length()-2))){
		    return true;
		  }
		  return false;
		}
	public String minCat(String a, String b) {
		  int dif = Math.abs(a.length() - b.length());
		  if(dif == 0){
		    return a + b;
		  }
		  if(a.length() > b.length()){
		    return a.substring(dif) + b;
		  }
		  return a+ b.substring(dif);
		}
	public String extraFront(String str) {
		  if(str.length() < 3){
		    return str + str + str;
		  }
		  String fr = str.substring(0,2);
		  return fr + fr + fr;
		}
	public String without2(String str) {
		  if(str.length() < 2){
		    return str;
		  }
		  if(str.substring(0,2).equals(str.substring(str.length()-2))){
		    return str.substring(2);
		  }
		  return str;
		}
}

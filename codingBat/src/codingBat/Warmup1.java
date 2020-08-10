package codingBat;

public class Warmup1 {
	//all answers for the method prompts in https://codingbat.com/java/Warmup-1

	public boolean sleepIn(boolean weekday, boolean vacation) {
		  if(vacation || !weekday){
		    return true;
		  }
		  return false;
		}
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		  if(aSmile == bSmile){
		    return true;
		  }
		  return false;
		}
	public int sumDouble(int a, int b) {
		  if(a == b){
		    return 2 * (a+b);
		  }
		  return a + b;
		}
	public boolean parrotTrouble(boolean talking, int hour) {
		  if(talking && (hour < 7 || hour > 20)){
		    return true;
		  }
		  return false;
		}
	public boolean nearHundred(int n) {
		  if(Math.abs(100 -n) <= 10 || Math.abs(200-n) <= 10){
		    return true;
		  }
		  return false;
		}
	public boolean posNeg(int a, int b, boolean negative) {
		  if(negative){
		    if( a < 0 && b < 0){
		      return true;
		    }
		    return false;
		  }
		  if(a < 0 && b > 0){
		    return true;
		  }
		  if(b < 0 && a > 0){
		    return true;
		  }
		  return false;
		}
	public String notString(String str) {
		  if(str.length() >= 3 && str.substring(0,3).equals("not")){
		    return str;
		  }
		  return "not " + str;
		}
	public String missingChar(String str, int n) {
		  return str.substring(0,n) + str.substring(n+1);
		}
	public String frontBack(String str) {
		  if(str.length() <= 1){
		    return str;
		  }
		  return str.charAt(str.length() - 1) + str.substring(1,str.length()-1) + str.charAt(0);
		}
	public String front3(String str) {
		  if(str.length() <= 3){
		    return str + str + str;
		  }
		  String temp = str.substring(0,3);
		  return temp + temp + temp;
		}
	public String backAround(String str) {
		  char last = str.charAt(str.length()-1);
		  return last + str + last;
		}
	public boolean or35(int n) {
		  if(n % 3 == 0 || n % 5 == 0){
		    return true;
		  }
		  return false;
		}
	public String front22(String str) {
		  if(str.length() <=2){
		    return str + str + str;
		  }
		  String fr = str.substring(0,2);
		  return fr + str + fr;
		}
	public boolean startHi(String str) {
		  if(str.length() < 2){
		    return false;
		  }
		  if(str.substring(0,2).equals("hi")){
		    return true;
		  }
		  return false;
		}
	public boolean icyHot(int temp1, int temp2) {
		  if((temp1 < 0 && temp2 > 100) ||(temp1 > 100 && temp2 < 0)){
		    return true;
		  }
		  return false;
		}
	public boolean in1020(int a, int b) {
		  if(a <= 20 && a >= 10){
		    return true;
		  }
		  if(b <= 20 && b >= 10){
		    return true;
		  }
		  return false;
		}
	public boolean hasTeen(int a, int b, int c) {
		  if(a >= 13 && a < 20){
		    return true;
		  }
		  if(b >= 13 && b < 20){
		    return true;
		  }
		  if(c >= 13 && c < 20){
		    return true;
		  }
		  return false;
		}
	public boolean loneTeen(int a, int b) {
		  int teens = 0;
		  if(a >= 13 && a < 20){
		    teens++;
		  }
		  if(b >= 13 && b < 20){
		    teens++;
		  }
		  if(teens == 1){
		    return true;
		  }
		  return false;
		}
	public String delDel(String str) {
		  if(str.length() < 4){
		    return str;
		  }
		  if(str.substring(1,4).equals("del")){
		    return str.charAt(0) + str.substring(4);
		  }
		  return str;
		}
	public boolean mixStart(String str) {
		  if(str.length() < 3){
		    return false;
		  }
		  if(str.substring(1,3).equals("ix")){
		    return true;
		  }
		  return false;
		}
	public String startOz(String str) {
		  if(str.length() == 0){
		    return "";
		  }
		  String ret = "";
		  if(str.length() >= 1){
		    if(str.charAt(0) == 'o'){
		      ret = "o";
		    }
		  }
		  if(str.length() >= 2){
		    if(str.charAt(1) == 'z'){
		      ret = ret + 'z';
		    }
		  }
		  return ret;
		}
	public int intMax(int a, int b, int c) {
		  if(a > b){
		    return Math.max(a,c);
		  }
		  return Math.max(b,c);
		}
	public int close10(int a, int b) {
		  if(Math.abs(10-a) == Math.abs(10-b)){
		    return 0;
		  }
		  if(Math.abs(10-a) < Math.abs(10-b)){
		    return a;
		  }
		  return b;
		}
	public boolean in3050(int a, int b) {
		  if(a <= 40 && b <=40){
		    if(a >= 30 && b >= 30){
		      return true;
		    }
		  }
		  if(a >= 40 && b >=40){
		    if(a <= 50 && b <= 50){
		      return true;
		    }
		  }
		  return false;
		}
	public int max1020(int a, int b) {
		  if(a >= b){
		    if(a >= 10 && a <= 20){
		      return a;
		    }
		  }
		  if(b >= 10 && b <= 20){
		    return b;
		  }
		  if(a >= 10 && a <= 20){
		      return a;
		    }
		  return 0;
		}
	public boolean stringE(String str) {
		  int es = 0;
		  for(int i = 0 ; i < str.length(); i++){
		    if(str.charAt(i) == 'e'){
		      es++;
		    }
		  }
		  if(es >= 1 && es <= 3){
		    return true;
		  }
		  return false;
		}
	public boolean lastDigit(int a, int b) {
		  if(a%10 == b %10){
		    return true;
		  }
		  return false;
		}
	public String endUp(String str) {
		  if(str.length() <= 3){
		    return str.toUpperCase();
		  }
		  return str.substring(0,str.length() - 3) + 
		  str.substring(str.length()-3).toUpperCase();
		}
	public String everyNth(String str, int n) {
		  String ret = "";
		  for(int i = 0; i < str.length(); i++){
		    if(i%n == 0){
		      ret = ret + str.charAt(i);
		    }
		  }
		  return ret;
		}
}

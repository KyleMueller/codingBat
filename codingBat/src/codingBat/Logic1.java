package codingBat;

public class Logic1 {
	public boolean cigarParty(int cigars, boolean isWeekend) {
		  if(isWeekend){
		    if(cigars >= 40){
		      return true;
		    }
		    return false;
		  }
		  if(cigars >= 40 && cigars <= 60){
		    return true;
		  }
		  return false;
		}
	public int dateFashion(int you, int date) {
		  if( you >= 8 || date >= 8){
		    if( you < 3 || date < 3){
		      return 0;
		    }
		    return 2;
		  }
		  if( you < 3 || date < 3){
		      return 0;
		  }
		  return 1;
		}
	public boolean squirrelPlay(int temp, boolean isSummer) {
		  int hi = 90;
		  if(isSummer){
		    hi = 100;
		  }
		  if(temp >= 60 && temp <= hi){
		    return true;
		  }
		  return false;
		}
	public int caughtSpeeding(int speed, boolean isBirthday) {
		  int lo = 60;
		  int hi = 80;
		  if(isBirthday){
		    lo = 65;
		    hi = 85;
		  }
		  if(speed <= lo){
		    return 0;
		  }
		  if(speed <= hi){
		    return 1;
		  }
		  return 2;
		}
	public int sortaSum(int a, int b) {
		  int sum = a + b;
		  if(sum <= 19 && sum >= 10){
		    sum = 20;
		  }
		  return sum;
		}
	public String alarmClock(int day, boolean vacation) {
		  if(vacation){
		    if(day == 0 || day == 6){
		      return "off";
		    }
		    return "10:00";
		  }
		  if(day == 0 || day == 6){
		    return "10:00";
		  }
		  return "7:00";
		}
	public boolean love6(int a, int b) {
		  if(a == 6 || b == 6){
		    return true;
		  }
		  if(a + b == 6 || Math.abs(a-b) == 6){
		    return true;
		  }
		  return false;
		}
	public boolean in1To10(int n, boolean outsideMode) {
		  if(outsideMode){
		    if( n <= 1 || n >= 10){
		      return true;
		    }
		    return false;
		  }
		  if(n <= 10 && n >= 1){
		    return true;
		  }
		  return false;
		}
	public boolean specialEleven(int n) {
		  if(n%11 == 0 || n%11 == 1){
		    return true;
		  }
		  return false;
		}
	public boolean more20(int n) {
		  if(n%20 == 1 || n%20 == 2){
		    return true;
		  }
		  return false;
		}
	public boolean old35(int n) {
		  if(n%3 == 0){
		    if(n%5 == 0){
		      return false;
		    }
		    return true;
		  }
		  if(n%5 == 0){
		    return true;
		  }
		  return false;
		}
	public boolean less20(int n) {
		  if(n%20 == 19 || n%20 == 18){
		    return true;
		  }
		  return false;
		}
	public boolean nearTen(int num) {
		  int rem = num%10;
		  if(rem <= 2 || rem >= 8){
		    return true;
		  }
		  return false;
		}
	public int teenSum(int a, int b) {
		  if(a >= 13 && a <= 19){
		    return 19;
		  }
		  if(b >= 13 && b <= 19){
		    return 19;
		  }
		  return a + b;
		}
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		  if(isAsleep){
		    return false;
		  }
		  if(isMorning){
		    if(isMom){
		      return true;
		    }
		    return false;
		  }
		  return true;
		}
	public int teaParty(int tea, int candy) {
		  if(tea < 5 || candy < 5){
		    return 0;
		  }
		  if(tea >= candy*2 || candy >= tea*2){
		    return 2;
		  }
		  return 1;
		}
	public String fizzString(String str) {
		  String ret = "";
		  if(str.charAt(0) == 'f'){
		    ret = ret + "Fizz";
		  }
		  if(str.charAt(str.length()-1) == 'b'){
		    ret = ret + "Buzz";
		  }
		  if(ret.length() == 0){
		    return str;
		  }
		  return ret;
		}
	public String fizzString2(int n) {
		  String ret = "";
		  if(n%3 == 0){
		    ret = ret + "Fizz";
		  }
		  if(n%5 == 0){
		    ret = ret +"Buzz";
		  }
		  if(ret.length() == 0){
		    ret = n + "";
		  }
		  return ret + "!";
		}
	public boolean twoAsOne(int a, int b, int c) {
		  if(a + b == c || a + c == b || c + b == a){
		    return true;
		  }
		  return false;
		}
	public boolean inOrder(int a, int b, int c, boolean bOk) {
		  if(bOk){
		    if(c > b){
		      return true;
		    }
		    return false;
		  }
		  if(c > b && b > a){
		    return true;
		  }
		  return false;
		}
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		  if(equalOk){
		    if(a <= b && b <= c){
		      return true;
		    }
		    return false;
		  }
		  if(a < b && b < c){
		    return true;
		  }
		  return false;
		}
	public boolean lastDigit(int a, int b, int c) {
		  int same = 0;
		  if(a%10 == b %10){
		    same++;
		  }
		  if(a%10 == c%10){
		    same++;
		  }
		  if(b%10 == c%10){
		    same++;
		  }
		  if(same >= 1){
		    return true;
		  }
		  return false;
		}
	public boolean lessBy10(int a, int b, int c) {
		  if(Math.abs(a-b) >= 10 || Math.abs(a-c) >= 10 || 
		    Math.abs(b-c) >= 10){
		      return true;
		    }
		    return false;
		}
	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		  if(noDoubles){
		    if(die1 == die2){
		      if(die1 + die2 == 12){
		        return 7;
		      }
		      return die1 + die2 + 1;
		    }
		  }
		  return die1 + die2;
		}
	public int maxMod5(int a, int b) {
		  if(a == b){
		    return 0;
		  }
		  if(a % 5 == b % 5){
		    if(a > b){
		      return b;
		    }
		    return a;
		  }
		  if(a > b){
		    return a;
		  }
		  return b;
		}
	public int redTicket(int a, int b, int c) {
		  if(a + b + c == 6){
		    return 10;
		  }
		  if(a == b && b == c){
		    return 5;
		  }
		  if(a != b && a != c){
		    return 1;
		  }
		  return 0;
		}
	public int greenTicket(int a, int b, int c) {
		  if(a == b && b == c){
		    return 20;
		  }
		  if(a == b || a == c || b == c){
		    return 10;
		  }
		  return 0;
		}
	public int blueTicket(int a, int b, int c) {
		  int ab = a + b;
		  int bc = b + c;
		  int ac = a + c;
		  if(ab == 10 || bc == 10 || ac == 10){
		    return 10;
		  }
		  if(ab - 10 >= ac || ab - 10 >= bc){
		    return 5;
		  }
		  return 0;
		}
	public boolean shareDigit(int a, int b) {
		  if(a%10 == b%10 || a%10 == b/10){
		    return true;
		  }
		  if(a/10 == b%10 || a/10 == b/10){
		    return true;
		  }
		  return false;
		}
	public int sumLimit(int a, int b) {
		  int len = (a + "").length();
		  if(((a+b) + "").length() == len){
		    return a+b;
		  }
		  return a;
		}

}

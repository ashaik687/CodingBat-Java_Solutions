public class Logic1 {
	public boolean cigarParty(int cigars, boolean isWeekend) {
		  if(isWeekend){
		  return cigars>=40;
		  }
		  return cigars>=40 && cigars<=60;
		}
	public int dateFashion(int you, int date) {
		  if(you<=2 || date<=2)
		    return 0;
		  if(you>=8 || date>=8)
		    return 2;
		  return 1;
		}
	public boolean squirrelPlay(int temp, boolean isSummer) {
		  if(!isSummer)
		    return temp>=60 && temp<=90;
		  return temp>=60 && temp<=100; 
		}
	public int caughtSpeeding(int speed, boolean isBirthday) {
		  int tmp = isBirthday?5:0;
		   if(speed>=81+tmp)
		     return 2;
		  else if(speed<=60+tmp)
		    return 0;
		  else
		    return 1; 
		}
	public int sortaSum(int a, int b) {
		  if(a+b>=10 && a+b<=19)
		     return 20;
		  return a+b;
		}
	public String alarmClock(int day, boolean vacation) {
		  if(vacation && (day==0|| day==6))
		      return "off";
		  if(vacation && (day>=1|| day<=5))
		      return "10:00";
		  if(day==0 || day==6)
		      return "10:00";
		  return "7:00"; 
		}
	public boolean love6(int a, int b) {
		  return a==6 || b==6 || a+b==6 || Math.abs(a-b)==6;
		}
	public boolean in1To10(int n, boolean outsideMode) {
		  if(outsideMode){
		  return n<=1 || n>=10;
		  }
		  return n>=1 && n<=10;
		}
	public boolean specialEleven(int n) {
		  return n%11==0||n%11==1;
		}
	public boolean more20(int n) {
		  return n%20 ==1 || n%20==2;
		}
	public boolean old35(int n) {
		  return (n%3==0 || n%5==0) && n%15!=0;
		}
	public boolean less20(int n) {
		  return n%20==19 || n%20==18;
		}
	public boolean nearTen(int num) {
		  return num%10<=2 || num%10>=8;  
		}
	public int teenSum(int a, int b) {
		  return (a>=13 && a<=19)||(b>=13 && b<=19)?19:a+b;
		}
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		  return isMorning?isMom&&!isAsleep:!isAsleep;
		}
	public int teaParty(int tea, int candy) {
		  if(tea<5 || candy<5)
		    return 0;
		  else{
		     if(tea>=2*candy || candy>=2*tea)
		       return 2;
		  }
		  return 1; 
		}
	public String fizzString(String str) {
		  String res=str;
		  if(str.length()<1)
		     return str;
		  if(str.charAt(0)=='f'){
		     res="Fizz";
		  if(str.charAt(str.length()-1)=='b')
		     return res+"Buzz";
		  }
		  if(str.charAt(str.length()-1)=='b')
		     return "Buzz";   
		     return res;  
		}
	public String fizzString2(int n) {
		  if (n%15==0)
		   return "FizzBuzz!";
		  if(n%3==0)
		   return "Fizz!";
		  if(n%5==0)
		   return "Buzz!";
		   return Integer.toString(n)+"!";
		}
	public boolean twoAsOne(int a, int b, int c) {
		  return a+b==c || b+c==a || a+c==b;
		}
	public boolean inOrder(int a, int b, int c, boolean bOk) {
		  return ((bOk || b>a) && c>b);
		}
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		  return b>a && c>b || (equalOk && b>=a && c>=b);
		}
	public boolean lastDigit(int a, int b, int c) {
		  return a%10==b%10 || b%10==c%10 || c%10==a%10;
		}
	public boolean lessBy10(int a, int b, int c) {
		  return Math.abs(a-b)>=10 || Math.abs(b-c)>=10 || Math.abs(c-a)>=10;
		}
	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		  if(noDoubles && die1==die2){
		      if(die1==6||die2==6)
		          return 7;
		     return 2*die1+1;
		     }
		  return die1+die2;
		}
	public int maxMod5(int a, int b) {
		  if(a==b)
		    return 0;
		  if(a%5==b%5)
		   return a>b?b:a;
		   return a>b?a:b;
		}
	public int redTicket(int a, int b, int c) {
		  if(a==2&&b==2&&c==2)
		     return 10;
		  if(a==b && b==c)
		     return 5;
		  if(a!=b && a!=c)
		     return 1;
		  return 0;
		}
	public int greenTicket(int a, int b, int c) {
		  if(a==b && b==c)
		    return 20;
		  if(a==b || b==c || c==a)
		    return 10;
		  return 0;
		}
	public int blueTicket(int a, int b, int c) {
		  int sum1=a+b;
		  int sum2=b+c;
		  int sum3=c+a;
		  if(sum1==10 || sum2==10 || sum3==10)
		     return 10;
		  if(sum1-sum2==10 || sum1-sum3==10)
		     return 5;
		  return 0;
		}
	public boolean shareDigit(int a, int b) {
		  return a%10==b%10 || a%10 ==b/10 || a/10==b%10 || a/10==b/10;
		}
	public int sumLimit(int a, int b) {
		  return String.valueOf(a+b).length()==String.valueOf(a).length()?a+b:a;
		}

}

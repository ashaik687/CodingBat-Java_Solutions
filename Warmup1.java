
public class Warmup1 {
	public boolean sleepIn(boolean weekday, boolean vacation) {
		  return (!weekday || vacation);
		  }
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		  return !(aSmile^bSmile);
		}
	public int sumDouble(int a, int b) {
		  return (a!=b?a+b:2*(a+b));
		}
	public int diff21(int n) {
		  return (n<=21?Math.abs(n-21):Math.abs((2*(n-21))));
		}
	public boolean parrotTrouble(boolean talking, int hour) {
		  return ((hour<7 || hour>20) && talking);
		}
	public boolean makes10(int a, int b) {
		  return ((a==10 || b==10) || a+b ==10); 
		}
	public boolean nearHundred(int n) {
		  return (Math.abs(n-100)<=10 || Math.abs(n-200)<=10);
		}
	public boolean posNeg(int a, int b, boolean negative) {
		  return negative?(a<0&&b<0):(a<0^b<0);  
		}
	public String notString(String str) {
		  return str.startsWith("not")?str:("not "+str);
		}
	public String missingChar(String str, int n) {
		  return str.subSequence(0,n)+""+str.subSequence(n+1,str.length());
		}
	public String frontBack(String str) {
		  return ((str.length()==1) ||(str.equals("")))?str:(str.charAt(str.length()-1)+str.substring(1,str.length()-1)+str.charAt(0));
		}
	public String front3(String str) {
		  return str.length()>=3?(str.substring(0,3)+str.substring(0,3)+str.substring(0,3)):(str+str+str); 
		}
	public String backAround(String str) {
		  return str.charAt(str.length()-1)+str+str.charAt(str.length()-1);
		}
	public boolean or35(int n) {
		  return n%3==0 || n%5 ==0;
		}
	public String front22(String str) {
		  return str.length()<=2?(str+str+str):str.substring(0,2)+str+str.substring(0,2); 
		}
	public boolean startHi(String str) {
		  return str.startsWith("hi");
		}
	public boolean icyHot(int temp1, int temp2) {
		  return (temp1<0&&temp2>100) ||(temp1>0&&temp2<100);
		}
	public boolean in1020(int a, int b) {
		  return Math.abs(a-15)<=5 || Math.abs(b-15)<=5;
		}
	public boolean hasTeen(int a, int b, int c) {
		  return Math.abs(a-16)<=3 || Math.abs(b-16)<=3 || Math.abs(c-16)<=3;
		}
	public boolean loneTeen(int a, int b) {
		  return Math.abs(a-16)<=3 ^ Math.abs(b-16)<=3;
		}
	public String delDel(String str) {
		  if (str.length()>=4 && str.substring(1, 4).equals("del")) {
		    return str.substring(0, 1) + str.substring(4);
		  }
		  return str;
		}
	public boolean mixStart(String str) {
		  return str.length()<3?false:str.substring(1,3).equals("ix");
		}
	public int intMax(int a, int b, int c) {
		  int max1 =a>b?a:b;
		  return c>max1?c:max1;
		}
	public int close10(int a, int b) {
		 int x =Math.abs(a-10);
		 int y =Math.abs(b-10);
		  if(x==y){
		  return 0;
		  }
		  else{
		  return x>y?b:a;
		  }
		}
	public boolean in3050(int a, int b) {
		  return (Math.abs(a-35)<=5 && Math.abs(b-35)<=5) ||(Math.abs(a-45)<=5 &&Math.abs(b-45)<=5);
		}
	public int max1020(int a, int b) {
		  boolean x = (a>=10 && a<=20);
		  boolean y = (b>=10 && b<=20);
		return (x||y)?(x&&y?Math.max(a,b):(x?a:b)):0;
		}
	public boolean stringE(String str) {
		  int index=0;
		  int count=0;
		  while(index<str.length()){
		  count=(str.charAt(index)=='e')?++count:count;    //using count++ will not give ans because the value will be assigned and then processed.
		  index++;
		  }
		 return (count >= 1 && count <= 3);
		}
	public boolean lastDigit(int a, int b) {
		  return a%10==b%10;
		}
	public String endUp(String str) {
		  return str.length()<=3?str.toUpperCase():(str.substring(0,str.length()-3)+str.substring(str.length()-3,str.length()).toUpperCase());
		}
	public String everyNth(String str, int n) {
		  int index=0;
		  String s2="";
		  while(index<str.length()){
		  s2=s2+str.charAt(index);
		  index=index+n;
		  }
		  return s2;
		}
}


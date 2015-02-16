
public class Strings1 {
	public String helloName(String name) {
		  return "Hello "+name+"!"; 
		}
	public String makeAbba(String a, String b) {
		  return a+b+b+a;
		}
	public String makeTags(String tag, String word) {
		  return "<"+tag+">"+word+"</"+tag+">";
		}
	public String makeOutWord(String out, String word) {
		  return out.substring(0,2)+word+out.substring(2,4);
		}
	public String extraEnd(String str) {
		  String s1=str.substring(str.length()-2,str.length());
		  return s1+s1+s1;
		}
	public String firstTwo(String str) {
		  return str.length()<=2?str:str.substring(0,2);
		}
	public String firstHalf(String str) {
		  return str.substring(0,str.length()/2);
		}
	public String withoutEnd(String str) {
		  return str.substring(1,str.length()-1);
		}
	public String comboString(String a, String b) {
		  return a.length()>b.length()?b+a+b:a+b+a;
		}
	public String nonStart(String a, String b) {
		  return a.substring(1,a.length())+b.substring(1,b.length());
		}
	public String left2(String str) {
		  return str.substring(2,str.length())+str.substring(0,2);
		}
	public String right2(String str) {
		  return str.substring(str.length()-2,str.length())+str.substring(0,str.length()-2);
		}
	public String theEnd(String str, boolean front) {
		  return front?str.substring(0,1):str.substring(str.length()-1,str.length());
		}
	public String withouEnd2(String str) {
		  return str.length()<=2?"":str.substring(1,str.length()-1);
		}
	public String middleTwo(String str) {
		  return str.substring((str.length()/2)-1,str.length()/2+1);
		}
	public boolean endsLy(String str) {
		  if(str.length()<2){return false;}
		  return (str.substring(str.length()-2,str.length())).equals("ly");
		}
	public String nTwice(String str, int n) {
		  return str.substring(0,n)+str.substring(str.length()-n,str.length());
		}
	public String twoChar(String str, int index) {
		  return (index>=str.length()-1) ||(index<=0)?str.substring(0,2):str.substring(index,index+2);
		}
	public String middleThree(String str) {
		  return str.substring((str.length()/2)-1,str.length()/2+2);
		}
	public boolean hasBad(String str) {
		  if(str.length()<3){return false;}
		  return (str.substring(0,3).equals("bad"))?true:str.substring(1).length()>=3 && str.substring(1,4).equals("bad");
		}
	public String atFirst(String str) {
		  String s=str.equals("")?"@":str;
		  return str.length()<2?s+"@":str.substring(0,2);
		}
	public String lastChars(String a, String b) {
		  String first=a.length()<1?"@":a.substring(0,1);
		  String second=b.length()<1?"@":b.substring(b.length()-1,b.length());
		  return first+second;
		  }
	public String conCat(String a, String b) {
		  if(a.equals("")||b.equals("")){
		  return a+b;
		  }
		  if(a.substring(a.length()-1,a.length()).equals(b.substring(0,1))){
		  return a.substring(0,a.length()-1)+b;
		  }
		  return a+b;
		}
	public String lastTwo(String str) {
		  if(str.length()<2){
		  return str;
		  }
		  return str.substring(0,str.length()-2)+str.substring(str.length()-1)+str.substring(str.length()-2,str.length()-1);
		}
	public String seeColor(String str) {
		  if(str.length()<3){
		  return "";
		  }
		  if (str.substring(0,3).equals("red")){
		  return "red";
		  }
		  if((str.length()>3 && str.substring(0,4).equals("blue")))
		  {
		  return "blue";
		  } 
		  return "";
		}
	public boolean frontAgain(String str) {
		  if(str.length()<2){
		  return false;
		  }
		  return (str.substring(0,2).equals(str.substring(str.length()-2,str.length())));
		}
	public String minCat(String a, String b) {
		  return a.length()<=b.length()?a+b.substring(b.length()-a.length(),b.length()):a.substring(a.length()-b.length(),a.length())+b;
		}
	public String extraFront(String str) {
		  String s2=str.length()<2?str:str.substring(0,2);
		  return s2+s2+s2;
		}
	public String without2(String str) {
		 if(str.length()<2){
		 return str;
		 }
		 if(str.substring(0,2).equals(str.substring(str.length()-2,str.length()))){
		 return str.substring(2,str.length());
		 }
		 return str;
		}
	public String deFront(String str) {    
		  if(str.length()<1){
		  return str;
		  }
		  if(str.length()<2){
		  return str.charAt(0)=='a'?"a":"";
		  }
		  String s3=str.substring(2,str.length());
		  String s1=str.charAt(0)=='a'?"a":"";
		  String s2=str.charAt(1)=='b'?"b":"";
		  return s1+s2+s3;
		}
	public String startWord(String str, String word) {
		  if(str.length()<word.length()){
		  return "";
		  }
		  String s1=str.substring(0,word.length());
		  return word.substring(1,word.length()).equals(s1.substring(1,word.length()))?s1:"";
		}
	public String withoutX(String str) {
		  if(str.length()<1){
		  return "";
		  }
		  if(str.length()<2){
		  return str.charAt(0)=='x'?"":str;
		  }
		  String s2=str.substring(1,str.length()-1);
		  String s1=str.charAt(0)=='x'?"":str.substring(0,1);
		  String s3=str.charAt(str.length()-1)=='x'?"":str.substring(str.length()-1,str.length());
		  return s1+s2+s3;
		}
	public String withoutX2(String str) {
		if(str.length()<1){
		return "";
		}
		if(str.length()<2){
		return str.charAt(0)=='x'?"":str;
		}
		  String s2=str.substring(2,str.length());
		  String s0=str.charAt(0)=='x'?"":str.substring(0,1);
		  String s1=str.charAt(1)=='x'?"":str.substring(1,2);
		  return s0+s1+s2;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

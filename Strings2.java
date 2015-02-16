
public class Strings2 {
	public String doubleChar(String str) {
		  String s="";
		  int i=0;
		  while(i<=str.length()-1){
		  s=s+str.substring(i,i+1)+str.substring(i,i+1);
		  i++;
		  }
		  return s;
		}
	public int countHi(String str) {
		  if(str.length()<2){
		  return 0;
		  }
		  int count=0;
		  int i=0;
		  while(i<=str.length()-2){
		  count =(str.charAt(i)=='h'&&str.charAt(i+1)=='i')?++count:count;
		  i++;
		  }
		  return count;
		}
	public boolean catDog(String str) {
		  if(str.length()<3){
		  return true;
		  }
		  int count1=0;
		  int count2=0;
		  int i=0;
		  while(i<=str.length()-3){
		    if(str.substring(i,i+3).equals("cat")){
		    count1++;
		    i=i+3;
		    }
		    else if(str.substring(i,i+3).equals("dog")){
		    count2++;
		    i=i+3;
		    }
		    else{
		    i++;
		    }
		  }
		  return count1==count2;
		}
	public int countCode(String str) {
		  if(str.length()<4){
		  return 0;
		  }
		  int i=0;
		  int count=0;
		  while(i<=str.length()-4){
		  if(str.substring(i,i+2).equals("co")&&str.substring(i+3,i+4).equals("e")){
		  count++;
		  i=i+4;
		  }
		  else{
		  i++;
		  }
		  }
		  return count;
		}
	public boolean endOther(String a, String b) {  //Improve ment to the question: Returns true if the small string is in any place not just end.
		  if(a.length()<1||b.length()<1){
		  return true;
		  }
		  String lng="";
		  String shrt="";
		  if(a.length()<=b.length()){
		  shrt=a;
		  lng=b;
		  }
		  else{
		  shrt=b;
		  lng=a;
		  }
		  int i=0;
		  while(i<=lng.length()-shrt.length()){
		if(shrt.substring(0,shrt.length()).toLowerCase().equals(lng.substring(i,i+shrt.length()).toLowerCase())){
		 i=i+shrt.length();
		  return true;
		  }
		  else{i++;}
		  }
		  return false;
		}
	public boolean xyzThere(String str) {
		 if(str.length()<3){
		 return false;
		 } 
		 if(str.length()==3 && str.equals("xyz")){
		 return true;
		 }
		 int i=0;
		 int count=0;
		 while(i<=str.length()-4){
		 if(str.substring(0,3).equals("xyz")){
		 return true;
		 }
		 if(!str.substring(i,i+1).equals(".")&&str.substring(i+1,i+4).equals("xyz")){
		 return true;
		 }
		 i++;
		 }
		 return false;
		}
	public boolean bobThere(String str) {
		  if(str.length()<3){
		  return false;
		  }
		  int i=0;
		  while(i<=str.length()-3){
		  if(str.substring(i,i+1).equals("b")&&str.substring(i+2,i+3).equals("b")){
		  return true;
		  }
		  i++;
		  }
		  return false;
		}
	public boolean xyBalance(String str) {
		  if(str.length()<1){
		  return true;
		  }
		  if(str.length()<2){
		  return !(str.charAt(0)=='x');
		  }
		  int i=0;
		  int count=0;
		  while(i<=str.length()-1){
		  if(str.charAt(i)=='x'){
		  count=1;
		  }
		  if(str.charAt(i)=='y'){
		  count=2;
		  }
		  i++;
		  }
		  return count==2||count==0;
		}
	public String mixString(String a, String b) {
		  if(a.length()<1){
		  return b;
		  }
		  if(b.length()<1){
		  return a;
		  }
		  int len=a.length()<=b.length()?a.length():b.length();
		  int i=0;
		  String s="";
		  while(i<=len-1){
		  s=s+a.substring(i,i+1)+b.substring(i,i+1);
		  i++;
		  }
		  return s+a.substring(i,a.length())+b.substring(i,b.length());
		}
	public String repeatEnd(String str, int n) {
		  if(n==0){
		  return "";
		  }
		  String s1="";
		  int i=0;
		  while(i<n){
		  s1=s1+str.substring(str.length()-n,str.length());
		  i++;
		  }
		  return s1;
		}
	public String repeatFront(String str, int n) {
		  if(n==0){
		  return "";
		  }
		  int i=n;
		  String s="";
		  while(i>=0){
		  s=s+str.substring(0,i);
		  i--;
		  }
		  return s;
		}
	public String repeatSeparator(String word, String sep, int count) {
		  if(count==0||word.length()<1){
		  return "";
		  }
		  int i=1;
		  String s=word;
		  while(i<count){
		  s=s+sep+word;
		  i++;
		  }
		  return s;
		}
	public boolean prefixAgain(String str, int n) {
		  String temp=str.substring(0,n);
		  int i=n;
		  while(i<=str.length()-n){
		  if(str.substring(i,i+n).equals(temp)){
		  return true;
		  }
		    i++;
		  }
		  return false;
		}
	public boolean xyzMiddle(String str) {
		  if(str.length()<3){
		  return false;
		  }
		  int t=str.length()/2;
		  if(str.length()%2==1){
		  return str.substring(t-1,t+2).equals("xyz");
		  }
		  return str.substring(t-2,t+1).equals("xyz")||str.substring(t-1,t+2).equals("xyz");
		}
	public String getSandwich(String str) {
		  if(str.length()<11){
		  return "";
		  }
		  int i=0;
		  int start=0;
		  int end=0;
		  int count=0;
		  while(i<=str.length()-5){
		  if(str.substring(i,i+5).equals("bread")&&count==0){
		  start=i+5;
		  count++;
		  }
		   if(str.substring(i,i+5).equals("bread")){
		  end=i;
		  }
		  i++;
		  }
		  return str.substring(start,end);
		}
	public boolean sameStarChar(String str) {
		  int i=1;
		  while(i<=str.length()-2){
		  if(str.charAt(i)=='*'){
		     if(str.charAt(i-1)!=str.charAt(i+1)){
		     return false;
		     }
		   }
		  i++;
		  }
		  return true;
		}
	public String zipZap(String str) {
		  if(str.length()<3){
		  return str;
		  }
		  String s="";
		  int i=0;
		  while(i<=str.length()-1){
		  if(str.charAt(i)=='z'&&str.charAt(i+2)=='p'){
		  s=s+str.substring(i,i+1)+str.substring(i+2,i+3);
		  i=i+3;
		  }
		  else{
		  s=s+str.substring(i,i+1);
		  i++;
		  }
		  }
		  return s;
		}
	public String starOut(String str) {
		 String s="";
		 int i=0;
		 while(i<=str.length()-1){
		    if(i==0 && str.charAt(0)!='*'){
		       s=s+str.substring(0,1);
		     }
		    if(i>0 && str.charAt(i)!='*' && str.charAt(i-1)!='*'){
		    s=s+str.substring(i,i+1);
		    }
		    if(i>0 && str.charAt(i)=='*'&& str.charAt(i-1)!='*'){
		    s=s.substring(0,s.length()-1);
		    }
		    i++;
		 }
		 return s;
		}
	public String plusOut(String str, String word) {
		 String s="";
		 int i=0;
		 int temp=word.length();
		 while(i<=str.length()-1){
		 if(word.length()>0 && i<=str.length()-temp && str.substring(i,i+temp).equals(word)){
		 s=s+word;
		 i=i+temp;
		 }
		 else{
		 s=s+"+";
		 i++;
		 }
		 } 
		 return s;
		}
	public String wordEnds(String str, String word) {
		if(str.length()==word.length()){
		return "";
		}
		String s="";
		int i=0;
		int temp=word.length();
		while(i<=str.length()-temp){
		  if(i==0&&str.substring(i,temp).equals(word)){
		  s=s+str.substring(temp,temp+1);
		  }
		  if(i>0 && i<str.length()-temp && str.substring(i,i+temp).equals(word) ){
		  s=s+str.substring(i-1,i)+str.substring(i+temp,i+temp+1);
		  }
		  if(i==str.length()-temp && str.substring(i,i+temp).equals(word)){
		  s=s+str.substring(i-1,i);
		  }
		  i++;
		}  
		return s;
		}
}


public class Warmup2 {
	public String stringTimes(String str, int n) {
		  String s="";
		  while(n>0){
		  s=str+s;
		  n--;
		  }
		return s;
		}
	public String frontTimes(String str, int n) {
		  String s=str.length()>2?str.substring(0,3):str;
		  String s1="";
		  while(n>0){
		  s1=s1+s;
		  n--;
		  }
		  return s1;
		}
	public int countXX(String str) {   //Recursive version
		  if(str.length()<2){
		  return 0;
		  }
		  else if(str.substring(0,2).equals("xx")){
		  return 1+countXX(str.substring(1));
		  }
		  else{
		  return countXX(str.substring(1));
		  } 
		}
	public int countXXI(String str) {  // iterative version of above
		  if(str.length()<2){
		  return 0;
		  }
		  else{
		  int i=0;
		  int count=0;
		  while(i<str.length()-1){
		  if(str.substring(i,i+2).equals("xx")){
		  count++;
		  }
		  i++;
		  }
		  return count;
		  }
		}
	boolean doubleX(String str) {   //Recursive version
		 if(str.length()<=1){
		 return false;
		 } 
		 else if(str.substring(0,1).equals("x")){
		        if(str.substring(1,2).equals("x")){return true;}
		        else{return false;}
		 }
		 else{
		 return doubleX(str.substring(1));
		 }
		}
	boolean doubleX1(String str) {   //Iterative version of above
		 if(str.length()<=1 || str.indexOf("x")==-1){
		 return false;
		 }
		 else{
		 return (str.indexOf("x") == str.indexOf("xx"));
		 }
		}
	public String stringBits(String str) {
		  String s="";
		  int i=0;
		  while(i<=str.length()-1){
		  s=s+str.substring(i,i+1);
		  i+=2;
		  }
		  return s;
		}
	public String stringSplosion(String str) {
		  String s="";
		  int i=0;
		  while(i<=str.length()-1){
		  s=s+str.substring(0,i+1);
		  i++;
		  }
		  return s;
		}
	public int last2(String str) {
		  if(str.length()<2){
		  return 0;
		  }
		  else{
		  String s= str.substring(str.length()-2,str.length());
		  int i =0;
		  int count=0;
		  while(i<=str.length()-3){
		  if(str.substring(i,i+2).equals(s)){
		  count++;
		  }
		  i++;
		  }
		  return count;
		  }
		}
	public int arrayCount9(int[] nums) {
		  int i=0;
		  int count=0;
		  while(i<=nums.length-1){
		  count = nums[i]==9?++count:count;
		  i++;
		  }
		  return count;
		}
	public boolean arrayFront9(int[] nums) {
		  int end= nums.length>4?4:nums.length;
		  int index=0;
		  int count=0;
		  while(index<=end-1){
		  count = nums[index]==9?++count:count;
		  index++;
		  }
		  return (count>0);
		}
	public boolean array123(int[] nums) {
		  int index=0;
		  while(index<=nums.length-3){
		  if((nums[index]==1 && nums[index+1]==2) && nums[index+2]==3){
		  return true;}
		  index++;
		  }
		  return false; 
		}
	public int stringMatch(String a, String b) {
		   if(a.length()<2||b.length()<2){
		   return 0;
		   }
		   int end = a.length()<=b.length()?a.length()-1:b.length()-1;
		   int count=0;
		   int index=0;
		   while(index<=end-1){
		   if(a.substring(index,index+2).equals(b.substring(index,index+2))){
		   count++;
		   }
		   index++;
		   }
		   return count;
		}
	public String stringX1(String str) {  //Modification of stringX dont remove x anywhere they are first or last.
		if(str.length()<2){
		return str;
		}
		int index=0;
		String s="";
		int count=0;
		int temp=-1;
		while(index<=str.length()-1){
		if(str.charAt(index)=='x' && count==0){
		s=s+str.charAt(index);
		count++;
		}
		else if(str.charAt(index)=='x'){
		temp=s.length()-1;
		}
		else {
		     s=s+str.charAt(index);
		  }
		  index++;
		}
		String s2=(count==0)?"":"x";
		return s.substring(0,temp+1)+s2+s.substring(temp+1,s.length());
		}
	public String stringX(String str) {
		  if(str.length()<=2){
		  return str;}
		  int index=1;
		  String s="";
		  while(index<=str.length()-2){
		  if(str.charAt(index)!='x'){
		  s=s+str.charAt(index);
		  }
		  index++;
		  }
		  return str.charAt(0)+s+str.charAt(str.length()-1);
		}
	public String altPairs(String str) {
		  String result="";
		  int index=0;
		  while(index<=str.length()-1){
		   if(str.substring(index,str.length()).length()<=2){
		   result=result+str.substring(index,str.length());
		   }
		  else{
		  result=result+str.substring(index,index+2);}
		  index=index+4;
		  }
		  return result;
		}
	public String stringYak(String str) {
		  if(str.length()<3){
		  return str;
		  }
		  String result="";
		  int index=0;
		  while(index<=str.length()-1){
		  if(index<=str.length()-3 && str.substring(index,index+3).equals("yak")){
		  index=index+3;
		  }
		  else{
		  result=result+str.substring(index,index+1);
		  index++;}
		  }
		  
		  return result;
		}
	public int array667(int[] nums) {
		 int count=0;
		 int index=0;
		 while(index<=nums.length-1){
		 if(index<nums.length-1 && nums[index]==6 &&(nums[index+1]==6||nums[index+1]==7)){
		 count++;
		 }
		 index++;
		 }
		  return count;
		}
	public boolean noTriples(int[] nums) {
		 int count=0;
		 int result=0;
		 int index=0;
		 while(index<=nums.length-3){
		 if((nums[index]==nums[index+1])&&(nums[index+1]==nums[index+2])){
		 return false;
		 }
		 index++;
		 }
		 return true;
		}

	public static void main(String[] args){
		
		//System.out.println(stringMatch("xxcaazz", "xxbaaz") );
	}

}

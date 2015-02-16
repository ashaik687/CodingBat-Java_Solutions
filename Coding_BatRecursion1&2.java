/*********Coding Bat Java Recursion1 and Recursion2 Solutions***********************/
//Links of Questions http://codingbat.com/java/Recursion-1 ,  http://codingbat.com/java/Recursion-2
// The question name in the website corresponds to the Function name in my solutions
public class Recursion {

	public static int sumOfN(int n){
		if (n==1){
			return 1;
		}
		else{
			return n+sumOfN(n-1);	
		}
		
	} 
	public static int sumOfNsquares(int n){
		if (n==0){
			return 0;
		}
		else{
			System.out.println(n*n);
			return n*n+sumOfNsquares(n-1);	
		}	
	} 
	public int triangle(int rows) {
		  if(rows==0){
		  return 0;
		  }
		  else if(rows==1){
		  return 1;
		  }
		  else{
		  return rows+triangle(rows-1);
		  }
		}
	public static int fibonacci(int n) {
		  if(n==1){
		  return 1;
		  }
		  else if(n==2){
		  return 1;
		  }
		  else{
		  return (fibonacci(n-2)+fibonacci(n-1));
		  }
		}
	public static int countHi(String s){	
		if(s.length()<2){return 0;}
		else if(s.subSequence(0, 2).equals("hi")){
			return 1+countHi(s.substring(1));
		}
		else{
			return countHi(s.substring(1));
			}
	}
	public static String noX(String str) {
		  if (str.length()<= 0){
		  return "";
		  }
		  else if (str.subSequence(0,1).equals("x")){
		 System.out.println("came here");
			  return ""+noX(str.substring(1));
		  }
		  else{
		  return str.subSequence(0,1)+noX(str.substring(1));
		  }
		}	
	public static int strCopies(String Mai,String sub){
		if(Mai.length() < sub.length()){
			return 0;
		}
		else if (Mai.subSequence(0,sub.length()).equals(sub)){
			return 1 + strCopies(Mai.substring(1),sub);
		}
		else{
			return strCopies(Mai.substring(1),sub);
		}	
	}
	public int count7(int n) {
		  if(n==7){
		  return 1;}
		  else if(n<=9 && n!=7){
		  return 0;}
		  else{
		  return count7(n%10) + count7(n/10);
		  } 
		}
	public int factorial(int n) {
		  if(n==1){
		  return 1;}
		  else {
		  return n*factorial(n-1);
		  }
		}
	public int countX(String str) {
		  if(str.length()<1){
		  return 0;}
		  else if(str.charAt(0)=='x'){
		  return 1 + countX(str.substring(1));
		  }
		  else{
		  return countX(str.substring(1));
		  }
		}
	public String changePi(String str) {
		  if(str.length()<2){
		  return str;}
		  else if(str.subSequence(0,2).equals("pi")){
		  return "3.14"+changePi(str.substring(2));
		  }
		  else{
		  return str.subSequence(0,1)+changePi(str.substring(1));
		  }
		}
	public int array11(int[] nums, int index) {
		  if(index > nums.length-1){
		  return 0;
		  }
		  else if(nums[index]==11){
		  return 1+array11(nums,index+1);
		  }
		  else{
		  return array11(nums,index+1);}
		}
	public String pairStar(String str) {
		  if(str.length()<2){
		  return str;}
		  else if(str.subSequence(0,1).equals(str.subSequence(1,2))){
		  return str.subSequence(0,1)+"*"+pairStar(str.substring(1));
		  }
		  else{
		  return str.subSequence(0,1)+pairStar(str.substring(1));
		  }
		}
	public int countAbc(String str) {
		  if(str.length()<3){
		  return 0;}
		  else if(str.subSequence(0,3).equals("abc") || str.subSequence(0,3).equals("aba")){
		  return 1 + countAbc(str.substring(2));}
		  else{
		  return countAbc(str.substring(1));
		  }
		}
	public int countHi2(String str) {
		  if(str.length()<2){
		  return 0;
		  }
		  else if(str.subSequence(0,1).equals("x") && str.length()>=3){		     
		     if(str.subSequence(1,3).equals("hi")){
		      return countHi2(str.substring(2));
		      }  
		      else{
		      return countHi2(str.substring(1));   
		          }  
		  }
		  else if(str.subSequence(0,2).equals("hi")){
		      return 1 +countHi2(str.substring(2));      
		  }
		  else{
		      return countHi2(str.substring(1));
		  }
		}
	public int strCount(String str, String sub) {
		  if(str.length() < sub.length()){
		  return 0;
		  }
		  else if(str.subSequence(0,sub.length()).equals(sub)){
		  return 1+strCount(str.substring(sub.length()),sub);
		  }
		  else{
		  return strCount(str.substring(1),sub);
		  }
		}
	public int sumDigits(int n) {
		  if(n<10){
		  return n;
		  }
		  else{
		   return sumDigits(n/10)+sumDigits(n%10);
		  } 
		}
	public int powerN(int base, int n) {
		  if(n==1){
		  return base;}
		  else {
		  return base*powerN(base,n-1);}
		}
	public String changeXY(String str) {
		  if(str.length()<1){
		  return "";
		  }
		  else if(str.subSequence(0,1).equals("x")){
		  return "y"+changeXY(str.substring(1));
		  } 
		  else {
		  return str.subSequence(0,1)+changeXY(str.substring(1));
		  }
		}
	public boolean array6(int[] nums, int index) {
		  if(index>nums.length-1){
		  return false;
		  }
		  else if(nums[index]==6){
		  return true;}
		  else{
		  return array6(nums, index + 1);
		  }
	}
	public String allStar(String str) {
		  if(str.length()<2){
		  return str;}
		  else{
		  return str.subSequence(0,1)+"*"+allStar(str.substring(1));
		  }
		}
	public int countPairs(String str) {
		  if(str.length()<3){
		  return 0;}
		  else if(str.charAt(0)==str.charAt(2)){
		   return 1+countPairs(str.substring(1));
		  }
		  else{
		  return countPairs(str.substring(1));}
		}
	public String stringClean(String str) {
		  if(str.length()<2){
		  return str;}
		  else if(str.subSequence(0,1).equals(str.subSequence(1,2))){
		  return stringClean(str.subSequence(0,1)+str.substring(2));
		  }
		  else{
		  return str.subSequence(0,1)+stringClean(str.substring(1));
		  }
		}
	public int strDist(String str, String sub) {
		  if(str.length()<sub.length()){
		  return 0;
		  }
		  else if(str.equals(sub)){
			  return str.length();
		  }
		  else if(str.startsWith(sub)){
			  if(str.endsWith(sub)){
				  return str.length();
			  }
			  else{
				  return strDist(str.substring(0,str.length()-1),sub);
			  }
		  }
		  else {
			  return strDist(str.substring(1),sub);
		  }
	}
	public boolean nestParen(String str) {
		  if(str.length()==0){
		  return true;}
		  else if(str.charAt(0)=='(' && str.charAt(str.length()-1)==')') {
		  return nestParen(str.substring(1,str.length()-1));
		  }
		  else{
		  return false;}
		}
	/*******************************************Harder Recursion problems Java coding bat********************/
	public boolean groupSum(int start, int[] nums, int target) {
		  // Base case: if there are no numbers left, then there is a
		  // solution only if target is 0.
		  if (start >= nums.length) return (target == 0);
		  
		  // Key idea: nums[start] is chosen or it is not.
		  // Deal with nums[start], letting recursion
		  // deal with all the rest of the array.
		  
		  // Recursive call trying the case that nums[start] is chosen --
		  // subtract it from target in the call.
		  if (groupSum(start + 1, nums, target - nums[start])) return true;
		  
		  // Recursive call trying the case that nums[start] is not chosen.
		  if (groupSum(start + 1, nums, target)) return true;
		  
		  // If neither of the above worked, it's not possible.
		  return false;
		}
	public boolean groupSum6(int start, int[] nums, int target) {
		  if(start>nums.length-1){
		  return (target ==0);
		  }
		  else if(nums[start]==6){
		    return groupSum6(start+1,nums,target-nums[start]);
		  }
		  else if(groupSum6(start+1,nums,target-nums[start])){
		  return true;
		  }
		  else if(groupSum6(start+1,nums,target)){
		  return true;}
		  else{
		  return false;}
		}
	public boolean groupNoAdj(int start, int[] nums, int target) {
		  if(start>nums.length-1){
		  return (target==0);
		}  
		 else if(groupNoAdj(start+2,nums,target-nums[start])){
		 return true;}
		 else if(groupNoAdj(start+1,nums,target)){
		 return true;
		 }
		 else{
		 return false;}
		}
	public boolean groupSum5(int start, int[] nums, int target) {
		  if(start>nums.length-1){
		  return (target == 0);
		  }
		  else if(nums[start]%5==0){
		         if(start == nums.length-1){
		         return groupSum5(start+1,nums,target-nums[start]);
		         }
		         else if(nums[start+1]==1){
		          return groupSum5(start+2,nums,target-nums[start]);
		          }
		          else{
		          return (groupSum5(start+1,nums,target-nums[start]));
		          }
		  }
		  else if(groupSum5(start+1,nums,target-nums[start])){
		  return true;}
		  else if(groupSum5(start+1,nums,target)){
		  return true;}
		  else{
		  return false;}
		}
	public boolean groupSumClump(int start, int[] nums, int target) {
		  
		  if(start>nums.length-1){
		  return (target == 0);}
		  int i=start;
		  while(start<nums.length-1 && nums[start]== nums[start+1]){
		  start++;
		  }
		  if(groupSumClump(start+1,nums,target-(start-i+1)*nums[start])){
		  return true;
		  }
		  else if(groupSumClump(start+1,nums,target)){
		  return true;
		  }
		  else{
		  return false;}
		}
	/***************************************splitArray & helper functioncheck1*******************************/
	public boolean splitArray(int[] nums) {
		  return (check(nums,0,0,0));
		}
		public boolean check1(int[] nums,int index,int sum1,int sum2){
		if(index>nums.length-1){
		return (sum1==sum2);
		}
		else{
		return (check(nums,index+1,sum1+nums[index],sum2)) || (check(nums,index+1,sum1,sum2+nums[index]));
		}
		}
/***************************************splitOdd & helper functioncheck2*******************************/		
		public boolean splitOdd10(int[] nums) {
			  int index=0;
			  return(check(nums,0,0,0));
			}
			public boolean check2(int[] nums,int index,int sum1,int sum2){
			if(index>nums.length-1){
			  return (sum1%10==0)&& (sum2%2==1);
			  }
			else{
			return (check(nums,index+1,sum1+nums[index],sum2)||check(nums,index+1,sum1,sum2+nums[index]));
			}
			}
			/***************************************split53 & helper functioncheck*******************************/		
			public boolean split53(int[] nums) {
				  int index=0;
				  return check(nums,0,0,0);
				}
				public boolean check(int[] nums,int index,int sum1,int sum2){
				if(index>nums.length-1){
				return (sum1==sum2);
				}
				else if(nums[index]%5==0){
				return (check(nums,index+1,sum1+nums[index],sum2));
				}
				else if(nums[index]%3==0 & nums[index]%5!=0){
				return (check(nums,index+1,sum1,sum2+nums[index]));
				}
				else {
				return (check(nums,index+1,sum1+nums[index],sum2)||check(nums,index+1,sum1,sum2+nums[index]));
				}
				}		
	public static void main(String[] args){
		
	//System.out.println(Recursion.fibbna(4));
	
	}
}

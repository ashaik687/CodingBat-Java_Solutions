
public class Arrays2 {
	public int countEvens(int[] nums) {
		 int count=0;
		 int i=0;
		 while(i<=nums.length-1){
		 if(nums[i]%2==0){
		 count++;
		 }
		 i++;
		 }
		 return count;
		}
	public int bigDiff(int[] nums) {
		  int max=nums[0];
		  int min=nums[0];
		  int i=0;
		  while(i<=nums.length-1){
		  max=Math.max(max,nums[i]);
		  min=Math.min(min,nums[i]);
		  i++;
		  }
		  return max-min; 
	}
	public int centeredAverage(int[] nums) {
		  int max=nums[0];
		  int min=nums[0];
		  int sum=0;
		  int i=0;
		  while(i<=nums.length-1){
		  max=Math.max(max,nums[i]);
		  min=Math.min(min,nums[i]);
		  sum=sum+nums[i];
		  i++;
		  }
		  return (sum-max-min)/(nums.length-2);
		}
	public int sum13(int[] nums) {
		  int count=0;
		  int i=0;
		  while(i<=nums.length-1){
		  if(nums[i]==13){
		  i=i+2;
		  }
		  else{
		  count =count+nums[i];
		  i++;
		  }
		  }
		  return count;
		}
	public int sum67(int[] nums) {
		  int count=0;
		  int i=0;
		  int sum=0;
		  while(i<=nums.length-1){
		  if(nums[i]==6 || count==1){
		  i++;
		  count=1;
		  }
		  if(nums[i]==7 && count==1){
		  count=0;
		  i++;
		  }
		  else if(count==0){
		  sum=sum+nums[i];
		  i++;
		  }
		  }
		  return sum;
		}
	public boolean has22(int[] nums) {
		  if(nums.length<2){
		  return false;
		  }
		  int i=0;
		  while(i<=nums.length-2){
		  if(nums[i]==2 && nums[i+1]==2){
		  return true;
		  }
		  i++;
		  }
		  return false;
		}
	public boolean lucky13(int[] nums) {
		  if(nums.length<1){
		  return true;
		  }
		  for(int i=0;i<=nums.length-1;i++){
		  if(nums[i]==1 || nums[i]==3)
		     return false;
		  }
		  return true;
		}
	public boolean sum28(int[] nums) {
		  int sum=0;
		  for(int i=0;i<=nums.length-1;i++){
		    if(nums[i]==2)
		       sum=sum+2;
		  }
		  return sum==8;
		}
	public boolean more14(int[] nums) {
		  int count=0;
		  for(int i=0;i<=nums.length-1;i++){
		     if(nums[i]==1)
		       count++;
		     if(nums[i]==4)
		       count--;
		  }
		  return count>0;
		}
	public int[] fizzArray(int n) {
		  int[] result= new int[n];
		  for(int i=n-1;i>=0;i--){
		  result[i]=i;
		  }
		  return result;
		}
	public boolean only14(int[] nums) {
		  for(int i=0;i<=nums.length-1;i++){
		  if(nums[i]!=4 && nums[i]!=1)
		       return false;
		  }
		  return true;
		}
	public String[] fizzArray2(int n) {
		  String[] res = new String[n];
		  for(int i=n-1;i>=0;i--){
		  res[i]=String.valueOf(i);
		  }
		  return res;
		}
	public boolean no14(int[] nums) {
		  int count1=0;
		  int count4=0;
		  for(int i=0;i<=nums.length-1;i++){
		     if(nums[i]==1)
		        count1++;
		     if(nums[i]==4)
		        count4++;
		  }
		  return count1==0 || count4==0;
		}
	public boolean isEverywhere(int[] nums, int val) {
		  for(int i=0;i<=nums.length-2;i++){
		  if(nums[i]!=val && nums[i+1]!=val)
		         return false;
		  }
		  return true;
		}
	public boolean either24(int[] nums) {
		  boolean found2=false;
		  boolean found4=false;
		  for(int i=0;i<=nums.length-2;i++){
		     if(nums[i]==2 && nums[i+1]==2 ){
		       found2=true;
		  }
		     if(nums[i]==4 && nums[i+1]==4){
		        found4=true;
		     }
		  }
		  return found2^found4; 
		}
	public int matchUp(int[] nums1, int[] nums2) {
		  int count=0;
		  for(int i=0;i<=nums1.length-1;i++){
		     if(Math.abs(nums1[i]-nums2[i])<=2 && Math.abs(nums1[i]-nums2[i])>0)
		            count++;
		  }
		  return count;
		}
	public boolean has77(int[] nums) {
		  if(nums.length<2){
		  return false;
		  }
		  if(nums.length==2){
		  return nums[0]==7&&nums[1]==7;
		  }
		  for(int i=0;i<=nums.length-3;i++){
		      if(nums[i]==7){
		         if ((nums[i+1]==7 || nums[i+2]==7))
		            return true;
		       }
		  }
		  return false||(nums[nums.length-1]==7&&nums[nums.length-2]==7);
		}
	public boolean has12(int[] nums) {
		  boolean found1=false;
		  for(int i=0;i<=nums.length-1;i++){
		      if(nums[i]==1)
		       found1=true;
		      if(nums[i]==2 && found1)
		         return true; 
		  }
		  return false;
		}
	public boolean modThree(int[] nums) {
		  for(int i=0;i<=nums.length-3;i++){
		    if(nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0)
		           return true; 
		    if(nums[i]%2==1 && nums[i+1]%2==1 && nums[i+2]%2==1) 
		           return true;
		  }
		  return false;
		}
	public boolean haveThree(int[] nums) {
		  int count=0;
		  for(int i=0;i<=nums.length-2;i++){
		      if(nums[i]==3){
		         if(nums[i+1]==3){
		           return false;}
		           else{
		           count++;
		           }
		     }
		  }
		  count=nums[nums.length-1]==3?++count:count;
		  
		  return count==3;
		}
	public boolean twoTwo(int[] nums) {
		 if(nums.length<1){
		 return true;
		 }
		  int count=0;
		  for(int i=0;i<=nums.length-1;i++){
		   if(nums[i]==2){
		   count++;
		   }
		   else if(count==1){
		   return false;
		   }
		   else{
		   count=0;
		   }
		  }
		  return !(count==1);
		}
	public boolean sameEnds(int[] nums, int len) {
		  for(int i=0;i<=len-1;i++){
		      if(nums[i]!=nums[nums.length-len+i]){
		      return false;
		      }
		  }
		  return true;
		}
	public boolean tripleUp(int[] nums) {
		  for(int i=1;i<=nums.length-2;i++){
		      if(nums[i]==nums[i-1]+1){
		           if(nums[i+1]==nums[i]+1)
		              return true;
		      }
		  }
		  return false;
		}
	public int[] fizzArray3(int start, int end) {
		  int len=end-start;
		  int[] res=new int[end-start];
		   for(int i=0;i<=len-1;i++){
		       res[i]=start+i;
		   }
		   return res;
		}
	public int[] shiftLeft(int[] nums) {
		  if(nums.length<1){
		  return nums;
		  }
		  int temp=nums[0];
		  for(int i=0;i<=nums.length-2;i++){
		     nums[i]=nums[i+1];
		  }
		  nums[nums.length-1]=temp;
		  return nums;
		}
	public int[] tenRun(int[] nums) {
		  boolean found=false;
		  int temp=0;
		  for(int i=0;i<=nums.length-1;i++){
		     if(nums[i]%10==0){
		      found=true;;
		      temp=nums[i];
		     }
		     if(found){
		     nums[i]=temp;
		     }
		  }
		  return nums;
		}
	public int[] pre4(int[] nums) {
		  int[] result = new int[0]; 
		  boolean found=false;
		  for(int i=0;i<=nums.length-1;i++){
		       if(nums[i]==4 && !found){
		           result=new int[i];
		            found=true;;
		          for(int j=0;j<=i-1;j++){
		        result[j]=nums[j];
		         }
		         return result;
		       }  
		  }
		  return result;
		}
	public int[] post4(int[] nums) {
		  int temp=nums.length+1;
		  for(int i=0;i<=nums.length-1;i++){
		         if(nums[i]==4){
		          temp=i;
		          }
		  }
		  int[] result = new int[nums.length-temp-1]; 
		  for(int i=0;i<=nums.length-temp-2;i++){
		        result[i]=nums[temp+i+1];
		  }
		  return result;
		}
	public int[] notAlone(int[] nums, int val) {
		  if(nums.length<3){
		  return nums;
		  }
		  for(int i=1;i<=nums.length-2;i++){
		      if(nums[i]==val ){
		      nums[i]=Math.max(nums[i-1],nums[i+1]);
		      i++;
		      }
		  }
		  return nums;
		}
	public int[] zeroFront(int[] nums) {
		  int index1=-1;
		  int count=0;
		  int temp=0;
		  for(int i=0;i<=nums.length-1;i++){
		      if(nums[i]==0){
		         if(index1!=-1){
		          temp=nums[index1];
		          nums[index1]=0;
		          nums[i]=temp;
		          index1++; 
		         }
		      }
		      if(nums[i]!=0 && count==0){
		      index1=i;
		      count++;
		      } 
		  }
		  return nums;
		}
	public int[] withoutTen(int[] nums) {
		  int index10=-1;
		  int count=0;
		  for(int i=0;i<=nums.length-1;i++){
		     if(nums[i]==10){
		     nums[i]=0;
		     }
		     if(nums[i]==0 && count==0){
		         index10=i;
		         count++;
		     }
		     if(nums[i]!=0 && index10!=-1){
		        nums[index10]=nums[i];
		        nums[i]=0;
		        index10++;
		     }
		  }
		  return nums;
		}
	public int[] zeroMax(int[] nums) {
		  if(nums.length<2){
		  return nums;
		  }
		  int max=0;
		  for(int i=nums.length-1;i>=0;i--){
		      if(nums[i]%2==1){
		      max=Math.max(max,nums[i]); 
		      }
		      if(nums[i]==0){
		        nums[i]=max;   
		      }
		  }
		  return nums;
		}
	public int[] evenOdd(int[] nums) {
		  int indexodd=-1;
		  int count=0;
		  int temp=0;
		  for(int i=0;i<=nums.length-1;i++){
		     if(nums[i]%2==1 && count==0){
		         indexodd=i;
		         count++;
		     }
		     if(nums[i]%2==0 && indexodd!=-1){
		         temp=nums[indexodd];
		         nums[indexodd]=nums[i];
		         nums[i]=temp;
		         indexodd++;
		     }
		  }
		  return nums;
		}
	public String[] fizzBuzz(int start, int end) {
		  int len=end-start;
		  String[] result= new String[len];
		  for(int i=start;i<=end-1;i++){
		     if((i)%15==0){
		     result[i-start]="FizzBuzz";
		     }
		     else if((i)%5==0){
		     result[i-start]="Buzz";
		     }
		     else if((i)%3==0){
		     result[i-start]="Fizz";
		     }
		     else{
		     result[i-start]=String.valueOf(i);
		     }
		  }
		  return result;
		}
	public String[] mergeTwo(String[] a, String[] b, int n) {
		  String[] res = new String[n];
		  int j=0;
		  int counter1=0;
		  int counter2=0;
		  while(j<n){
		    if(a[counter1].compareTo(b[counter2])>0){
		       res[j]=b[counter2];
		       j++;
		       counter2++;
		       }
		    else if(a[counter1].compareTo(b[counter2])==0){
		       res[j]=b[counter2];
		       j++;
		       counter2++;
		       counter1++;
		    }
		    else{
		       res[j]=a[counter1];
		       j++;
		       counter1++;
		    }
		  }
		  return res;
	}
	public int commonTwo(String[] a, String[] b) {
		  int count = 0;
		  String str = "";
		  for (int i = 0; i < b.length; i++) {
		    for (int j = 0; j < a.length; j++) {
		      if (a[j].equals(b[i]) && !str.contains(a[j])) {
		        str += a[j];
		        count++;
		      }
		    }
		  }
		  return count;
		}
}

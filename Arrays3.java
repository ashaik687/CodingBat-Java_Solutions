
public class Arrays3 {
	public int maxSpan(int[] nums) {
		  int max=0;
		  int temp=0;
		  int temp1=0;
		  int span=0;
		  for(int i=0;i<=nums.length-1;i++){
		       temp=nums[i];       
		      for(int j=i+1;j<=nums.length-1;j++){
		           if(nums[j]==temp){
		           max=j;
		           }
		      }
		      span=Math.max(max-i+1,span);
		      
		  }
		  return span;
	}
	public int[] fix34(int[] nums) {
		  int temp=-1;
		  int index=nums.length;
		  for(int i=0;i<=nums.length-1;i++){
		    if(nums[i]==3){
		      temp=i;
		      index=Math.min(index,temp);
		      for(int j=index+1;j<=nums.length-1;j++){
		      if(nums[j]==4){
		       int temp1=nums[temp+1];
		       nums[temp+1]=4;
		       nums[j]=temp1;
		       index=temp+2;
		      }
		      }
		    }
		  }
		  return nums;
		}
	public int[] fix45(int[] nums) {
		 int index=0;
		 for(int i=0;i<=nums.length-2;i++){
		   if(nums[i]==4 &&nums[i+1]!=5){
		    for(int j=index;j<=nums.length-1;j++){
		      if(nums[j]==5 && j==0){
		         nums[0]=nums[i+1];
		         nums[i+1]=5;
		         index++;
		       }
		       if(nums[j]==5 && nums[j-1]!=4){
		         nums[j]=nums[i+1];
		         nums[i+1]=5;
		       index=j;
		       break;
		       }
		    }
		   }
		 
		 }
		 return nums;
		}
public boolean canBalance(int[] nums) {
	  if(nums.length<1){
	  return false;
	  }
	  int prevSum=nums[0];
	  for(int i=1;i<=nums.length-1;i++){
	    int nextSum=0;
	     for(int j=i;j<=nums.length-1;j++){
	      nextSum=nextSum+nums[j];
	     }
	  if(prevSum==nextSum)
	    return true;
	  prevSum=prevSum+nums[i];
	  }
	  return false;
	}
public boolean linearIn(int[] outer, int[] inner) {
	  if(inner.length<1){
	  return true;
	  }
	  int inter=0;
	  int temp=inner[inter];
	  for(int i=0;i<=outer.length-1;i++){
	     if(temp==outer[i] && inter<=inner.length-2){
	     temp=inner[++inter];
	     }
	     if(inter==inner.length-1){
	        if(inner[inter]==outer[i]){
	        return true;
	        }
	     }
	  }
	  return false;
	}
public int[] squareUp(int n) {
	  int len=n*n;
	  int[] result=new int[len];
	  if(n==0){
	  return result;
	  }
	  result[n-1]=1;
	  for(int i=1;i<=n-1;i++){
	    for(int j=0;j<=n-1;j++){
	        result[n*i+j]=result[n*(i-1)+j];
	    }
	    result[(n*i)+(n-i-1)]=i+1;
	  }
	  return result;
	}
public int[] seriesUp(int n) {
	  int len=n*(n+1)/2;
	  int[] result= new int[len];
	  if(n<1){
	  return result;
	  }
	  int count=0;
	  result[count]=1;
	  for(int i=1;i<=n-1;i++){
	     for(int j=1;j<=i+1;j++){
	         result[++count]=j;
	     } 
	  }
	  return result;
	}
public int countClumps(int[] nums) {
	  int count=0;
	  boolean found=false;
	  for(int i=0;i<=nums.length-2;i++){
	     if(nums[i]==nums[i+1] && !found){
	       count++;
	      found=true;;  
	     }  
	     else if(nums[i]!=nums[i+1]){
	     found=false;
	     }
	  }
	  return count;
	}
}

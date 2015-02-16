
public class Arrays1 {

	public boolean firstLast6(int[] nums) {
		  return (nums[0]==6||nums[nums.length-1]==6);
		}
	public boolean sameFirstLast(int[] nums) {
		  return nums.length>=1&&(nums[0]==nums[nums.length-1]);
		}
	public int[] makePi() {
		  int[] pi = new int[3];
		  pi[0]=3;
		  pi[1]=1;
		  pi[2]=4;
		  return pi;
		}
	public boolean commonEnd(int[] a, int[] b) {
		  return a[0]==b[0]||a[a.length-1]==b[b.length-1];
		}
	public int sum3(int[] nums) {
		  return nums[0]+nums[1]+nums[2];
		}
	public int[] rotateLeft3(int[] nums) {
		  int[] result=new int[3];
		  result[0]=nums[1];
		  result[1]=nums[2];
		  result[2]=nums[0];
		  return result;
		}
	public int[] reverse3(int[] nums) {
		  int[] result =new int[3];
		  result[0]=nums[nums.length-1];
		  result[1]=nums[nums.length-2];
		  result[2]=nums[nums.length-3];
		  return result;
		}
	public int[] maxEnd3(int[] nums) {
		  int temp = Math.max(nums[0],nums[nums.length-1]);
		  int[] result = new int[] {temp,temp,temp};
		  return result;
		}
	public int sum2(int[] nums) {
		  if(nums.length<1){
		  return 0;
		  }
		  if(nums.length<2){
		  return nums[0];
		  }
		  return nums[1]+nums[0];  
		}
	public int[] middleWay(int[] a, int[] b) {
		  int[] result =new int[] {a[(a.length/2)],b[(b.length/2)]};
		  return result;
		}
	public int[] makeEnds(int[] nums) {
		  int[] result = new int[] {nums[0],nums[nums.length-1]};
		  return result;
		}
	public boolean has23(int[] nums) {
		  return nums[0]==2||nums[0]==3||nums[1]==2||nums[1]==3;
		}
	public boolean no23(int[] nums) {
		  return !(nums[0]==2||nums[0]==3||nums[1]==2||nums[1]==3);
		}
	public int[] makeLast(int[] nums) {
		  int[] result = new int[nums.length*2];
		  result[result.length-1]=nums[nums.length-1];
		  return result;
		}
	public boolean double23(int[] nums) {
		  if(nums.length<2){
		  return false;}
		  return nums[0]==nums[1]&&(nums[0]==3||nums[0]==2);
		}
	public int[] fix23(int[] nums) {
		  if(nums[0]==2&&nums[1]==3){
		     nums[1]=0;
		  return nums;
		  }
		  if(nums[1]==2&&nums[2]==3){
		     nums[2]=0;
		  return nums;
		  }
		  return nums;
		}
	public int start1(int[] a, int[] b) {
		  int count=0;
		  if(a.length>0 && a[0]==1){
		  count++;
		  }
		  if(b.length>0 && b[0]==1){
		  count++;
		  }
		  return count;
		}
	public int[] biggerTwo(int[] a, int[] b) {
		  return a[0]+a[1]>=b[0]+b[1]?a:b;
		}
	public int[] makeMiddle(int[] nums) {
		  int[] result = new int[] {nums[(nums.length/2)-1],nums[(nums.length/2)]};
		  return result;
		}
	public int[] plusTwo(int[] a, int[] b) {
		  int[] result = new int[] {a[0],a[1],b[0],b[1]};
		  return result;
		}
	public int[] swapEnds(int[] nums) {
		  int temp= nums[nums.length-1];
		  nums[nums.length-1]=nums[0];
		  nums[0]=temp;
		  return nums;
		}
	public int[] midThree(int[] nums) {
		  int a= nums.length/2;
		  int[] result = new int[] {nums[a-1],nums[a],nums[a+1]};
		  return result; 
		}
	public int maxTriple(int[] nums) {
		  int temp = Math.max(nums[0],nums[nums.length/2]);
		  return Math.max(temp,nums[nums.length-1]);
		}
	public int[] frontPiece(int[] nums) {
		  if(nums.length<3){
		  return nums;
		  }
		  int[] result=new int[] {nums[0],nums[1]};
		  return result;
		}
	public boolean unlucky1(int[] nums) {
		  if (nums.length < 2) {
		    return false;
		  } else if ((nums[0] == 1 && nums[1] == 3) || (nums[nums.length-2] == 1 && nums[nums.length-1] == 3)) {
		      return true;
		    } else if (nums.length > 2 && nums[1] == 1 && nums[2] == 3) {
		        return true;
		    } else
		      return false;     
		}
	public int[] make2(int[] a, int[] b) {
		  int s1=0,s2=0;
		  if(a.length<1){
		  s1=b[0];
		  s2=b[1];
		  }
		  if(a.length==1){
		  s1=a[0];
		  s2=b[0];
		  }
		  if(a.length>1){
		  s1=a[0];
		  s2=a[1];
		  }
		  int[] result = new int[] {s1,s2};
		  return result;
		  
		}
	public int[] front11(int[] a, int[] b) {
		  int s1=0,s2=0;
		  if(a.length<1&&b.length<1){
		  return b;
		  }
		  if(a.length<1){
		  int[] result = new int[] {b[0]};
		  return result;
		  }
		  else if(b.length<1){
		  int[] result = new int[] {a[0]};
		  return result;
		  }
		  else{
		  s1=a[0];
		  s2=b[0];
		  }
		  int[] result = new int[] {s1,s2};
		  return result;
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

import java.awt.List;
import java.util.ArrayList;


public class Ap1 {

	public boolean scoresIncreasing(int[] scores) {
		  for(int i=0;i<=scores.length-2;i++){
		  if (!(scores[i]<=scores[i+1]))
		    return false;
		  }
		  return true;
		}
	public boolean scores100(int[] scores) {
		  for(int i=0;i<=scores.length-2;i++){
		  if(scores[i]==100 && scores[i+1]==100)
		     return true;
		  }
		  return false;
		}
	public boolean scoresClump(int[] scores) {
		  for(int i=0; i<=scores.length-3;i++){
		   if(Math.abs(scores[i]-scores[i+1])<=2 && Math.abs(scores[i]-scores[i+2])<=2)
		      return true;
		  }
		  return false;
		}
	public int scoresAverage(int[] scores) {
		  int sum1=0;
		  int sum2=0;
		  for(int i=0;i<scores.length/2;i++){
		  sum1= sum1+ scores[i];
		  }
		  sum1=sum1/(scores.length/2);
		  for(int i=scores.length/2;i<=scores.length-1;i++){
		  sum2= sum2+ scores[i];
		  }
		  sum2=sum2/(scores.length-scores.length/2);
		  return (sum1>=sum2)?sum1:sum2;
		}
	public int wordsCount(String[] words, int len) {
		  int count=0;
		  for(int i=0;i<=words.length-1;i++){
		  if(words[i].length()==len)
		      count++;
		  }
		  return count;
		}
	public String[] wordsFront(String[] words, int n) {
		  String[] res = new String[n];
		  for(int i=0;i<=n-1;i++){
		    res[i]=words[i];
		  }
		  return res;
		}
	public List wordsWithoutList(String[] words, int len) {
		  List res = new ArrayList();
		  for(int i=0;i<=words.length-1;i++){
		  if(words[i].length()!=len)
		     res.add(words[i]);
		  }
		  return res;
		}
	public boolean hasOne(int n) {
		 while(n>9){
		 if(n%10==1)
		    return true;
		   n=n/10;
		 } 
		 return n==1;
		}
	public boolean dividesSelf(int n) {
		  int tmp=n;
		  while(tmp>9){
		    int x = tmp%10;
		    if(x==0)
		       return false;
		    if(n%x!=0)
		       return false;
		       tmp=tmp/10;
		  }
		  return n%tmp==0;
		}
	public int[] copyEvens(int[] nums, int count) {
		  int[] res = new int[count];
		  int j=0;
		  for(int i=0; i<=nums.length-1;i++){
		    if(j<=count-1 && nums[i]%2==0){
		       res[j]=nums[i];
		       j++;
		       }   
		  }
		  return res;
		}
	public int[] copyEndy(int[] nums, int count) {
		  int[] res = new int[count];
		  int j=0;
		  for(int i=0;i<=nums.length-1;i++){
		   if((j<=count-1)&&(nums[i]>=1 && nums[i]<=10) ||( nums[i]>=90 && nums[i]<=100)){
		     res[j]=nums[i];
		     j++;
		   }
		  }
		  return res;
		}
	public int matchUp(String[] a, String[] b) {
		   int count=0;
		   for(int i=0;i<=a.length-1;i++){
		     if(a[i]!="" && b[i]!="" && a[i].substring(0,1).equals(b[i].substring(0,1))){
		     count++;
		     }
		   }   
		   return count;
		}
	public int scoreUp(String[] key, String[] answers) {
		  int count=0;
		  for(int i=0;i<=answers.length-1;i++){
		    if(answers[i].equals("?")){}
		    else if(key[i].equals(answers[i])){
		        count=count+4;}
		    else{
		    count--;
		    }
		  }
		  return count;
		}
	public String[] wordsWithout(String[] words, String target) {
		  ArrayList res1 = new ArrayList();
		  for(int i=0;i<=words.length-1;i++){
		    if(!words[i].equals(target)){
		    res1.add(words[i]);
		    }
		  }
		  String[] res= (String[])res1.toArray(new String[res1.size()]);
		  return res;
		}
	public int scoresSpecial(int[] a, int[] b) {
		  return special(a)+special(b);
		}
		public int special(int[] a){
		  int count=0;
		  for(int i=0;i<=a.length-1;i++){
		   if(a[i]%10==0 && a[i]>count)
		   count=a[i];
		  }
		  return count;
		}
		public int sumHeights(int[] heights, int start, int end) {
			  int res=0;
			  for(int i=start;i<=end-1;i++){
			   res=res+Math.abs(heights[i]-heights[i+1]);
			  }
			  return res;
			}
		public int sumHeights2(int[] heights, int start, int end) {
			  int res=0;
			  for(int i=start;i<=end-1;i++){
			   if(heights[i+1]-heights[i]>0){
			   res=res+2*Math.abs(heights[i]-heights[i+1]);
			   }
			   else{
			   res=res+Math.abs(heights[i]-heights[i+1]);
			   }
			  }
			  return res;
			}
		public int bigHeights(int[] heights, int start, int end) {
			  int count=0;
			  for(int i=start;i<=end-1;i++){
			    if(Math.abs(heights[i]-heights[i+1])>=5)
			       count++;
			  }
			  return count;
			}
		public int userCompare(String aName, int aId, String bName, int bId) {
			  if(aName.compareTo(bName)==0){
			     if(aId>bId){
			       return 1;}
			       else if(aId==bId){
			       return 0;
			       }
			       else{
			       return -1;
			       }
			  }
			  return aName.compareTo(bName)>0?1:-1;
			}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

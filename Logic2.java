
public class Logic2 {
	public boolean makeBricks(int small, int big, int goal) {
		  if(goal>small+big*5) return false;
		  if(goal%5>small) return false;
		  return true;
		}
	public int loneSum(int a, int b, int c) {
		  if(a==b && b==c)
		     return 0;
		  if(a==b) return c;
		  if(b==c) return a;
		  if(a==c) return b;
		  return a+b+c;
		}
	public int luckySum(int a, int b, int c) {
		  if(a==13) return 0;
		  if(b==13) return a;
		  if(c==13) return a+b;
		  return a+b+c;
		}
	
	
	public int noTeenSum(int a, int b, int c) {
		  return isTeen(a)+isTeen(b)+isTeen(c);
		}
		public int isTeen(int a){  // Helper function for noTeenSum
		  if(a==13 || a==14 || (a>=17 && a<=19))
		     return 0;
		  return a;
		}
	public int roundSum(int a, int b, int c) {
			  return rounded(a)+rounded(b)+rounded(c);
			}
			public int rounded(int a){
			   if(a%10>=5)
			     return (a/10)*10+10;
			   if(a%10<5)
			     return (a/10)*10;
			     return a;
			}
			
	public boolean closeFar(int a, int b, int c) {
			     if(Math.abs(a-b)<=1 && Math.abs(c-a)>=2 && Math.abs(c-b)>=2)
			       return true;
			     if(Math.abs(a-c)<=1 && Math.abs(b-a)>=2 && Math.abs(c-b)>=2)
			       return true;       
			     return false; 
			}
	public int blackjack(int a, int b) {
		  if(a>21 && b>21)
		    return 0;
		  if(a>21) return b;
		  if(b>21) return a;
		  return Math.abs(a-21)<=Math.abs(b-21)?a:b;
		}
	public boolean evenlySpaced(int a, int b, int c) {   /// Good technique to sort
		   int small= a>=c?c:a;
		   int med= b;
		   int large=a>c?a:c;
		   if(b<small){
		     int i=small;
		     small=b;
		     med=i;
		   }
		   if(b>large){
		     int i=large;
		     large=b;
		     med=i;
		   }
		   return Math.abs(large-med)==Math.abs(med-small);    
		}
	public int makeChocolate(int small, int big, int goal) {
		  if(goal>big*5+small)
		     return -1;
		  if(goal/5>=big)
		    return goal-big*5;
		    if(goal%5<=small)
		     return goal%5;
		     return -1;
		}

		public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

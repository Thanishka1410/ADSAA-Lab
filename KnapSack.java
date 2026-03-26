import java.util.*;
public class KnapSack{
	static int n=4;
	static int w=16;
	static int[] weight={2,5,10,5};
	static int[] profit={40,30,50,10};
	static int max=0;
	static void knapsac(int i,int currentw,int currentP){
		if(currentw<=w && currentP>max){
		    max=currentP;
		}
		if(i<n){
			knapsac(i+1,currentw+weight[i],currentP+profit[i]);
			knapsac(i+1,currentw,currentP);
		}
	}
	
	public static void main(String[] args){
		knapsac(0,0,0);
		System.out.println("Maximum Profit="+max);
	}
}	


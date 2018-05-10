//dynamic programming
public class KnapSack {
	int maximum(int a, int b) { return (a > b)? a : b; }
	
public int findSolution(int val[],int wt[],int max,int n)
{
	
    int K[][] = new int[n+1][max+1];
     
    int i, w;
    for (i = 0; i <= n; i++)
    {
        for (w = 0; w <= max; w++)
        {
            if (i==0 || w==0)
                 K[i][w] = 0;
            else if (wt[i-1] <= w)
                  K[i][w] = maximum(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
            else
                  K[i][w] = K[i-1][w];
        }
     }
     
     return K[n][max];
}


	public static void main(String[] args) {
		int val[]= {12,20,10,34,40};
		int weights[]= {10,20,25,15,30};
		int max_wt=50;
		int n=val.length;
		KnapSack kp=new KnapSack();
		int solution=kp.findSolution(val,weights,max_wt,n);
		
		System.out.println(solution);
	}

}

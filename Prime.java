import java.util.*;


public class Prime{

	public static void main(String[] args) {
		System.out.println("limit:");
		Scanner input=new Scanner(System.in);
		int limit=input.nextInt();
		//System.out.println(limit);
		int[] prim=new int[50];
		int c,k=0;
		for(int i=2;i<=limit;i++)
		{
			c=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					c=1;
			}
			if(c==0&&(i%2)!=0)
				{
					prim[k]=i;
					k++;
				}
		}
		int sum,diff,temp1=0,temp2=0;
		int m=Integer.MAX_VALUE;
		for (int i=0;i<k;i++) {
			for(int j=i+1;j<k;j++){
				sum=prim[i]+prim[j];
				diff=prim[j]-prim[k];
				if(sum==limit&&diff<=m)
				{
					temp1=prim[i];
					temp2=prim[j];
					m=diff;
				}

			}
		}
		System.out.println(temp1+"    "+temp2);
		/*for (int i=0;i<k;i++) {

			System.out.println(prim[i]);
		}*/
		
	}
}
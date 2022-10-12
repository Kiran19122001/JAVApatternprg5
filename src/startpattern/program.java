 package startpattern;

public class program {

	public static void main(String[] args) {
		int i;
		int j;
		int n=10;
		int k;
		for(i=1;i<=n;i++)
		{
			for(k=1;k<=n-i+1;k++)
			{
		        
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				if(j==1||j==i||i==n)
				{
				    System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}System.out.println();
		}
	}

}

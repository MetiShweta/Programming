/*   1
    12
   123
  1234*/

package Patternprograms;

public class Pattern1 {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++)
		{
			int k=1;
			for(int j=1;j<=n;j++)
			{
				if((i+j)>=(n+1))
					System.out.print(k++);
				//k++
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}



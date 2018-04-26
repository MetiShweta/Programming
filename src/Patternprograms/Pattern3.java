/*5     
  4 4    
  3 3 3   
  2 2 2 2  
  1 1 1 1 1  */
package Patternprograms;

public class Pattern3 {

	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=1;j--)
			{
				if(i<=j)
					System.out.print(i+" ");
				else
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}

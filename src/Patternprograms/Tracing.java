package Patternprograms;

public class Tracing {

	public static void main(String[] args) {
		int x=1;
		int y=1;
		for(int i=1;i<=5;i++)
		{
			if(x<y)
				 y=10;
			x++;
		}
		System.out.println(x);
		System.out.println(y);
	}

}

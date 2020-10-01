public class LoopProgram
{
	public static void main(String[] args)
	{
		int height = 20;
		int width = 40;
		for(int i=0;i<=(height/2);i++)
		{
			System.out.print(" ");
			for(int k=height;k>0;k--)
			{	
				if(k<=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=2;j<width+1;j++)
			{
				if(j<=i)
					System.out.print("*");	
			}
			System.out.println();
		}
		for(int i=(height/2)-1;i>0;i--)
		{
			System.out.print("  ");
			for(int k=height-1;k>0;k--)
			{
				if(k<=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=1;j<i;j++)
			{
				if(j<i)
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
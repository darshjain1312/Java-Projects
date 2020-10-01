public class table
{
	public static void main(String args[])
	{
		int i,j;
		int range1 = Integer.parseInt(args[0]);
		int range2 = Integer.parseInt(args[1]);
		for(i=1;i<21;i++)
		{
			for(j=1;j<21;j++)
			{
				
				System.out.print("\t"+i*j);
			}
			System.out.println();
		}
		System.out.println();
		for(int vert=1;vert<(range2+1);vert++)
		{
			for(int hori=range1;hori<(range2+1);hori++)
			{
				System.out.print("\t"+vert*hori);
			}
			System.out.println();	
		}
	}
}
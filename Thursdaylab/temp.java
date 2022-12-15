import java.util.Scanner;
class temp
	{
		public static void main(String[]args)
		{
			int a[][]=new int[2][7];
			Scanner sc=new Scanner(System.in);
			float Avg=0;
			int sum=0;
			for(int i=0; i<a.length; i++)
			{
				if(i==0)
				{System.out.println("ENTER THE FIRST CITY TEMP :");}
				else
				{System.out.println("ENTER THE SECOND CITY TEMP :");}
				for(int j=0; j<a[i].length; j++)
				{
					System.out.println("Day No."+(j+1));
					a[i][j]=sc.nextInt();
					
					
				}
			}		
			
				
			System.out.println();
			System.out.println("------------------  Disply    ------------------");
			for(int i=0; i<a.length; i++)
			{
				if(i==0)
				{System.out.println("FIRST WEEK TEMP : ");}
				else
				{System.out.println("SECOND WEEK TEMP   :");}
				for(int j=0; j<a[i].length; j++)
				{
					System.out.print(a[i][j]+"   ");
				}
				System.out.println();
			}
			
		}
            
    }
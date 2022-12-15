import java.util.*;
public class pronic {
    public static void main(String[]args)
    {
        Scanner in= new Scanner (System.in);
        System.out.println("Enter the Number : ");
        int n=in.nextInt();
        for(int i=0;i<=n;i++)
        {
            if(n/i==0)
            {
                if(i*(i++)=n || i*(i--)=n)
                System.out.println("This pronic Number : ");
                else
                System.out.println("This Non pronic Number : ");
            }
        }
    }
}

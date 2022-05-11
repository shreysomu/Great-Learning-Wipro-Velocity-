import java.util.Scanner;

public class HandsOn1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows");
          int rows = in.nextInt();
        for (int i=1; i<=rows; i++) 
        { 
            //  space 
            for (int j=rows; j>i; j--)
            {
               System.out.print(" ");
            }
            // star
            for (int k=1; k<=(i * 2) -1; k++)
            {
                System.out.print("*" );
           
            }
            System.out.println();
        }  
    }
}

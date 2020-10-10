import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args) {
        long a = 0, b = 1, c = 1;
        Scanner sc = new Scanner(System.in);
        
        int iterations = sc.nextInt();
        
        for(int i = 0; i < iterations; i++)
        {
            c = (b + a);
            a = b;
            b = c;
            
            System.out.println("");
            for(long d = c; d > 0; d--)     
            {
                System.out.print("#");
            }
            
            System.out.print(c);
        }
    }
}

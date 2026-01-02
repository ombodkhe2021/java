import java.util.*;

class basic{
    public static void main (String[]arg)
    {
       // System.out.println("This is first java program");
       // Q2)
       // int a = 25;
       //System.out.println(a);
       //float b = 2.5f;
       //System.out.println(b);
       //char c = 'O';
       //System.out.println(c);
       //Q3)
        
       Scanner sc = new Scanner(System.in);
       /* 
       System.out.print(" Enter the number a : ");
       int a = sc.nextInt();
       System.out.print("Enter the number b :");
       int b = sc.nextInt();
       int sum = a + b;
       System.out.println("Sum of a and b :" +sum);
       int sub = a - b;
       System.out.println("sub of a and b are : " +sub );
       int multi = a*b;
       System.out.println("Multi of a and b are :" +multi);
       int div = a/b;
       System.out.println("division of a and b are :" +div);
*/
       System.out.print("Enter the length : ");
       int l = sc.nextInt();
       System.out.print("Enter the breadth : ");
       int b = sc.nextInt();
       int area = l*b;
       System.out.println(" The area of rectangle :"  +area );



       

    }
}
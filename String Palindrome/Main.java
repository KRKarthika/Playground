import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      String s1=sc.nextLine();
      StringBuffer sb1 = new StringBuffer(s1);
      sb1.reverse();
      String s2=sb1.toString();
      if(s1.equals(s2))
         {
           System.out.println("Yes");
         }
         else
         System.out.println("No");
    } 
}
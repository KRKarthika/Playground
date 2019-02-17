import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int fd = n /100;
    int sd = n /10%10;
    int ld = n %10;
    int rev = ((ld*100) + (sd*10) + (fd));
    System.out.println(rev);
  }
}
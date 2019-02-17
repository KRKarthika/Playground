import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      System.out.print(sq(n));
	} 
  public static int sq(int a)
  {
    int res = a*a;
    return res;
  }
}
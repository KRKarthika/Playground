import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n1=n%100;
      int n2=n1/10;
      System.out.println(n2);
	}
}
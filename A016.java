package Algorithm1;

import java.util.Scanner;

public class A016 {
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  int x=scanner.nextInt();
	  int n=scanner.nextInt();
	  System.out.println(cube(x,n));
  }
  public static int cube(int x, int n) {
     return (int)(Math.pow(x, n));
  }
}
 
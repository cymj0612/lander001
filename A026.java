package Algorithm1;

import java.util.Arrays;
import java.util.Scanner;

public class A026 {
  public static int  maxSubArray(int[] array) {
	  int n=array.length;
	  int csum=0;
	  int sum=0;
	  for(int i=0;i<n;i++) {
		  csum += array[i];
		  if(csum<0) {
			  csum=0;
		  }
		  if(csum>sum) {
			  sum = csum;
		  }
	  }
	  if(sum==0) {
		  sum = array[0];
		  for(int i=0;i<n;i++) {
			  if(sum < array[i]) {
				  sum = array[i];
			  }
		  }
	  }
	  return sum;
  }
  public static void main(String []args){
  	Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		scanner.close();
		String num[] = number.split(" ");//将字符用空格分开
		int[] array = new int[num.length];
		for(int i=0;i<num.length;i++) {
			array[i] = Integer.parseInt(num[i]);//将索引对应的字符赋值给整形数组
		}
		System.out.println(maxSubArray(array));
  }
}

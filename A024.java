package Algorithm1;

import java.util.Arrays;
import java.util.Scanner;

public class A024 {
	 public static void main(String []args){
	    	Scanner scanner = new Scanner(System.in);
			String number = scanner.nextLine();
			int a = scanner.nextInt();
			scanner.close();
			String num[] = number.split(" ");//将字符用空格分开
			int[] array = new int[num.length];
			for(int i=0;i<num.length;i++) {
				array[i] = Integer.parseInt(num[i]);//将索引对应的字符赋值给整形数组
			}
			Arrays.sort(array);
			int floor=0;
			int ceil=0;
			for(int i=0;i<array.length-1;i++) {
				if(array[i]==a && array[i+1]>a) {
				  	floor=a;//小于等于的最大整数
				    ceil=a;//大于等于的最大整数
				}
				else if(array[i]<a && array[i+1]>a) {
					floor=array[i];//小于等于的最大整数
				    ceil=array[i+1];//大于等于的最大整数
				}
			}
			System.out.print(ceil+" "+floor);
   }
}

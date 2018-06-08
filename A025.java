package Algorithm1;

import java.util.Scanner;

public class A025 {
	 public static void main(String []args){
	    	Scanner scanner = new Scanner(System.in);
			String number = scanner.nextLine();
			scanner.close();
			String num[] = number.split(" ");//将字符用空格分开
			int[] array = new int[num.length];
			for(int i=0;i<num.length;i++) {
				array[i] = Integer.parseInt(num[i]);//将索引对应的字符赋值给整形数组
			}
			 rotate(array);
   }
	 
	 public static void rotate(int[] array) {
		 int index=0;
		 for(int i=array.length-1;i>0;i--) {
			 if(array[i-1]>array[i]) {
				 index=i;
				 break;
			 }
		 }
		 int rotate=array.length-index;
		 System.out.println("The array is rotated "+ rotate+" times");
	}	
}

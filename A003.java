package Algorithm1;

import java.util.Scanner;

public class A003 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
			String number = scanner.nextLine();
			scanner.close();
			String num[] = number.split(" ");//将字符用空格分开
			int[] array = new int[num.length];
			for(int i=0;i<num.length;i++) {
				array[i] = Integer.parseInt(num[i]);//将索引对应的字符赋值给整形数组
			}
			 bubbleSort(array);
			  for(int i=0;i<array.length;i++) {
				  System.out.print(array[i]+" ");
			 }
   }
	 public static void bubbleSort(int[] a) {
		    for(int i=0;i<a.length;i++) {
		    	for(int j=1;j<a.length-i;j++) {
		    		if(a[j-1]>a[j]) {
		    			int temp = a[j-1];
		    			a[j-1] = a[j];
		    			a[j] = temp;
		    		}
		    	}
		    }
	 }
}

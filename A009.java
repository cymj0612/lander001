package Algorithm1;

import java.util.Scanner;

public class A009 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
			String number = scanner.nextLine();
			scanner.close();
			String num[] = number.split(" ");//将字符用空格分开
			int[] array = new int[num.length];
			for(int i=0;i<num.length;i++) {
				array[i] = Integer.parseInt(num[i]);//将索引对应的字符赋值给整形数组
			}
			for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-1;j++) {
					if(array[j]==0) {
						int temp = array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
					}
				}
			}
			for(int k=0;k<array.length;k++) {
	    		System.out.print(array[k]+" ");
	    	  }
   }
}
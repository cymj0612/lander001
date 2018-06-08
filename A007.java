package Algorithm1;

import java.util.Scanner;

public class A007 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
			String number = scanner.nextLine();
			scanner.close();
			String num[] = number.split(" ");//将字符用空格分开
			int[] array = new int[num.length];
			for(int i=0;i<num.length;i++) {
				array[i] = Integer.parseInt(num[i]);//将索引对应的字符赋值给整形数组
			}
	int m=0;
	int n=0;
	for(int i=1;i<array.length-1;i++) {
	if(array[i-1]>array[i]) {
		m=i-1;
		break;
	}
  }
	for(int j=array.length-1;j>=2;j--) {
		if(j==array.length-1 && array[array.length-2]>array[array.length-1]) {
			n=j;
			break;
		}else if(array[j-1]<array[j] && array[j-2]>array[j-1]) {
			n=j-1;
			break;
		}
	}
   System.out.println("Sort array from index "+ m+ " to " +n);
	}
}
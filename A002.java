package Algorithm1;

import java.util.Scanner;

public class A002 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
			String number = scanner.nextLine();
			scanner.close();
			String num[] = number.split(" ");//将字符用空格分开
			int[] array = new int[num.length];
			for(int i=0;i<num.length;i++) {
				array[i] = Integer.parseInt(num[i]);//将索引对应的字符赋值给整形数组
			}
			 selectSort(array);
			  for(int i=0;i<array.length;i++) {
				  System.out.print(array[i]+" ");
			 }
    }
	
	public static void selectSort(int[] array) {
		 for(int j=0;j<array.length;j++) {
			   int min=array[j];
			   int n=j;//最小数对应的索引
		for(int k=j+1;k<array.length;k++) {
			if(array[k]<min) {
				min=array[k];
				n=k;
			}
		} 
		array[n]=array[j];
		array[j]=min;  //如果array[k]<array[j],将两者的值互换
   }
  }
}

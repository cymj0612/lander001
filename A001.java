package Algorithm1;

import java.util.Scanner;

public class A001 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
			String number = scanner.nextLine();
			scanner.close();
			String num[] = number.split(" ");//���ַ��ÿո�ֿ�
			int[] array = new int[num.length];
			for(int i=0;i<num.length;i++) {
				array[i] = Integer.parseInt(num[i]);//��������Ӧ���ַ���ֵ����������
			}
			 insertionSort(array);
			  for(int i=0;i<array.length;i++) {
				  System.out.print(array[i]+" ");
			 }
     }
	
			public static void insertionSort(int[] array) {
				  for(int i=1;i<array.length;i++) {
					  for(int j=i;(j>0 && array[j] < array[j-1]);j--) {
						  int temp = array[j];
						  array[j] = array[j-1];
						  array[j-1] = temp;
			 }
		 }
	}
}


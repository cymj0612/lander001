package Algorithm1;

import java.util.Scanner;

public class A027 {
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		scanner.close();
		String num[] = number.split(" ");//���ַ��ÿո�ֿ�
		int[] array = new int[num.length];
		for(int i=0;i<num.length;i++) {
			array[i] = Integer.parseInt(num[i]);//��������Ӧ���ַ���ֵ����������
		}
		int min = array[0];
		int max = array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		for(int i=0;i<array.length;i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("The minimum element in the array is "+ min);
		System.out.println("The maximum element in the array is "+ max);
  }
	
}

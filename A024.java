package Algorithm1;

import java.util.Arrays;
import java.util.Scanner;

public class A024 {
	 public static void main(String []args){
	    	Scanner scanner = new Scanner(System.in);
			String number = scanner.nextLine();
			int a = scanner.nextInt();
			scanner.close();
			String num[] = number.split(" ");//���ַ��ÿո�ֿ�
			int[] array = new int[num.length];
			for(int i=0;i<num.length;i++) {
				array[i] = Integer.parseInt(num[i]);//��������Ӧ���ַ���ֵ����������
			}
			Arrays.sort(array);
			int floor=0;
			int ceil=0;
			for(int i=0;i<array.length-1;i++) {
				if(array[i]==a && array[i+1]>a) {
				  	floor=a;//С�ڵ��ڵ��������
				    ceil=a;//���ڵ��ڵ��������
				}
				else if(array[i]<a && array[i+1]>a) {
					floor=array[i];//С�ڵ��ڵ��������
				    ceil=array[i+1];//���ڵ��ڵ��������
				}
			}
			System.out.print(ceil+" "+floor);
   }
}

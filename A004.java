package Algorithm1;

import java.util.Scanner;

public class A004 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
			String number = scanner.nextLine();
			scanner.close();
			String num[] = number.split(" ");//���ַ��ÿո�ֿ�
			int[] array = new int[num.length];
			for(int i=0;i<num.length;i++) {
				array[i] = Integer.parseInt(num[i]);//��������Ӧ���ַ���ֵ����������
			}
			int n=array.length;
			timeSort(array,n);
			for(int i=0;i<array.length;i++) {
				System.out.print(array[i]+" ");
			}
     }
	public static void timeSort(int[] array, int n) {
		int count=0;
		for(int i=0;i<n;i++) {
			if(array[i]==0) {count++;}
		}//�����0�ĸ�����ǰcount��Ϊ0 ������Ϊ1
	    for(int j=0;j<n-count;j++) {
	    	array[j]=0;
	    }
	    for(int k=n-1;k>=n-count;k--) {
	    	array[k]=1;
	    }
	}
}

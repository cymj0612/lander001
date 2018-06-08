package Algorithm1;

import java.util.Scanner;

public class A005 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
			String number = scanner.nextLine();
			scanner.close();
			String num[] = number.split(" ");//���ַ��ÿո�ֿ�
			int[] array = new int[num.length];
			for(int i=0;i<num.length;i++) {
				array[i] = Integer.parseInt(num[i]);//��������Ӧ���ַ���ֵ����������
			}
			quickSort(array, 0, array.length - 1);
			  for(int i=0;i<array.length;i++) {
				  System.out.print(array[i]+" ");
			 }
   }
	
	 public static void swap(int[] array, int i, int j) {  
	        if (i == j) {  
	            return;  
	        }  
	        array[i] = array[i] + array[j];  
	        array[j] = array[i] - array[j];  
	        array[i] = array[i] - array[j];  
	    }  
	  
	    public static void quickSort(int[] array, int start, int end) {  
	        if (start >= end)  
	            return;  
	        //����ʼ����Ϊ�ֽ��  
	        int temp = array[start];  
	        int i = start + 1;  
	        int j = end;  
	        while (true) {  
	            while (i <= end && array[i] < temp) {  
	                i++;  
	            }  
	            while (j > start && array[j] > temp) {  
	                j--;  
	            }  
	            if (i < j) {  
	                swap(array, i, j);  
	            } else {  
	                break;  
	            }  
	        }  
	        //���� j�ͷֽ���ֵ  
	        swap(array, start, j);  
	        //�ݹ���������  
	        quickSort(array, start, j - 1);  
	        //�ݹ���������  
	        quickSort(array, j + 1, end);  
	    }  
}

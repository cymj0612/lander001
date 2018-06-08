package Algorithm1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class A021 {
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
			int position = InsertKeySearch(array, 4,a);  
		    if(position == 0){  
		        System.out.println("Element not found");  
		    }else{  
		        System.out.println("Element found at index "+position);  
		    }  

	    }
	static int InsertKeySearch(int [] array, int right, int a){
		int low, high, mid;
		low = 0;
		high = right;
		while(low <= high){
			/* ��ֵ���ҵļ��㹫ʽ */
			mid = low + (high - low)*
					(a - array[low])/(array[high] - array[low]);
			if (a< array[mid]){
				high = mid - 1;
			}
			else if (a > array[mid]){
				low = mid + 1;
			}
			else 
				return mid;
		}
		return 0;
	}
  
    
}
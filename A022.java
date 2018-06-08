package Algorithm1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class A022 {
	 public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
			String number = scanner.nextLine();
			int a = scanner.nextInt();
			scanner.close();
			String num[] = number.split(" ");//将字符用空格分开
			int[] array = new int[num.length];
			for(int i=0;i<num.length;i++) {
				array[i] = Integer.parseInt(num[i]);//将索引对应的字符赋值给整形数组
			}
		int position = FindCycleArr(array,a);  
	    if(position == -1){  
	        System.out.println("Element not present");  
	    }else{  
	        System.out.println("Element found at index "+position);  
	    }  

 }
	public static  int FindCycleArr(int[] array,int a){
        int left = 0;
        int right = array.length-1;
        while (left <= right) {
            int mid = (left + right)/2;
            if (a == array[mid]) {
                return mid;
            }
            if (array[left] <= array[mid]) {
                if (a < array[mid] && a >= array[left]) {
                    right = mid-1;
                 }else {
                    left = mid+1;
                }
            }else if (array[left] > array[mid]) {
                if (a < array[left] && a > array[mid]) {
                    left = mid + 1;
                }else {
                    right= mid - 1;
                }
            }
        }
        return -1;
    }
}

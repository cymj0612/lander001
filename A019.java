package Algorithm1;

import java.util.Scanner;

public class A019 {
	 public static void main(String []args){
	    	Scanner scanner = new Scanner(System.in);
			String number = scanner.nextLine();
			int a = scanner.nextInt();
			scanner.close();
			String num[] = number.split(" ");//将字符用空格分开
			int[] array = new int[num.length];
			for(int i=0;i<num.length;i++) {
				array[i] = Integer.parseInt(num[i]);//将索引对应的字符赋值给整形数组
			}
			 index(array,a);
}
	       
	        
	 public static void index(int[] array, int a) {
		 boolean b=false;
		 for(int i=0;i<array.length;i++) {
				if(a==array[i]) {
					 b=true;
				}
		}
		 if(b==false) {
			 System.out.println("Element not found");
		 }
		 int start=0;
		 int end=array.length-1;
		 while(start+1<end) {
			 int mid = start +(end-start)/3;
			 if(array[mid]==a) {
				 System.out.println("Element found at index "+mid);
				 break;
			 }else if(array[mid]<a) {
				 start = mid; 
			 }else {
				 end = mid;
			 }
		 }
		 if(array[start]==a) {
			 System.out.println("Element found at index "+start);
		 }
		 if(array[end]==a) {
			 System.out.println("Element found at index "+end);
		 }
		
	 }
}

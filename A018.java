package Algorithm1;

import java.util.Scanner;

public class A018 {
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
		int y=NearSearch(array,a);
		if(y==-1) {
			System.out.println("Element not found in the array");
		}else {
			System.out.println("Element "+a+" found at index "+y);
		}
	}
	public static int NearSearch(int[] array,int a) {
		 int low=0;  
		 int high=array.length-1;  
		 int notFind=-1;  
		    while(low<=high)  {
		        int mid=low+(high-low)/2;
		        if(array[mid]==a) {
		        	return mid;
		        }
		        else if(array[mid-1]==a) {
		        	return mid-1;
		        }
		        else if(array[mid+1]==a) {
		        	return mid+1;
		        }
		        else if(array[mid]>a){
		            high=mid-1;  
		        }
		        else{
		            low=mid+1;  
		        } 
		         
		    }   
		 return notFind;     
	}
	
}
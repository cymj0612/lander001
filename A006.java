package Algorithm1;

import java.util.Arrays;
import java.util.Scanner;

public class A006 {
	//求数组最大值
   public static int max(int[] array) {
	Arrays.sort(array);
	return  array[array.length-1];  //需要返回一个int 型数据
   }
   //桶排序
   public static int[] bucketSort(int[] array, int maxArray) {
	   int[] num = new int[maxArray+1];//定义一个新的长度为最大值+1的数据，即桶
	   for(int i=0;i<array.length;i++) {
		   num[array[i]] = array[i];  //将数据放到对应索引的位置
	   }
	   return num;//返回一个数组
   }
   public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 String number=scanner.nextLine();
		 scanner.close();
		 String num[] = number.split(" ");
		 int[] array=new int[num.length];
		 for(int i=0;i<num.length;i++) {
			 array[i]=Integer.parseInt(num[i]);
		 }
		 //桶排序
		 bucketSort(array,max(array));
		for(int i = 0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
		//求差值
		int[] arr=new int[array.length-1];
		for(int j=0;j<array.length-1;j++) {
			arr[j]=array[j+1]-array[j];
		}
		System.out.println("\n"+max(arr));
	 }
}

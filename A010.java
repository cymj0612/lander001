package Algorithm1;

import java.util.Scanner;

public class A010 {
	//归并回归，将序列拆分后分别排序，再合并到一起
   public static void mergeSort(int[] array) {
	   sort(array,0,array.length-1);
   }
   
   public static void sort(int[] array, int left, int right) {
	   if(left>=right) 
		   return;
	   int center = (left+right)/2; //根据索引找到拆分点
	   sort(array,left,center);//对左边排序
	   sort(array,center+1,right);//对右边排序
	   merge(array,left,center,right);
   }
   public static void merge(int[] array, int left,int center, int right) {
	 int[] arr= new int[array.length];//定义一个新的临时数组  
	 int rf=center+1;//右边序列第一个元素的索引
	 int lf =left;//左边第一个元素的索引
	 int temp=left;
	 while(left <= center && rf <= right) {
		 if(array[left]<array[rf]){
			 arr[lf++]=array[left++];//将左边的元素依次赋值给新数组
		 }else {
			 arr[lf++]=array[rf++];//否则将右边的元素依次赋值给新数组
		 }
	 }//剩余部分一次放入临时数组中
	 while( rf<= right) {
		 arr[lf++]=array[rf++];
	 }
	 while(left <= center) {
		 arr[lf++]=array[left++];
	 }
	 while(temp <= right) {
		 array[temp]=arr[temp++];//将临时数组中的排序好的元素重新赋值给原数组
	 }
   }
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		scanner.close();
		String num[] = number.split(" ");//将字符用空格分开
		int[] array = new int[num.length];
		for(int i=0;i<num.length;i++) {
			array[i] = Integer.parseInt(num[i]);//将索引对应的字符赋值给整形数组
		}
		mergeSort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
   }
}

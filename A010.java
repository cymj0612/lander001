package Algorithm1;

import java.util.Scanner;

public class A010 {
	//�鲢�ع飬�����в�ֺ�ֱ������ٺϲ���һ��
   public static void mergeSort(int[] array) {
	   sort(array,0,array.length-1);
   }
   
   public static void sort(int[] array, int left, int right) {
	   if(left>=right) 
		   return;
	   int center = (left+right)/2; //���������ҵ���ֵ�
	   sort(array,left,center);//���������
	   sort(array,center+1,right);//���ұ�����
	   merge(array,left,center,right);
   }
   public static void merge(int[] array, int left,int center, int right) {
	 int[] arr= new int[array.length];//����һ���µ���ʱ����  
	 int rf=center+1;//�ұ����е�һ��Ԫ�ص�����
	 int lf =left;//��ߵ�һ��Ԫ�ص�����
	 int temp=left;
	 while(left <= center && rf <= right) {
		 if(array[left]<array[rf]){
			 arr[lf++]=array[left++];//����ߵ�Ԫ�����θ�ֵ��������
		 }else {
			 arr[lf++]=array[rf++];//�����ұߵ�Ԫ�����θ�ֵ��������
		 }
	 }//ʣ�ಿ��һ�η�����ʱ������
	 while( rf<= right) {
		 arr[lf++]=array[rf++];
	 }
	 while(left <= center) {
		 arr[lf++]=array[left++];
	 }
	 while(temp <= right) {
		 array[temp]=arr[temp++];//����ʱ�����е�����õ�Ԫ�����¸�ֵ��ԭ����
	 }
   }
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		scanner.close();
		String num[] = number.split(" ");//���ַ��ÿո�ֿ�
		int[] array = new int[num.length];
		for(int i=0;i<num.length;i++) {
			array[i] = Integer.parseInt(num[i]);//��������Ӧ���ַ���ֵ����������
		}
		mergeSort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
   }
}

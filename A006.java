package Algorithm1;

import java.util.Arrays;
import java.util.Scanner;

public class A006 {
	//���������ֵ
   public static int max(int[] array) {
	Arrays.sort(array);
	return  array[array.length-1];  //��Ҫ����һ��int ������
   }
   //Ͱ����
   public static int[] bucketSort(int[] array, int maxArray) {
	   int[] num = new int[maxArray+1];//����һ���µĳ���Ϊ���ֵ+1�����ݣ���Ͱ
	   for(int i=0;i<array.length;i++) {
		   num[array[i]] = array[i];  //�����ݷŵ���Ӧ������λ��
	   }
	   return num;//����һ������
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
		 //Ͱ����
		 bucketSort(array,max(array));
		for(int i = 0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
		//���ֵ
		int[] arr=new int[array.length-1];
		for(int j=0;j<array.length-1;j++) {
			arr[j]=array[j+1]-array[j];
		}
		System.out.println("\n"+max(arr));
	 }
}

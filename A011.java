package Algorithm1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class A011 {
    public static void main(String []args){
    	Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		scanner.close();
		String num[] = number.split(" ");//将字符用空格分开
		int[] array = new int[num.length];
		for(int i=0;i<num.length;i++) {
			array[i] = Integer.parseInt(num[i]);//将索引对应的字符赋值给整形数组
		}
			List<Integer> list = new ArrayList<Integer>();
			for (int i=0; i<array.length; i++) {
			  if(!list.contains(array[i])) {
			    list.add(array[i]);
			  }
			}
			Integer[] b = list.toArray(new Integer[list.size()]);
			for(int i=0;i<b.length;i++) {
				System.out.print(b[i]+" ");
			}//输出b
			System.out.println();
			int[]c=new int[5];
			int[]s=new int[5];
			//个数
			for(int i=0;i<b.length;i++) {
				for(int j=0;j<array.length;j++) {
					if(b[i]==array[j]) {
						c[i]+=1;
					}
				}
			}
			for(int i=0;i<c.length;i++) {
				System.out.print(c[i]+" ");
			}
			//索引和
	/*		System.out.println();
			for(int i=0;i<b.length;i++) {
				for(int j=0;j<a.length;j++) {
					if(b[i]==a[j]) {
						s[i]+=j;
					}
				}
			}
			for(int i=0;i<s.length;i++) {
				System.out.print(s[i]+" ");
			}*/
			//排序
			System.out.println();//换行
			//排出先后输出的数字
			int []p=new int[5];
			int temp;
			for(int i=0;i<b.length;i++) {
				for(int j=0;j<b.length-1-i;j++) {
				if (c[j] < c[j+1]) {
					temp = c[j];
					c[j] = c[j+1];
					c[j+1] = temp;
					temp = b[j];
					b[j] = b[j+1];
					b[j+1] = temp;
				    }
				}
			}
			for(int i=0;i<b.length;i++) {
					for(int k=0;k<c[i];k++) {
						System.out.print(b[i]+" ");
					}
			}
    }
}
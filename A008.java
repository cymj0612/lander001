package Algorithm1;

import java.util.Scanner;

public class A008 {
	 public String largestNumber(int[] nums){
	        String[] strs=new String[nums.length];  //把数组转化成字符串
	        for(int i=0;i<nums.length;i++){
	            strs[i]=String.valueOf(nums[i]);// 把数组转化成字符串数组
	        }
	        for(int i=0;i<strs.length;i++) {
	            for(int j=i+1;j<strs.length;j++) {
	                if((strs[i]+strs[j]).compareTo(strs[j]+strs[i])<0){
	                   String temp=strs[i];
	                    strs[i]=strs[j];
	                    strs[j]=temp;
	                }
	            }
	        }
	        if(strs[0].equals("0"))
	        {
	            return "0";
	        }
	        else
	        {
	            String str="";//空
	            for(int i=0;i<strs.length;i++)
	            {
	                str=str+strs[i];
	            }
	            return str;
	        }

	    }

	    public static void main(String []args){
	    	Scanner scanner = new Scanner(System.in);
			String number = scanner.nextLine();
			scanner.close();
			String num[] = number.split(" ");//将字符用空格分开
			int[] array = new int[num.length];
			for(int i=0;i<num.length;i++) {
				array[i] = Integer.parseInt(num[i]);//将索引对应的字符赋值给整形数组
			}
	        A008 stri=new A008();
	        String str=stri.largestNumber(array);
	        System.out.println(str);
	    }
   }


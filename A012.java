package Algorithm1;

public class A012 {
   public static void main(String[] args) {
	   int[] array= {1,2,3,1};
	   String[] str = new String[array.length];
	   for(int i=0;i<array.length;i++) {
		   str[i]=String.valueOf(array[i]);
	   }
	   for(int i=0;i<str.length-1;i++) {
		   for(int j=i;j<str.length-1;j++) {
			   System.out.println(str[i]+" "+str[j]);
		   }
	   }
	   
   }
}

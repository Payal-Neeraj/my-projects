import java.util.*;
import java.lang.*;
import java.io.*;  
  public class decimalToAnyBase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       //StringBuilder input=new StringBuilder();
	   char[] arr1=new char[20];
	   int k=0,result=0;
       String baseResult="";
       while(n!=0){
       baseResult=baseResult+(n%b);
       n=n/b;
       }
		char[] arr=baseResult.toCharArray();
		for(int i=arr.length-1;i>=0;i--){
			arr1[k]=arr[i];
			k++;
		}
		String str=String.valueOf(arr1);
		System.out.println(str);
		try{
		result=Integer.valueOf(str);
		}catch(NumberFormatException e){
			System.out.println(e);
		}
		return result;
  }
  }
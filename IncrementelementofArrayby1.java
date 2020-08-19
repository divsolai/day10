package java30;

import java.util.Arrays;
import java.util.Scanner;

public class IncrementelementofArrayby1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
Scanner scan=new Scanner(System.in);
System.out.println("Enter the size of an array");
num=scan.nextInt();
int[] arr= new int[num];
int[] arr1=new int[num];
System.out.println("Enter the numbers in the array");
for(int i=0;i<num;i++)
{
	arr[i]=scan.nextInt();
}
System.out.println("the array entered is"+ Arrays.toString(arr));
for(int i=0;i<num;i++)
{
	arr1[i]=arr[i]+1;
}
System.out.println(Arrays.toString(arr1));
scan.close();
	}

}

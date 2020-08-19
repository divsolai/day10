package java30;

import java.util.Arrays;
import java.util.Scanner;

public class OddandEvennumbersinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		num=scan.nextInt();
		int[] arr= new int[num];
		//int[] even=new int[num];
		//int[] odd=new int[num];
		System.out.println("Enter the numbers in the array");
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("the array entered is"+ Arrays.toString(arr));
		for(int i=0;i<num;i++)
		{
			if (arr[i]%2==0)
			{
				System.out.println("the number "+ arr[i] +" in array is even");
			}
			else
			{
				System.out.println("the number "+ arr[i] + " in array is odd");
			}
		}
		//System.out.println("The even array is"+ Arrays.toString(even));
		//System.out.println("The odd array is"+ Arrays.toString(odd));
		scan.close();
	}

}

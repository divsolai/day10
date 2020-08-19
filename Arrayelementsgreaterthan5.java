package java30;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayelementsgreaterthan5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input;
Scanner scan=new Scanner(System.in);
System.out.println("enter the string");
input=scan.nextLine();
String[] arr = input.split(" ");
System.out.println(arr.length);
if(arr.length>=5)
{
	
	System.out.println(Arrays.toString(arr));
}
else
{
System.out.println("The array size is not greater than 5");

	}
scan.close();
}
}

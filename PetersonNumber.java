package specialNumber;

import java.util.Scanner;

public class PetersonNumber {
	static int number(int x) {
		return x%10;
	}
	static int factorial(int x) {
		int f=1;
		for(int i=1;i<=x;i++) 
			f*=i;
		return f;
	}
	static boolean peterson(int x) {
		int number=x;
		int result=0;
		int num;
		while(number>0) {
		num=number(number);
		result=result+factorial(num);
		number=number/10;
		}
		if(result==x)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int number=in.nextInt();
		boolean res=peterson(number);
		if(res==true)
			System.out.print("YES");
		else 
			System.out.print("NO");
		in.close();

	}

}

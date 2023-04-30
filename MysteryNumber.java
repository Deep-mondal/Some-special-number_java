package specialNumber;

import java.util.Scanner;

public class MysteryNumber {
	static int reverse(int number) {
		int n=number;
		int digit,res=0;
		while(n>0) {
			digit=n%10;
			res=(10*res)+digit;
			n=n/10;
		}
		return res;
	}
	static boolean mystery(int x) {
		int i;
		int demo;
		for(i=x;i>0;i--) {
			demo=reverse(i);
			if((i+demo)==x)
				return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int number=in.nextInt();
		boolean res=mystery(number);
		if(res==true)
			System.out.print("YES");
		else 
			System.out.print("NO");
		in.close();

	}

}

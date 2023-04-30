package specialNumber;

import java.util.Scanner;

public class EmirpNumber {
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
	static boolean prime(int num) {
		int i;
		if(num==1)
			return true;
		if(num<=0)
			return false;
		for(i=2;i<num/2;i++)
			if(num%i==0)
				return false;
		return true;
	}
	static boolean emirp(int x) {
		boolean check=prime(x);
		if(check==true) {
			int rev=reverse(x);
			boolean ch=prime(rev);
			if(ch==true)
				return true;
		}
	 
		return false;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int number=in.nextInt();
		boolean res=emirp(number);
		if(res==true)
			System.out.print("YES");
		else 
			System.out.print("NO");
		in.close();

	}

}

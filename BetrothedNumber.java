package specialNumber;

import java.util.Scanner;

public class BetrothedNumber {
	static int sumOfPerfectDivisor(int x) {
		int i,sum=0;
		for(i=1;i<=x/2;i++)
			if(x%i==0)
				sum+=i;
		return sum;
	}
	static boolean betrothed(int x,int y) {
		if((y+1)==sumOfPerfectDivisor(x))
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int x=in.nextInt();
		System.out.print("Enter another Number:");
		int y=in.nextInt();
		if(betrothed(x,y)==true&&betrothed(y,x)==true)
			System.out.print("YES");
		else 
			System.out.print("NO");
		in.close();

	}

}

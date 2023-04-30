package specialNumber;

import java.util.Scanner;

public class NudeNumber {
	static boolean nude(int x) {
		int num=x;
		int digit,c=0;
		while(num>0) {
			digit=num%10;
			if(digit==0)
				return false;
			if(x%digit==0)
				c++;
			num=num/10;
		}
		if(count(x)==c)
			return true;
		return false;
	}
	static int count(int x) {
		int num=x;
		int digit,c=0;
		while(num>0) {
			digit=num%10;
			c++;
			num=num/10;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int number=in.nextInt();
		boolean res=nude(number);
		if(res==true)
			System.out.print("YES");
		else 
			System.out.print("NO");
		in.close();

	}

}

package specialNumber;

import java.util.Scanner;

public class TriangularNumbers {
	static boolean triangular(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(sum==num) 
				return true;
			sum+=i;
		}
		return false;	
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int number=in.nextInt();
		boolean res=triangular(number);
		if(res==true)
			System.out.print("YES");
		else 
			System.out.print("NO");
		in.close();

	}

}

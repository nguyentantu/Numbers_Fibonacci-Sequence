package fibonaci;

import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, fibo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập số phần tử trong dãy Fibonaci: ");
		int n = sc.nextInt(); 
		System.out.print("Dãy Fibonaci: ");
		System.out.print("\t"+n1+"\t"+n2+"\t");
		for(int i=2; i<n; i++) {
			fibo = n1 + n2;
			System.out.print(fibo+"\t");
			n1 = n2;
			n2 = fibo;
		}
		
	}

}

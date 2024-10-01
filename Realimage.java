package assignment30;
import java.util.Scanner;
public class Realimage {
	private int real;
	private int imag;
	private int real2;
	private int imag2;
	
	public Realimage(int real, int imag, int real2, int imag2) {
		super();
		this.real = real;
		this.imag = imag;
		this.real2 = real2;
		this.imag2 = imag2;
	}
	void sum() {
		int r1 = real + real2;
		int r2 = imag + imag2;
		System.out.println("Sum of complex no  : " + r1 + " + " + r2 + "i");
	}
	void diff() {
		int r1 = real - real2;
		int r2 = imag - imag2;
		System.out.println("Difference of complex no is : " + r1 + " + " + r2 + "i");
	}
	void prod() {
		int r1 = real * real2;
		int r2 = imag * imag2;
		int r3 = real * imag2;
		int r4 = imag * real2;
		int result1 = r1 - r2;
		int result2 = r3 - r4;
		System.out.println("product of complex no : " + result1 + " + " + result2 + "i");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter real and imag number");

		int real = sc.nextInt();
		int imag = sc.nextInt();
		System.out.println("Enter real and imag number");
		int real2 = sc.nextInt();
		int imag2 = sc.nextInt();
               Realimage realiamge=new Realimage(real, imag, real2, imag2);
               realiamge.sum();
       		realiamge.diff();
       		realiamge.prod();
	}

}

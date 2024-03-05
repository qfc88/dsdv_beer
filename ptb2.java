package week2g3;
import java.util.Scanner;
public class ptb2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextInt();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		if (a == 0){
			if (b==0) {
				System.out.println("countless zeros");
			}else {
				System.out.println(-c/b);
			}
			
		}else {
		
		
		double delta = b*b -(4*a*c);
		if( delta > 0) {
			System.out.println("there are 2 roots");
			System.out.println("the first root is: " + (-b-Math.sqrt(delta))/(2*a));
			System.out.println("the second root is: " +(-b+Math.sqrt(delta))/(2*a));;
		}else if (delta < 0) {
			System.out.println("there exit 0 root");
		}else {
			System.out.println("there exit 1 root");
			System.out.println("the root is: "+ (-b/2*a));
		}
		
		
		}
	}

}
//alo alo

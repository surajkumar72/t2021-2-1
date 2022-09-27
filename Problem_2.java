import java.util.Scanner;

public class Problem_2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number greater than 0");
	int a=scan.nextInt();
	series(a);
	
}
static void series(int input) {
	int x=1;
	for(int i=1;i<=input;i++) {
		
		System.out.print(x);
		if(i!=input) {
			System.out.print(",");
		}
		x+=2;
	}
}
}

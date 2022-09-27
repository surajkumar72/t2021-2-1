import java.util.Scanner;

public class Prooblem_3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number greater than 0");
	int a=scan.nextInt();
	series(a);
	
}
public static void series(int input) {
	int x=1;
	if(input%2==0) {
		input--;
	}
	for(int i=1;i<=input;i++) {
		System.out.print(x);
		if(i!=input) {
			System.out.print(",");
		}
		x+=2;
	}
}
}

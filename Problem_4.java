
import java.util.HashMap;
import java.util.Scanner;

public class Problem_4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	System.out.println("Enter array length");
	int len=scan.nextInt();
	int arrInput[]=new int[len];
	for(int i=0;i<=arrInput.length-1;i++) {
		arrInput[i]=scan.nextInt();
	}
	HashMap<Integer, Integer> count1to9=new HashMap<Integer, Integer>();
	for(int i=1;i<=9;i++) {
		int count=0;
		for(int j=0;j<=arrInput.length-1;j++) {
			if(arrInput[j]%i==0) {
				count++;
			}
			
		}
		count1to9.put(i, count);
	}
	System.out.println(count1to9);
	}

}

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args)  {
		Scanner scan=new Scanner(System.in);
		try {
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		String operation=scan.next();
		Calculator calci=new Calculator(a, b, operation);
		switch (operation) {
		case "addition":System.out.println(calci.addition());
			
			break;
		case "subtractin":System.out.println(calci.subtractin());
		
		break;
		case "multiplication":System.out.println(calci.multiplication());
		
		break;
		case "division":System.out.println(calci.division());
		
		break;

		default:System.out.println("Invalid Operation");
			break;
		}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			scan.close();	
		}
		

	}

}
class Calculator{
	private double a;
	private double b;
	private String operation;
	
	public Calculator() {
		
	}
	public Calculator(double a, double b, String operation) {
		super();
		this.a = a;
		this.b = b;
		this.operation = operation;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public double addition() {
		return a+b;
	}
	public double subtractin() {
		return a-b;
	}
	public double multiplication() {
		return a*b;
	}
	
	public double division() {
		return a/b;
	}
	
		
	
}

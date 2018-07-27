import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Arithmetic {

	int num1;
	int num2;
	int num3;
	public Arithmetic(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	
	}
public abstract int calculate();
}
//......................................................................
 class Addition extends Arithmetic{

	public Addition(int num1, int num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		return this.num1+this.num2;
	}}
 //........................................................................
 class Subtraction extends Arithmetic{

	public Subtraction(int num1, int num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		return this.num1-this.num2;
	}}
 //..........................................................................
 class Multiplication extends Arithmetic{

	public Multiplication(int num1, int num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		return this.num1*this.num2;
	}}
 //.........................................................................
 class Division extends Arithmetic{

	public Division(int num1, int num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		return this.num1/this.num2;
	}}
 //.........................................................................
class Calculator{
	public static void main(String[] args) throws NumberFormatException, IOException {
	int result=0;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("calculator");
		System.out.println("Choose the required value(addition-1, subtraction-2, multiplication-3, division-4)");
		int choice= Integer.parseInt(br.readLine());
//..............................................................................	
		System.out.println("Enter number 1:");
		int num1=Integer.parseInt(br.readLine());
		
//..............................................................................
		System.out.println("Enter number 2:");
		int num2=Integer.parseInt(br.readLine());
//................................................................................
		Arithmetic []ar= {new Addition(num1,num2),new Subtraction(num1,num2),new Multiplication(num1,num2),new Division(num1,num2)};
		result=ar[choice-1].calculate();
		System.out.println(result);
		
		}
			
	}

 
 
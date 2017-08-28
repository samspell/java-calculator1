package calculator;

import java.util.Scanner;
class CalcDemo {

	Scanner sc=new Scanner(System.in);
	public void add(){
		int num;
		int sum=0;
		System.out.println("Enter the nos. to be added");
		System.out.println("(Please enter 0 at the end)");
		
		do{
			num=sc.nextInt();
			sum+=num;
		}while(num!=0);
		System.out.println(sum);
		}
	
	public void sub(){
		int num;
		int sum=0;
		System.out.println("Enter the nos. to be subtracted");
		System.out.println("(Please enter 0 at the end)");
		
		do{
			num=sc.nextInt();
			sum-=num;
		}while(num!=0);
		System.out.println(sum);
		}
	
	public void multiply(){
		int num;
		int sum=1;
		System.out.println("Enter the nos. to be multiplied");
		System.out.println("(Please enter 0 at the end)");
		
		do{
			num=sc.nextInt();
			sum*=num;
		}while(num!=1);
		System.out.println(sum);
		}
	
	public void div(){
		int num1;
		int num2;
		int ans = 0;
		System.out.println("Enter the nos. to be divided");
		
		
		
			num1=sc.nextInt();
			num2=sc.nextInt();
			if(num2!=0){
				ans=num2/num1;}
		
		System.out.println(ans);
		
	}
}
public class Calc{
	 public static void main(String[] args){
	CalcDemo c=new CalcDemo();
	System.out.println("Enter the number assigned to the operation you want to perform");
	System.out.println("1-Addition");
	System.out.println("2-Subtraction");
	System.out.println("3-Multiplication");
	System.out.println("4-Division");
	Scanner scan = new Scanner (System.in);
	String digit = scan.nextLine();
	switch(digit){
	case "1":
		c.add();
		break;
	case "2":
		c.sub();
		break;
	case "3":
		c.multiply();
		break;
	case "4":
		c.div();
		break;
	default:	
		System.out.println("Not a command bro!");
		break;
	}


	
}
}
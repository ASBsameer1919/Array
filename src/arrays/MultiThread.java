package arrays;



	import java.util.*;
	class Operate extends Thread{
		public void run() {
		if(Thread.currentThread().getName().equals("Add")) {
			Add();
		}
		else if(Thread.currentThread().getName().equals("Print")){
			print();
		}
		else {
			Bank();
		}
	}

		private void Add() {
			// TODO Auto-generated method stub
			try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Task 1: Addition opertaion Started");
			System.out.println("Enter first number:");
			int a=sc.nextInt();
			System.out.println("Enter Second number:");
			int b=sc.nextInt();
			System.out.println("Result is:");
			System.out.println("Task 1: Addition operation completed");
		}
			catch(ArithmeticException e1) {
				e1.printStackTrace();
			}catch(InputMismatchException e2) {
				e2.printStackTrace();
			}
		}

		private void print() {
			// TODO Auto-generated method stub
			try {
			System.out.println("Task 2: printing operation Started");
			for(int i=0;i<2;i++) {
				System.out.println("Nani");
			Thread.sleep(2000);
			}
			System.out.println("Task 2: printing operation completed");
		}catch(InterruptedException e3) {
			e3.printStackTrace();
		}
		}

		private void Bank() {
			// TODO Auto-generated method stub
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println("Task 2: Banking operation Started");
				System.out.println("Enter the Account number");
				int acno=sc.nextInt();
				System.out.println("Enter the pincode");
				int pin=sc.nextInt();
				System.out.println("Account details recorded");
				System.out.println("Task 3: Bank operation completed");
			}catch(ArithmeticException e4) {
				e4.printStackTrace();
			}
	}

	public class MultiThread {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Operate o1=new Operate();
			Operate o2=new Operate();
			Operate o3=new Operate();
			o1.Add();
			o2.print();
			o3.Bank();
			
			o1.setName("Add");
			o2.setName("Print");
			o3.setName("Bank");
			
			o1.start();
			o2.start();
			o3.start();
		}
	}
	}



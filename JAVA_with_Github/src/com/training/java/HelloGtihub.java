package com.training.java;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

class Complex{

	public int imag;
	public int real;

	public Complex()
	{

	}
	public Complex(int im, int re)
	{
		this.imag = im;
		this.real = re;
	}

	public void showValues()
	{

		try {
			this.real = Integer.parseInt(JOptionPane.showInputDialog("Enter first value"));
			JOptionPane.showMessageDialog(null, "Please enter valid inputs!!!",
					"Invalid Inputs", JOptionPane.ERROR_MESSAGE);	
			JOptionPane.showMessageDialog(null, "The values of real is :- "+this.real);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
		}

	}


}
public class HelloGtihub {

	public static void main(String[] args) {

		int choice;
		char ch=' ';
		double bonusPer;
		boolean isPresent = false;
		
		ArrayList<Employee> empList = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("1>Add new record\n2>Display record\n3>Delete a record\n4>Provide Bonus\\n");
			choice=input.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Emp Name:");
				String name=input.next();
				System.out.println("Enter Emp Salary:");
				double sal=input.nextDouble();

				empList.add(new Employee(name,sal));
				System.out.println("Record is added Successfully....");
				break;
			case 2:
				System.out.println("************Employee records are**********");
				for (Employee employee : empList) {
					System.out.println(employee);
				}
				break;

			case 3:
				System.out.println("Enter the name to delete:-");
				isPresent = false;
				String nameDelete=input.next();				

				for (Employee employee : empList) {
					if(employee.getEmployeeName().equals(nameDelete))
					{
						empList.remove(employee);
						isPresent = true;
						System.out.println("Employee "+employee.getEmployeeName()+" "+"has been deleted successfully....");
						break;
					}	
				}
				if(isPresent==false)
				{
					System.out.println("Entered employee is not present in the database......");
				}
				break;
				
				
			case 4:
				if(!empList.isEmpty()) {
					
					for (Employee employee : empList) {
						if(employee.getSalary()>=0 && employee.getSalary()<=10000) {
							bonusPer =5;
							employee.setSalary(employee.getSalary()+(employee.getSalary()*bonusPer/100));
						}
						else if(employee.getSalary()>=10000 && employee.getSalary()<=20000) {
							bonusPer =10;
							employee.setSalary(employee.getSalary()+(employee.getSalary()*bonusPer/100));
						} 
					}
					
					
				}
				else {
					System.out.println("No Employee records present!! Please add some data....");
				}
				break;


				
				
				
				
				
			default:
				System.out.println("Invalid Choice...");
				break;
			}

			System.out.println("Do you want to continue....");
			ch=input.next().charAt(0);

		}while(ch=='y' || ch=='Y');

		System.out.println("I'm done");
	}
	
	


}


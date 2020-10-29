package testing2;
import java.util.*;
public class name {

	public static void main(String[] args) {
	Scanner in= new Scanner (System.in);
	
	printName();
	printGender();
	printBirthday();
	printAge();
	printMaritalstatus();
	printCitizenship();
	printHp();
	printWorkskill();
	printWorkingexperience();
	printTalent();
	printGrade();
	printCgpa();
	printCgpaforcurrentsemester();
	
	
	in.close();
	
	}
	public static void printName() {
		Scanner in= new Scanner (System.in);
		System.out.print("Enter your name : ");
		String name=in.next();
		System.out.println("Name: "+ name);
		
	}
	public static void printGender() {
		Scanner in= new Scanner (System.in);
		System.out.print("Enter your gender : ");
		String gender=in.next();
		System.out.println("Gender: "+ gender);
		
	}
	public static void printBirthday() {
		Scanner in= new Scanner (System.in);
		System.out.print("Enter your birthday : ");
		String birthday=in.next();
		System.out.println("Birthday: "+ birthday);
		
	}
	public static void printAge() {
		Scanner in= new Scanner (System.in);
		System.out.print("Enter your age : ");
		int age= in.nextInt();
		System.out.println("Age: "+ age);
		
	}
	public static void printMaritalstatus() {
		Scanner in= new Scanner (System.in);
		System.out.print("Enter your marital status : ");
		String maritalstatus=in.next();
		System.out.println("Marital Status: "+ maritalstatus);
		
	}
	public static void printCitizenship() {
		Scanner in= new Scanner (System.in);
		System.out.print("Enter your citizenship: ");
		String citizenship= in.next();
		System.out.println("Citizenship:  "+ citizenship);
		
	}
	public static void printHp() {
		Scanner in= new Scanner (System.in);
		System.out.print("Enter your Hp: ");
		String hp= in.next();
		System.out.println("Hp:  "+ hp);
		
	}
	public static void printWorkskill() {
		Scanner in= new Scanner (System.in);
		System.out.print("Enter your work skill 1: ");
		String workskill1= in.next();
		System.out.println("Work skill 1:  "+ workskill1);
		System.out.print("Enter your work skill 2: ");
		String workskill2= in.next();
		System.out.println("Work skill 2:  "+ workskill2);
		
	}
	public static void  printWorkingexperience(){
		Scanner in= new Scanner (System.in);
		System.out.print("Enter your working experience 1: ");
		String workingexperience1= in.next();
		System.out.println("Working Experience 1:  "+ workingexperience1);
		System.out.print("Enter your working experience 2: ");
		String workingexperience2= in.next();
		System.out.println("Working Experience 2:  "+ workingexperience2);
		
	}
	public static void  printTalent(){
		Scanner in= new Scanner (System.in);
		System.out.print("Enter your talent 1: ");
		String talent1= in.next();
		System.out.println("Talent 1:  "+ talent1);
		System.out.print("Enter your talent 2: ");
		String talent2= in.next();
		System.out.println("Talent 2:  "+ talent2);
		
	}
	public static void printGrade() {
		Scanner in= new Scanner (System.in);
		System.out.print("Enter Grade STIA1113 : ");
		String str =in.next();
		char grade = str.charAt(0);
		System.out.println("Grade: "+ grade);
		
	}
	public static void printCgpa() {
		Scanner in= new Scanner (System.in);
		System.out.print("Enter your CGPA : ");
		double cgpa = in.nextDouble();
		System.out.println("CGPA " + cgpa);
		

	}
	public static void printCgpaforcurrentsemester() {
		Scanner in= new Scanner (System.in);
		System.out.print("Enter CGPA Semester 1 : ");
		double num1 = in.nextDouble();
		System.out.print("Enter CGPA Semester 2 : ");
		double num2= in.nextDouble();
		double sum= num1 + num2;
		double totalcgpa = sum/2;
		System.out.println("CGPA for current semester is " + totalcgpa);
		
	}
	
	
	
	

}

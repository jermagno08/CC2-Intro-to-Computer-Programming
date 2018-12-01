import java.util.Scanner; 

public class StudentInfo
{ 
    public static void main(String[] args) 
    { 
 
        Scanner sc = new Scanner(System.in);
 
   	 System.out.println("What is your Name: ");
 	String name = sc.nextLine(); 
	System.out.println("What is your Gender: ");
        char gender = sc.next().charAt(0);
	System.out.println("Enter Age: "); 
        int age = sc.nextInt(); 
	System.out.println("Enter Value of PI: "); 
        double PI = sc.nextDouble(); 
	
	
	
         
 
       
 	System.out.println("=========================");
        System.out.println("Name: "+name); 
	System.out.println("Age: "+age); 
        System.out.println("Gender: "+gender); 
        System.out.println("Value of PI: "+PI); 
    } 
} 
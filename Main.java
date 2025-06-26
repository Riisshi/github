import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("You like me?");
        System.out.println("what's up buddy");

        //integer data types
        int year=2025;
        int age=23;
        int quantity=1;

        //decimal data types
        double price=19.99;
        double gpa=3.5;
        double temperature=-12.5;

        //character data types
        char grade='A';
        char symbol='!';
        char currency='$';

        //boolean data types
        boolean isStudent=true;
        boolean forSale=true;
        boolean isOnline=true;

        if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }

        System.out.println(year);
        System.out.println(isOnline);
        System.out.println("The grade is " +grade);
        System.out.println("The price is "+price);

        //string data types
        String name="Rishi";
        String food="Biriyani";
        String Email="rishi10xcr7@gmail.com";
        String Car="rolls royce";

        System.out.println("Hello "+name);
        System.out.println("Your favourite food is "+food);
        System.out.println("Your email is "+Email);
        System.out.println("Your favourite car is "+Car);
        System.out.println("You are "+age+" years old");
        System.out.println("Your gpa is " + gpa);

        System.out.println("Your choice is a "+age+" "+year+" "+Car);
        if(forSale){
            System.out.println("There is a "+Car +" "+food+" "+price);
        }

        //to get input from the user, first import Scanner using (import java.util.Scanner)
        //and to use it, first call the library(Scanner) and use the class(scanner) and create new Scanner(asking for input as(System.in))
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name2=scanner.nextLine();
        System.out.println("Hello "+name2);
     

        Scanner scanner1=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num4=scanner1.nextInt();
        System.out.println(num4);
        scanner1.close();
    }
}
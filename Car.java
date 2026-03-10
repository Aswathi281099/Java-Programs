import java.util.Scanner;
 class Car{
        public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the car name : ");
             String name = sc.nextLine();
             System.out.println("Enter the brand : ");
             String brand = sc.nextLine();
             System.out.println("Enter the price : ");
             float price  = sc.nextInt();

             System.out.println("Employee name : "+name);
             System.out.println("Employee ID : "+brand);
             System.out.println("Employee salary : "+price);
             sc.close();
    }
 }
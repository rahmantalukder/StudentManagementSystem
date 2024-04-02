package StudentManagementSystem;

import java.util.Scanner;

public class RegisterStudent {
    public void register(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("**************\n* Management *\n**************");
            System.out.println("1. Add\n2. Search\n3. Delete\n4. Update\n5 Exit");
            System.out.print("Enter your choice: ");
            int searchKey = sc.nextInt();
            System.out.println("\n\n");
            switch (searchKey) {
                case 1:
                    System.out.println("Add Student Successful");
                    break;
                case 2:
                    System.out.println("Search Student Successful");
                    break;
                case 3:
                System.out.println("Delete Student Successful");
                    break;
                case 4:
                System.out.println("Update Student Successful");
                    break;
                case 5:
                System.out.println("Application close Successful");
                    System.exit(0);
                    sc.close();
                default:
                    System.out.println("Enter valid option");
                    break;
            }
            System.out.println("\n\n");
        }while(true);
    }
}
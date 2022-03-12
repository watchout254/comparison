import java.util.Scanner;
public class comparison{
    public static void main(String[]args) {

        Scanner Student = new Scanner(System.in);
        int x;
        int y;
        int largest;

        System.out.println("Enter any number: ");
        x = Student.nextInt();

        System.out.println("Enter any number: ");
        y = Student.nextInt();

        // user to enter 2 numbers compares them  and displays the greates number
        if(x>y) {
            largest = x;
            
        }
        else {
            largest = y;
        }

        System.out.println("LARGEST:" +largest);
    }
}
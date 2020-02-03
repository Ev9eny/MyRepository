import java.util.Scanner;

public class App4 {
    public static void main(String []args){

        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = keyboardInput.nextLine();
        System.out.println("Hey "+name+"!");

        System.out.print("Enter your age: ");
        int age = keyboardInput.nextInt();
        System.out.println("Hey "+name+", you are "+age+" years old!");


    }
}

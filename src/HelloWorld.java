import java.util.Scanner;

public class HelloWorld {
    public void great() {
        String greeting = "Hello";
        System.out.println(greeting + " world!");
    }

    public static void main(String[] args){
        System.out.println("in Main");

        System.out.print("Enter your name:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        System.out.printf("%s", name);
        /*
        for(String a : args) {
            System.out.println(a);
        }*/
    }
}

import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.println("How old are you?");
        age = scanner.nextInt();

        if(age >= 18 && age < 75) {
            System.out.println("You are an adult!");
        }
        else if(age >= 13 && age < 18){
            System.out.println("You are a teenager!");
        }
        else if(age >= 75){
            System.out.println("Ok Boomer!");
        }
        else {
            System.out.println("You are a child!");
        }
    }
}

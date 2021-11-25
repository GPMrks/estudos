import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        String name = JOptionPane.showInputDialog("Enter your name: ");

        while(name.isBlank()){
            name = JOptionPane.showInputDialog("Enter your name: ");
        }

        JOptionPane.showMessageDialog(null, "Hello " + name);

    }

}

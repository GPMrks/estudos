import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        String name = JOptionPane.showInputDialog("Enter your name: ");

        while(name.isBlank()){
            name = JOptionPane.showInputDialog("Enter your name: ");
        }

        if(name.equals("Guilherme")) {
            JOptionPane.showMessageDialog(null, "Welcome back, " + name + "!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Get the fuck out of GPMrks'es PC!!");
        }

    }

}

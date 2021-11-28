import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args){

        String name;
        String input;
        int age = 0;
        double height = 0;
        boolean validAge = false;
        boolean validHeight = false;

        try {
            do {
                name = JOptionPane.showInputDialog("Digite seu nome: ");
                if(name.equals("")){
                    JOptionPane.showMessageDialog(null, "Nome não informado!");
                }
            }
            while (name.equals(""));
            {
                JOptionPane.showMessageDialog(null, "Olá " + name);
            }

            while (!validAge) {
                try {
                    input = JOptionPane.showInputDialog("Digite sua idade: ");

                    if(input == null){
                        throw new NullPointerException();
                    }
                    else{
                        age = Integer.parseInt(input);
                    }

                    validAge = true;

              } catch (NumberFormatException ae) {
                    JOptionPane.showMessageDialog(null, "Idade não informada!");
               }
            }
            JOptionPane.showMessageDialog(null, "Você tem " + age + " anos.");

            while (!validHeight) {
               try {
                    height = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura(cm): "));
                    validHeight = true;
                } catch (NumberFormatException ae) {
                    JOptionPane.showMessageDialog(null, "Altura não informada!");
                }
            }
            JOptionPane.showMessageDialog(null, "Você tem " + height + "cm de altura.");

            JOptionPane.showMessageDialog(null, "Bem vindo!!");
        }

        catch(NullPointerException exit){
            JOptionPane.showMessageDialog(null, "Você saiu do programa!");
        }

    }
}

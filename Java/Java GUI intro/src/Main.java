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

            while (!validHeight) {
               try {
                    height = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura(cm): "));
                    validHeight = true;
                } catch (NumberFormatException ae) {
                    JOptionPane.showMessageDialog(null, "Altura não informada!");
                }
            }

            JOptionPane.showMessageDialog(null, "Bem vindo!!");

            JOptionPane.showMessageDialog(null, "Olá " + name);
            //JOptionPane.showMessageDialog(null, "Você tem " + age + " anos.");
            JOptionPane.showMessageDialog(null, "Você tem " + height + "cm de altura.\nVocê tem " + age + " anos.");
            JOptionPane.showMessageDialog(null, "Fim do programa!");

        }

        catch(NullPointerException exit){
            JOptionPane.showMessageDialog(null, "Você saiu do programa!");
        }

    }
}

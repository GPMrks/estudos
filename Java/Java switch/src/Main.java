import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String day = JOptionPane.showInputDialog("Enter the day of the week: ");

        switch (day){
            case "Sunday": JOptionPane.showMessageDialog(null, "It is sunday!");
                break;
            case "sunday": JOptionPane.showMessageDialog(null, "It is sunday!");
                break;
            case "Monday": JOptionPane.showMessageDialog(null, "It is monday!");
                break;
            case "monday": JOptionPane.showMessageDialog(null, "It is monday!");
                break;
            case "Tuesday": JOptionPane.showMessageDialog(null, "It is tuesday!");
                break;
            case "tuesday": JOptionPane.showMessageDialog(null, "It is tuesday!");
                break;
            case "Wednesday": JOptionPane.showMessageDialog(null, "It is wednesday!");
                break;
            case "wednesday": JOptionPane.showMessageDialog(null, "It is wednesday!");
                break;
            case "Thursday": JOptionPane.showMessageDialog(null, "It is thursday!");
                break;
            case "thursday": JOptionPane.showMessageDialog(null, "It is thursday!");
                break;
            case "Friday": JOptionPane.showMessageDialog(null, "It is friday!");
                break;
            case "friday": JOptionPane.showMessageDialog(null, "It is friday!");
                break;
            case "Saturday": JOptionPane.showMessageDialog(null, "It is saturday!");
                break;
            case "saturday": JOptionPane.showMessageDialog(null, "It is saturday!");
                break;
            default: JOptionPane.showMessageDialog(null, "That's not a day of the week dummy!");
        }
    }
}

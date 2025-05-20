import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        float num1,num2,num3;
         num1=Integer.parseInt(JOptionPane.showInputDialog("Dime el primer numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Dime el segundo numero"));
         num3=Integer.parseInt(JOptionPane.showInputDialog("Dime el tercer numero"));
        float resultado;
        resultado=(num1+num2+num3)/3;
        System.out.println(resultado);
    }
}

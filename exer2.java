import javax.swing.JOptionPane;

public class exer2 {
    public static void main(String[] args) {
    // Declarações 
    double numero1, numero2;
    
    // Recebendo os valores 
    numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
    numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));

    // Calculando e apresentando a diferena 
    diferenca(numero1, numero2);
    }

    // Método de diferença
    static void diferenca(double valor1, double valor2) {
        double diferenca;

        // Verificação pra não dar número negativo
        if(valor1 > valor2) {
            diferenca = valor1 - valor2;
            JOptionPane.showMessageDialog(null, "A diferença é de: " + diferenca);
        }
        else {
            if(valor2 == valor1) {
                JOptionPane.showMessageDialog(null, "Os valores são iguais!");
            } 
            else {
                diferenca = valor2 - valor1; 
                JOptionPane.showMessageDialog(null, "A diferença é de: " + diferenca);
            }
        }
    }
}


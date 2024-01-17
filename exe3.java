import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class exe3 {
    public static void main(String[] args) {
        // Declaraçõa
        double altura, peso;
        int sexo;
        DecimalFormat duasCasas = new DecimalFormat("0.00");

        // Recebendo os dados 
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));        
        sexo = Integer.parseInt(JOptionPane.showInputDialog("Digite seu sexo (homem = 1 | mulher = 2): "));
            // Verificando se o sexo é valido
            while(sexo != 1 && sexo != 2) {
                sexo = Integer.parseInt(JOptionPane.showInputDialog("Digite um sexo válido: "));
            }

        // Peso
        peso = calcularPeso(altura, sexo);

        // Apresentando 
        JOptionPane.showMessageDialog(null, "Seu peso ideial é: Kg " + duasCasas.format(peso));

    }

    static double calcularPeso(double h, int s ) {  
        double peso;
        if(s == 1) {
            peso = (72.7*h) - 58;
        } else {
            peso = (62.1*h) - 44.7;
        }
        return peso;
    }
}

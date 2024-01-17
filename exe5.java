import java.text.DecimalFormat;

import javax.swing.JOptionPane;;

public class exe5 {
    public static void main(String[] args) {
        // Declarações
        double altura, base, hipotenusa;
        DecimalFormat duasCasas = new DecimalFormat("0.00");

        // Recebendo os dados 
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base: "));

        // Calculando hipotenusa
        hipotenusa = hipotenusa(altura, base);

        // Apresentando 
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: " + duasCasas.format(hipotenusa));
    }

    static double hipotenusa(double h, double b) {
        double hipotenusa;
        hipotenusa = (b * b) + (h*h);
        hipotenusa = Math.sqrt(hipotenusa);
        
        return hipotenusa;
    }
}

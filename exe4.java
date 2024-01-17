import javax.swing.JOptionPane;

public class exe4 {
    public static void main(String[] args) {
        // Declaração 
        int menu;
        
        // Menu
        menu = Integer.parseInt(JOptionPane.showInputDialog(
            "Escolha sua opção: 1 = soma | 2 = subtração | 3 = divisão | 4 = multiplicação | 5 = resto de divisão | 6 = dobro | 7 = Quadrado | 8 = Cubo | 9 = Raiz quadrada | 0 = sair "));

            // Verificação
            while(menu > 9 || menu < 0) {
                menu = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção valida: "));
            }

        // Calcular e apresentar
        Calcular(menu);

    }

    static void Calcular(int mn) {
        double numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));  
        double numero2 = 0;      
        if(mn < 6) {
            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        }

        switch(mn) {
            //Soma 
            case 1:
                double soma = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "Soma: " + soma); 

            break;

            //Subtração
            case 2:
                double sub = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "Subtração: " + sub);
                
            break;

            //Divisão 
            case 3:
                double div = numero1 / numero2;
                JOptionPane.showMessageDialog(null, "divisão: " + div); 
            
            break;

            //multiplicação
            case 4:
                double mult = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "multiplicação: " + mult); 

            break;

            //Resto 
            case 5:
                double resto = numero1 % numero2;
                JOptionPane.showMessageDialog(null, "resto: " + resto); 
            
            break;

            //Double 
            case 6:
                double dobro = numero1 * 2;
                JOptionPane.showMessageDialog(null, "Dobro: " + dobro);
        
            break;
                
            //Quadrado 
            case 7:
                double Quadrado = numero1 * numero1;
                JOptionPane.showMessageDialog(null, "Ao Quadrado: " + Quadrado);
            
            break;
                
            //Cubo 
            case 8:
                double cubo = numero1 * numero1 * numero1;
                JOptionPane.showMessageDialog(null, "Ao cubo: " + cubo); 
            
            break;

            //Raiz 
            case 9:
                double raiz = Math.sqrt(numero1);
                JOptionPane.showMessageDialog(null, "Raiz quadrada: " + raiz); 
            
            break;
    
            // Sair
            case 0:
            JOptionPane.showMessageDialog(null, "Saindo..."); 

            break;

        }
    }
}

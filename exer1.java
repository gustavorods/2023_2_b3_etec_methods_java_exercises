import javax.swing.JOptionPane;

public class exer1 {
    public static void main(String[] args) {
        // Declarações de variáveis 
        String nome;
        int contador = 1;
        double nota1 = 0, nota2 = 0, media;
        
        // Recebendo nomes 
        nome = JOptionPane.showInputDialog("Digite o nome do aluno"); 
        
        // Recebendo notas 
        nota1 = lerNotas(contador, nome);   
        contador++;
        nota2 = lerNotas(contador, nome);

        // Calculando a média 
        media = calcularMedia(nota1, nota2);

        // Apresentando o valor 
        if(media >= 7) {
            JOptionPane.showMessageDialog(null, "O aluno " + nome + " Foi aprovado com média " + media); 
        }
        else {
            JOptionPane.showMessageDialog(null, "O aluno " + nome + " Foi reprovado com média " + media); 
        }


    }

    // Método de ler as notas
    static double lerNotas( int cont, String aluno) { // Colocando outro nome pro contador pra manter a segurança da 1° variavel 
        // Declaração
        double nota = 0;

        // Recebendo a nota 
        nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + cont + "° nota do " + aluno + ": "));

        // Verificação 
        while(nota > 10 || nota < 0) {
           nota = Double.parseDouble(JOptionPane.showInputDialog("A " + cont + "° nota digitada é maior que 10 ou menor que 0, insira novamente: "));
        }
        return nota;
    }

    // Método de realizar a média
    static double calcularMedia(double prova1, double prova2) {
        double media;
        media = (prova1 + prova2) / 2;
        return media;
    }
}

import javax.swing.JOptionPane;

public class C11EX04A 
{
    public static void main(String[] args) 
    {
        String nome, nomeMaiorIdade;
        String[] sexoOpcoes = {"MASCULINO", "FEMININO"};
        int idade, mediaIdade = 0, qntPontos, sexo, contador = 0, homens = 0, mulheres7Pontos = 0, maiorIdade = 0;
        double valor, valorTotal = 0, percentualHomens;

        for (int i = 1; i <= 230; i++) 
        {
            contador++;
            nome = JOptionPane.showInputDialog(null,
             "Informe o nome do condutor:",
             "Exercício 04a",
             JOptionPane.QUESTION_MESSAGE);
            sexo = JOptionPane.showOptionDialog(null,
             "Informe o sexo do condutor:", 
             "Exercício 04a", 
             0, 
             JOptionPane.QUESTION_MESSAGE, 
             null, 
             sexoOpcoes,
             null);
            idade = Integer.parseInt(JOptionPane.showInputDialog(null,
             "Informe a idade do condutor:",
             "Exercício 04a",
             JOptionPane.QUESTION_MESSAGE));
            qntPontos = Integer.parseInt(JOptionPane.showInputDialog(null,
             "Informe a quantidade de pontos perdida na carteira:",
             "Exercício 04a",
             JOptionPane.QUESTION_MESSAGE));
            
            if (sexo == 0)
            {
                homens++;
    
            } else if (sexo == 1 && qntPontos == 7)
            {
                mulheres7Pontos++;
            }

            if (idade < maiorIdade) 
            {
                nomeMaiorIdade = nome;
                maiorIdade = idade;
            }

            if (qntPontos <= 2)
            {
            valor = 500;

            } else if (qntPontos <= 6) 
            {
            valor = 2000;

            } else if (qntPontos <= 10) 
            {
            valor = 4000;
            
            } else 
            {
            valor = 10000;
            }
            
            mediaIdade += idade;
            valorTotal += valor;

            System.out.printf("NOME DO CONDUTOR: %s\nSEXO: %s\nIDADE: %d\nQUANTIDADE DE PONTOS PERDIDOS NA CARTEIRA: %d\nVALOR DA MULTA: R$ %.2f", nome.toUpperCase(), sexoOpcoes[sexo], idade, qntPontos, valor);
        }
        percentualHomens = homens / contador * 100;
    }
}

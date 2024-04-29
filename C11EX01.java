import javax.swing.*;

public class C11EX01
{
    public static void main(String[] args)
    {
        int x = 1, contador = 0;
        double y, fx, media = 0;

        y = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Informe um número ímpar maior que 1 (ou um número par para interromper)",
                "Exercício 01",
                JOptionPane.QUESTION_MESSAGE));
        if (x < 1)
        {
            JOptionPane.showMessageDialog(null,
                    "O número precisa ser maior que 1!",
                    "ERRO!",
                    JOptionPane.ERROR_MESSAGE);
        }

        while (x <= y)
        {
            if (y % 2 == 0)
            {

                break;
            }

            contador++;
            fx = Math.pow(x, 2) + (double) (4 * x - 2) / 5;
            media += fx;

            System.out.printf("f(%d) = %.2f", x, fx);
            System.out.println();

            x += 2;
        }
        media /= contador;
        System.out.printf("MEDIA DE f(x) = %.2f", media);
    }
}

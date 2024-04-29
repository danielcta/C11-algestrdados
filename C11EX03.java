import java.util.Scanner;

public class C11EX03
{
    public static void main(String[] args) {
        String placa;
        int dia = 1, pontos;
        double valorMulta;

        Scanner multas = new Scanner(C11EX03.class.getResourceAsStream("C11EX03.txt"));


        while (dia != 99)
        {
            dia = multas.nextInt();
            placa = multas.nextLine();
            pontos = multas.nextInt();

            System.out.println(dia + placa + pontos);
        }
    }
}

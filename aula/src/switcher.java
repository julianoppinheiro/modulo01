import java.util.Scanner;

public class switcher {
            //instancia do captura
            Scanner leitor = new Scanner(System.in);
            //texto da pergunta
            System.out.println("Digite uma opção: ");
            //capturar texto
            int numeroMes = leitor.nextInt();

            switch (numeroMes) {
                case 1:
                    System.out.println("Este mês é Janeiro!");
                    break;
                case 2:
                    System.out.println("Este mês é Fevereiro!");
                    break;
                default:
                    System.out.println("Mês inválido! Tente novamente.");
            }
        }


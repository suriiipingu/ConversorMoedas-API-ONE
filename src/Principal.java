import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {


            System.out.println("\n✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧\n");
            System.out.println("Converta um valor em determinada moeda. \n");
            System.out.println("1) Dólar -> Peso argentino \n" +
                    "2) Peso argentino -> Dólar \n" +
                    "3) Dólar -> Real brasileiro \n" +
                    "4) Real brasileiro -> Dólar \n" +
                    "5) Dólar -> Peso colombiano \n" +
                    "6) Peso colombiano -> Dólar \n" +
                    "7) Sair \n" +
                    "8) Histórico");
            System.out.println("\nEscolha uma opção válida:");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double dolarParaPeso = 60.0; // Taxa de câmbio

                    System.out.println("Digite um valor para converter.");
                    var valorOrignal = scanner.nextDouble();

                    var valorConvertido = valorOrignal * dolarParaPeso;

                    System.out.println("O valor de " + valorOrignal + " dólares é igual a " + valorConvertido + " pesos argentinos.");

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;


            }


            System.out.println("\n✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧");
        } while (opcao != 7);
        scanner.close();

    }
}

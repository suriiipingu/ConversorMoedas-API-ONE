import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        ConversaoDeMoeda conversao = new ConversaoDeMoeda();

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

            System.out.println("Digite um valor para converter.");
            var valorOriginal = scanner.nextDouble();

            String moedaOriginal;
            String moedaAlvo;
            double taxaCambio;

            switch (opcao) {
                case 1:
                    moedaOriginal = "USD";
                    moedaAlvo = "ARS";
                    taxaCambio = 4.0;
                    conversao.converterValor(valorOriginal, moedaOriginal, moedaAlvo, taxaCambio);
                    break;
                case 2:
                    moedaOriginal = "ARS";
                    moedaAlvo = "USD";
                    taxaCambio = 4.0;
                    conversao.converterValor(valorOriginal, moedaOriginal, moedaAlvo, taxaCambio);
                    break;
                case 3:
                    moedaOriginal = "";
                    moedaAlvo = "";
                    taxaCambio = 4.0;
                    conversao.converterValor(valorOriginal, moedaOriginal, moedaAlvo, taxaCambio);
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

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        ConversaoDeMoeda conversao = new ConversaoDeMoeda();

        while (true) {
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

            if (opcao != 7) {

                System.out.println("Digite um valor para converter.");
                var valorOriginal = scanner.nextDouble();

                String moedaOriginal;
                String moedaAlvo;
                double taxaConversao;

                switch (opcao) {
                    case 1:
                        moedaOriginal = "USD";
                        moedaAlvo = "ARS";
                        taxaConversao = PrincipalBusca.buscarTaxaConversao(moedaOriginal, moedaAlvo);
                        if (taxaConversao >= 0) {
                            conversao.converterValor(valorOriginal, moedaOriginal, moedaAlvo, taxaConversao);
                        } else {
                            System.out.println("Não foi possível encontrar a taxa de conversão.");
                        }
                        break;
                    case 2:
                        moedaOriginal = "ARS";
                        moedaAlvo = "USD";
                        taxaConversao = PrincipalBusca.buscarTaxaConversao(moedaOriginal, moedaAlvo);
                        if (taxaConversao >= 0) {
                            conversao.converterValor(valorOriginal, moedaOriginal, moedaAlvo, taxaConversao);
                        } else {
                            System.out.println("Não foi possível encontrar a taxa de conversão.");
                        }
                        break;
                    case 3:
                        moedaOriginal = "USD";
                        moedaAlvo = "BRL";
                        taxaConversao = PrincipalBusca.buscarTaxaConversao(moedaOriginal, moedaAlvo);
                        if (taxaConversao >= 0) {
                            conversao.converterValor(valorOriginal, moedaOriginal, moedaAlvo, taxaConversao);
                        } else {
                            System.out.println("Não foi possível encontrar a taxa de conversão.");
                        }
                        break;
                    case 4:
                        moedaOriginal = "BRL";
                        moedaAlvo = "USD";
                        taxaConversao = PrincipalBusca.buscarTaxaConversao(moedaOriginal, moedaAlvo);
                        if (taxaConversao >= 0) {
                            conversao.converterValor(valorOriginal, moedaOriginal, moedaAlvo, taxaConversao);
                        } else {
                            System.out.println("Não foi possível encontrar a taxa de conversão.");
                        }
                        break;
                    case 5:
                        moedaOriginal = "USD";
                        moedaAlvo = "COP";
                        taxaConversao = PrincipalBusca.buscarTaxaConversao(moedaOriginal, moedaAlvo);
                        if (taxaConversao >= 0) {
                            conversao.converterValor(valorOriginal, moedaOriginal, moedaAlvo, taxaConversao);
                        } else {
                            System.out.println("Não foi possível encontrar a taxa de conversão.");
                        }
                        break;
                    case 6:
                        moedaOriginal = "COP";
                        moedaAlvo = "USD";
                        taxaConversao = PrincipalBusca.buscarTaxaConversao(moedaOriginal, moedaAlvo);
                        if (taxaConversao >= 0) {
                            conversao.converterValor(valorOriginal, moedaOriginal, moedaAlvo, taxaConversao);
                        } else {
                            System.out.println("Não foi possível encontrar a taxa de conversão.");
                        }
                        break;
                    case 8:
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;

                }
            } else {
                scanner.close();
                break;

            }
        }
    }
}

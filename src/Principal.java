import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        ConversaoDeMoeda conversao = new ConversaoDeMoeda();
        ListaHistorico historico = new ListaHistorico();

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

            if (opcao != 7 && opcao !=8) {

                System.out.println("Digite um valor para converter.");
                var valorOriginal = scanner.nextDouble();

                String moedaOriginal;
                String moedaAlvo;
                double taxaConversao;
                String dado;

                switch (opcao) {
                    case 1:
                        moedaOriginal = "USD";
                        moedaAlvo = "ARS";
                        taxaConversao = PrincipalBusca.buscarTaxaConversao(moedaOriginal, moedaAlvo);
                        if (taxaConversao >= 0) {
                            dado = conversao.converterValor(valorOriginal, moedaOriginal, moedaAlvo, taxaConversao);
                            historico.adicionarDado(dado);
                        } else {
                            System.out.println("Não foi possível encontrar a taxa de conversão.");
                        }
                        break;
                    case 2:
                        moedaOriginal = "ARS";
                        moedaAlvo = "USD";
                        taxaConversao = PrincipalBusca.buscarTaxaConversao(moedaOriginal, moedaAlvo);
                        if (taxaConversao >= 0) {
                            dado = conversao.converterValor(valorOriginal, moedaOriginal, moedaAlvo, taxaConversao);
                            historico.adicionarDado(dado);
                        } else {
                            System.out.println("Não foi possível encontrar a taxa de conversão.");
                        }
                        break;
                    case 3:
                        moedaOriginal = "USD";
                        moedaAlvo = "BRL";
                        taxaConversao = PrincipalBusca.buscarTaxaConversao(moedaOriginal, moedaAlvo);
                        if (taxaConversao >= 0) {
                            dado = conversao.converterValor(valorOriginal, moedaOriginal, moedaAlvo, taxaConversao);
                            historico.adicionarDado(dado);
                        } else {
                            System.out.println("Não foi possível encontrar a taxa de conversão.");
                        }
                        break;
                    case 4:
                        moedaOriginal = "BRL";
                        moedaAlvo = "USD";
                        taxaConversao = PrincipalBusca.buscarTaxaConversao(moedaOriginal, moedaAlvo);
                        if (taxaConversao >= 0) {
                            dado = conversao.converterValor(valorOriginal, moedaOriginal, moedaAlvo, taxaConversao);
                            historico.adicionarDado(dado);
                        } else {
                            System.out.println("Não foi possível encontrar a taxa de conversão.");
                        }
                        break;
                    case 5:
                        moedaOriginal = "USD";
                        moedaAlvo = "COP";
                        taxaConversao = PrincipalBusca.buscarTaxaConversao(moedaOriginal, moedaAlvo);
                        if (taxaConversao >= 0) {
                            dado = conversao.converterValor(valorOriginal, moedaOriginal, moedaAlvo, taxaConversao);
                            historico.adicionarDado(dado);
                        } else {
                            System.out.println("Não foi possível encontrar a taxa de conversão.");
                        }
                        break;
                    case 6:
                        moedaOriginal = "COP";
                        moedaAlvo = "USD";
                        taxaConversao = PrincipalBusca.buscarTaxaConversao(moedaOriginal, moedaAlvo);
                        if (taxaConversao >= 0) {
                            dado = conversao.converterValor(valorOriginal, moedaOriginal, moedaAlvo, taxaConversao);
                            historico.adicionarDado(dado);
                        } else {
                            System.out.println("Não foi possível encontrar a taxa de conversão.");
                        }
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;

                }
            } else if (opcao == 7) {
                scanner.close();
                break;
            } else if (opcao == 8){
                historico.exibirLista();
            }
        }
    }
}

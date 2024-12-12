public class ConversaoDeMoeda {
    private double valorOriginal;
    private double valorConvertido;


    public double getValorConvertido() {
        return valorConvertido;
    }

    public double getValorOriginal() {
        return valorOriginal;
    }

    public void converterValor(double valorOriginal,String moedaOriginal, String moedaAlvo, double taxaCambio){
        this.valorOriginal = valorOriginal;
        valorConvertido = valorOriginal * taxaCambio;

        System.out.println("O valor de " + valorOriginal + " [" + moedaOriginal + "]" + " é igual a " + valorConvertido + " [" + moedaAlvo + "]");
    }


}

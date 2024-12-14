public class ConversaoDeMoeda {
    private double valorOriginal;
    private double valorConvertido;
    ListaHistorico historico = new ListaHistorico();


    public double getValorConvertido() {
        return valorConvertido;
    }

    public double getValorOriginal() {
        return valorOriginal;
    }

    public String converterValor(double valorOriginal,String moedaOriginal, String moedaAlvo, double taxaCambio){
        this.valorOriginal = valorOriginal;
        this.valorConvertido = valorOriginal * taxaCambio;

        var dado = "O valor de " + valorOriginal + " [" + moedaOriginal + "]" + " é igual a " + valorConvertido + " [" + moedaAlvo + "]";
        System.out.println(dado);
        return dado;

    }


}

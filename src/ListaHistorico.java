import java.util.ArrayList;
import java.util.List;

public class ListaHistorico {
    private List<String> lista = new ArrayList<>();

    public void adicionarDado(String dado) {
        this.lista.add(dado);
    }

    public void exibirLista() {
        System.out.println("\nSeu histórico:");
        if (!lista.isEmpty()) {
            for (String dado : lista) {
                System.out.println(dado);
            }
        } else {
            System.out.println("Nenhuma conversão de valor foi realizada até o momento.\n");
        }
    }
}


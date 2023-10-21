import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NavegadorInternet {
    private Map<Integer, String> abas;
    private int abaAtual;

    public NavegadorInternet() {
        abas = new HashMap<>();
        abaAtual = -1;
    }

    public void exibirPagina(int numeroAba) {
        if (abas.containsKey(numeroAba)) {
            abaAtual = numeroAba;
            System.out.println("Exibindo a página: " + abas.get(abaAtual));
        } else {
            System.out.println("A aba especificada não existe.");
        }
    }

    public void adicionarNovaAba(String url) {
        int novaAbaNumero = abas.size() + 1;
        abas.put(novaAbaNumero, url);
        abaAtual = novaAbaNumero;
        System.out.println("Nova aba criada com a página: " + url);
    }

    public void atualizarPagina() {
        if (abaAtual != -1) {
            String url = abas.get(abaAtual);
            System.out.println("Atualizando a página: " + url);
        } else {
            System.out.println("Nenhuma aba está aberta para atualizar.");
        }
    }

    public static void main(String[] args) {
        NavegadorInternet navegador = new NavegadorInternet();

        navegador.adicionarNovaAba("https://www.exemplo.com");
        navegador.exibirPagina(1);
        navegador.atualizarPagina();

        navegador.adicionarNovaAba("https://www.google.com");
        navegador.exibirPagina(2);
    }
}


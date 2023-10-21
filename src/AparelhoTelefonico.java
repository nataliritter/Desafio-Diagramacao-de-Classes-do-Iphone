public class AparelhoTelefonico {
    private boolean emLigacao;
    private boolean correioDeVozAtivo;

    public AparelhoTelefonico() {
        emLigacao = false;
        correioDeVozAtivo = false;
    }

    public void ligar() {
        if (!emLigacao) {
            emLigacao = true;
            System.out.println("Ligação em andamento.");
        } else {
            System.out.println("O aparelho já está em ligação.");
        }
    }

    public void atender() {
        if (emLigacao) {
            System.out.println("Chamada atendida.");
            emLigacao = false;
        } else {
            System.out.println("Nenhuma chamada em andamento para atender.");
        }
    }

    public void iniciarCorreioDeVoz() {
        if (!emLigacao) {
            correioDeVozAtivo = true;
            System.out.println("Correio de voz ativado.");
        } else {
            System.out.println("Não é possível ativar o correio de voz durante uma chamada. Termine a chamada antes.");
        }
    }

    public static void main(String[] args) {
        AparelhoTelefonico telefone = new AparelhoTelefonico();

        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioDeVoz();
        telefone.ligar();
    }
}

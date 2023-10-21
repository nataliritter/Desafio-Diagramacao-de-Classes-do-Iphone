public class iPhone {
    private boolean ligado;
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iPhone() {
        ligado = false;
        reprodutorMusical = new ReprodutorMusical();
        aparelhoTelefonico = new AparelhoTelefonico();
        navegadorInternet = new NavegadorInternet();
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("iPhone ligado.");
        } else {
            System.out.println("O iPhone já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("iPhone desligado.");
        } else {
            System.out.println("O iPhone já está desligado.");
        }
    }

    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();

        meuiPhone.ligar();

        meuiPhone.desligar();
    }
}

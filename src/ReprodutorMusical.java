public class ReprodutorMusical {
    private String musicaAtual;

    public void tocar(String musica) {
        this.musicaAtual = musica;
        System.out.println("Tocando: " + musica);
    }

    public void pausar() {
        System.out.println("Pausando a música: " + musicaAtual);
    }

    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }

    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();

        reprodutor.tocar("Música 1");
        reprodutor.pausar();
        reprodutor.selecionarMusica("Música 2");
        reprodutor.tocar("Música 2");
    }
}

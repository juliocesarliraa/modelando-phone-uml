public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.adicionarAba();
        iphone.atualizarPagina();
        iphone.exibirPagina("Site da Gi");

        iphone.atender();
        iphone.ligar("99999999");
        iphone.iniciarCorreioVoz();

        iphone.selecionarMusica("Me liga - Jorge e Mateus");
        iphone.tocar();
        iphone.pausar();

    }
}
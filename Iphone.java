public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    @Override
    public void tocar(){
        System.out.println("Tocando musica.");
    }

    @Override
    public void pausar (){
        System.out.println("Pausando musica.");
    }

    @Override
    public void selecionarMusica(String musica){
        System.out.println("Selecionando musica: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz.");
    }

    @Override
    public void adicionarAba() {
        System.out.println("Adicionando aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina: " + url);
    }
}

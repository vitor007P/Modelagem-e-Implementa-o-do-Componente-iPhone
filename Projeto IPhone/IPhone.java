public class IPhone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico
{

    private String musicaAtual = ("Billie Jean");
    private String paginaAtual = "atual";



    @Override
    public void atender() {
        System.out.println("Ligação atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz!");


    }

    @Override
    public void ligar(String numero) {
        System.out.println("ligando para: " + numero);


    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);


    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("\nAbrindo nova aba no navegador...");


    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página..." + "\n\n");


    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo musica: " + musicaAtual);

    }

    @Override
    public void pausar() {
        System.out.println(musicaAtual + " -Pausada"  + "\n\n");


    }

    @Override
    public void selecionarMusica(String musica) {
        musicaAtual = musica; //ATUALIZA A ATUAL MUSICA
        System.out.println("Selecione nova música: " +musica);


    }
}

public class Main {

    public static void main(String[] args) {


        IPhone meuIPhone = new IPhone();

        // TESTE DE NAVEGADOR
        meuIPhone.adicionarNovaAba();
        meuIPhone.exibirPagina("https://www.youtube.com/");
        meuIPhone.atualizarPagina();



        // TESTE DE REPRODUTOR MUSICAL
        meuIPhone.selecionarMusica("What I've Done");
        meuIPhone.tocar();//MOSTRAR QUE A MUSICA DE FATO MUDOU
        meuIPhone.pausar();


        // TESTE DE TELEFONE
        meuIPhone.atender();
        meuIPhone.ligar("10987654321");
        meuIPhone.iniciarCorreioVoz();

    }
}
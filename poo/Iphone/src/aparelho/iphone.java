package aparelho;

 import componentes.aparelhoTelefonico;
 import componentes.navegadorInternet;
 import componentes.reprodutorMusical;
 
	public class iphone implements aparelhoTelefonico, navegadorInternet, reprodutorMusical {
	    public void ligar() {
	        System.out.println("Fazendo ligação...");
	    }

	    public void atender() {
	        System.out.println("Atendendo ligação...");
	    }

	    public void iniciarCorreioVoz() {
	        System.out.println("Correio de voz iniciado...");
	    }

	    public void exibirPagina() {
	        System.out.println("Exibindo página internet...");
	    }

	    public void adicionarNovaAba() {
	        System.out.println("Adicionando nova aba...");
	    }

	    public void atualizarPagina() {
	        System.out.println("Atualizando página web...");
	    }

	    public void tocar() {
	        System.out.println("Tocando musica...");
	    }

	    public void pausar() {
	        System.out.println("Pausando musica...");
	    }

	    public void selecionarMusica() {
	        System.out.println("Selecionando musica...");
	    }
	}


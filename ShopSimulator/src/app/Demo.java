package app;

// importa interfaces do package factories, incluindo interface e classes
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

public class Demo { // demo da aplicação
	private static Application configureApplication() { // método privado e estático para configurar aplicação
		// declaração de variáveis de aplicação e factory
		Application app;
		GUIFactory factory;
		
		String osName = System.getProperty("os.name").toLowerCase(); 
		// pega as propriedades da string osName para verificar se os parâmetros correspondem ao argumento especificado
		
		if (osName.contains("mac")) { // se osName conter "mac"
			factory = new MacOSFactory(); // cria factory de MacOS
		} else { // se não conter
			factory = new WindowsFactory(); // cria factory de Windows
		}
		app = new Application(factory); // criação de aplicação Factory dependendo do processo de if e else
		return app; // retorna aplicação
		}
	public static void main(String[] args) { // método main
		Application app = configureApplication(); // aplicação chama método configureApplication
		app.paint(); // aplicativo executa método paint
	}

}

package app;

// importa interfaces do package factories, incluindo interface e classes
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

public class Demo { // demo da aplica��o
	private static Application configureApplication() { // m�todo privado e est�tico para configurar aplica��o
		// declara��o de vari�veis de aplica��o e factory
		Application app;
		GUIFactory factory;
		
		String osName = System.getProperty("os.name").toLowerCase(); 
		// pega as propriedades da string osName para verificar se os par�metros correspondem ao argumento especificado
		
		if (osName.contains("mac")) { // se osName conter "mac"
			factory = new MacOSFactory(); // cria factory de MacOS
		} else { // se n�o conter
			factory = new WindowsFactory(); // cria factory de Windows
		}
		app = new Application(factory); // cria��o de aplica��o Factory dependendo do processo de if e else
		return app; // retorna aplica��o
		}
	public static void main(String[] args) { // m�todo main
		Application app = configureApplication(); // aplica��o chama m�todo configureApplication
		app.paint(); // aplicativo executa m�todo paint
	}

}

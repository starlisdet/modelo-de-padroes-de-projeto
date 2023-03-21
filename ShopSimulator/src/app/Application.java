package app;

// importa interfaces dos packages Button, Checkbox e Factories
import button.Button;
import checkbox.Checkbox;
import factories.GUIFactory;

public class Application {
	// declara��o privada de Button e Checkbox
	private Button button;
	private Checkbox checkbox;
	
	// m�todo p�blico de aplica��o contendo interface GUIFactory
	public Application(GUIFactory factory) {
		button = factory.createButton(); // factory de Button cria um Button
		checkbox = factory.createCheckbox(); // factory de Checkbox cria um Checkbox
	}
	
	public void paint() { // m�todo void paint
		button.paint(); // button executa m�todo paint
		checkbox.paint(); // checkbox executa m�todo paint
	}

}

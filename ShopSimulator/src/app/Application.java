package app;

// importa interfaces dos packages Button, Checkbox e Factories
import button.Button;
import checkbox.Checkbox;
import factories.GUIFactory;

public class Application {
	// declaração privada de Button e Checkbox
	private Button button;
	private Checkbox checkbox;
	
	// método público de aplicação contendo interface GUIFactory
	public Application(GUIFactory factory) {
		button = factory.createButton(); // factory de Button cria um Button
		checkbox = factory.createCheckbox(); // factory de Checkbox cria um Checkbox
	}
	
	public void paint() { // método void paint
		button.paint(); // button executa método paint
		checkbox.paint(); // checkbox executa método paint
	}

}

package factories;

// importa interface e classes MacOS dos packages Button e Checkbox
import button.Button;
import button.MacOSButton;
import checkbox.Checkbox;
import checkbox.MacOSCheckbox;

// implementa interface GUIFactory 
public class MacOSFactory implements GUIFactory {
	@Override
	public Button createButton() { // cria botão do MacOS
		return new MacOSButton(); // retorna botão do MacOS
	}
	
	@Override
	public Checkbox createCheckbox() { // cria checkbox do MacOS
		return new MacOSCheckbox(); // retorna checkbox do MacOS
	}

}

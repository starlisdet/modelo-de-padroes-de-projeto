package factories;

// importa classes e interfaces Windows de package Button e Checkbox
import button.Button;
import button.WindowsButton;
import checkbox.Checkbox;
import checkbox.WindowsCheckbox;

// implementa interface GUIFactory
public class WindowsFactory implements GUIFactory {
	@Override
	public Button createButton() { // cria bot�o do Windows
		return new WindowsButton(); // retorna bot�o do Windows
	}
	
	@Override
	public Checkbox createCheckbox() { // cria checkbox do Windows
		return new WindowsCheckbox(); // retorna checkbox do Windows
	}

}
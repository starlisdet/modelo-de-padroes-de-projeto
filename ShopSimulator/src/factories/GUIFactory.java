package factories;
// importa interface Button e Checkbox dos packages button e checkbox
import button.Button;
import checkbox.Checkbox;

public interface GUIFactory {
	Button createButton(); // cria botão
	Checkbox createCheckbox(); // cria checkbox
}

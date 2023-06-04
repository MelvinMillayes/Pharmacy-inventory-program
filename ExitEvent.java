// Importar clases necesarias
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

// Clase ExitEvent.
public class ExitEvent implements ActionListener {

    // Funcion que el ejecutara el evento.
    public void actionPerformed(ActionEvent e) {
        // Caja de dialogo con mensaje.
        JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema!");
        // Cerrar programa.
        System.exit(0);
   }
}
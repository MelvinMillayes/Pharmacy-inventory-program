// Importar clases necesarias.
import java.awt.*;
import javax.swing.*;

public class Window
{
      public void menu()
      {
         JFrame frame = new JFrame();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         //Crear panel y botones         
         JPanel panel = new JPanel();
         JButton crear = new JButton("Crear");
         JButton buscar = new JButton("Buscar");
         JButton salir = new JButton("Salir");

         // Añadir botones al panel
         panel.add(crear);
         panel.add(buscar);
         panel.add(salir);

         // Añadir eventlisteners a botones
         crear.addActionListener(new CrearActionListener());
         buscar.addActionListener(new BuscarActionListener());
         salir.addActionListener(new ExitEvent());

         //Panel con el titulo
         JPanel panel2 = new JPanel();
         panel2.add(new JLabel("Manejo de Inventario", JLabel.CENTER));
         
         //Panel que maneja los anteriores
         JPanel pane = new JPanel();
         pane.add(panel2, BorderLayout.PAGE_START);
         pane.add(panel, BorderLayout.CENTER);
         
         frame.getContentPane().add(pane);
         frame.setSize(256, 144);
         frame.setVisible(true);
         frame.setLocationRelativeTo(null);
      }            
}
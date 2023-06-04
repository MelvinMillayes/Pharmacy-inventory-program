import java.util.Scanner;
import java.io.*;
import javax.swing.*;

public class IntroLoginModule
{
   public void Intro()
   {

      JOptionPane.showMessageDialog(null, "Manejo de inventario de articulos" + 
                                          "\n" +
                                          "\nRealizado por:" +
                                          "\nJustin Ferrer" +
                                          "\nKenneth Yelton" +
                                          "\nMatthew Morales" +
                                          "\nMelvin Millalles" +
                                          "\n" +
                                          "\nUsername: user" +
                                          "\nPassword: pass", "Proyecto Final de 2400",JOptionPane.INFORMATION_MESSAGE);

   }
   
   public void loginPrompt()
   throws IOException
   {
            
      Scanner scan = new Scanner (new File("credenciales.txt"));    
      String user = scan.nextLine();
      String pass = scan.nextLine();  
      String inpUser;
      String inpPass;
      boolean success = false; 
      
      while (!success)
      {
         inpUser = JOptionPane.showInputDialog("Entre el nombre de usuario");
         inpPass = JOptionPane.showInputDialog("Entre la contrasena");
      
         if (inpUser.equals(user) && inpPass.equals(pass)) 
         {
             //JOptionPane.showMessageDialog(null,"Bienvenidos",null,JOptionPane.PLAIN_MESSAGE);
             success = true;
             //menu
         }
         else 
         {
             JOptionPane.showMessageDialog(null,"Nombre de Usuario o contraseña invalida",null,JOptionPane.PLAIN_MESSAGE);
                   
         }
      }        
   }
}
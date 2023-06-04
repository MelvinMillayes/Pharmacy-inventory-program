// Proyecto Final COMP 2400.

import java.io.*;

public class MainManager
   {
      public static void main(String args[]) throws IOException
      {
         IntroLoginModule login = new IntroLoginModule();
         // Mostrar introduccion.
         login.Intro();
         // Mostrar login
         login.loginPrompt();
         Window menu = new Window();
         // Mostrar menu
         menu.menu();
      }
}
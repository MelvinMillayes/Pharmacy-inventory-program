
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*; 

public class CrearActionListener implements ActionListener {
    
    public void actionPerformed(ActionEvent e) {
        try{
            // Crear objeto fileOutput.
            PrintWriter fileOutput; 
            //Arreglos donde se va a almacenar la informacion de la prescripcion.
            String [] medicamento = {"Nombre", "Descripcion", "Codigo", "Fecha de compra", "Fecha de expiracion", "Cantidad comprada", "Cantidad disponible", "Cantidad danada", "Cantidad Vendida", "Precio de Articulo", "Total Vendido"};
            
            
            medicamento[0]= JOptionPane.showInputDialog( medicamento[0] + " de medicamento");
            //Crea objeto para escribir en archivo

            fileOutput = new PrintWriter(medicamento[0] + ".txt");
           
            fileOutput.println(medicamento[0]);

            //Loop que pide al usuario que entre informacion del medicamento, se almacena en arreglo.
            for(int i=1; i< medicamento.length; i++){
                medicamento[i]= JOptionPane.showInputDialog( medicamento[i] + " de medicamento");

                fileOutput.println(medicamento[i]);

            }

            fileOutput.close();

            int  existencias[]={1, 2, 3, 4};

            int indiceExist = 0;
            //Loop que almacena en nuevo arreglo los indices que tienen las cantidades de existencias(stock). 
            for(int j = 5; j <=8; j++){
                
                existencias[indiceExist] =Integer.parseInt(medicamento[j]);

                indiceExist++;
            }
            //Almacena en nuevo arreglo los indices que contienen precio y total como tipo float del arreglo Medicamento. 
            float precio[] = {Float.parseFloat(medicamento[9]), Float.parseFloat(medicamento[10])};

            
         //Arreglo de objeto.
         Articulo prescripcion [] = new Articulo[4];
        //Crea objeto con la informacion que entro el usuario
        Articulo articuloCreado;
        prescripcion[0] = new Articulo(medicamento[0], medicamento[1], medicamento[2], 
        medicamento[3], medicamento[4], existencias[0], existencias[1], existencias[2], existencias[3], precio[0], precio[1]);
        articuloCreado = prescripcion[0];
        System.out.println(articuloCreado.nombre);
     
        // Catch por si hay error
    }   catch(IOException err){
            System.out.println("File error " + e);
        }
   }
}
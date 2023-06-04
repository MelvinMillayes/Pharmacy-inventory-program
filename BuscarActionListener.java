// Importar clases necesarias.
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 
import java.util.Scanner;
import java.io.*; 
import java.time.LocalDate;


public class BuscarActionListener implements ActionListener {

    // Evento que se ejecutara
    public void actionPerformed(ActionEvent e) {
        String [] medicamento = {"Nombre", "Descripcion", "Codigo", "Fecha de compra", "Fecha de expiracion", "Cantidad comprada", "Cantidad disponible", "Cantidad danada", "Cantidad Vendida", "Precio", "Total"};
        String input = JOptionPane.showInputDialog(null, "Buscar medicamento");                         
        try{
            File myObj = new File(input +".txt");
            Scanner myReader = new Scanner(myObj);
            for (int i = 0; myReader.hasNextLine(); i++) {
            String data = myReader.nextLine();
            medicamento[i] = data;
            }
            myReader.close();
        }catch(FileNotFoundException err){
            System.out.println("Error");
        }

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
        Articulo medic;
        prescripcion[0] = new Articulo(medicamento[0], medicamento[1], medicamento[2], 
        medicamento[3], medicamento[4], existencias[0], existencias[1], existencias[2], existencias[3], precio[0], precio[1]);
        medic = prescripcion[0];

        String[] options = new String[] {"Editar", "Atras"};
        int response = JOptionPane.showOptionDialog(null, medic.toString(), "Informacion de Articulo",
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options, options[0]);

        // Seleccion sobre que editar
        int editInput;
        if (response == 0){
            // Guardar lo que el usuario entra en el dialogo de entrada en variabla editInput.
            editInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre el numero de lo que desea editar?: "));                         
            if (editInput ==1){
                medic.nombre = JOptionPane.showInputDialog(null, "Entre nombre nuevo: ");
            }            
            if (editInput ==2){
                medic.descripcion = JOptionPane.showInputDialog(null, "Entre descripcion nueva: ");
            }            
            if (editInput ==3){
                medic.codigo = JOptionPane.showInputDialog(null, "Entre codigo nuevo: ");
            }            
            if (editInput ==4){
                medic.fechaDeCompra = LocalDate.parse(JOptionPane.showInputDialog(null, "Entre fecha de compra nueva: "));
            }            
            if (editInput ==5){
                medic.fechaDeExpiracion = LocalDate.parse(JOptionPane.showInputDialog(null, "Entre fecha de expiracion nueva: "));

            }            
            if (editInput ==6){
                medic.cantidadComprada = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre cantidad comprada nueva: "));
            }            
            if (editInput ==7){
                medic.cantidadDisponible = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre cantidad dosponible nueva: "));
            }           
            if (editInput ==8){
                medic.cantidadDanada = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre cantidad danada nueva: "));
            }            
            if (editInput ==9){
                medic.cantidadVendida = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre cantidad vendida nueva: "));
            }
            if (editInput == 10){
                medic.precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre precio nuevo: "));
            }            
            if (editInput == 11){
                medic.totalVendido = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre total vendido nuevo: "));
            }
            guardarEnFile(medic);
        }
        else {
        }
    
    }
    // Metodo que guarda la informacion del objeto modificado a el archivo de texto nuevamente.
    static void guardarEnFile(Articulo medica){
        try {
            PrintWriter fileOutput = new PrintWriter(medica.nombre + ".txt");

            fileOutput.println(medica.nombre);
            fileOutput.println(medica.descripcion);
            fileOutput.println(medica.codigo);
            fileOutput.println(medica.fechaDeCompra);
            fileOutput.println(medica.fechaDeExpiracion);
            fileOutput.println(medica.cantidadComprada);
            fileOutput.println(medica.cantidadDisponible);
            fileOutput.println(medica.cantidadDanada);
            fileOutput.println(medica.cantidadVendida);
            fileOutput.println(medica.precio);
            fileOutput.println(medica.totalVendido);
            fileOutput.close();

        } catch (IOException error){
            System.out.println(error);
        }
    
   }
}
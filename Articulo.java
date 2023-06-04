// Importar clase LocalDate
import java.time.LocalDate;

class Articulo {
    // Crear atributos String.
    String nombre, descripcion,codigo;

    // Crear atributos LocalDate YYYY-MM-DD
    LocalDate fechaDeCompra, fechaDeExpiracion;

    // Crear atributos int
    int cantidadComprada, cantidadDisponible, 
        cantidadDanada, cantidadVendida;

    // Crear atributos float
    float precio, totalVendido;

    // Constructor default.
    public Articulo(){
        nombre = "Panadol";
        descripcion = "Para dolor";
        codigo = "P1234";

        fechaDeCompra = LocalDate.parse("2022-12-01");
        fechaDeExpiracion = LocalDate.parse("2022-12-10");

        cantidadComprada = 5;
        cantidadDisponible = 4;
        cantidadDanada = 0;
        cantidadVendida = 1;

        precio = 1.00f;
        totalVendido = 1.07f;

    }

    // Constructor con parametros (toma fechas como string (YYYY-MM-DD) y las convierte en tipo LocalDate)
    public Articulo(String nom, String desc, String cod,
    String fechaCompra, String fechaExpiracion,
     int cantidadComp, int cantidadDisp, int cantidadDan, int cantidadVend,
     float p, float t)   
    {
        nombre = nom;
        descripcion = desc;
        codigo = cod;
        fechaDeCompra = LocalDate.parse(fechaCompra);
        fechaDeExpiracion = LocalDate.parse(fechaExpiracion);
        cantidadComprada = cantidadComp;
        cantidadDisponible = cantidadDisp;
        cantidadDanada = cantidadDan;
        cantidadVendida = cantidadVend;
        precio = p;
        totalVendido = t;

    }

    // Metodo toString.
    public String toString(){
        return ("1. nombre: " + nombre +
                "\n2. descripcion: " + descripcion +
                "\n3. codigo: " + codigo +
                "\n4. fecha de compra: " + fechaDeCompra +
                "\n5. fecha de expiracion: " + fechaDeExpiracion +
                "\n6. cantidad comprada: " + cantidadComprada +
                "\n7. cantidad disponible: " + cantidadDisponible +
                "\n8. cantiad danada: " + cantidadDanada + 
                "\n9. cantidad vendida: " + cantidadVendida +
                "\n10. precio: " + precio +
                "\n11. total vendido: " + totalVendido);
    }
}
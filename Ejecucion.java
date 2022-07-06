import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//////////////////////////////77
import java.util.Scanner;
public class Ejecucion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Canasta producto1= new Canasta("Leche",0.98,2);
        Canasta producto2= new Canasta("Avena",0.54,1);
        Canasta producto3= new Canasta("Huevos",0.15,10);

        System.out.println("************* Su canasta contiene *************");
        producto1.imprimirCanasta();
        producto2.imprimirCanasta();
        producto3.imprimirCanasta();

        //EL CLIENTE DESEA CAMBIAR LA AVENA POR OTRO PRODUCTO, EN ESTE CASO ACCEDEREMOS AL CAMBIO MEDIANTE EL METODO SET
        System.out.println("Ingrese el nuevo Producto: ");
        producto2.setProducto(sc.nextLine());
        System.out.println("Precio: ");
        producto2.setPrecio(sc.nextDouble());
        System.out.println("Cantidad: ");
        producto2.setCantidad(sc.nextInt());

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("************* Su nueva canasta contiene *************");
        producto1.imprimirCanasta();
        producto2.imprimirCanasta();
        producto3.imprimirCanasta();

        ///////////////// MANDAR AL ARCHIVO
        /*String texto1="Hola a todos";
        String texto2="Buenos dias";

        try(BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\User\\Desktop\\archivo_de_prueba.txt"))){
            bw.write(producto1.imprimirCanasta());
            bw.newLine();
            bw.write(texto2);
            System.out.println("Escritura correcta");
        }catch(IOException e){
            System.out.println("Error");
        }*/










    }
}

import java.io.FileNotFoundException;

public class Exe {
    public static void main(String[] args) throws FileNotFoundException {
        // Llamamos el constructor del objeto, mandamos la localización del archivo y el
        // nombre del mismo
        ReadWrite newFile = new ReadWrite("./", "Datos");
        // Creamos el archivo
        newFile.createFile();
        // Escribimos el archivo (con el método sobrecargado)
        newFile.writeOnFile("Hola Mundo");
        newFile.writeOnFile(10);
        newFile.writeOnFile(10.90);
        // Cerramos el archivo
        newFile.closeWrite();

        // Leemos el archivo
        ReadWrite fileToRead = new ReadWrite("./", "Datos");
        fileToRead.readFile();
        // Imprimimos datos del archivo
        System.out.println(fileToRead.readNextLine());
        System.out.println(fileToRead.readNextDouble());
        System.out.println(fileToRead.readNext());

        // Cerramos el archivo
        fileToRead.closeRead();
    }
}
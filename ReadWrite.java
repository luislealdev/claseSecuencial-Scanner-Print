import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWrite {
    // Atributos
    String a_fileLocation, a_fileName;
    PrintWriter a_archEscritura;
    Scanner a_archLectura;

    // Constructor
    ReadWrite(String p_fileLocation, String p_fileName) {
        a_fileLocation = p_fileLocation;
        a_fileName = p_fileName;
    }

    public void createFile() throws FileNotFoundException {
        // Crear el archivo
        a_archEscritura = new PrintWriter(new File(a_fileLocation + "/" + a_fileName));
    }

    // SOBRECARGAMOS EL MÉTODO DE ESCRIBIR
    public void writeOnFile(String p_textToWrite) {
        // Escribimos algo dentro del archivo
        a_archEscritura.print(p_textToWrite + "\n");
    }

    public void writeOnFile(int p_textToWrite) {
        // Escribimos algo dentro del archivo
        a_archEscritura.print(p_textToWrite + "\n");
    }

    public void writeOnFile(Float p_textToWrite) {
        // Escribimos algo dentro del archivo
        a_archEscritura.print(p_textToWrite + "\n");
    }

    public void writeOnFile(char p_textToWrite) {
        // Escribimos algo dentro del archivo
        a_archEscritura.print(p_textToWrite + "\n");
    }

    public void writeOnFile(double p_textToWrite) {
        // Escribimos algo dentro del archivo
        a_archEscritura.print(p_textToWrite + "\n");
    }

    public void readFile() throws FileNotFoundException {
        a_archLectura = new Scanner(new File((a_fileLocation + "/" + a_fileName)));
    }

    // SOBRECARGAMOS EL MÉTODO DE LEER
    public String readNext() {
        return a_archLectura.next();
    }

    public String readNextLine() {
        return a_archLectura.nextLine();
    }

    public int readNextInt() {
        return a_archLectura.nextInt();
    }

    public double readNextDouble() {
        return a_archLectura.nextDouble();
    }

    public float readNextFloat() {
        return a_archLectura.nextFloat();
    }

    // MÉTODO PARA CERRAR LA PUERTA
    public void closeWrite() {
        // Cerramos la puerta
        a_archEscritura.close();
    }

    public void closeRead() {
        // Cerramos la puerta
        a_archLectura.close();
    }
}

// se importa la clase scanner para leer entrada del usuario desde consola
import java.util.Scanner; 

// se deeclara la clase pública VehiculoInfo
public class VehiculoInfo { 
    
    // Método principal main- punto de entrada del programa
    public static void main(String[] args) { 
        
        // se crea una instancia de scanner para leer datos desde teclado
        Scanner scanner = new Scanner(System.in);
        
        // Requisito de actividad: solicitar nombre y edad
        // se muestra mensaje pidiendo el nombre del usuario
        System.out.println("Ingrese su nombre:");
        
        // se lee una línea completa de texto y se almacena en la variable nombre
        String nombre = scanner.nextLine();
        
        // se muestra mensaje pidiendo la edad del usuario
        System.out.println("Ingrese su edad:");
        
        // selee un número entero y lo almacena en la variable edad
        int edad = scanner.nextInt();

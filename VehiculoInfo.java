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
        
        // se guarda una línea completa de texto y se almacena en la variable nombre
        String nombre = scanner.nextLine();
        
        // se muestra mensaje pidiendo la edad del usuario
        System.out.println("Ingrese su edad:");
        
        // seguarda un número entero y lo almacena en la variable edad
        int edad = scanner.nextInt();

        // Limpia el buffer del scanner (consume el salto de línea pendiente después de nextInt())
        scanner.nextLine(); // limpiar salto
        
        // Caso: datos del vehículo
        //  Se solicita la marca del vehículo
        System.out.println("Ingrese la marca del vehiculo:");
        
        // Se guarda la marca del vehículo como string
        String marca = scanner.nextLine();
        
        // Se solicita el modelo del vehículo
        System.out.println("Ingrese el modelo del vehiculo:");
        
        // guarda el modelo del vehículo como string
        String modelo = scanner.nextLine();
        
        // Solicita el tipo de combustible
        System.out.println("Ingrese el tipo de combustible:");
        
        // guarda el tipo de combustible como string
        String tipoCombustible = scanner.nextLine();
        
        // se solicita la cilindrada con ejemplo
        System.out.println("Ingrese la cilindrada (ej: 1600):");
        
        // guarda la cilindrada como número entero
        int cilindrada = scanner.nextInt();
        
        // se solicita la capacidad de pasajeros
        System.out.println("Ingrese la capacidad de pasajeros:");
        
        // guarda la capacidad de pasajeros como número entero
        int capacidadPasajeros = scanner.nextInt();

        scanner.close();
    }
}

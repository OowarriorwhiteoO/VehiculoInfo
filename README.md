# Proyecto VehiculoInfo 

Programa Java por consola **sin IDE** que solicita **nombre y edad** del usuario y además datos de un **vehículo** (marca, modelo, cilindrada, tipo de combustible, capacidad de pasajeros).
Se compila con `javac` y se ejecuta con `java`.
Basándome en el análisis de tu código Java, aquí están los requerimientos funcionales y no funcionales del programa:

## **Requerimientos Funcionales**

**RF01 - Captura de datos del usuario:**
- El sistema debe solicitar y almacenar el nombre del usuario (tipo String)
- El sistema debe solicitar y almacenar la edad del usuario (tipo int)

**RF02 - Captura de datos del vehículo:**
- El sistema debe solicitar y almacenar la marca del vehículo (tipo String)
- El sistema debe solicitar y almacenar el modelo del vehículo (tipo String)
- El sistema debe solicitar y almacenar el tipo de combustible (tipo String)
- El sistema debe solicitar y almacenar la cilindrada del vehículo (tipo int)
- El sistema debe solicitar y almacenar la capacidad de pasajeros (tipo int)

**RF03 - Presentación de información:**
- El sistema debe mostrar un resumen de los datos del usuario (nombre y edad)
- El sistema debe mostrar un resumen completo de los datos del vehículo ingresados
- La información debe presentarse de forma organizada con encabezados claramente diferenciados

**RF04 - Interacción por consola:**
- El sistema debe funcionar completamente a través de la línea de comandos
- Debe proporcionar mensajes claros para guiar al usuario en cada entrada

## **Requerimientos No Funcionales**

**RNF01 - Usabilidad:**
- La interfaz debe ser intuitiva con mensajes claros y comprensibles
- Los datos deben incluir ejemplos cuando sea necesario (como en cilindrada)
- La salida debe estar bien formateada y ser fácil de leer

**RNF02 - Compatibilidad:**
- El programa debe ejecutarse en cualquier sistema con Java Runtime Environment (JRE)
- Compatible con Java 8 o superior

**RNF03 - Rendimiento:**
- Tiempo de respuesta inmediato para la captura y visualización de datos
- Uso mínimo de memoria (solo variables necesarias)

**RNF04 - Mantenibilidad:**
- Código simple y directo, fácil de entender y modificar
- Uso de nombres de variables descriptivos

**RNF05 - Confiabilidad:**
- Gestión adecuada de recursos (cierre del Scanner)

**RNF06 - Simplicidad:**
- Programa de propósito específico y alcance limitado
- Sin persistencia de datos (los datos se pierden al terminar la ejecución)
- Operación de sesión única (no hay bucles o ni menús)

**Limitaciones de aplicación:**
- No hay validación de entrada (el programa puede fallar con entradas incorrectas)
- No hay manejo de excepciones
- No hay persistencia de datos
- No permite corrección de errores una vez ingresados los datos

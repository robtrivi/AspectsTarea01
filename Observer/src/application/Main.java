package application;




/*

Aquí están los pasos mencionados en el video para instalar JavaFX en Eclipse IDE:

1. Abre el servicio de Eclipse e ir a donde dice "Ayuda", luego haz clic en "Eclipse Marketplace".
2. Busca "fx" y haz clic en "Ir". Deberás instalar "e(fx)clipse", que es una biblioteca para JavaFX.
3. Acepta los términos y haz clic en "Finalizar". Cuando llegue al 53%, aparecerá una ventana emergente en la que tienes que seleccionar "Reiniciar ahora".
4. Ve a la página de descarga de JavaFX y descarga la versión que dice "Windows x64 SDK".
5. En Eclipse, ve a "Archivo" -> "Nuevo" -> "Proyecto JavaFX".
6. Pon el nombre del proyecto y asegúrate de que la casilla "Usar biblioteca JavaFX" esté marcada.
7. Una vez descargado el SDK de JavaFX, ve a donde se guardó, descomprímelo y copia todo su contenido.
8. En tu computadora, ve a la carpeta "Windows" y crea una nueva carpeta, por ejemplo, "JavaFX". Pega allí todo el contenido del SDK de JavaFX que copiaste.
9. Regresa a Eclipse y ve a "Windows" -> "Preferencias" -> "Java" -> "Build Path" -> "User Libraries". Haz clic en "Nuevo" y pon el nombre "JavaFX".
10. Haz clic en "Añadir archivos externos" y ve a la carpeta donde pegaste los archivos de JavaFX. Selecciona todos los archivos y haz clic en "Abrir".
11. Haz clic en "Aplicar y cerrar". Luego ve a "Proyecto" -> "Propiedades" -> "Java Build Path" -> "Libraries" y arrastra "JavaFX" a "Modulepath".
12. Haz clic en "Aplicar y cerrar". Luego ve a "Run" -> "Run Configurations" -> "Arguments" y en "VM arguments" pega el siguiente texto: `--module-path 'C:\JavaFX\lib' --add-modules javafx.controls,javafx.fxml`
13. Haz clic en "Aplicar" y "Cerrar". Ahora deberías poder ejecutar tu proyecto JavaFX sin errores.

Por favor, ten en cuenta que estos pasos pueden variar dependiendo de tu configuración específica y de la versión de las herramientas que estés utilizando.

Configuracion en RUN
--module-path 'C:\Users\DELL\Documents\javafx-sdk-17.0.7'
--add-modules javafx.controls,javafx.fxml
*/

public class Main{
    public static void main(String[] args) {
        // Crear la instancia de la ventana
        CambioColorFondo ventana = new CambioColorFondo();

        // Mostrar la ventana
        ventana.setVisible(true);
    }
}

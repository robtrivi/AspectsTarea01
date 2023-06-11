# Implementación del patrón de diseño: Observador

En nuestro programa el aspecto `ColorCAspect.aj` es el que hace el rol del observador y el sujeto es la clase `Change.java` a través de joinpoints, pointcuts y advices. Imprimiendo en consola el color actual que el usuario ha escogido. 

#### Implementación de la funcionalidad adicional 

Dentro del advice al ejecutarse el observador, además de imprimirse por consola, se implementó el método para preservar en un log los cambios del fondo de nuestra ventana, adicionalmente de la hora y fecha exacta permitiendo el monitoreo y depuración de la aplicación manteniendo la persistencia de los datos en el archivo `colorLogger.txt`, ademas implementamos que el Label se configure con el ultimo color.

Este es un claro ejemplo de cross-cutting concern debido a que involucra diferentes partes del código
sin estar relacionado a la lógica principal de nuestro programa.

Color
![Color](https://github.com/robtrivi/AspectsTarea01/blob/main/WhatsApp%20Image%202023-06-10%20at%2023.17.13.jpeg)

ColorCAspect
![ColorCAspect](https://github.com/robtrivi/AspectsTarea01/blob/main/WhatsApp%20Image%202023-06-10%20at%2023.18.11.jpeg)

Configuracion
![WhatsApp Image 2023-06-10 at 23 46 40](https://github.com/robtrivi/AspectsTarea01/assets/95447422/a917a1f6-6d53-4908-bcf8-dac916dc16b3)

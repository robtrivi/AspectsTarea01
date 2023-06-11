# Implementación del patrón de diseño: Observador

En nuestro programa el aspecto `ColorCAspect.aj` es el que hace el rol del observador y el sujeto es la clase `Change.java` a través de joinpoints, pointcuts y advices. Imprimiendo en consola el color actual que el usuario ha escogido. 

#### Implementación de la funcionalidad adicional 

Dentro del advice al ejecutarse el observador, además de imprimirse por consola, se implementó el método para preservar en un log los cambios del fondo de nuestra ventana, adicionalmente de la hora y fecha exacta permitiendo el monitoreo y depuración de la aplicación manteniendo la persistencia de los datos en el archivo `colorLogger.txt`.

Este es un claro ejem

plo de cross-cutting concern debido a que involucra diferentes partes del código
sin estar relacionado a la lógica principal de nuestro programa.


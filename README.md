
                                                          Trabajo Final Tecnicas De Programacion 1

La compañía líder en Seguros de Latino America requiere construir un prototipo que permita proveer al equipo de Analistas de datos de la data necesaria para
realizar un estudio del índice de desigualdad de los diferentes países de Latino américa. para esto el equipo de análisis de datos espera que el desarrollo
solicitado permita:

1. Conectarse al API https://restcountries.com/
2. Consumir el endpoint: https://restcountries.com/v3.1/name/{name}
3. Extraer el objeto de respuesta: Nombre del País, Capital, Población, GINI
4. Pasar los datos extraídos del API a un archivo (este solo puede tener extensión .txt, .text o .data )
5. Interfaz gráfica que permita interactuar con la aplicación, esta interfaz debe contar con:

  ● Campo de texto para ingresar el nombre del archivo.
  ● Campo para ingreso de la extensión del archivo.
  ● Botón de Procesar Data.
  ● Mensaje de procesamiento terminado.
  ● Botón de generar archivo.
  
  ----------------------------------------------------------------------------------------------
 
1. La interfaz deberá tener un display que muestre el log del sistema, ejemplo:

  ● Fecha de ejecución
  ● interfaz cargada
  ● conexión con servidor ejecutada
  ● información consumida
  ● archivo abierto
  ● archivo escrito
  ● archivo guardado
  ● operación finalizada.
  
2. Generar un segundo archivo con extensión .log que tenga el resumen de la operación ejecutada por el sistema (punto anterior).
3. Agregar un CheckBox que permita seleccionar si se quiere guardar el resultado en la base de datos (SQLlite) solo el Nombre del País, Población y GINI.
4. Si se decide guardar en base de datos en el archivo Log y en el display deberá aparecer el registro (se guardó en base de datos).
5. Finalmente en la interfaz deberá aparecer una sección de filtrar y mostrar en pantalla, esta sección se caracteriza por:

  ● Campo de texto que solo reciba letras
  ● El campo de texto debe ser para ingresar países
  ● Botón de buscar GINI del país ingresado
  ● Cuando se de click el botón debe consumir el endpoint debe filtrar por país y traer los datos: Pais, Capital, Población y GINI
  ● Los datos traídos deben ser mostrados en una sección en la interfaz con el título: “ÍNDICE DE DESIGUALDAD DE [PAÍS FILTRADO] ES:”

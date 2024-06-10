FUNCIONAMIENTO DEL PRIMER ASPECTO SOLICITADO (Cambio de color y aviso en consola del cambio de color de la ventana)
![image](https://github.com/kathyforero/Tarea01-Aspectos/assets/143484307/87d3daa4-4300-4859-a6e4-41fb417ef6ff)

FUNCIONAMIENTO DEL ASPECTO ADICIONAL + EXPLICACIÓN
![image](https://github.com/kathyforero/Tarea01-Aspectos/assets/143484307/1e3bb560-783b-4e67-b11d-37e8d74c96b3)

Los aspectos vistos de forma general, nos ayudan a manejar las diferentes preocupaciones que se tienen al momento de diseñar un software. En el primer aspecto solicitado, por ejemplo, manejamos lo que es un Core Concern, haciendo un aspecto orientado 
a mostrar en consola cuando una ventana cambie de color al presionar uno de los tres botones; está directamente relacionado con la función principal, que es el cambio de color de la ventana a través de botones, permitiéndonos ver como cada que se presiona un botón,
efectivamente la acción se ejecuta de forma correcta al momento de interactuar con la interfaz.
Hablando específicamente del nuevo aspecto creado, como se puede ver en la captura, al momento de ejecutar algún botón, se registra el botón presionado junto con la fecha y hora en la que se realizó esta acción. Esto ejemplifica de mejor manera por otro lado lo que
sería un Cross-cutting Concern, que a diferencia del Core Concern manejado en el primer aspecto, el mismo no está relacionado directamente con la funcionalidad principal de nuestro programa (el cambio de color de las ventanas), sino que está orientado a realizar un
registro cada que se presione un botón, lo que nos permite monitorear cuando un usuario decida cambiar el color de la ventana para así poder analizar otros factores a través del registro, como el correcto funcionamiento del programa y detectar errores, o recopilar 
la información de los usuarios y tal vez hallar un patrón que nos permitirían hacer estadísticas sobre el color más usado, el menos frecuente, etc. Como podemos ver, nos abre muchas posibilidades de análisis, que como ya se mencionó, incluso si no tiene relación
directa con la funcionalidad principal del programa, en todo caso puede afectar a una parte importante de él, como en este caso, el uso de un registro para control y monitoreo, que contribuye al aseguramiento de la estabilidad de nuestro programa, la corrección
eficiente de errores, o realizar estádisticas que nos permitan determinar otras variables.

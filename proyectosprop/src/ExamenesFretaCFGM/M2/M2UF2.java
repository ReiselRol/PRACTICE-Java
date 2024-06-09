package ExamenesFretaCFGM.M2;

import java.util.ArrayList;

import ExamenesFretaCFGM.PlantillaExamen;
import ExamenesFretaCFGM.Pregunta;

public class M2UF2 extends PlantillaExamen{
	
	
	protected void RellenarPreguntas(ArrayList<Pregunta> preguntas) {
		
		String pregunta = "Cual es la comanda de CMD que se utliza para copiar archivos de un lado a otro:";	
		String [] opciones1 = {"COPY", "cp", "COPY-ITEM", "Ctrl + C"};
		String respuesta = "COPY";
		
		preguntas.add(new Pregunta(pregunta, opciones1, respuesta));
		
		pregunta = "Cual es la comanda de PowerShell que se utliza para copiar archivos de un lado a otro:";	
		String [] opciones2 = {"COPY", "cp", "COPY-ITEM", "Ctrl + C"};
		respuesta = "COPY-ITEM";
		
		preguntas.add(new Pregunta(pregunta, opciones2, respuesta));
		
		pregunta = "Cual es la comanda de PowerShell que se utliza para mover archivos de un lado a otro:";	
		String [] opciones3 = {"MOVE", "mv", "MOVE-ITEM", "cd"};
		respuesta = "MOVE-ITEM";
		
		preguntas.add(new Pregunta(pregunta, opciones3, respuesta));
		
		pregunta = "Cual es la comanda de CMD que se utliza para mover archivos de un lado a otro:";	
		String [] opciones4 = {"MOVE", "mv", "MOVE-ITEM", "cd"};
		respuesta = "MOVE";
		
		preguntas.add(new Pregunta(pregunta, opciones4, respuesta));
		
		pregunta = "Cual es la diferencia entre un usuario administrador y un usuario estandar?";	
		String [] opciones5 = {"El usuario estandar no puede crear usuarios nuevos", "El usuario administrador tiene mas privilegios que el usuario estandar", "El usuario estandar no puede hacer una comparticion de recursos", "ninguna es correcta"};
		respuesta = opciones5[1];
		
		preguntas.add(new Pregunta(pregunta, opciones5, respuesta));
		
		pregunta = "Los recursos compartidos por donde son accessibles";	
		String [] opciones6 = {"Es accessible si estas en la misma red que el dispositivo lo comparte", "Es accessible desde internet", "Es accessible desde el mismo dispositivo que lo esta compartiendo y solo en ese dispositivo", "ninguna es correcta"};
		respuesta = opciones6[0];
		
		preguntas.add(new Pregunta(pregunta, opciones6, respuesta));
		
		pregunta = "Como se comparte un recurso compartido?";	
		String [] opciones7 = {"Se tiene de ir al apartado de Administrar equipos y luego en recursos compartidos puedes crear uno nuevo", "Se tiene de hacer la comanda SHARE-RESOURCE del Powershell", "Se tiene de hacer la comanda share del CMD con opcion de -rscPath indicando la ruta", "ninguna es correcta"};
		respuesta = opciones7[0];
		
		preguntas.add(new Pregunta(pregunta, opciones7, respuesta));
		
		pregunta = "Con cual comanda de CMD podemos crear un usuario";	
		String [] opciones8 = {"useradd", "adduser", "net user", "user net"};
		respuesta = opciones8[2];
		
		preguntas.add(new Pregunta(pregunta, opciones8, respuesta));
		
		pregunta = "Con cual comanda de CMD podemos crear un usuario con nombre Ramon y contraseña 1234";	
		String [] opciones9 = {"useradd -n Ramon -pswd 1234", "adduser -n Ramon -pswd 1234", "net user Ramon 1234 /add", "user net Ramon 1234 /add"};
		respuesta = opciones9[2];
		
		preguntas.add(new Pregunta(pregunta, opciones9, respuesta));
		
		pregunta = "Que es un recurso compartido?";	
		String [] opciones10 = {"Es la comparticion de carpeta o dispositivo (escaner, impresora) la cual se puede acceder en esa red", "Es la comparticion de datos como ficheros a traves de la nube", "Es cuando le pasas por USB los datos a un compañero de la empresa", "Ninguna respuesta es correcta"};
		respuesta = opciones10[0];
		
		preguntas.add(new Pregunta(pregunta, opciones10, respuesta));
		
		pregunta = "Si queremos listar en el powershell todos los archivos txt ordenados por tamaño en orden creciente, ¿qué instrucción utilizas?";	
		String [] opciones11 = {"Get-ChildItem 'ruta\\*.txt' | Sort-Object Name, Length", "ls -l ruta/*.txt -S -r", "dir /O:S /S 'ruta\\*.txt\'", "Ninguna respuesta es correcta"};
		respuesta = opciones11[0];
		
		preguntas.add(new Pregunta(pregunta, opciones11, respuesta));
		
		pregunta = "Si queremos listar en el CMD todos los archivos txt ordenados por tamaño en orden creciente, ¿qué instrucción utilizas?";	
		String [] opciones12 = {"Get-ChildItem 'ruta\\*.txt' | Sort-Object Name, Length", "ls -l ruta/*.txt -S -r", "dir /O:S /S 'ruta\\*.txt\'", "Ninguna respuesta es correcta"};
		respuesta = opciones12[2];
		
		preguntas.add(new Pregunta(pregunta, opciones12, respuesta));
		
		pregunta = "Cual es la comanda de CMD que se utliza para listar los archivos?";	
		String [] opciones13 = {"ls", "dir", "GET-CHILDITEM", "ll"};
		respuesta = "dir";
		
		preguntas.add(new Pregunta(pregunta, opciones13, respuesta));
		
		pregunta = "Cual es la comanda de Powershell que se utliza para listar los archivos?";	
		String [] opciones14 = {"ls", "dir", "GET-CHILDITEM", "ll"};
		respuesta = "GET-CHILDITEM";
		
		preguntas.add(new Pregunta(pregunta, opciones14, respuesta));
		
		pregunta = "Qué funciones puedes realizar desde el administrador de tareas?";	
		String [] opciones15 = {"Monitorage de diferentes componentes, cambiar aplicaciones que se inician y ver los procesos que hay podiendo detenerlos", "Abrir una macro para que  se hagan diferentes tareas que ya estaban programadas para haccerse", "Hacer tareas obiamente", "ninguna de las respuestas es correcta"};
		respuesta = opciones15[0];
		
		preguntas.add(new Pregunta(pregunta, opciones15, respuesta));
		
		pregunta = "Explica que es Cortana, Windows Hello y Microsoft Ink?";	
		String [] opciones16 = {"Son assistentes de windows que te ayudan a buscar cosas por ejemplo", "Nos sirve para automatizar processos del Windows", "Ninguna de las respuestas es correcta"};
		respuesta = opciones16[0];
		
		preguntas.add(new Pregunta(pregunta, opciones16, respuesta));
		
		pregunta = "Qué es una imagen de sistema? Qué utilidad tiene?";	
		String [] opciones17 = {"Una imagen del sistema es una copia de seguridad la cual luego puedes volcar al ordenador para tener lo que tenias en ese momento", "Es un archivo de mapa de bits que normalmente su extension es png o jpg", "Es una copia que cuando quieres puedes volver a recuperar los archivos pero no los programas", "ninguna de las respuestas es correcta"};
		respuesta = opciones17[0];
		
		preguntas.add(new Pregunta(pregunta, opciones17, respuesta));
		
		pregunta = "Cual es la orden o comanda que se usa para detener un processo en el CMD?";	
		String [] opciones18 = {"taskkill /F /PID 'Id del processo'", "STOP-PROCESS -Forced -ProcessID 'id del proceso'", "KILL-PROCESS -Forced -ProcessID 'id del proceso'", "ninguna de las respuestas es correcta"};
		respuesta = opciones18[0];
		
		preguntas.add(new Pregunta(pregunta, opciones18, respuesta));
		
		pregunta = "Como podemos seleccionar todos los archivos en entorno de comandas?";	
		String [] opciones19 = {"Con '*'", "Con '?'", "Con 'ALL'", "Sin definir un nombre"};
		respuesta = opciones19[0];
		
		preguntas.add(new Pregunta(pregunta, opciones19, respuesta));
		
		pregunta = "Como podemos seleccionar todos los archivos que se llamen Ramon.txt y que antes de el punto tenga un caracter al azar en entorno de comandas?";	
		String [] opciones20 = {"Con 'Ramon*.txt'", "Con 'Ramon?.txt'", "Con 'Ramon_.txt'", "Con 'Ramon-.txt'"};
		respuesta = opciones20[1];
		
		preguntas.add(new Pregunta(pregunta, opciones20, respuesta));
		
		pregunta = "Como podemos seleccionar todos los archivos que se llamen Ramon.txt y que antes de el punto tenga un numero de caracteres indefinidos y al azar en entorno de comandas?";	
		String [] opciones21 = {"Con 'Ramon*.txt'", "Con 'Ramon?.txt'", "Con 'Ramon_.txt'", "Con 'Ramon-.txt'"};
		respuesta = opciones21[0];
		
		preguntas.add(new Pregunta(pregunta, opciones21, respuesta));
		
		pregunta = "Que es el historial de Ficheros?";	
		String [] opciones22 = {"Es un registro que nos permite saber que ficheros se han abierto", "Es un registro que nos permite ver todos los ficheros que ha tenido windows", "Es un registro que nos permite cambiar a una version pasada del fichero indicado", "Ninguna respuesta es correcta"};
		respuesta = opciones22[0];
		
		preguntas.add(new Pregunta(pregunta, opciones22, respuesta));
		
		pregunta = "Con que comando del CMD puedes ocultar un archivo llamado documento1.txt";	
		String [] opciones23 = {"Attrib documento1.txt +H", "Attrib documento1.txt -Hide", "Hide documento1.txt", "Ninguna respuesta es correcta"};
		respuesta = opciones23[0];
		
		preguntas.add(new Pregunta(pregunta, opciones23, respuesta));
		
		pregunta = "Cual es el atributo con letra S";	
		String [] opciones24 = {"Es el atributo de Archivo del sistema", "Es el atributo de Archivo Oculto", "Es el atributo de Archivo para leerlo", "Ninguna respuesta es correcta"};
		respuesta = opciones24[0];
		
		preguntas.add(new Pregunta(pregunta, opciones24, respuesta));
		
		pregunta = "Cual es el atributo con letra R";	
		String [] opciones25 = {"Es el atributo de Archivo del sistema", "Es el atributo de Archivo Oculto", "Es el atributo de Archivo para leerlo", "Ninguna respuesta es correcta"};
		respuesta = opciones25[2];
		
		preguntas.add(new Pregunta(pregunta, opciones25, respuesta));
		
		pregunta = "Cual es el atributo con letra H";	
		String [] opciones26 = {"Es el atributo de Archivo del sistema", "Es el atributo de Archivo Oculto", "Es el atributo de Archivo para leerlo", "Ninguna respuesta es correcta"};
		respuesta = opciones26[1];
		
		preguntas.add(new Pregunta(pregunta, opciones26, respuesta));
		
		pregunta = "Dime cual es la funcionalidad del historial de ficheros";	
		String [] opciones27 = {"El historial de archivos permite acceder rápidamente a los archivos utilizados recientemente", "Permite encontrar rápidamente los documentos en los que estabas trabajando sin recordar su ubicación exacta.", "Algunos sistemas operativos guardan versiones anteriores de los archivos para recuperar cambios no deseados o volver a una versión anterior.", "Todas las respuesta són correctas"};
		respuesta = opciones27[3];
		
		preguntas.add(new Pregunta(pregunta, opciones27, respuesta));
		
	}

}
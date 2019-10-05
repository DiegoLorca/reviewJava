package curso;

import java.util.ArrayList;
import java.util.Hashtable; //Las importaciones siempre son por debajo del package

public class Curso {

    
    public static void main(String[] args) {
        // COMENTARIOS de una linea
        /*
         Comentarios de varias lineas
         */
        /*
        Crear una VARIABLES en Java:
        tipo de dato con minuscula - nombre variable con mayuscula, minusculo o mezclado - ;
        */
        int uno; //o
        int dos, tres;
        //Se asigna valor poniendo la variable y asignandole un valor
        uno = 45;
        dos = 55;
        tres = 65;
        //o tambien puede ser creada la variable y asignado enseguida el valor
        int cuatro = 75;
        int cinco = 85;
        int seis = 95;
        //Para imprimir un valor en consola se escribe lo siguiente:
        //System.out.println(dos);
        //Tambien se puede cambiar el valor de una variable
        uno = 50;
        //System.out.println(uno);
        
        /*                                                  Númericos enteros  ------------->       byte, short, int, long
                                Primitivos                  Númericos en punto flotante  --->       float, double
                                                            Booleanos          ------------->       boolean
                                                            Caracteres         ------------->       char
                                                            
                                                            Cadenas de caracteres        --->       String
        TIPOS DE DATOS Java     Estructurados (Clases)      Vectores (arrays)            --->       Array
                                                            Clases de la biblioteca estándar Java
                                                            Clases de terceros
                                                            Clases propias
        
                                Envoltorio (wrapper)        Tipos primitivos "envueltos" en una clase -> Objetos
        */
        //Primitivos
        float decimal = 100.555555f; // los numeros decimales de float estan limitados, luego se hace una aproximacion con el ultimo numero
        double decimalLargo = 100.555555d; //Estos decimales van varios los decimales
        char hola = 4;
        boolean verdad = true;
        //System.out.println(decimalLargo);
        //Estructurados
        String chao = "holachao";
        //System.out.println(chao);
        //Casting
        double a = 445.999999d;
        int b = (int)a;
        //System.out.println(b);
        //Conversion de datos
        String numero = "95";
        //Tipo de dato del destino - Variable = conversion ;
        int numero1 = Integer.parseInt(numero); //Transforma de string a entero
        /*
        double dos = Double.parseDouble(); //Transforma de entero a double
        String dos = Integer.toString(); //Transforma de un entero a un string
        String dos = Character.toString(); //Transforma de un char a un string
        double dos = Double.parseDouble(); //Transformar de String a double
        String dos = String.valueOf(); //Transforma de double a un string
        float dos = Float.parseFloat(); //Transforma de un String a un float
        String dos = Float.toString(); //Transforma de float a un String
        boolean dos = Boolean.parseBoolean(); //Transforma de un String a un boolean
        String dos = Boolean.toString(); //Transforma de un boolean a un String
        */
        int numero2 = 5;
        int suma = numero1 + numero2;       
        //System.out.println(suma);
        //OPERADORES ARITMETICOS
        int numero3 = 10;
        int numero4 = 10;
        //System.out.println(numero3 + numero4); // + (suma) - (resta) * (multiplicacion) / (division) % (modulo, el resto de una division)
        //Potenciacion
        double potencia = Math.pow(2, 5); //dos elevado a 5
        //System.out.println(potencia);
        //Precedencia potenciacion - multiplicacion - division - suma - resta 
        int once = 11;
        int ocho = 8;
        int diez = 10;
        int doce = 12;
        //System.out.println(((once + ocho) * diez) / doce); //Se toma en cuenta siempre los parentesis
        //OPERADORES DE ASIGNACION = += -= *= /= %=
        int quince = 15;
        //quince = quince + quince;
        //quince += quince; //Es una forma mas sistematizada para realizar la operacion de arriba
        quince %= 4;
        //System.out.println(quince);
        //OPERADORES RELACIONALES == != < > <= >=
        int trece = 13;
        int catorce = 14;
        //System.out.println(trece <=  catorce); //== compara los datos, != busca diferencia, < menor que, > mayor que
        //OPERADORES LOGICOS && , || , ^, !()
        //// AND && Y ... se cumple ambas sentencias
        //// OR || O ... cualquiera de las sentencias tiene que cumplirse
        //// XOR ^ O ... Similar a OR pero exclusivo, solo tiene que cumplirse una sentencia, si se cumple ambas sentencias dara falso
        //// DIFERENT !() Diferente ... ambas variables tienen que ser diferentes
        int num1 = 10;
        int num2 = 20;
        int num3 = 10;
        //System.out.println(num1 == num2 || num1 && num3);
        //System.out.println(num1 == num2 || num1 == num3);
        //System.out.println(num1 == num2 || num1 ^ num3);
        //System.out.println(!(uno > dos)); //Ocupa cualquier operador relacional
        //OPERADORES INCREMENTALES Y DECREMENTALES ++, --
        int primera = 10;
        primera ++; // puede ser post fija primera ++; o pre fija ++ primera;
        //System.out.println(primera);
        // OPERADOR DE CONCATENACIÓN +
        String nom = "Diego";
        int ed = 28;
        //System.out.println(nom + " tiene " + ed + " años.");
        // OTROS OPERADORES instanceof, <<, >>, >>>, &, ~ 
        //instanceof = nos permite ver si un objeto pertence a una instancia y a cual pertenece
        // ESTRUCTURAS DE CONTROL CONDICIONAL If, If - else, If - else if - else,  Switch, Try Catch
        //IF, ELSE, ELSE IF si cumple un con el requisito
        int  cien = 100;
        if(cien == 99){
            //System.out.println("Es correcto"); //IF
        }
        if(cien == 100){
            //System.out.println("Es correcto");
        } else {
            //System.out.println("No es correcto"); //IF ELSE
        }
        if(cien == 5){
            //System.out.println("El valor es: " + cien);
        } else if(cien == 55){
            //System.out.println("El valor es: " + cien); // ELSE IF
        } else if (cien == 100){
            //System.out.println("El valor es: " + cien);
        } else {
            //System.out.println("No es ningun valor");
        }
        //SWITCH con alternativas
        int dieciseis = 16;
        switch(dieciseis){
            //case 12: System.out.println("Es doce");break;
            //case 13: System.out.println("Es trece");break;
            //case 14: System.out.println("Es catorce");break; //SWITCH
            //case 15: System.out.println("Es quince");break;
            //case 16: System.out.println("Es dieciseis");break;
            //default: System.out.println("No es ningun numero");break;
        }
        //TRY CATCH evaluacion de errores
        try{
            int n1 = 4 / 0;
        } catch(Exception e){ //Imprime error que hay, pero el programa sigue en su curso
            //System.out.println(e);
        }
        // ESTRUCTURAS DE CONTROL ITERATIVA While, Do - while, For, Foreach, Break, Continue - bucles que se repiten una y otra vez hasta que se diga lo contrario
        //WHILE
        int n1 = 10; //tiene que haber una variable para que se pueda ejecutar el ciclo while
        while(n1 >= 1){
            //System.out.println(n1); //Imprimira el numero hasta que se cumpla la condicion
            n1 --; //Reducira por cada vuelta una unidad de la variable
        }
        int n2 = 10;
        do{
            //System.out.println(n2); // Si quiero que por lo menos se ejecute y luego invertirlo se ocupa DO WHILE
            n2++;
        }while(n2 < 10);
        //FOR
        for(int i = 1; i < 10; i++){ // Dentro de la estructura for se puede crear una variable
            //System.out.println(i); 
        }
        //FOREACH
        // Otra forma de ocupar FOR es en conjunto con String  y el Array (arreglo)
        String[]semana = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado",  "Domingo" };
        for( String i: semana ){
            //System.out.println(i);
        }
        // BREAK Y CONTINUE - Se puede ocupar con while y for
        for(int i = 1; i <= 10; i++){
            if(i == 5){ // Produce un "descanso", es decir, que detiene la accion
                break;
            }
            //System.out.println(i);
        }
        for(int i = 1; i <= 10; i++){
            if(i >= 5 && i <= 7){ // Hace un salto en el ciclo que se esta realizando
                continue;
            }
            //System.out.println(i);
        }
        // ARREGLOS O ARRAYS Unidimensional, Hashtable, Bidimensional y Multidimensional - Uso de una serie de datos
        // ARRAY
        String[]dia = new String[7]; //Se crea el valor con la cantidad de elementos
        dia[0] = "Lunes";
        dia[1] = "Martes";
        dia[2] = "Miercoles";
        dia[3] = "Jueves";
        dia[4] = "Viernes";
        dia[5] = "Sabado";
        dia[6] = "Domingo";
        //System.out.println(dia[4]); // Primera forma especificando el elemento, se tiene que cumplir con la cantidad de elementos
        // ARRAY UNIDIMENSIONAL
        String[]dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
        //System.out.println(dia[0]); // Segunda forma, funciona tambien con FOREACH
        // HASHTABLE - Se maneja texto, numero y todos los datos, ademas se IMPORTA una libreria Java 
        Hashtable< Integer, String > semana1 = new Hashtable<Integer, String>(); //pueden ocuparse cualquier tipo de dato
        semana1.put(30, "Lunes");
        semana1.put(1, "Martes");
        semana1.put(2, "Miercoles");//Este es un hash asociativo
        semana1.put(3, "Jueves");
        semana1.put(4, "Viernes");
        semana1.put(5, "Sabado");
        semana1.put(6, "Domingo");
        //System.out.println(semana1.get(5));
        //ARRAY BIDIMENSIONAL
        int[][] DOS = new int[4][3]; // Se coloca la cantidad de dimensiones - se coloca un arreglo dentro de un arreglo - se coloca el nivel de profundidad basa en fila y columna
        DOS[0][0]= 10;    DOS[0][1]= 20;    DOS[0][2]= 30;
        DOS[1][0]= 10;    DOS[1][1]= 20;    DOS[1][2]= 30;
        DOS[2][0]= 10;    DOS[2][1]= 20;    DOS[2][2]= 30;
        DOS[3][0]= 10;    DOS[3][1]= 20;    DOS[3][2]= 30;
        //System.out.println(DOS[0][0]); //Se imprime la fila 0, columna 0
        //System.out.println(DOS[0][0] + DOS[0][2]); // Se imprime y suma los valores correspondientes + - * /
        // Tambien se puede hacer un Array Bidimensional de la siguiente manera sistematizada:
        int [][] doS = { // Es por esto que es un array dentro de un array - Este array tiene doble nivel de profundidad
            {10, 20, 30},
            {10, 20, 30},
            {10, 20, 30},
            {10, 20, 30}
        };
        //System.out.println(doS[0][0]);
        // ARRAY MULTIDIMENSIONAL
        int [][][] TRES = { // Este array tiene tres profundidades anidados de 3 raices - primera profundidad
            {   // segunda profundidad
                {10, 20, 30}, //tercera profundidad
                {10, 20, 30},
                {10, 20, 30},// Raiz uno
                {10, 20, 30}                  
            },
                        {   
                {10, 20, 30},
                {10, 20, 30}, // Raiz dos
                {10, 20, 30},
                {10, 20, 30}                  
            },
            {   
                {10, 20, 30},
                {10, 20, 30}, // Raiz tres
                {10, 20, 30},
                {10, 20, 30}                  
            }
        };
        //System.out.println(TRES[0][0][0]);
        // ARRAYLIST es una clase que nos permite almacenar datos en memoria similar a los Arrays, con la ventaja que el numero de elementos suele ser de forma dinamica y no declararlo como en los Arrays
        ArrayList<String> Dias = new ArrayList<String>(); // Se tiene que importar su libreria
        Dias.add("Lunes"); // Se puede agregar un dato ADD
        Dias.add("Martes");
        Dias.add("Miercoles");
        Dias.add("Jueves");
        Dias.add("Viernes");
        Dias.add("Miercoles");
        //Dias.add(3,"Martes"); // se puede colocar su indice siempre y cuando la cantidad de elementos no influya
        //System.out.println(Dias.get(3));// Se ocupa GET para buscar un elemento
        //System.out.println(Dias.size()); // Para confirmar la cantidad de elementos se ocupa SIZE
        //System.out.println(Dias.contains("Viernes")); // Comprobar si esta el elemento que esta buscando en la lista CONTAINS, responde con True o False
        //System.out.println(Dias.indexOf("Miercoles")); //Busca la posicion en la que se encuentra el elemento, contabiliza desde el primer elemento, de arriba hacia abajo
        //System.out.println(Dias.lastIndexOf("Miercoles")); // Contabiliza desde el ultimo elemento hacia el primero, abajo hacia arriba
        //Dias.remove(5);// Eliminar un elemento
        //System.out.println(Dias.get(4)); // todos los elementos se reacomodaran y ocuparan su lugar de indice del que continua
        //Dias.clear();// Eliminar todo el ArrayList
        //System.out.println(Dias.get(4)); // Arrojara error porque no existe ningun valor
        //System.out.println(Dias.isEmpty()); // Ver si una lista esta vacia - False cuando esta con contenido, True cuando esta vacio
        //ArrayList<String> Semana = new ArrayList<String>(Dias);// Copiar ArrayList a otro ArrayList diferente
        //System.out.println(Semana);
        String[] Semana = new String[Dias.size()];//Para convertir el ArrayList a un Array o un String
        Dias.toArray(Semana); //Pasa ArrayList al Array
        System.out.println(Semana[0]);
        // CLASES Funcionamiento, Los modificadores, Creación de nuevas clases, Propiedades, Métodos, Constructor 
  
        // OBJETOS Instanciación, Evocar un objeto, Herencia, Polimorfismo, Final y Static
    }
    
}

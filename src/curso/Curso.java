package curso;

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
        // ESTRUCTURAS DE CONTROL CONDICIONAL If, If-else, If-elseif-else,  Switch, Try Catch

        // ESTRUCTURAS DE CONTROL ITERATIVA While, Do - while, For, Foreach, Break, Continue 

        // ARREGLOS O ARRAYS Unidimensional, Hashtable, Bidimensional y Multidimensional
 
        // ARRAYLIST
 
        // CLASES Funcionamiento, Los modificadores, Creación de nuevas clases, Propiedades, Métodos, Constructor 
  
        // OBJETOS Instanciación, Evocar un objeto, Herencia, Polimorfismo, Final y Static
    }
    
}

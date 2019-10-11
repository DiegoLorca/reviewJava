package curso;
                //publico, estatico, protegido y privado
// MODIFICADORES (public, static, protected, private) o niveles de accesos
//public abstract class Primera { // Todo lo que haga en esta clase, se puede recuperar en la clase principal (Curso.java)
public  class Primera {
    String nombre; // Por defecto son datos PUBLIC, pero se pueden modificar a los diferentes modificadores
    // Esta variable se puede acceder desde otros lugares    
    //Para CREAR NUEVAS CLASES
    //public class miClase {
    //}   
    // PROPIEDADES (variables)
    int edad = 28; // Cuando necesite un valor absoluto, se le agrega de esta forma
    double tamaño; // Cuanto utilizamos las clases y las convertimos en objetos ahi vamos llenando los datos   
    // METODOS (funciones)
    public void caminar(){ // VOID no devuelve un dato concreto, es decir este metodo devolvera las acciones que vaya a necesitar, Se puede ocupar las variables creadas dentro de la clase o en el metodo. Metodos sin parametros
    // Cuando coloco VOID no devuelve NINGUN dato y da Error
    }
    public void hablar(double volumen, String palabras, int numero, boolean pregunta){ //  Pero tambien se pueden solicitar parametros desde la consola o interfaz dentro de los parentesis ()... Metodos con parametros
        //System.out.println(volumen + numero + palabras + pregunta);
    }   
    // CONSTRUCTOR (inicializador)
    //public Primera(String a, int b, double c){ // El conductor tiene que tener el mismo nombre su clase.. Los datos que estan dentro del parentesis si o si tiene que estar pasados desde afuera
        //nom = a; // Arrojara error hasta que no se cree o llame a una variable con este nombre o un parametro
        //ed = b;
        //peso = c; // Este dato tiene que ser tomado desde afuera
    //    tamaño = 86.5d;
    //}
    // Estos datos del Constructor son invocados desde la Clase principal, se colocan los datos NO ASIGNADOS y en la Clase principal se asignan sus valores.
    //public Primera(double uno, String dos){ 
    //    tamaño = uno;
    //    nombre = dos;
    //}
    public void metodo(){
        // Los datos de CONSTRUCTOR pueden ser facilmente ultilizados dentro del metodo
        System.out.println(tamaño);
    }
    // Objetos con Metodos String
    public String saludar(String a, String b){
        return a + b;
    }
    // Objetos con Metodos void
    public void despedir(String a, String b){
        System.out.println(a + b);
    }
    
    // HERENCIAS
    //*** NO SE PUEDE HEREDAR DE VARIAS CLASES, ES SOLO DE UNA CLASE A OTRA ***
    String nom = "Diego";
    String ape = "Lorca";
    
    //POLIMORFISMO
    // Nos permite ocupar las mismas caracteristicas, en diferentes circunstancias pero con diferente nombre
    // Cuando se crea un Metodo con ABSTRACT se debe indicar que la Clase en la que esta (Primera) tambien sea abstract
    //public abstract void accion(); // Crear un metodo que no devuelva nada, es un metodo no inicializado, puesto que no tiene sus llaves
    
    static int trescientos = 300; // Con STATIC no es necesario instanciar un objeto ni nada por el estilo, se puede acceder desde cualquier lado
}

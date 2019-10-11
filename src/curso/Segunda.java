package curso;
// Click derecho en el paquete curso --> New --> Java Class
public class Segunda extends Primera { // Para solicitar una extencion de una clase se debe colocar extends y ademas, no debe haber ningun constructor entremedio
    String nombreCompleto = nom + " Sebastián " + ape + " Chacón";
    
    public void accion(){ // Se debe inicializar el metodo {} y luego con el POLIMORFISMO podras trabajar con los datos facilitados
        System.out.println("Esta es la SEGUNDA CLASE");
    }
}

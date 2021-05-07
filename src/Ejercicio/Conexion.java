
package Ejercicio;

public class Conexion {
    //Declaración
    private static Conexion instancia;
    //private static Conexion instancia=new Conexion();
    
    //Para evitar instancia mediante operador "new"
    private Conexion(){
        
        
    }
    
    //para obtener la instancia unicamente por este metodo
    //Notese la palabra reservada "static" hace posible el acceso mediante Clase.metodo
    public static Conexion getInstancia(){
        if(instancia==null){
            instancia=new Conexion();
        }
    return instancia;
}
    
    //Metodo de prueba
    public void conectar(){
        System.out.println("Me conecte a la Base de Datos");
    }
    
    //Metodo de prueba
    public void desconectar(){
        System.out.println("Me desconecte de la Base de Datos");
    }
}

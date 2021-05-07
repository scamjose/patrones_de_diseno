
package Ejercicio;

public class App {
    public static void main(String[] args) {
        //Instanciación por constructor prohibido por ser "private"
        //Conexion c=new Conexion();
        Conexion c=Conexion.getInstancia();
        c.conectar();
        c.desconectar();
        
        boolean res=c instanceof Conexion;
        System.out.println(res);
    }
}

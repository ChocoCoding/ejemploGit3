/**
 * @Author: Gonzalo Campos Dominguez
 * @Date: ${DATE}
 */
public class Main {

    public static void main(String[] args) {

        Empleado p = new Empleado("Pepe Pérez", 30);
        System.out.println(p);

        p.nombre = "Otro nombre";
        System.out.println(p);

    }

}
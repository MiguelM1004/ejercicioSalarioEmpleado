
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        * una empresa desea registrar la información de cada empleado
        * Para ello un empleado debe ingresar con su usuario y contraseña
        * Una vez ingresado el empleado debe registrar la siguiente información
        * 1 - Nombre completo
        * 2 - Documento de identidad
        * 3 - Valor de la hora
        * 4 - Cantidad de horas
        * 5 - Seleccionar un día de descanso a la semana (L-V)
        * El sistema le debe mostrar al empleado:
        * Salario Neto, salario bruto, deducción por pensión, deducción por salud, auxilio de transporte (si aplica) y bonificación del 10%
        * Si no supera 2 SMMLV (sin incluir auxiñio de transporte)
        * Toda la información del empleado se debe de mostrar en un mensaje descriptivo
        * */

        /*Definición y asiganación de variables*/
        Scanner sc = new Scanner (System.in);
        String nombreEmpleado = "";
        String documentoIdentidad = "";
        String diaDescanso = "";
        String usuarioEmpleado = "";
        String contrasenaUsuario = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double retencioSalud = 0;
        double retencionPension = 0;
        double valorHora = 0;
        double cantidadHoras = 0;
        double bonificacionEmpleado = 0;
        int auxilioTransporte = 200000;

        System.out.println("Ingrese su usuario: ");
        usuarioEmpleado = sc.nextLine();
        System.out.println("Ingrese su contraseña: ");
        contrasenaUsuario = sc.nextLine();
        if (usuarioEmpleado.equals("admin") && contrasenaUsuario.equals("admin")){
            System.out.println("Bienvenido al sistema");
        } else {
            System.out.println("Error de credenciales ");
        }




        }

}
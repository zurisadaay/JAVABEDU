import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Paciente paciente1 = new Paciente();

        System.out.print("Ingresa el nombre del paciente:");
        paciente1.nombre = entrada.nextLine();

        System.out.print("Ingresa la edad del paciente:");
        paciente1.edad = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Ingresa el número de expediente:");
        paciente1.noexp = entrada.nextLine();

        System.out.println();

        entrada.close();


        paciente1.mostrarInformacion();




    }
}





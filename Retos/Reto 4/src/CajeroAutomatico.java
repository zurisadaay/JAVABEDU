import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var saldo = 1000.0;
        int opcion;

        do {
            System.out.println("\n💸 Bienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("🟢 Tu saldo actual es: $%.2f%n", saldo);
                    break;

                case 2:
                    System.out.print("💵 Ingresa el monto a depositar: ");
                    double deposito = scanner.nextDouble();

                    if (deposito <= 0) {
                        System.out.println("❌ El monto debe ser mayor a 0.");
                        continue;
                    }

                    saldo += deposito;
                    System.out.printf("✅ Depósito exitoso. Saldo actual: $%.2f%n", saldo);
                    break;

                case 3:
                    System.out.print("🏧 Ingresa el monto a retirar: ");
                    double retiro = scanner.nextDouble();

                    if (retiro <= 0) {
                        System.out.println("❌ El monto debe ser mayor a 0.");
                        continue;
                    }

                    if (retiro > saldo) {
                        System.out.printf("❌ Saldo insuficiente. Tu saldo es: $%.2f%n", saldo);
                        continue;
                    }

                    saldo -= retiro;
                    System.out.printf("✅ Retiro exitoso. Saldo restante: $%.2f%n", saldo);
                    break;

                case 4:
                    System.out.println("👋 Gracias por usar el cajero. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("❌ Opción inválida. Intenta nuevamente.");
                    continue;
            }

        } while (opcion != 4);

        scanner.close();
    }
}

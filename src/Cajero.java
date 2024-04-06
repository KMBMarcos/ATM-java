import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String clientName = "Tony Stark";
        String accountType = "Corriente";
        double balanceCustomer = 20000.54;
        int options = 0;

        System.out.println("-------------------------------- \n");
        System.out.println("Nombre del cliente: " + clientName);
        System.out.println("Tipo de cuenta: " + accountType);
        System.out.println("Saldo de cuenta: " + balanceCustomer + " $" + "\n");
        System.out.println("-------------------------------- \n");

        while (options != 9) {
            System.out.println("-- Escriba la opcion del menu --");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Retirar");
            System.out.println("3 - Deposito");
            System.out.println("9 - Salir \n");
            options = teclado.nextInt();

            if (options == 1) {
                System.out.println("Saldo actual: " + balanceCustomer + " $");
            } else if (options == 2) {

                System.out.println("Cual es el monto a depositar?");
                double amountToWithdraw = teclado.nextDouble();

                if (amountToWithdraw < balanceCustomer) {
                    balanceCustomer -= amountToWithdraw;
                    System.out.println("El saldo actualizado es: " + balanceCustomer + " $");
                } else {
                    System.out.println("Saldo insuficiente");
                }

            } else if (options == 3) {

                System.out.println("Cual es el monto a depositar?");
                double amountToDeposit = teclado.nextDouble();

                balanceCustomer += amountToDeposit;
                System.out.println("El saldo actualizado es: " + balanceCustomer + " $");
            } else if (options == 9) {
                System.out.println("Finalizando el programa. Hasta luego!");
                break;
            }
        }
    }
}
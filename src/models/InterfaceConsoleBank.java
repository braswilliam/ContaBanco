package models;

import java.util.Locale;
import java.util.Scanner;

public class InterfaceConsoleBank {
    //for using notation "."
    Locale pointLocale = new Locale("en", "BR");
    Scanner scannerWithPointLocale = new Scanner(System.in).useLocale(pointLocale);


    private final Scanner sc = new Scanner(System.in);


    private int getTheAccountNumber() {
        System.out.print("Informe o numero da conta: ");
        return sc.nextInt();
    }

    private String getTheAgencyNumber() {
        System.out.print("Por favor, digite o número da Agência: ");
        sc.nextLine(); // Consumir a nova linha pendente
        return sc.nextLine();
    }

    private String getName() {
        System.out.print("Informe o seu nome: ");
        return sc.nextLine();
    }

    private double getDepositValue() {
        System.out.print("Informe o valor de depósito: ");
        return scannerWithPointLocale.nextDouble();
    }

    public void showInConsole() {
        int numberAccount = getTheAccountNumber();
        String agency = getTheAgencyNumber();
        String clienteName = getName();
        double balance = getDepositValue();

        ContaTerminal c = new ContaTerminal(numberAccount, agency, clienteName, balance);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", c.getNomeCliente(), c.getAgencia(), c.getNumero(), c.getSaldo());
    }


}

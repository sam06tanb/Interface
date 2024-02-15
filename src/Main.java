import Model.Services.BrazilTaxServices;
import Model.Services.RentalServices;
import modelentities.CarRental;
import modelentities.carmodel;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Rent info");
        System.out.print("Car model: ");
        String carmodel = sc.nextLine();
        System.out.println("Retreat (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.println("return (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new carmodel(carmodel));

        System.out.print("Enter with the price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter with the price per day:");
        double pricePerDay = sc.nextDouble();

        RentalServices rentalServices = new RentalServices(pricePerHour, pricePerDay, new BrazilTaxServices());

        rentalServices.processInvoice(cr);

        System.out.println("INVOICE: ");
        System.out.println("Basic payment: " + cr.getInvoice().getBasicPayment());
        System.out.println("Tax: " + cr.getInvoice().getTax());
        System.out.println("Total payment: " + cr.getInvoice().getTotalPayment());


        sc.close();
    }
}
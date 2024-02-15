package modelentities;

import java.time.LocalDateTime;

public class CarRental {

   private LocalDateTime start;
    private LocalDateTime finish;

    private carmodel car;
    private Invoice invoice;

    public CarRental() {
    }

    public CarRental(LocalDateTime start, LocalDateTime finish, carmodel car ) {
        this.start = start;
        this.finish = finish;
        this.car = car;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public carmodel getCar() {
        return car;
    }

    public void setCar(carmodel car) {
        this.car = car;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}

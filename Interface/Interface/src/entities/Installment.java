package entities;
import java.util.Date;

public class Installment {
    private Date dueDate;
    private Double amount;

    public Installment(Double amount, Date dueDate) {
        this.amount = amount;
        this.dueDate = dueDate;
    }

    public Installment(){
        super();
    }

    public Double getAmount() {
        return amount;
    }

    public Installment setAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Installment setDueDate(Date dueDate) {
        this.dueDate = dueDate;
        return this;
    }
}

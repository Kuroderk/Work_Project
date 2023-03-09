package data.user_info.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "receipts")
public class Receipt {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(name = "Invoice_No", nullable = false)
    private int invoice_no;
    @Column(name = "Amount")
    private int amount;
    @Column(name = "PaidStatus")
    private boolean paid;

}

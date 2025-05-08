package github.com.simaomenezes.appbank.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter @Setter
@Table(name = "cards")
public class Cards {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cards_seq_gen")
    @SequenceGenerator(name = "cards_seq_gen", sequenceName = "cards_id_seq")
    @Column(name = "card_id")
    private long cardId;

    @Column(name = "customer_id")
    private long customerId;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "card_type")
    private String cardType;

    @Column(name = "total_limit")
    private int totalLimit;

    @Column(name = "amount_used")
    private int amountUsed;

    @Column(name = "available_amount")
    private int availableAmount;

    @Column(name = "create_dt")
    private Date createDt;
}

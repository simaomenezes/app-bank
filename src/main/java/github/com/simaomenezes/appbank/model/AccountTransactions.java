package github.com.simaomenezes.appbank.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "account_transactions")
public class AccountTransactions {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_transactions_seq_gen")
    @SequenceGenerator(name = "account_transactions_seq_gen", sequenceName = "account_transactions_id_seq")
    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name="account_number")
    private long accountNumber;

    @Column(name = "customer_id")
    private long customerId;

    @Column(name="transaction_dt")
    private Date transactionDt;

    @Column(name = "transaction_summary")
    private String transactionSummary;

    @Column(name="transaction_type")
    private String transactionType;

    @Column(name = "transaction_amt")
    private int transactionAmt;

    @Column(name = "closing_balance")
    private int closingBalance;

    @Column(name = "create_dt")
    private Date createDt;
}

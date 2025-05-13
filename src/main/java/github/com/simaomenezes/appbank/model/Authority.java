package github.com.simaomenezes.appbank.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "authorities")
@Getter @Setter
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "authorities_seq_gen")
    @SequenceGenerator(name = "authorities_seq_gen", sequenceName = "authorities_id_seq")
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}

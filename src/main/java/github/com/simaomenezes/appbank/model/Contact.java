package github.com.simaomenezes.appbank.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter @Setter
@Table(name = "contact_messages")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contact_messages_seq_gen")
    @SequenceGenerator(name = "contact_messages_seq_gen", sequenceName = "contact_messages_id_seq")
    @Column(name = "contact_id")
    private String contactId;

    @Column(name = "contact_name")
    private String contactName;

    @Column(name = "contact_email")
    private String contactEmail;

    private String subject;

    private String message;

    @Column(name = "create_dt")
    private Date createDt;
}

package me.akrem.email_project.email;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "emails")
@Setter
public class EmailEntity {
    @Id
    private Long id;
    private String subject;
    private String content;
    private String sender;

    @ManyToOne
    @JoinColumn(name = "reply_to_id")
    private EmailEntity replyTo;

    @CreatedDate
    private Date createdAt;

    @ManyToMany
    @JoinTable(name = "email_recepients",
            joinColumns = @JoinColumn(name = "email_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "recepient_id", referencedColumnName = "id"))
    private List<RecepientEntity> recepients;

    @ManyToMany
    @JoinTable(name = "email_attachments",
            joinColumns = @JoinColumn(name = "email_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "attachment_id", referencedColumnName = "id"))
    private List<AttachmentEntity> attachments;
}

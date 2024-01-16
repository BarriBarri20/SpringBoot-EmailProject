package me.akrem.email_project.email;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "attachments")
public class AttachmentEntity {
    @Id
    private Long id;
    private String name;
    private String type;
    private Long size;
}

package me.akrem.email_project.email;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "recepients")
public class RecepientEntity {
    @Id
    private Long id;
    private String email;
    private RecepientType type;

}

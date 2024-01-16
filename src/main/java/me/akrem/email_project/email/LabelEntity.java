package me.akrem.email_project.email;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "labels")
@Data
public class LabelEntity {
    @Id
    private Long id;
    private String name;
    private String color;
}

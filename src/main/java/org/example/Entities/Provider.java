package org.example.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "provider")
public class Provider {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    @Column(name="id")
    private int id;

    @Column
    private String name;

    @Column
    private Date registration_date;

    @Column(name = "client_id")
    private int clientId;
}

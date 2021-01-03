package br.com.alura.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Ordem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal preco;

    private String tipo;

    private LocalDate data;

    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Usuario usuario;
}

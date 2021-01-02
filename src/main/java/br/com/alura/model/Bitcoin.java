package br.com.alura.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Bitcoin {

   private Long id;

   private BigDecimal preco;

   private String tipo;

   private LocalDate data;
}

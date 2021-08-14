package com.atividades.gerenciausuarioempresa.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Movimentacao {

    @Embeddable
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    public class MovimentacaoId implements Serializable{

        private Long idMovimento;
        private Long idUsuario;

    }
    @Id
    @EmbeddedId
    private MovimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodos;
    @ManyToOne
    private Ocorrencia ocorrencia;
    @ManyToOne
    private Calendario calendario;
}

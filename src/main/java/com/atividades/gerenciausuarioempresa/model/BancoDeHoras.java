package com.atividades.gerenciausuarioempresa.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
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
public class BancoDeHoras {

    @EqualsAndHashCode
    @Embeddable
    @Getter
    @Setter
    public class BancoHorasId implements Serializable{

        private Long idBancoHoras;
        private Long idMovimentacao;
        private Long idUsuario;

    }

    @Id
    @EmbeddedId
    private BancoHorasId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;
}

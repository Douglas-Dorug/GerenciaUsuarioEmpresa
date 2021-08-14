package com.atividades.gerenciausuarioempresa.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Calendario {

    @Id
    private Long id;
    @ManyToOne
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
}

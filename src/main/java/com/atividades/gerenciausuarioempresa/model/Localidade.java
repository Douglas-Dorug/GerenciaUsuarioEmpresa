package com.atividades.gerenciausuarioempresa.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Localidade {

    @Id
    private Long id;

    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;

}

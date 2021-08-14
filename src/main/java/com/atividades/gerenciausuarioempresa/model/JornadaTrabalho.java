package com.atividades.gerenciausuarioempresa.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class JornadaTrabalho {
    @Id
    private Long id;
    private String descricao;


}

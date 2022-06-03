package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  @Positive(message = "O Id do aluno precisa ser positivo.")
  private Long alunoId;

  @NotNull(message = "preencha o campo corretamente.")
  @Positive(message = "´${validatedValue´ precisa ser positivo.")
  private double peso;

  @NotNull(message = "preencha o campo corretamente.")
  @Positive(message = "´${validatedValue´ precisa ser positivo.")
  @DecimalMin(value = "150", message = "´${validateValue}´ precisa ser no minimoo {value}")
  private double altura;
}

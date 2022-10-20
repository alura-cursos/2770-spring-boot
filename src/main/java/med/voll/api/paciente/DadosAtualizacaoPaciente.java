package med.voll.api.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}

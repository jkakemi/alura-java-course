package med.voll.api.domain.consulta;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.medico.Especialidade;
import org.aspectj.weaver.ast.Not;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulta(
        Long idMedico,

        @NotNull
        Long idPaciente,

        @NotNull
        // Data tem que ser do futuro, nao pode ser do passado!
        @Future
        LocalDateTime data,

        Especialidade especialidade
) {
}

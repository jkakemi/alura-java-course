package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroMedico(
        @NotBlank
        // não é vazio, não pode ser! E é somente para lidar com Strings
        String nome,
        @NotBlank
        @Email
        // sabe o formato padrão do email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        // expressão regular \\d significa dígitos que variam de 4 a 6
        @Pattern(regexp = "\\d{4,6}")
        String crm,
        @NotNull
        Especialidade especialidade,
        @NotNull
        @Valid
        // está dizendo "preciso que você também valide as anotações do outro DTO"
        DadosEndereco endereco
) {
}

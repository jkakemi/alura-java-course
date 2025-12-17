ALTER TABLE pacientes
    ALTER COLUMN ativo TYPE boolean USING (ativo = 1),
    ALTER COLUMN ativo SET DEFAULT TRUE,
    ALTER COLUMN ativo SET NOT NULL;

ALTER TABLE medicos
    ALTER COLUMN ativo TYPE boolean USING (ativo = 1),
    ALTER COLUMN ativo SET DEFAULT TRUE,
    ALTER COLUMN ativo SET NOT NULL;

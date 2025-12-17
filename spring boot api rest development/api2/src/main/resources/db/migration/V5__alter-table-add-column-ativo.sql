alter table pacientes add column ativo smallint;
update pacientes set ativo = 1;
alter table pacientes alter column ativo set not null;
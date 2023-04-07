use Db_Carnaval;

go

*--Como ver as caracteristicas do banco--*
sp_helpdb Db_Carnaval

create table Escola
(
	id_escola int not null primary key nonclustered, *--OS dados não ficarão organizados de acordo com o Id_Escola.
	*--POdemos ter apenas um item com essa propriedade nonclustered, por padrão chave primaria vem como clustered--*
	Nome_Escola Varchar(155) not null,
	Qtde_COmponentes smallint,
	Samba_enredo varchar(255),
	Tema_Desfile Varchar(255),
	Qtde_Pontos numeric (4,2)
)
go



*--Criar indice clustered--*
create clustered index IDX_Escola_Nome
on Escola (Nome_Escola);

select * from Escola
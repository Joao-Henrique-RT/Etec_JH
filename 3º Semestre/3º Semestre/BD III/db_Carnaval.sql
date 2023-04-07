use Db_Carnaval;

go

*--Como ver as caracteristicas do banco--*
sp_helpdb Db_Carnaval

create table Escola
(
	id_escola int not null primary key nonclustered, *--OS dados não ficarão organizados de acordo com o Id_Escola.
	*--POdemos ter apenas um item com essa propriedade nonclustered, por padrão chave primaria vem como clustered--*
	Nome_Escola Varchar(155) not null,
	Qtde_Componentes smallint,
	Samba_enredo varchar(255),
	Tema_Desfile Varchar(255),
	Qtde_Pontos numeric (4,2)
)
go

select * from Escola;

sp_helpdb db_carnaval
--DESCRIBE --MYSQL

select * from Escola;

begin transaction
insert into Escola(Nome_Escola,Qtde_COmponentes, Samba_enredo, Tema_Desfile,Qtde_Pontos
)
('Camisa 12', 5, 'Amazonia queimou', 'amazonia', 10)


rollback transaction;

--Registros envolvidos em transações de
--banco de dados, ficam bloqueados para qualquer
--tipo de manipulação por através de outra conexão
--insert update delete, sempre utilizar o Begin transaction antes da execução destes comandos

--Begin transaction
--Commit transaction
--rollback transaction

--ALTERAR COLUNA DE QUANTIDADE DE PONTOS DA TABELA ESCOLA 
--pRA RECEBER VALORES COM 3 DIGITOS
alter table escola
alter column Qtde_Pontos numeric(5,2);

Alter table Escola
Add Regiao  Varchar (15);
 
 update Escola

 set Qtde_COmponentes = 250,
 Samba_enredo = 'Etec itaquera',
 Tema_desfile = 'Alisson Expulso',
 Qtde_Pontos = 190
 where id_escola = 40;

 sp_help Escola;

 select * from Escola;

 --Obter o maior número de pontos
 Select Regiao,
	 max (Qtde_Pontos) as Maior_Pontuacao, --Maior pontuação
	min (Qtde_Pontos) as Menor_Pontuacao, --Menor pontuação
	avg (Qtde_Pontos) as Media_Pontuacao, -- MEdia de pontos por regiao
	count (id_escola) as Quantidade_Escolas, --Quantidade de escolas por regiao
	avg(Qtde_COmponentes) as media_Componentes, --Media de componetnes
	sum(Qtde_COmponentes) as total_Componentes --QUantidade de componentes
	 from Escola
Group by Regiao;


 --Funções de agregação --
 --max = maior
 --min == menor
 --avg = media
 --count = contar
 --Sum = soma
--Max(), MIn(), Avg(), Count(), Sum()


update Escola set Regiao = 'Leste' where id_escola=40
update Escola set Regiao = 'Leste' where id_escola=50
update Escola set Regiao = 'Leste' where id_escola=30
update Escola set Regiao = 'Norte' where id_escola=20


 
 update Escola

 set Qtde_COmponentes = 250,
 Samba_enredo = 'gremio',
 Tema_desfile = 'Eu sou: Meu nome é Gabriel',
 Qtde_Pontos = 190
 where id_escola = 20;


 select @@VERSION
 --Escola com o maior número de componentes
 select * from Escola where Qtde_COmponentes =
 (
 select max(Qtde_COmponentes) as Qtde_Componentes
	from Escola 
 )

 select * from Escola where id_escola =
 (
 select max(Regiao) as Qtde_Regiao
 from Escola
 )


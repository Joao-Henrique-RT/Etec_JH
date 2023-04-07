-- SQL --
-- Maiúsculunos e mínusculos, não faz diferença --

-- DML -->> Data Manipulation Language (Maniplar DADOS)
-- DML ->> É composta por: Insert, Update, Delete, Select

-- DDL -->> Data Definition Language (Manipular ESTRUTURA)
-- DDL ->> É composta por: Create, Alter, Drop. ***Database, Table, View, Triger, Procedure, Index ***(Estruturas para suportar os dados).

--diferença entre DELETE e DROP, Delete manipula apenas dados, pois faz parte da DML.

--GO, cria uma "Divisão".

--> Toda variável precisa do " @ " --

-- declare @curiosidade varchar(200); -- Criar Variável -- -- varchar, Quando não tiver número de caracteres indefinido --
-- select @curiosidade = 'apenas teste'; -- Atribuir valor p/ variável -- -->> Aspas simples serve para delimitar o conjunto de caracteres --
-- select @curiosidade as texto; -- Retornar valor da variável -- -->> Apelido para a informação -- 
							  -->> Se for palavra composta, coloca aspas -- select @curiosidade as 'texto da variavel' --
-- go --

-- declare @PAIS char(3); -- char, Quando tiver número de caracteres definido --
-- SET @PAIS ='BR'; --

-- Criar banco de dados para Mercado --
create database db_mercado;
go

use db_mercado;
go

Create table dbo.Produto
	(
	ID_Produto		int not null primary key,
	Nome_Produto	Varchar(100) not null,
	Data_Cadastro	date,
	Id_Fornecedor	int not null, --NOT NULL, OBRIGADO A INSERIR DADOS
	Custo_Unitario	Numeric(9,2),
	Preco_Unitario	Numeric(10,2),
	);
go

--Quando um dado da coluna CUsto_Unitário não for inserido, será autompáticamente inserido 0
ALTER TABLE dbo.Produto ADD CONSTRAINT
	DF_Produto_Custo_Unitario DEFAULT 0 FOR Custo_Unitario;

	
	ALTER TABLE dbo.Produto ADD CONSTRAINT
	DF_Produto_Preco_Unitario DEFAULT 0 FOR Preco_Unitario;

	go

-- Inserir dados na tabela Produto --
	insert into produto
	(
	ID_Produto, Nome_Produto, Data_Cadastro, Preco_Unitario, Custo_Unitario, Id_Fornecedor
	)
	Values
	(
	1, 'Alcool 70%', '2022-08-08' , 15.99, 1.99, 100
	);
	
	insert into Produto(
	ID_Produto, Nome_Produto, Data_Cadastro, Preco_Unitario, Custo_Unitario, Id_Fornecedor
	)
	values 
	(
	2, 'Amaciante', '2022-08-15', 20.00, 5.00, 100
	),
	(
	3, 'Arroz', '2022-08-15', 50.00, 25.00, 100
	);

	insert into Produto(
	ID_Produto, Nome_Produto, Data_Cadastro, Preco_Unitario, Custo_Unitario, Id_Fornecedor
	)
	values 
	(
	4, 'Cloro', '2022-08-15', 10.00, 3.50, 110
	);
	

	insert into Produto(
	ID_Produto, Nome_Produto, Data_Cadastro, Preco_Unitario, Id_Fornecedor
	)
	values 
	(
	6, 'Miojo', '2022-08-15', 1.50, 110
	);



	--Selecione todos os registros da tabela Produtos. --
	select *from Produto
	Where Id_produto = 3; --Filtro/ critério -- Selecione onde o Id_produto é 3;


	--select id_produto, Nome_produto, Data_Cadastro from Produto;
	

	--Excluir registro da tabela -- 
	Delete from Produto
	 Where ID_Produto = 3;
	 --Exclua da tabela produto onde o ID_Produto é 3 --
	 
	 -- Update -- Atualizar dados existentes em uma tabela --
Update Produto
	Set Nome_Produto = 'Macarrão'
   Where Id_Produto = 6; 

   --Obter nomes das tabelas contigas no banco--
   select name from sys.tables;

   --Verificar se há restrições na tabela--
  -- sp_help Produto;


   select * from Produto;

   --Não será criado pois o ID_Produto "2" já existe, e está restrito não pode ser alterado--
   insert into Produto(
	ID_Produto, Nome_Produto, Data_Cadastro, Id_Fornecedor
	)
	values 
	(
	7, 'Danone', '2022-08-15', 110
	);


	ALTER TABLE dbo.Produto ADD CONSTRAINT
	CK_Produto CHECK (Preco_Unitario >= Custo_Unitario);

	insert into Produto(
	ID_Produto, Nome_Produto, Data_Cadastro, Preco_Unitario, Custo_Unitario, Id_Fornecedor
	)
	values 
	(
	5, 'Desodorante', '2022-08-15', 30, 10, 200
	);

	insert into Produto(
	ID_Produto, Nome_Produto, Data_Cadastro, Preco_Unitario, Custo_Unitario, Id_Fornecedor
	)
	values 
	(
	9, 'Sabão', '2022-08-15', 3.50, 10, 110
	);
	

	--Constraint - Objetos de integridade de dados e integridade referencial;
	--Constraint é sinônimo de RESTRIÇÃO--
	--Primary key -- Não permitir duplicidade de dados na(s) colunas(s) que faz(em) parte da chave.

	update Produto
	set Nome_Produto = 'Curitia', ID_Produto = 1
	where ID_Produto = 2; -- Não será executado pois já existe um produto com ID de numero 1, como o ID é PRIMARY KEY o programa não permite duplicidade de dados


	go
	SP_HELP PRODUTO;

	-- Check para Custo do Produto -- 
	-- ** Custo do Produto deve ser valor Positivo --

	Alter table produto
	add constraint CK_Produto_Custo -- Nome da constraint
	Check (Custo_Unitario >= 0);

	update Produto
	set Custo_Unitario = 1 -- Caso fosse um número negativo, não irá aceitar.
	where ID_Produto = 4;

	--nova tabela--
	create table dbo.Prod_Cod_Barra
	(
	Sequencia int not null Identity (1,1), --Auto numeração
	Id_Produto int not null,
	Cod_Barra VarChar(15) not null,
	);


	--Acrescentar Constraint UNIQUE KEY --
	Alter table Prod_Cod_Barra
	Add constraint UK_Produto_Cod_Barra unique (Cod_Barra); -- UNIQUE KEY - pode colocar quantas chaves quiser! --

	insert into Prod_Cod_Barra(
	ID_Produto, Cod_Barra
	)
	values 
	(
	1, 29082022
	);
		insert into Prod_Cod_Barra(
	ID_Produto, Cod_Barra
	)
	values 
	(
	1, 29082020
	);

	select * from Prod_Cod_Barra;

	--Criar relacionamento entre (foreign Key) entre
	--tabela produto e Cod_Barra

	Alter table Prod_Cod_Barra
	add constraint FK_Cod_Barra_Id_Produto Foreign key
	(ID_Produto)
	references Produto (ID_Produto);

	SP_HELP Prod_Cod_Barra;


	Select * from Produto;
	Select * from Prod_Cod_Barra;

	--Truncate table Prod_Cod_Barra;   
	--COm este código os dados serão apagados para sempre, sem nenhuma possíbilidade de recuperar.
	-- Com o DELETE ainda podemos recuperar os dados, pois eles ficam armazenados em um local.

	insert into Prod_Cod_Barra
	(Id_Produto, Cod_Barra)
	values
	 (1, 202585);
	--não será inserido, pois estamos tentando colocar um código de barras com com um ID_ que não existe na 
	--tabela pai, a tabela PRODUTO

	delete from Produto where ID_Produto = 1;
	--Não será executada essa linha porque existe um produto com este ID na tabela cod barras, para ser excluido, primeiro deve-se apagar o 
	--ID que está na tabela relacionada a tabela pai


	create table dbo.Fornecedor
	(
	Id_Fornecedor int not null primary key,
	Nome_Fornecedor varchar(100) not null,
	
	
	);

	select * from Produto ;
	select * from Fornecedor;

	insert into Fornecedor
	(Id_Fornecedor,Nome_Fornecedor)
	values
	(200, 'Alisson Albuquerque'); 

	alter table Produto
	add constraint FK_Id_Fornecedor foreign key
	(Id_Fornecedor)
	references Fornecedor (Id_Fornecedor);

	insert into Produto(
	ID_Produto, Nome_Produto, Data_Cadastro, Preco_Unitario, Custo_Unitario, Id_Fornecedor
	)
	values 
	(
	10, 'Chuveiro', '2022-08-15', 3.50, 10, 200
	);

	SP_HELP Fornecedor;

		
 select * from Fornecedor;
select * from Produto;
select * from Prod_Cod_Barra;

	insert into Prod_Cod_Barra
	(Id_Produto, Cod_Barra)
	values
	 (7, 30145741);

	 insert into Fornecedor
	(Id_Fornecedor, Nome_Fornecedor)
	values
	 (100, 'Eric Sanderson');

	 insert into Fornecedor
	(Id_Fornecedor, Nome_Fornecedor)
	values
	 (110, 'João Henrique');

	 select * from Fornecedor;

	 select prd.ID_Produto, prd.Nome_Produto, prd.Data_Cadastro, prd.Id_Fornecedor, prd.Custo_Unitario, pcb.Sequencia, pcb.Cod_Barra, fnd.Nome_Fornecedor
	 from Produto prd
	 inner join Prod_Cod_Barra pcb on pcb.Id_Produto = prd.ID_Produto
	 inner join Fornecedor fnd on fnd.Id_Fornecedor = prd.Id_Fornecedor; 

	 bulk insert produto
	 from [c:\etec\banco de dados\produto.txt]
	 with (codepage = 'OEM',
		   fieldterminator = '\t',
		   firstrow = 1
	 );
	 	 if (select name from sys.tables
			where name = 'Fornecedor') is not null
	 begin 
			drop table Fornecedor
	 end
	 create table dbo.Fornecedor
	 (
		Id_Fornecedor int not null primary key,
		Nome_Fornecedor Varchar(50),
		Dt_Cadastro Date,
		Status_Fornecedor Char(1)
	 );
--Criar chave Estrangeira na Tabela de Produto
	Alter table dbo.Produto WITH NOCHECK ADD 
	Constraint FK_Prod_Fornecedor
	Foreign key (Id_Fornecedor)
	References Fornecedor (Id_Fornecedor);

	USE db_mercado
	GO
	Select *
	from Produto;

	alter table dbo.Fornecedor 
	add 
	Dt_Cadastro date,
	Status_Fornecedor varchar(2); -- where Id_Fornecedor = 100;

	insert into Fornecedor
	(Id_Fornecedor, Nome_Fornecedor, Data_Cadastro, Status_Fornecedor)
	values
	(300, 'Picaretas & Cia Ltda', Getdate(), 'A');

	select*from Produto where ID_Produto = 5;
	select*from Prod_Cod_Barra where Id_Produto = 5;



	select P.Id_Produto, P.Nome_Produto, P.Preco_Unitario,
	CB.Sequencia ,CB.Cod_Barra
	from Produto P
	inner join
	Prod_Cod_barra CB on CB.id_Produto = P.Id_Produto
	where p.Id_Produto = 5;

	select P.Id_Produto, P.Nome_Produto,
	P.Data_Cadastro, P.Custo_Unitario,
	CB.Sequencia, CB.Cod_Barra,
	F.Id_Fornecedor, F.Nome_Fornecedor, 
	F.Data_Cadastro
	from Produto  as P  --As, serve para adicionar um apelido a tabela, no caso P é de Produto, F de Fornecedor, CB de Cod_Barra.
	 Para das apelido não precisa do As, basta dar um espaço
	join  --Join ou Inner Join são a mesma coisa
	Prod_Cod_Barra CB on
	CB.Id_Produto = p.Id_Produto
		inner join
		Fornecedor F on f.Id_Fornecedor = p.Id_Fornecedor

		where p.Id_Produto = 3;

		select * from Fornecedor;

		alter table Fornecedor 
		add Status_Fornecedor varchar(50),
		 Data_Cadastro date;
		

		select p.*, CB.*
			from Produto p
				inner join
				Prod_Cod_Barra CB ON CB.ID_PRODUTO = P.ID_Produto	

				where CB.Cod_Barra is null;


				--obtenha dados, onde o código de barras é nulo


				--count (*) - retorna quantidade de registros
				SELECT COUNT (*) as qtde from Produto;
				select COUNT (*) as qtde from Fornecedor;
				select count (*) as qtde from Prod_Cod_Barra;


				--criar  tabelas de pedidos e item de pedido
				
				create table dbo.Vendedor
				(
				Id_Vendedor Smallint not null primary key identity (1,1),
				Nome_Vencedor Varchar(60),
				Dt_Admissao Date,
				Status_Vendedor char(1)
				)
				
				go
				
				create table  dbo.Pedido
				(
				Num_Pedido int not null primary key identity(1,1),
				Dt_Pedido date,
				Id_Vendedor Smallint,
				Constraint Fk_Pedido_Vendr --Chave estrangeira --
				foreign key (Id_Vendedor) References Vendedor(Id_Vendedor)
				)

				go -- tabela item pedido --

				create table dbo.Item_Pedido(
				Sequencia int not null identity(1,1),
				Num_Pedido int not null,
				Id_Produto int not null, 
				Quantidade numeric (6,2),
				Preco_Unitario numeric(10,2),
				Constraint Fk_Item_Pedido
				FOreign key (Num_Pedido) references Pedido (Num_Pedido),
				Constraint Fk_Item_Produto
				foreign key (Id_Produto) references Produto(Id_Produto)
				)
				
				use db_mercado
				go
				select 'Select * from' + name from sys.tables;

				Select * from Produto;
				Select * from Prod_Cod_Barra;
				Select * from Fornecedor;
				Select * from sysdiagrams;
				Select * from Vendedor;

			insert into Fornecedor
	(Id_Fornecedor, Nome_Fornecedor, Data_Cadastro, Status_Fornecedor)
	values
	(300, 'Picaretas & Cia Ltda', Getdate(), 'A');

			insert into Vendedor
			(Nome_Vencedor, Dt_Admissao, Status_Vendedor)
			values 
			('Eric Sanderon', GETDATE(), 'A');

			

				insert into Vendedor
			(Nome_Vencedor, Dt_Admissao, Status_Vendedor)
			values 
			('JOão Henrique', GETDATE(), 'A');


				insert into Vendedor
			(Nome_Vencedor, Dt_Admissao, Status_Vendedor)
			values 
			('Alisson Almeida', GETDATE(), 'A');


				insert into Vendedor
			(Nome_Vencedor, Dt_Admissao, Status_Vendedor)
			values 
			('Rodrigo foda', GETDATE(), 'F');


				insert into Vendedor
			(Nome_Vencedor, Dt_Admissao, Status_Vendedor)
			values 
			('To cansado mano', GETDATE(), 'F');

			sp_help Vendedor;

			--COMANDOS COM IDENTITY POSSUEM AUTO INCREMENTO, NÃO PODEM SER COLOCADOS DADOS VIA INSERT

			--TOMAR CUIDADO COM O TAMANHO DE CHAR OU VARCHAR DENTRO DOS DADOS, PARA NÃO COLOCAR QUANTIDADE A MAIS DO QUE A "VARIÁVEL" ARMAZENA

			--pedido;

			--itemPedido;

			CREATE TABLE [dbo].[Pedido](
	[Num_Pedido] [int] IDENTITY(1,1) NOT NULL,
	[Dt_Pedido] [date] NULL,
	[Id_Vendedor] [smallint] NULL,
PRIMARY KEY CLUSTERED 
(
	[Num_Pedido] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO


CREATE TABLE [dbo].[Item_Pedido](
	[Sequencia] [int] IDENTITY(1,1) NOT NULL,
	[Num_Pedido] [int] NOT NULL,
	[Id_Produto] [int] NOT NULL,
	[Quantidade] [numeric](6, 2) NULL,
	[Preco_Unitario] [numeric](10, 2) NULL
) ON [PRIMARY]
GO


Select * from Produto;
Select * from Prod_Cod_Barra;
Select * from Fornecedor;
Select * from Vendedor;
Select * from Pedido;
Select * from Item_Pedido;


ALTER TABLE [dbo].[Item_Pedido]  WITH CHECK ADD  CONSTRAINT [Fk_Item_Pedido] FOREIGN KEY([Num_Pedido])
REFERENCES [dbo].[Pedido] ([Num_Pedido])
GO
ALTER TABLE [dbo].[Item_Pedido] CHECK CONSTRAINT [Fk_Item_Pedido]
GO
ALTER TABLE [dbo].[Item_Pedido]  WITH CHECK ADD  CONSTRAINT [Fk_Item_Produto] FOREIGN KEY([Id_Produto])
REFERENCES [dbo].[Produto] ([Id_Produto])
GO
ALTER TABLE [dbo].[Item_Pedido] CHECK CONSTRAINT [Fk_Item_Produto]
GO
ALTER TABLE [dbo].[Pedido]  WITH CHECK ADD  CONSTRAINT [Fk_Pedido_Vendr] FOREIGN KEY([Id_Vendedor])
REFERENCES [dbo].[Vendedor] ([Id_Vendedor])
GO
ALTER TABLE [dbo].[Pedido] CHECK CONSTRAINT [Fk_Pedido_Vendr]
GO

/*
		select p.*, CB.*
			from Produto p
				inner join
				Prod_Cod_Barra CB ON CB.ID_PRODUTO = P.ID_Produto	

				where CB.Cod_Barra is null;




					select P.Id_Produto, P.Nome_Produto, P.Preco_Unitario,
	CB.Sequencia ,CB.Cod_Barra
	from Produto P
	inner join
	Prod_Cod_barra CB on CB.id_Produto = P.Id_Produto
	where p.Id_Produto = 5;

	select P.Id_Produto, P.Nome_Produto,
	P.Data_Cadastro, P.Custo_Unitario,
	CB.Sequencia, CB.Cod_Barra,
	F.Id_Fornecedor, F.Nome_Fornecedor, 
	F.Data_Cadastro
	from Produto  as P  --As, serve para adicionar um apelido a tabela, no caso P é de Produto, F de Fornecedor, CB de Cod_Barra.
	 Para das apelido não precisa do As, basta dar um espaço
	join  --Join ou Inner Join são a mesma coisa
	Prod_Cod_Barra CB on
	CB.Id_Produto = p.Id_Produto
		inner join
		Fornecedor F on f.Id_Fornecedor = p.Id_Fornecedor

*/



select name from sys.tables;

Select Prod.Id_Produto, Prod.Nome_Produto, Prod.Data_Cadastro,
Prod.Custo_Unitario,Prod.Preco_Unitario,
Prod.Id_Fornecedor, F.Nome_Fornecedor,
f.Dt_Cadastro as Dt_Cad_Fornec, F.Status_Fornecedor,
IPed.Num_Pedido,IPed.Sequencia, IPEd.Preco_Unitario,
Iped.Quantidade, IPed.Preco_Unitario * IPed.Quantidade as Valor_Item,
V.Nome_Vencedor, V.Dt_Admissao, V.Status_Vendedor

 from Produto Prod
Inner Join Fornecedor f on F.Id_Fornecedor = Prod.Id_Fornecedor
Left Join Prod_Cod_Barra CB on CB.Id_Produto = Prod.ID_Produto
left join Item_Pedido IPed on IPed.Id_Produto = Prod.ID_Produto
Left join Pedido P on P.Num_Pedido = IPEd.Id_Produto
Left Join Vendedor V on V.Dt_Admissao = P.Id_Vendedor

select * from Vendedor;
select * from Fornecedor;





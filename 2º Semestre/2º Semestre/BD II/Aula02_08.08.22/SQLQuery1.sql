-- SQL --
-- Mai�sculunos e m�nusculos, n�o faz diferen�a --

-- DML -->> Data Manipulation Language (Maniplar DADOS)
-- DML ->> � composta por: Insert, Update, Delete, Select

-- DDL -->> Data Definition Language (Manipular ESTRUTURA)
-- DDL ->> � composta por: Create, Alter, Drop. ***Database, Table, View, Triger, Procedure, Index ***(Estruturas para suportar os dados).

--diferen�a entre DELETE e DROP, Delete manipula apenas dados, pois faz parte da DML.

--GO, cria uma "Divis�o".

--> Toda vari�vel precisa do " @ " --

-- declare @curiosidade varchar(200); -- Criar Vari�vel -- -- varchar, Quando n�o tiver n�mero de caracteres indefinido --
-- select @curiosidade = 'apenas teste'; -- Atribuir valor p/ vari�vel -- -->> Aspas simples serve para delimitar o conjunto de caracteres --
-- select @curiosidade as texto; -- Retornar valor da vari�vel -- -->> Apelido para a informa��o -- 
							  -->> Se for palavra composta, coloca aspas -- select @curiosidade as 'texto da variavel' --
-- go --

-- declare @PAIS char(3); -- char, Quando tiver n�mero de caracteres definido --
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

--Quando um dado da coluna CUsto_Unit�rio n�o for inserido, ser� automp�ticamente inserido 0
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
	Where Id_produto = 3; --Filtro/ crit�rio -- Selecione onde o Id_produto � 3;


	--select id_produto, Nome_produto, Data_Cadastro from Produto;
	

	--Excluir registro da tabela -- 
	Delete from Produto
	 Where ID_Produto = 3;
	 --Exclua da tabela produto onde o ID_Produto � 3 --
	 
	 -- Update -- Atualizar dados existentes em uma tabela --
Update Produto
	Set Nome_Produto = 'Macarr�o'
   Where Id_Produto = 6; 

   --Obter nomes das tabelas contigas no banco--
   select name from sys.tables;

   --Verificar se h� restri��es na tabela--
   sp_help Produto;


   select * from Produto;

   --N�o ser� criado pois o ID_Produto "2" j� existe, e est� restrito n�o pode ser alterado--
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
	9, 'Sab�o', '2022-08-15', 3.50, 10, 110
	);
	

	--Constraint - Objetos de integridade de dados e integridade referencial;
	--Constraint � sin�nimo de RESTRI��O--
	--Primary key -- N�o permitir duplicidade de dados na(s) colunas(s) que faz(em) parte da chave.

	update Produto
	set Nome_Produto = 'Curitia', ID_Produto = 1
	where ID_Produto = 2; -- N�o ser� executado pois j� existe um produto com ID de numero 1, como o ID � PRIMARY KEY o programa n�o permite duplicidade de dados


	go
	SP_HELP PRODUTO;

	-- Check para Custo do Produto -- 
	-- ** Custo do Produto deve ser valor Positivo --

	Alter table produto
	add constraint CK_Produto_Custo -- Nome da constraint
	Check (Custo_Unitario >= 0);

	update Produto
	set Custo_Unitario = 1 -- Caso fosse um n�mero negativo, n�o ir� aceitar.
	where ID_Produto = 4;

	--nova tabela--
	create table dbo.Prod_Cod_Barra
	(
	Sequencia int not null Identity (1,1), --Auto numera��o
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
	--COm este c�digo os dados ser�o apagados para sempre, sem nenhuma poss�bilidade de recuperar.
	-- Com o DELETE ainda podemos recuperar os dados, pois eles ficam armazenados em um local.

	insert into Prod_Cod_Barra
	(Id_Produto, Cod_Barra)
	values
	 (1, 202585);
	--n�o ser� inserido, pois estamos tentando colocar um c�digo de barras com com um ID_ que n�o existe na 
	--tabela pai, a tabela PRODUTO

	delete from Produto where ID_Produto = 1;
	--N�o ser� executada essa linha porque existe um produto com este ID na tabela cod barras, para ser excluido, primeiro deve-se apagar o 
	--ID que est� na tabela relacionada a tabela pai


	create table dbo.Fornecedor
	(
	Id_Fornecedor int not null primary key,
	Nome_Fornecedor varchar(100) not null
	
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

		

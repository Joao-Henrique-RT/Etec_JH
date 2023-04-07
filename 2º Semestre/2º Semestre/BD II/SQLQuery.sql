

use db_estoque;

go

create table dbo.Fornecedor 
(
id_fornecedor int not null identity(1,1) primary key, --C�digo do Fornecedor
nome_fornecedor varChar(50) not null, --Nome do Fornecedor, m�ximo de 50 caracteres
situa��o_fornecedor varChar(2), -- Situa��o (OK, FA)
);

Select * from Fornecedor;

sp_help fornecedor;

insert into Fornecedor
(nome_fornecedor, situa��o_fornecedor)
values
('Jo�o Henrique', 'OK'),
('Alisson Almeida', 'OK'),
('Nilson Fagundes', 'OK'),
('Eric Sanderson','FA'),
('Carlitos Tev�z','FA');

---------------------------------------------

create table dbo.Vendedor
(
id_vendedor int not null identity(1,1) primary key,
nome_Vendedor varChar(50) not null,
data_admissao date not null,
situacao_vendedor varchar(2), --(OK, IN (INATIVO))
);

insert into Vendedor
(nome_Vendedor, data_admissao, situacao_vendedor)
values
('Gabriel Sena', getdate(),'OK'),
('Michael Jackson',getdate(),'IN'),
('Billie Jean',getdate(),'IN'),
('Ana Concei��o', getdate(),'OK'),
('Gerson Welington',getdate(),'OK');

select*from dbo.Fornecedor;
select*from dbo.Vendedor;


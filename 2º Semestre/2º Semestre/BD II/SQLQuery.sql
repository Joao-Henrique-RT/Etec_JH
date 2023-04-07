

use db_estoque;

go

create table dbo.Fornecedor 
(
id_fornecedor int not null identity(1,1) primary key, --Código do Fornecedor
nome_fornecedor varChar(50) not null, --Nome do Fornecedor, máximo de 50 caracteres
situação_fornecedor varChar(2), -- Situação (OK, FA)
);

Select * from Fornecedor;

sp_help fornecedor;

insert into Fornecedor
(nome_fornecedor, situação_fornecedor)
values
('João Henrique', 'OK'),
('Alisson Almeida', 'OK'),
('Nilson Fagundes', 'OK'),
('Eric Sanderson','FA'),
('Carlitos Tevéz','FA');

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
('Ana Conceição', getdate(),'OK'),
('Gerson Welington',getdate(),'OK');

select*from dbo.Fornecedor;
select*from dbo.Vendedor;


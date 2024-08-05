/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  note
 * Created: 3 de ago. de 2024
 */

create  database clinica;
use clinica;

create table CadastroPac(
nome   varchar(50),
telefone varchar(15),
idade varchar(3),
endereco varchar(30),
complemento varchar(30),
bairro varchar(10),
cep varchar(15),
UF varchar(5)
);

create table CadastroMed(
nome varchar(50),
email varchar(30),
especializacao varchar(20),
crm int
);

create table Consulta(
nome varchar(50),
especialista varchar(20),
horario varchar(100)
);


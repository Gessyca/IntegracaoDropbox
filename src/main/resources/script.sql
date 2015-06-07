create database dropbox;
use dropbox;
create table usuario (
id int primary key not null, 
usuario varchar(255), 
email_dropbox varchar(255), 
senha varchar(255), 
senha_dropbox varchar(255)
);
create database dropbox;
use dropbox;
create table usuario (
id int not null primary key auto_increment, 
usuario varchar(255), 
email_dropbox varchar(255), 
senha varchar(255), 
senha_dropbox varchar(255)
);
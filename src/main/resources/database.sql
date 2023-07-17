CREATE DATABASE IF NOT EXISTS phonebook;
USE phonebook;

CREATE TABLE IF NOT EXISTS contacts(
     id int not null auto_increment,
     firstName varchar(100) not null,
     lastName varchar(100) not null,
     phoneNumber varchar(100) not null unique,
     email varchar(100) null,
     createdAt timestamp default current_timestamp,
     lastUpdated timestamp default current_timestamp on update current_timestamp,
     primary key (id)
);

select * from contacts;
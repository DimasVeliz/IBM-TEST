create database ibm_test;
use ibm_test;

CREATE TABLE provider (
id int NOT NULL AUTO_INCREMENT,
name varchar(255),
registration_date date,
client_id int,
PRIMARY KEY (id)
);

insert into provider values(1,'Coca-cola','2012-01-01',5);
insert into provider values(2,'Pepsi','2012-01-02',5);
insert into provider values(3,'Redbull','2012-01-03',6);

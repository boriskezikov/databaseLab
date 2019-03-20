DROP TABLE IF EXISTS DB_CONNECTOR;
CREATE TABLE  DB_CONNECTOR(
 id int primary key ,
 phone_number varchar(11) NOT NULL,
 meta_data varchar(100)
);



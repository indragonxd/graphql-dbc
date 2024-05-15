CREATE TABLE IF NOT EXISTS accounts (
    id INT NOT NULL,
    number VARCHAR(255),
    balance NUMERIC(10,4),
    currency INT,
    customerId INT,
    PRIMARY KEY (id)
    );

truncate table accounts;
INSERT INTO accounts(id,number,balance,currency,customerId) values (1,'191-1111111-1',1000,1,1);
INSERT INTO accounts(id,number,balance,currency,customerId) values (2,'191-1111111-2',2000,1,1);
INSERT INTO accounts(id,number,balance,currency,customerId) values (3,'191-1111111-3',3000,1,1);

INSERT INTO accounts(id,number,balance,currency,customerId) values (4,'192-1111111-1',1000,1,2);
INSERT INTO accounts(id,number,balance,currency,customerId) values (5,'192-1111111-2',2000,1,2);
INSERT INTO accounts(id,number,balance,currency,customerId) values (6,'192-1111111-3',3000,1,2);

INSERT INTO accounts(id,number,balance,currency,customerId) values (7,'193-1111111-1',1000,1,3);
INSERT INTO accounts(id,number,balance,currency,customerId) values (8,'193-1111111-2',2000,1,3);
INSERT INTO accounts(id,number,balance,currency,customerId) values (9,'193-1111111-3',3000,1,3);

CREATE TABLE IF NOT EXISTS transactions (
    id INT NOT NULL,
    fecha TIMESTAMP,
    amount NUMERIC(10,4),
    currency INT,
    accountId INT,
    PRIMARY KEY (id)
    );

truncate table transactions;
INSERT INTO transactions(id,fecha,amount,currency,accountId) values (1,'2023-10-08 11:17:52.0',100,1,1);
INSERT INTO transactions(id,fecha,amount,currency,accountId) values (2,'2023-10-09 11:17:52.0',-50,1,1);
INSERT INTO transactions(id,fecha,amount,currency,accountId) values (3,'2023-11-29 02:03:00.0',-50,1,1);
INSERT INTO transactions(id,fecha,amount,currency,accountId) values (4,'2023-11-29 02:00:00.0',500,1,2);
INSERT INTO transactions(id,fecha,amount,currency,accountId) values (5,'2023-11-29 02:01:00.0',-50,1,2);
INSERT INTO transactions(id,fecha,amount,currency,accountId) values (6,'2023-11-29 02:03:00.0',-50,1,2);
INSERT INTO transactions(id,fecha,amount,currency,accountId) values (7,'2023-11-30 02:00:00.0',500,1,3);
INSERT INTO transactions(id,fecha,amount,currency,accountId) values (8,'2023-11-29 02:01:00.0',-50,1,3);
INSERT INTO transactions(id,fecha,amount,currency,accountId) values (9,'2023-12-01 02:03:00.0',-50,1,3);

INSERT INTO transactions(id,fecha,amount,currency,accountId) values (10,'2023-12-01 02:03:00.0',800,1,4);
INSERT INTO transactions(id,fecha,amount,currency,accountId) values (11,'2023-12-01 02:04:00.0',-50,1,5);
INSERT INTO transactions(id,fecha,amount,currency,accountId) values (12,'2023-12-01 02:05:00.0',-50,1,6);

INSERT INTO transactions(id,fecha,amount,currency,accountId) values (13,'2023-11-29 02:00:00.0',1000,1,7);
INSERT INTO transactions(id,fecha,amount,currency,accountId) values (14,'2023-11-29 02:01:00.0',-10,1,8);
INSERT INTO transactions(id,fecha,amount,currency,accountId) values (15,'2023-11-29 02:03:00.0',-10,1,9);
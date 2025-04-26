CREATE TABLE pessoa
(
    id_pessoa INTEGER PRIMARY KEY AUTO_INCREMENT,
    CPF       VARCHAR(14)  NOT NULL,
    nome      VARCHAR(120) NOT NULL,
    data_nasc DATE         NOT NULL,
    email     VARCHAR(120),
    telefone  VARCHAR(15)
);

CREATE TABLE funcionario
(
    id_funcionario INTEGER PRIMARY KEY AUTO_INCREMENT,
    cargo          VARCHAR(45) NOT NULL,
    salario        DECIMAL(6, 2) NOT NULL,
    setor          VARCHAR(45) NOT NULL,
    status         TINYINT(1) NOT NULL,
    id_pessoa INTEGER,
    FOREIGN KEY (id_pessoa) REFERENCES pessoa (id_pessoa)
);

CREATE TABLE cliente
(
    id_cliente INTEGER PRIMARY KEY AUTO_INCREMENT,
    id_pessoa INTEGER,
    FOREIGN KEY (id_pessoa) REFERENCES pessoa (id_pessoa)
);

CREATE TABLE estoque
(
    id_estoque      INTEGER PRIMARY KEY AUTO_INCREMENT,
    marca           VARCHAR(45) NOT NULL,
    modelo          VARCHAR(45)NOT NULL,
    cor             VARCHAR(45) NOT NULL,
    data_fabricacao DATE NOT NULL
);

CREATE TABLE venda
(
    id_venda INTEGER PRIMARY KEY AUTO_INCREMENT,
    data     DATETIME NOT NULL,
    total    DECIMAL(6, 2) NOT NULL,
    status   TINYINT(1) NOT NULL,
    id_funcionario INTEGER,
    id_cliente INTEGER,
    id_estoque INTEGER,
    FOREIGN KEY (id_funcionario) REFERENCES funcionario (id_funcionario),
    FOREIGN KEY (id_cliente) REFERENCES cliente (id_cliente),
    FOREIGN KEY (id_estoque) REFERENCES estoque(id_estoque)
);
USE banco;

CREATE TABLE agencia(
NomeAgencia VARCHAR(50) NOT NULL,
IdAgencia INT(7) PRIMARY KEY NOT NULL auto_increment,
EnderecoAgencia VARCHAR(100) NOT NULL

);

CREATE TABLE cliente(
NomeCliente VARCHAR(100) NOT NULL,
IdCliente INT(12) PRIMARY KEY NOT NULL auto_increment,
EnderecoCliente VARCHAR(100) NOT NULL,
UsuarioCliente VARCHAR(15) NOT NULL,
SenhaCliente VARCHAR(10) NOT NULL,
EmailCliente VARCHAR(50)NOT NULL

);

CREATE TABLE pedido(
IdPedido INT(10) PRIMARY KEY NOT NULL auto_increment,
DataIda DATE NOT NULL,
DataVolta DATE NOT NULL,
IdCliente INT(12),
FOREIGN KEY (IdCliente) REFERENCES cliente (IdCliente)
);

CREATE TABLE ItensPedido(
valor INT,
itens INT,
decricao VARCHAR(100),
IdPedido INT(10),
FOREIGN KEY (IdPedido) REFERENCES pedido (IdPedido)
);

CREATE TABLE ViagemComum(
DataIda DATE NOT NULL,
DataVolta Date NOT NULL,
IdViagemV1 INT (20) PRIMARY KEY NOT NULL auto_increment
);

CREATE TABLE ListaV1(
VoosV1 VARCHAR(100) PRIMARY KEY NOT NULL,
DestinoV1 VARCHAR(100) NOT NULL,
IdViagemV1 INT(20),
FOREIGN KEY (IdViagemV1) REFERENCES ViagemComum (IdViagemV1)

);

CREATE TABLE promocoes(
DataIda DATE NOT NULL,
DataVolta Date NOT NULL,
IdViagemV2 INT (20) PRIMARY KEY NOT NULL auto_increment
);

CREATE TABLE ListaV2(
VoosV2 VARCHAR(100) PRIMARY KEY NOT NULL,
DestinoV2 VARCHAR(100) NOT NULL,
IdViagemV2 INT(20),
FOREIGN KEY (IdViagemV2) REFERENCES promocoes (IdViagemV2)
);

CREATE TABLE Disney(
Disney CHAR(6) PRIMARY KEY NOT NULL
);

CREATE TABLE eua(
IdViagemD1 INT(15) PRIMARY KEY NOT NULL auto_increment,
DataIda DATE NOT NULL,
DataVolta DATE NOT NULL,
voos VARCHAR(50) NOT NULL,
Disney CHAR(6),
FOREIGN KEY (Disney) REFERENCES Disney (Disney)
);

CREATE TABLE eur(
IdViagemD2 INT(15) PRIMARY KEY NOT NULL auto_increment,
DataIda DATE NOT NULL,
DataVolta DATE NOT NULL,
voos VARCHAR(50) NOT NULL,
Disney CHAR(6),
FOREIGN KEY (Disney) REFERENCES Disney (Disney)
);

CREATE TABLE cruzeiro(
cruzeiros VARCHAR(80) NOT NULL,
IdCruzeiros INT(7) PRIMARY KEY NOT NULL auto_increment,
DataIda DATE NOT NULL,
DataVolta DATE NOT NULL

);

CREATE TABLE navios(
navios VARCHAR(90) NOT NULL,
itinerario VARCHAR(200) NOT NULL,
IdCruzeiros INT(7),
FOREIGN KEY (IdCruzeiros) REFERENCES cruzeiro (IdCruzeiros)
);

CREATE TABLE seguro(
codigo INT(13) PRIMARY KEY NOT NULL auto_increment,
NomeCliente VARCHAR(100) NOT NULL,
IdCliente INT(12) NOT NULL,
periodofuncionamento DATE NOT NULL,
FOREIGN KEY (IdCliente) REFERENCES cliente (IdCliente)

);


-- INSERT INTO GYMDB.CLIENTES (NOMBRE, FECHA_NAC, TELEFONO, EMAIL, DIRECCION) VALUES ( ?, ?, ?, ?, ?); 
-- SELECT TC.IDCLIENTE, NOMBRE, HORA FROM GYMDB.CLIENTES TC JOIN GYMDB.ASISTENCIAS AS TA ON TC.IDCLIENTE = TA.IDCLIENTE
-- SELECT * FROM GYMDB.FINANZAS WHERE FECHA LIKE '2012-02-%'

SELECT TC.IDCLIENTE, NOMBRE, PRECIO, FECHA_INICIO, DURACION, DESCRIPCION FROM GYMDB.CLIENTES TC JOIN GYMDB.MEMBRESIAS AS TM ON TC.IDCLIENTE = TM.IDCLIENTE


DROP TABLE IF EXISTS GYMDB.CLIENTES;
DROP TABLE IF EXISTS GYMDB.MEDIDAS;
DROP TABLE IF EXISTS GYMDB.MEMBRESIAS;
DROP TABLE IF EXISTS GYMDB.ASISTENCIAS;
DROP TABLE IF EXISTS GYMDB.FINANZAS;

CREATE TABLE IF NOT EXISTS GYMDB.CLIENTES(
	IDCLIENTE INT IDENTITY,
	NOMBRE VARCHAR(100) NOT NULL,
	FECHA_NAC DATE NOT NULL,
	TELEFONO VARCHAR(20),
	EMAIL VARCHAR(70),
	DIRECCION VARCHAR(255)
);
	
CREATE TABLE IF NOT EXISTS GYMDB.MEDIDAS(
	IDMEDIDA INT IDENTITY,
	IDCLIENTE INT NOT NULL,
	FECHA DATE NOT NULL, 
	PESO DECIMAL DEFAULT 0, 
	BICEPDER DECIMAL DEFAULT 0, 
	BICEPIZQ DECIMAL DEFAULT 0, 
	PECTORAL DECIMAL DEFAULT 0,
	ABDOMEN DECIMAL DEFAULT 0,
	CINTURA DECIMAL DEFAULT 0,
	GLUTEOS DECIMAL DEFAULT 0,
	CADERA DECIMAL DEFAULT 0,
	PIERNADER DECIMAL DEFAULT 0,
	PIERNAIZQ DECIMAL DEFAULT 0,
	FOREIGN KEY(IDCLIENTE) REFERENCES CLIENTES(IDCLIENTE) ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS GYMDB.MEMBRESIAS(
	IDMEMBRESIA INT IDENTITY,
	IDCLIENTE INT NOT NULL,
	FECHA_INICIO DATE NOT NULL,
	DURACION SMALLINT NOT NULL,
	DESCRIPCION VARCHAR(255),
	PRECIO DECIMAL NOT NULL,
	FOREIGN KEY(IDCLIENTE) REFERENCES CLIENTES(IDCLIENTE) ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS GYMDB.ASISTENCIAS(
	IDASISTENCIA INT IDENTITY,
	IDCLIENTE INT NOT NULL,
	FECHA DATE NOT NULL,
	HORA TIME DEFAULT '12:00',
	FOREIGN KEY(IDCLIENTE) REFERENCES CLIENTES(IDCLIENTE) ON UPDATE CASCADE
);


CREATE TABLE IF NOT EXISTS GYMDB.FINANZAS(
	IDFINANZA INT IDENTITY,
	FECHA DATE NOT NULL,
	DESCRIPCION VARCHAR(255) NOT NULL,
	PRECIO DECIMAL
);


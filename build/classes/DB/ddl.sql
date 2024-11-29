DROP TABLE IF EXISTS clientes;
DROP TABLE IF EXISTS productos;
DROP TABLE IF EXISTS pedidos;
DROP TABLE IF EXISTS detalle_pedido;



CREATE TABLE clientes (
    id_cliente INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre     VARCHAR (80)             NOT NULL,
    apellido   VARCHAR (80)             NOT NULL,
    email      VARCHAR (80)             NOT NULL,
    direccion  VARCHAR (100),
    telefono   VARCHAR (20)   
);

CREATE TABLE productos (
    id_producto INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre      VARCHAR (80)         NOT NULL,
    descripcion VARCHAR (300),
    precio      DECIMAL (10, 2),
    stock       INTEGER              NOT NULL
);


CREATE TABLE pedidos (
    id_pedido    INTEGER PRIMARY KEY AUTOINCREMENT,
    id_cliente   INTEGER,
    fecha_pedido DATE                 NOT NULL,
    total        DECIMAL (10, 2)      NOT NULL,
    FOREIGN KEY (
        id_cliente
    )
    REFERENCES clientes (id_cliente) 
);

CREATE TABLE detalle_pedido (
    id_detalle      INTEGER PRIMARY KEY AUTOINCREMENT,
    id_pedido       INTEGER,
    id_producto     INTEGER,
    cantidad        INTEGER                  NOT NULL,
    precio_unitario DECIMAL (10, 2)      NOT NULL,
    FOREIGN KEY (
        id_pedido
    )
    REFERENCES pedidos (id_pedido),
    FOREIGN KEY (
        id_producto
    )
    REFERENCES productos (id_producto) 
);


/* POBLAR BASE DE DATOS */
INSERT INTO clientes (nombre, apellido, email, direccion, telefono) 
VALUES 
('juan','Gonzales','juan@gmail.com','calle 45 #25-54','3187447874'),
('Laura ','Velasquez','lauraV@gmail.com','carrera 25 #30-24','3168568486'),
('Pedro','Ruiz','pedroR@gmail.com','calle 63 #85-12','3221185636'),
('Carlos','Perez','carlosP@gmail.com','tranv 36 #38-10','3169868754'),
('Alejandra','Martínez ','alejaM@gmail.com','carrera 45 #25-54','3185269845'),
('Alicia','Sanchez.','aliciaS@gmail.com','calle 33 #69-78','3201254639'),
('Luna','Jimenez','lunaJ@gmail.com','calle 58 #25-04','3226598745'),
('Lucía','Fernández','luciaF@gmail.com','carrera 20 #36-23','3215487963'),
('Arturo','Ramírez','arturoR@gmail.com','conj Flor verde apt 702 t 2','3236987452'),
('Ariel','Rodríguez ','arielR@gmail.com','carrera 52 #83-45','3256987546');



INSERT INTO productos (nombre,descripcion,precio,stock) 
VALUES 
('Base de Maquillaje Líquida (Tono Universal)','Base líquida de cobertura media a alta, con acabado mate y larga duración. Ideal para piel mixta a grasa',15000.00,15),
('Paleta de Sombras de Ojos (12 Colores)','Paleta con tonos neutros y brillantes, altamente pigmentados, perfecta para looks de día y de noche.',20000.00,20),
('Máscara de Pestañas a Prueba de Agua','Máscara resistente al agua que alarga y da volumen a las pestañas sin grumos.',10000.0,15),
('Labial Mate Líquido (Tono Rojo Intenso)','Labial de fórmula líquida con acabado mate, de larga duración y resistente al transfer.',12000.00,5),
('Iluminador en Polvo Compacto',' Iluminador suave con partículas reflectantes para un brillo natural. Disponible en tonos dorado y perla.',8000.00,10),
('Delineador Líquido de Ojos (Negro)','Delineador con punta de precisión para trazos finos y duraderos. Secado rápido. ',15000.00,10),
('Rubor Compacto (Tono Rosa Durazno)','Rubor de textura sedosa que se difumina fácilmente para un acabado natural.',9000.00,10),
('Corrector en Barra (Cobertura Total)','Corrector en barra de alta cobertura para ojeras e imperfecciones. Fórmula hidratante.',6000.00,10),
('Spray Fijador de Maquillaje',' Spray ligero para fijar el maquillaje y prolongar su duración por hasta 12 horas.',10000.00,4),
('Kit de Cejas (Cera, Polvo y Cepillo)','Kit completo para definir y rellenar cejas, incluye cera modeladora y polvo compacto.',15000.00,2);


INSERT INTO pedidos (id_cliente,fecha_pedido,total) 
VALUES 
(1,'2024-11-12',49000.00),
(2,'2024-11-01',37000.00),
(3,'2024-11-15',37000.00),
(4,'2024-11-22',40000.00),
(5,'2024-11-29',59000.00),
(6,'2024-11-18',50000.00),
(7,'2024-11-05',29000.00),
(8,'2024-11-10',42000.00),
(9,'2024-11-25',44000.00),
(10,'2024-11-20',43000.00);



INSERT INTO detalle_pedido (id_pedido,id_producto,cantidad,precio_unitario) 
VALUES 
(1,1,1,15000.00),
(1,3,1,10000.00),
(1,4,2,12000.00),
(2,2,1,20000.00),
(2,5,1,8000.00),
(2,7,1,9000.00),
(3,8,2,6000.00),
(3,9,1,10000.00),
(3,6,1,15000.00),
(4,10,1,15000.00),
(4,1,1,15000.00),
(4,3,1,10000.00),
(5,4,3,12000.00),
(5,5,1,8000.00),
(5,6,1,15000.00),
(6,2,1,20000.00),
(6,3,2,10000.00),
(6,9,1,10000.00),
(7,7,1,9000.00),
(7,8,2,6000.00),
(7,5,1,8000.00),
(8,10,1,15000.00),
(8,4,1,12000.00),
(8,6,1,15000.00),
(9,1,1,15000.00),
(9,9,1,10000.00),
(9,7,1,9000.00),
(9,3,1,10000.00),
(10,2,1,20000.00),
(10,10,1,15000.00),
(10,5,2,8000.00);
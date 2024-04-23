INSERT INTO cargos (descripcion, sueldo_base)
VALUES
('Vendedor', 1500000),
('Administrador', 3000000),
('Diseñador', 2500000),
('Costurero', 1000000),
('Almacenista', 800000);

INSERT INTO color (descripcion)
VALUES
('Negro'),
('Blanco'),
('Rojo'),
('Verde'),
('Azul'),
('Amarillo'),
('Rosa'),
('Morado'),
('Gris'),
('Beige');

INSERT INTO forma_pago (descripcion)
VALUES
('Efectivo'),
('Tarjeta de crédito'),
('Tarjeta de débito'),
('Transferencia bancaria'),
('Paypal');

INSERT INTO genero (descripcion)
VALUES
('Masculino'),
('Femenino'),
('Unisex');

INSERT INTO insumo (nombre, valor_unit, stock_min, stock_max)
VALUES
('Tela de algodón', 10000, 100, 1000),
('Tela de poliéster', 20000, 50, 500),
('Hilo', 5000, 20, 200),
('Botones', 2000, 10, 100),
('Cierres', 3000, 5, 50);

INSERT INTO pais (nombre)
VALUES
('Colombia'),
('México'),
('Estados Unidos'),
('España'),
('China'),
('Brasil'),
('Argentina'),
('India'),
('Francia'),
('Inglaterra');

INSERT INTO talla (descripcion)
VALUES
('XS - Extra pequeña'),
('S - Pequeña'),
('M - Mediana'),
('L - Grande'),
('XL - Extra grande'),
('XXL - Extra extra grande');

INSERT INTO tipo_estado (descripcion)
VALUES
('Nuevo'),
('En proceso'),
('Listo para enviar'),
('Enviado'),
('Entregado');

INSERT INTO tipo_persona (nombre)
VALUES
('Cliente'),
('Proveedor'),
('Empleado');

INSERT INTO tipo_proteccion (descripcion)
VALUES
('Protección contra el sol'),
('Protección contra el agua'),
('Protección contra el frío'),
('Protección contra el viento'),
('Protección contra los insectos');

INSERT INTO departamento (nombre, id_pais_fk)
VALUES
('Antioquia', 1),
('Bogotá', 1),
('Cundinamarca', 1),
('Valle del Cauca', 1),
('Buenos Aires', 2),
('Ciudad de México', 3),
('Miami', 4),
('Londres', 5),
('París', 6),
('Tokio', 7);

INSERT INTO municipio (nombre, id_departamento_fk)
VALUES
('Medellín', 1),
('Bogotá, D.C.', 2),
('Zipaquirá', 2),
('Cali', 4),
('Buenos Aires', 5),
('Ciudad de México', 6),
('Miami', 7),
('Londres', 8),
('París', 9),
('Tokio', 10);

INSERT INTO estado (descripcion, id_tipo_estado_fk)
VALUES
('Pendiente', 1),
('En proceso', 2),
('Listo para enviar', 3),
('Enviado', 4),
('Entregado', 5);

INSERT INTO cliente (nombre, id_tipo_persona_fk, fecha_registro, id_municipio_fk)
VALUES
('Juan Pérez', 1, '2023-07-20', 1),
('María López', 2, '2023-08-03', 2),
('Sofía García', 3, '2023-08-10', 3),
('Pedro Gómez', 1, '2023-08-17', 4),
('Ana Sánchez', 2, '2023-08-24', 5),
('Carlos Hernández', 3, '2023-08-31', 6),
('Luisa Rodríguez', 1, '2023-09-07', 7),
('Daniela Castillo', 2, '2023-09-14', 8),
('Andrés Morales', 3, '2023-09-21', 9),
('Camila Gutiérrez', 1, '2023-09-28', 10);

INSERT INTO empleado (nombre, id_cargo_fk, fecha_ingreso, id_municipio_fk)
VALUES
('Juan Pérez', 1, '2023-07-20', 1),
('María López', 2, '2023-08-03', 2),
('Sofía García', 3, '2023-08-10', 3),
('Pedro Gómez', 1, '2023-08-17', 4),
('Ana Sánchez', 2, '2023-08-24', 5),
('Carlos Hernández', 3, '2023-08-31', 6),
('Luisa Rodríguez', 1, '2023-09-07', 7),
('Daniela Castillo', 2, '2023-09-14', 8),
('Andrés Morales', 3, '2023-09-21', 9),
('Camila Gutiérrez', 1, '2023-09-28', 10);

INSERT INTO venta (fecha, id_empleado_fk, id_cliente_fk, id_forma_pago_fk)
VALUES
('2023-07-20', 1, 1, 1),
('2023-08-03', 2, 2, 2),
('2023-08-10', 3, 3, 3),
('2023-08-17', 1, 4, 1),
('2023-08-24', 2, 5, 2),
('2023-08-31', 3, 6, 3),
('2023-09-07', 1, 7, 1),
('2023-09-14', 2, 8, 2),
('2023-09-21', 3, 9, 3),
('2023-09-28', 1, 10, 1);

INSERT INTO prenda (nombre, valor_unit_cop, valor_unit_usd, id_estado_fk, id_tipo_proteccion, id_genero_fk, codigo)
VALUES
('Camiseta de algodón manga corta', 20000, 5, 1, 1, 1, 'PR001'),
('Camisa de manga larga', 30000, 7.5, 1, 1, 1, 'PR002'),
('Pantalón de mezclilla', 40000, 10, 1, 1, 1, 'PR003'),
('Vestido de algodón', 50000, 12.5, 1, 2, 1, 'PR004'),
('Zapatos casuales', 60000, 15, 1, 1, 1, 'PR005'),
('Gafas de sol', 10000, 2.5, 1, 1, 1, 'PR006'),
('Chaqueta de cuero', 150000, 37.5, 1, 1, 1, 'PR007'),
('Traje de baño', 50000, 12.5, 1, 1, 1, 'PR008'),
('Gorra', 10000, 2.5, 1, 1, 1, 'PR009'),
('Medias', 5000, 1.25, 1, 1, 1, 'PR010');

INSERT INTO inventario (cod_inv, id_prenda_fk, valor_vta_cop, valor_vta_usd)
VALUES
('INV001', 1, 25000, 6.25),
('INV002', 2, 37500, 9.375),
('INV003', 3, 50000, 12.5),
('INV004', 4, 62500, 15.625),
('INV005', 5, 75000, 18.75),
('INV006', 6, 12500, 3.125),
('INV007', 7, 187500, 46.875),
('INV008', 8, 62500, 15.625),
('INV009', 9, 12500, 3.125),
('INV010', 10, 5000, 1.25);

INSERT INTO detalle_venta (id_venta_fk, id_producto_fk, id_talla_fk, cantidad, valor_unit)
VALUES
(1, 1, 1, 2, 25000),
(2, 2, 2, 1, 37500),
(3, 3, 3, 3, 50000),
(4, 4, 4, 4, 62500),
(5, 5, 5, 5, 75000),
(6, 6, 6, 6, 12500);

INSERT INTO orden (fecha, id_empleado_fk, id_cliente_fk, id_estado_fk)
VALUES
('2023-07-20', 1, 1, 1),
('2023-08-03', 2, 2, 2),
('2023-08-10', 3, 3, 3),
('2023-08-17', 1, 4, 4),
('2023-08-24', 2, 5, 5);

INSERT INTO detalle_orden (id_orden_fk, id_prenda_fk, prenda_id, cantidad_producir, id_color_fk, cantidad_producida, id_estado_fk)
VALUES
(1, 1, 1, 10, 1, 5, 1),
(2, 2, 2, 5, 2, 3, 2),
(3, 3, 3, 3, 3, 3, 3),
(4, 4, 4, 2, 4, 2, 4),
(5, 5, 5, 1, 5, 1, 5);

INSERT INTO empresa (nit, razon_social, representante_legal, fecha_creacion, id_municipio_fk)
VALUES
('900000000-1', 'Empresa de Ropa S.A.S.', 'Juan Pérez', '2023-01-01', 1),
('900000000-2', 'Empresa de Calzado S.A.S.', 'María Rodríguez', '2023-02-02', 2),
('900000000-3', 'Empresa de Accesorios S.A.S.', 'Pedro Gómez', '2023-03-03', 3),
('900000000-4', 'Empresa de Textiles S.A.S.', 'Ana García', '2023-04-04', 4),
('900000000-5', 'Empresa de Confección S.A.S.', 'Carlos Hernández', '2023-05-05', 5);

INSERT INTO insumo_prenda (id_insumo_fk, id_prenda_fk, cantidad)
VALUES
(1, 1, 2),
(2, 2, 1),
(3, 3, 3),
(4, 4, 2),
(5, 5, 1),
(6, 6, 10),
(7, 7, 5),
(8, 8, 3),
(9, 9, 2),
(10, 10, 1);

INSERT INTO inventario_talla (id_inv_fk, id_talla_fk)
VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5);

INSERT INTO proveedor (nit_proveedor, nombre, id_tipo_persona, id_municipio_fk)
VALUES
('900000000-1', 'Proveedor 1', 1, 1),
('900000000-2', 'Proveedor 2', 2, 2),
('900000000-3', 'Proveedor 3', 3, 3),
('900000000-4', 'Proveedor 4', 1, 4),
('900000000-5', 'Proveedor 5', 2, 5);

INSERT INTO insumo_proveedor (id_insumo_fk, id_proveedor_fk)
VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5);

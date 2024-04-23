drop database if exists vizyon;

create database if not exists vizyon;

use vizyon;
-- Tabla: cargos
CREATE TABLE cargos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(100),
    sueldo_base DECIMAL(10, 2)
);

-- Tabla: color
CREATE TABLE color (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(100)
);

-- Tabla: forma_pago
CREATE TABLE forma_pago (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(100)
);

-- Tabla: genero
CREATE TABLE genero (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(100)
);

-- Tabla: insumo
CREATE TABLE insumo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    valor_unit DECIMAL(10, 2),
    stock_min INT,
    stock_max INT
);

-- Tabla: pais
CREATE TABLE pais (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100)
);

-- Tabla: talla
CREATE TABLE talla (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(100)
);

-- Tabla: tipo_estado
CREATE TABLE tipo_estado (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(100)
);

-- Tabla: tipo_persona
CREATE TABLE tipo_persona (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100)
);

-- Tabla: tipo_proteccion
CREATE TABLE tipo_proteccion (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(100)
);

-- Tabla: departamento
CREATE TABLE departamento (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    id_pais_fk INT,
    FOREIGN KEY (id_pais_fk) REFERENCES pais(id)
);

-- Tabla: municipio
CREATE TABLE municipio (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    id_departamento_fk INT,
    FOREIGN KEY (id_departamento_fk) REFERENCES departamento(id)
);

-- Tabla: estado
CREATE TABLE estado (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(100),
    id_tipo_estado_fk INT,
    FOREIGN KEY (id_tipo_estado_fk) REFERENCES tipo_estado(id)
);

-- Tabla: cliente
CREATE TABLE cliente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    id_tipo_persona_fk INT,
    fecha_registro DATE,
    id_municipio_fk INT,
    FOREIGN KEY (id_tipo_persona_fk) REFERENCES tipo_persona(id),
    FOREIGN KEY (id_municipio_fk) REFERENCES municipio(id)
);

-- Tabla: empleado
CREATE TABLE empleado (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    id_cargo_fk INT,
    fecha_ingreso DATE,
    id_municipio_fk INT,
    FOREIGN KEY (id_cargo_fk) REFERENCES cargos(id),
    FOREIGN KEY (id_municipio_fk) REFERENCES municipio(id)
);

-- Tabla: venta
CREATE TABLE venta (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE,
    id_empleado_fk INT,
    id_cliente_fk INT,
    id_forma_pago_fk INT,
    FOREIGN KEY (id_empleado_fk) REFERENCES empleado(id),
    FOREIGN KEY (id_cliente_fk) REFERENCES cliente(id),
    FOREIGN KEY (id_forma_pago_fk) REFERENCES forma_pago(id)
);

-- Tabla: prenda
CREATE TABLE prenda (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    valor_unit_cop DECIMAL(10, 2),
    valor_unit_usd DECIMAL(10, 2),
    id_estado_fk INT,
    id_tipo_proteccion INT,
    id_genero_fk INT,
    codigo VARCHAR(20),
    FOREIGN KEY (id_estado_fk) REFERENCES estado(id),
    FOREIGN KEY (id_tipo_proteccion) REFERENCES tipo_proteccion(id),
    FOREIGN KEY (id_genero_fk) REFERENCES genero(id)
);

-- Tabla: inventario
CREATE TABLE inventario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cod_inv VARCHAR(20),
    id_prenda_fk INT,
    valor_vta_cop DECIMAL(10, 2),
    valor_vta_usd DECIMAL(10, 2),
    FOREIGN KEY (id_prenda_fk) REFERENCES prenda(id)
);

-- Tabla: detalle_venta
CREATE TABLE detalle_venta (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_venta_fk INT,
    id_producto_fk INT,
    id_talla_fk INT,
    cantidad INT,
    valor_unit DECIMAL(10, 2),
    FOREIGN KEY (id_venta_fk) REFERENCES venta(id),
    FOREIGN KEY (id_producto_fk) REFERENCES prenda(id),
    FOREIGN KEY (id_talla_fk) REFERENCES talla(id)
);

-- Tabla: orden
CREATE TABLE orden (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE,
    id_empleado_fk INT,
    id_cliente_fk INT,
    id_estado_fk INT,
    FOREIGN KEY (id_empleado_fk) REFERENCES empleado(id),
    FOREIGN KEY (id_cliente_fk) REFERENCES cliente(id),
    FOREIGN KEY (id_estado_fk) REFERENCES tipo_estado(id)
);

-- Tabla: detalle_orden
CREATE TABLE detalle_orden (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_orden_fk INT,
    id_prenda_fk INT,
    prenda_id INT,
    cantidad_producir INT,
    id_color_fk INT,
    cantidad_producida INT,
    id_estado_fk INT,
    FOREIGN KEY (id_orden_fk) REFERENCES orden(id),
    FOREIGN KEY (id_prenda_fk) REFERENCES prenda(id),
    FOREIGN KEY (prenda_id) REFERENCES prenda(id),
    FOREIGN KEY (id_color_fk) REFERENCES color(id),
    FOREIGN KEY (id_estado_fk) REFERENCES estado(id)
);

-- Tabla: empresa
CREATE TABLE empresa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nit VARCHAR(20),
    razon_social VARCHAR(100),
    representante_legal VARCHAR(100),
    fecha_creacion DATE,
    id_municipio_fk INT,
    FOREIGN KEY (id_municipio_fk) REFERENCES municipio(id)
);

-- Tabla: insumo_prenda
CREATE TABLE insumo_prenda (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_insumo_fk INT,
    id_prenda_fk INT,
    cantidad INT,
    FOREIGN KEY (id_insumo_fk) REFERENCES insumo(id),
    FOREIGN KEY (id_prenda_fk) REFERENCES prenda(id)
);

-- Tabla: inventario_talla
CREATE TABLE inventario_talla (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_inv_fk INT,
    id_talla_fk INT,
    FOREIGN KEY (id_inv_fk) REFERENCES inventario(id),
    FOREIGN KEY (id_talla_fk) REFERENCES talla(id)
);

-- Tabla: proveedor
CREATE TABLE proveedor (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nit_proveedor VARCHAR(20),
    nombre VARCHAR(100),
    id_tipo_persona INT,
    id_municipio_fk INT,
    FOREIGN KEY (id_tipo_persona) REFERENCES tipo_persona(id),
    FOREIGN KEY (id_municipio_fk) REFERENCES municipio(id)
);

-- Tabla: insumo_proveedor
CREATE TABLE insumo_proveedor (
    id_insumo_fk INT,
    id_proveedor_fk INT,
    FOREIGN KEY (id_insumo_fk) REFERENCES insumo(id),
    FOREIGN KEY (id_proveedor_fk) REFERENCES proveedor(id)
);

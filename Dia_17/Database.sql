use bqsygfmwlyeealq5c3fz;

create table Cliente (
id_cliente int primary key not null auto_increment,
nombre varchar(100) not null,
tipo text
);
create table Producto (
id_producto int primary key not null auto_increment,
nombre varchar(100) not null,
precio decimal(10,2) not null
);
create table Factura_cliente (
id_FaCli int primary key not null auto_increment,
id_cliente int not null,
total decimal (10,2),
foreign key(id_cliente)references Cliente(id_cliente)
);
create table Factura_producto (
id_factura int not null,
foreign key(id_factura)references Factura_cliente (id_FaCli),
id_producto int not null,
foreign key(id_producto)references Producto(id_producto),
cantidad int
);
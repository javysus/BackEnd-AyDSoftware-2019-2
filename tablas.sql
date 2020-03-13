-- Escrito en PostgreSQL

CREATE USER proyectuser WITH
    LOGIN
    SUPERUSER
    INHERIT
    CREATEDB
    CREATEROLE
    REPLICATION; -- ejecutar solo

alter user proyectuser with password 'qwerty123'; -- ejecutar solo

CREATE DATABASE asistencias; -- ejecutar solo

create table public.usuario(
    id_usuario serial not null,
    nombre varchar(100) not null,
    password varchar(100) not null,
    primary key (id_usuario)
);

create table public.admin(
    id_admin serial not null,
    nombre varchar(100) not null,
    password varchar(100) not null,
    primary key (id_admin)
);

create table public.tecnico(
    id_tecnico serial not null,
    nombre varchar(100) not null,
    password varchar(100) not null,
    especialidad int not null,
    primary key (id_tecnico)
    
);

create table public.solicitud(
    id_solicitud serial not null,
    id_usuario int not null,
    id_tecnico int,
    monto int default 0,
    direccion varchar(100),
    latitud numeric,
    longitud numeric,
    aceptada_cli int default 0,
    aceptada_tec int default 0,
    aceptada_adm int default 0,
    primary key (id_solicitud),
    foreign key (id_usuario) references usuario(id_usuario),
    foreign key (id_tecnico) references tecnico(id_tecnico)
);


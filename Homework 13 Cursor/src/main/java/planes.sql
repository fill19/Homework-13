CREATE DATABASE IF not EXISTS jdbc;
USE jdbc;
CREATE TABLE planes
(
    model              varchar(25),
    serial_number_name TEXT,
    seats_name         INT,
    id                 serial primary key,
    airportid          integer references airport (id)
);


CREATE TABLE pilots
(
    pilots_name TEXT    NOT NULL,
    age         TINYINT NOT NULL,
    models      varchar(3)    NOT NULL,
    id          serial primary key,
    airportid   integer references airport (id)
);


CREATE TABLE airport
(
    id     serial primary key,
    models TEXT       NOT NULL,
    part   varchar(5) NOT NULL
)

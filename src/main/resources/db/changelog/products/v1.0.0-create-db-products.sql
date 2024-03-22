--liquibase formatted sql

-- changeset bohdan_taran:1711121614139-1
CREATE TABLE IF NOT EXISTS products (
    id BIGSERIAL PRIMARY KEY,
    scu TEXT NOT NULL UNIQUE,
    name TEXT NOT NULL,
    number_of_reviews INTEGER NOT NULL,
    price DOUBLE PRECISION NOT NULL,
    discount DECIMAL,
    rating INTEGER NOT NULL,
    quantity_in_stock BIGINT NOT NULL,
    short_description TEXT NOT NULL,
    images JSON NOT NULL,
    name_of_subblock TEXT NOT NULL,
    long_description TEXT NOT NULL
);
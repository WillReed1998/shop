--liquibase formatted sql

-- changeset bohdan_taran:1711121614131-1
CREATE TYPE product_categories AS ENUM ('history');

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
    overview TEXT NOT NULL,
    images JSON NOT NULL,
    headline TEXT NOT NULL,
    description TEXT NOT NULL,
    year_of_issue INTEGER NOT NULL,
    country_of_issue TEXT NOT NULL,
    series TEXT NOT NULL,
    category product_categories NOT NULL
);
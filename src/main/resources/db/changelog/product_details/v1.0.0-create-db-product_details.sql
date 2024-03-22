--liquibase formatted sql

-- changeset bohdan_taran:1711121584674-1
CREATE TABLE IF NOT EXISTS product_details (
   id BIGSERIAL PRIMARY KEY REFERENCES products (id),
   year_of_issue INTEGER NOT NULL,
   country_of_issue TEXT NOT NULL,
   series TEXT NOT NULL
);
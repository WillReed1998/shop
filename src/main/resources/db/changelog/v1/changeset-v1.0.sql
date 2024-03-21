CREATE TABLE IF NOT EXISTS categories (
    id BIGSERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    img TEXT
);

CREATE TABLE IF NOT EXISTS product_details (
    id BIGSERIAL PRIMARY KEY,
    year_of_issue INTEGER NOT NULL,
    country_of_issue TEXT NOT NULL,
    series TEXT NOT NULL,
    category_id INTEGER NOT NULL,

    CONSTRAINT category_id_fk FOREIGN KEY (category_id) REFERENCES categories (id)
);

CREATE TABLE IF NOT EXISTS products (
    id BIGSERIAL PRIMARY KEY REFERENCES product_details (id),
    scu TEXT NOT NULL UNIQUE,
    name TEXT NOT NULL,
    number_of_reviews INTEGER NOT NULL,
    price DECIMAL NOT NULL,
    discount DECIMAL,
    rating INTEGER NOT NULL,
    quantity_in_stock BIGINT NOT NULL,
    short_description TEXT NOT NULL,
    images JSON NOT NULL,
    name_of_subblock TEXT NOT NULL,
    long_description TEXT NOT NULL
);
CREATE TABLE IF NOT EXISTS persons (
    id IDENTITY PRIMARY KEY,
    name VARCHAR(255),
    age INT,
    country VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS sales (
    id IDENTITY PRIMARY KEY,
    person_id BIGINT,
    sale_date DATE,
    amount DECIMAL(10, 2),
    description VARCHAR(255),
    FOREIGN KEY (person_id) REFERENCES persons(id)
);
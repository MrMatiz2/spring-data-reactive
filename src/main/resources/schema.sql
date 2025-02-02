create table Ingredient(
    id IDENTITY,
    slug varchar(4) not null,
    name varchar(25) not null,
    type varchar(10) not null
);

create table Taco(
    id IDENTITY,
    name varchar(50) not null,
    ingredients_ids INTEGER ARRAY
);

create table Taco_Order(
    id IDENTITY,
    delivery_name varchar(50) not null,
    delivery_street varchar(50) not null,
    delivery_city varchar(50) not null,
    delivery_state varchar(2) not null,
    delivery_zip varchar(10) not null,
    cc_number varchar(16) not null,
    cc_expiration varchar(5) not null,
    cc_cvv varchar(3) not null,
    taco_ids INTEGER ARRAY
);


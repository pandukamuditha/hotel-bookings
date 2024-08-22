CREATE TABLE "property" (
    id serial primary key,
    owner_id serial not null,
    property_type varchar(255) not null,
    capacity integer not null,
    created_at timestamp not null default current_timestamp,
    updated_at timestamp not null default current_timestamp
);

ALTER TABLE property
ADD CONSTRAINT fk_property_owner
FOREIGN KEY (owner_id) REFERENCES "owner" (id);

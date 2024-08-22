CREATE TABLE "guest" (
    id serial primary key,
    user_id serial not null,
    created_at timestamp not null default current_timestamp,
    updated_at timestamp not null default current_timestamp
);

ALTER TABLE guest
ADD CONSTRAINT fk_guest_user
FOREIGN KEY (user_id) REFERENCES "user" (id);

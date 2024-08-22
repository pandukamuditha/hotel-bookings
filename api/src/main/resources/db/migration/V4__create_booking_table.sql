CREATE TABLE "booking" (
    id serial primary key,
    booking_start timestamp not null,
    booking_end timestamp not null,
    property_id serial not null,
    guest_id serial not null,
    created_at timestamp not null default current_timestamp,
    updated_at timestamp not null default current_timestamp
);

ALTER TABLE booking
ADD CONSTRAINT fk_booking_property
FOREIGN KEY (property_id) REFERENCES "property" (id);

ALTER TABLE booking
ADD CONSTRAINT fk_booking_guest
FOREIGN KEY (guest_id) REFERENCES "guest" (id);

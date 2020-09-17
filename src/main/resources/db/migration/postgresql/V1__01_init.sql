create table users (
    id  bigserial not null,
    email varchar(255) not null,
    enabled boolean, first_name varchar(255),
    last_name varchar(255),
    locked boolean,
    password varchar(255),
    user_role int4,
    primary key (id));

alter table users add constraint UK_ob8kqyqqgmefl0aco34akdtpe unique (email);
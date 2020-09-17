create table users (
    id  bigserial not null,
    email varchar(255) not null,
    enabled boolean, first_name varchar(255),
    last_name varchar(255),
    locked boolean,
    password varchar(255),
    user_role int4,
    primary key (id));


create table persistent_logins(
	username varchar(50) not null,
	series varchar(64) primary key,
	token varchar(64) not null,
	last_used timestamp not null
);

alter table users add constraint UK_ob8kqyqqgmefl0aco34akdtpe unique (email);
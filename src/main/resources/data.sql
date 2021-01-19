drop table if exists car_entity CASCADE;
create table car_entity (id bigint not null, engine varchar(255), name varchar(255), primary key (id));

insert into car_entity (engine, name, id) values
 ('Ferrari', 'Alfa Romeo Racing C39', 1),
 ('Honda', 'AlphaTauri AT01', 2),
 ('Ferrari', 'Ferrari SF1000', 3),
 ('Ferrari', 'Haas VF-20', 4),
 ('Renault', 'McLaren MCL35', 5),
 ('Mercedes', 'Mercedes W11', 6),
 ('Mercedes', 'Racing point RP20', 7),
 ('Honda', 'Red Bull RB16', 8),
 ('Renault', 'Renault R.S.20', 9),
 ('Mercedes', 'Williams FW43', 10);
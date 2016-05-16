drop table if exists card;
drop table if exists deck;

create table deck (
  id integer identity primary key,
  name varchar(25) not null
);

create table card (
  id integer identity primary key,
  code varchar(10) not null,
  descr varchar(100),
  deck_id integer,
  foreign key (deck_id) references deck(id) 
);
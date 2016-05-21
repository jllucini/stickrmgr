drop table if exists userdata;
drop table if exists card;
drop table if exists deck;

create table userdata (
  id integer identity primary key,
  username varchar(25) not null unique,
  password varchar(25) not null
);

create table deck (
  id integer identity primary key,
  name varchar(25) not null,
  user_id integer,
  foreign key (user_id) references userdata(id) 
);

create table card (
  id integer identity primary key,
  code varchar(10) not null,
  descr varchar(100),
  num_cards integer,
  deck_id integer,
  foreign key (deck_id) references deck(id) 
);
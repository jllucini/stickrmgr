drop table if exists userdata;
drop table if exists card;
drop table if exists deck;

create table userdata (
  username varchar(25) primary key,
  password varchar(25) not null
);

create table deck (
  id long identity primary key,
  name varchar(25) not null,
  user_id varchar(25)∫∫,
  foreign key (user_id) references userdata(username) 
);

create table card (
  id long identity primary key,
  code varchar(10) not null,
  descr varchar(100),
  num_cards integer,
  deck_id long,
  foreign key (deck_id) references deck(id) 
);
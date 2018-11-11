drop table if exists offers;
drop table if exists drinks;
drop table if exists parlour;
drop table if exists drinkType;

create table drinkType(
	typeId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	typeName text
);

create table drinks(
	drinksId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	drinkName varchar(100) NOT NULL,
	drinkType int,
	description varchar(255),
	FOREIGN KEY (drinkType) REFERENCES drinkType(typeId)
);

create table parlour(
	parlourId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	parlourName varchar(100) NOT NULL,
	address varchar(255)
);

create table offers(
	id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	parlourId int,
	drinkId int,
	price int,
	mLiters int,
	FOREIGN KEY (parlourId) REFERENCES parlour(parlourId),
	FOREIGN KEY (drinkId) REFERENCES drink(drinkId)
);

insert into drinkType (typeName) values ('Whiskey');
insert into drinks (drinkName, drinkType, description) values ('Johnny Walker Red Label',1,'Much good, wow!');
insert into drinks (drinkName, drinkType, description) values ('Bobos clown  fancy whiskey',1,'For black tie events only!');
insert into drinks (drinkName, drinkType, description) values ('Marlon brandos white cat whiskey',1,'It offers a taste no one can refuse');

insert into parlour (parlourName, address) values ('Bobos whiskey tent','Bobos tent');
insert into parlour (parlourName, address) values ('Eftirpartyid','Dufnaholar 10');

insert into offers (parlourId, drinkId, price, mLiters) values (1, 1, 2000, 200);
insert into offers (parlourId, drinkId, price, mLiters) values (1, 2, 3000, 200);
insert into offers (parlourId, drinkId, price, mLiters) values (2, 2, 4000, 200);
insert into offers (parlourId, drinkId, price, mLiters) values (2, 3, 5000, 200);

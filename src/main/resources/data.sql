create table if not EXISTS contrader.gomme(
  id_gomme int(20) NOT NULL AUTO_INCREMENT,
  model varchar(50),
  manufacturer varchar(50),
  price float,
  PRIMARY KEY (id_gomme)
);


insert into contrader.gomme (model, manufacturer, price)
values ('Trelleborg-B50','Trelleborg',200.50);
insert into contrader.gomme (model, manufacturer, price)
values ('Trelleborg-B60','Trelleborg',100.50);
insert into contrader.gomme (model, manufacturer, price)
values ('Trelleborg-B70','Trelleborg',300.50);
insert into contrader.gomme (model, manufacturer, price)
values ('Pirelli Hard','Pirelli',50.50);
insert into contrader.gomme (model, manufacturer, price)
values ('Pirelli Soft','Pirelli',150.50);
insert into contrader.gomme (model, manufacturer, price)
values ('Pirelli Ultra-Soft','Pirelli',134.50);

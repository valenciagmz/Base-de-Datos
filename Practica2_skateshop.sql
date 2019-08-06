
create schema skateshop;

use skateshop;

create table Productos (
	idItem varchar(255) primary key not null,
    nombreItem varchar(255),
    precioItem decimal(15),
    existenciaItem int(15),
    fecha varchar(255)
);

insert into Productos values("1","Skate",500.0,"15","10/02/19");
insert into Productos values("2","Ruedas",325.0,"35","02/03/19");
insert into Productos values("3","Calcomanía",5.0,"850","11/03/19");
insert into Productos values("4","Mochila",550.5,"20","14/04/19");
insert into Productos values("5","Playera",170.5,"120","18/04/19");
insert into Productos values("6","Liga",10.0,"350","25/05/19");
insert into Productos values("7","Tennis",1250.5,"60","12/06/19");
insert into Productos values("8","Trucks",430.0,"35","30/06/19");
insert into Productos values("9","Tornillos",50.0,"400","06/07/19");
insert into Productos values("10","Baleros",68.5,"250","10/07/19");


select * from Productos;

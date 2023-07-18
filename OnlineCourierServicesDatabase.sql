Create Database onlinecourierservices ;

USE onlinecourierservices ;


create table user_register(
uname varchar(40) not null,
ucontact bigint not null,
ucountry varchar(20) not null,
ustate varchar(20) null,
ucity varchar(20)  null,
uusername varchar(50) not null ,
upassword varchar(30) not null ,
constraint u1 unique(ucontact) 
);





create table shipment_detail(
uusername varchar(20) not null,
paddress varchar(100) not null,
pcountry varchar(20) not null ,
ppincode bigint,
daddress varchar(100) not null,
dcountry varchar(20) not null ,
dpincode bigint,
height double ,
width double ,
weight double ,
ordertype varchar(30) not null,
Datetime varchar(50) not null 
);

Alter table shipment_detail 
add column orderid int4 not null auto_increment primary key;

Alter table shipment_detail 
add  foreign key (uusername) 
references user_register(uusername);

Alter table shipment_detail 
add column orderStatus varchar(20) not null ;


drop database tutorial;
create database if not exists tutorial;

use tutorial;

create table if not exists driver(
	name varchar(100) not null,
	phone_number varchar(15) not null,
    vehicle_type varchar(50) not null,
    number_plate varchar(50) not null,
	driver_id varchar(20) null,
    primary key (name)
) engine innodb;

create table if not exists client (
    name varchar(100) not null,
    phone_number varchar(15) not null,
    payinfo_reference varchar(20) not null,
	passenger_id varchar(20) null,
    primary key(name)
) engine innodb;

create table if not exists bookings (
    ref_id int not null auto_increment,
    dname varchar(100) not null,
    cname varchar(100) not null,
    status varchar(15) not null,
    primary key(ref_id),
    foreign key (dname) references driver(name),
    foreign key (cname) references client(name)
)engine innodb;

insert into driver values('tiger nixon','0208007001','car','CAS 234', 'D0072');
insert into driver values('Lucas Thiyago','0208007002','van','KNW 456','D0053');
insert into driver values('Woo Jin','0208007003','car','HGY 423','D0027');
insert into driver values('Airi Satou','0208007004','car','KAW 467','D0013');
insert into driver values('Brielle Williamson','0208007005','car','KNX 564','D0009');

insert into client values('James Easton','0205007001','c200','p0064');
insert into client values('Ryan Martin','0205007002','c201','p0052');
insert into client values('Zofia Cox','0205007003','c202','p0048');	
insert into client values('Kelly Carter','0205007004','c203','p0037');	
insert into client values('Xing Wu','0205007005','c203','p0022');

    
    
 

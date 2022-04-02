drop table if exists 'department';
create table 'department'(
id int(11) not null auto_increment,
name varchar(255) default null
primary key (id)
)engine=innodb auto_increment=1 default charset=utf8;
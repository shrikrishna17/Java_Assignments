use HR;

select *from sys.tables;

exec sp_help Employee;

create table Employee1(
empId int identity(1,1) primary key,
name varchar(20),
phone varchar(20),
email varchar(20),
address varchar(20),
qualification varchar(20),
experience varchar(20),
joiningDate varchar(20),
employmentStatus varchar(20),
contractEnddate varchar(20),
PFAccountNumber varchar(20)
);

set IDENTITY_INSERT Employee1 ON;

select *from Employee1;

update Employee1 set employmentStatus='Employee' where empId=1;

select *from sys.tables;

exec sp_help HR;


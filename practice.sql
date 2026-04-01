create table student(
stu_id int primary key,
name varchar(50),
age int,mark int
);

INSERT INTO Student(stu_id,name,age,mark)values
(101, 'Arun', 19, 85),
(102, 'Bala', 18, 72),
(103, 'Charan', 20, 91),
(104, 'Dinesh', 17, 65),
(105, 'Ezhil', 18, 88);

SELECT * FROM Student where mark >70;

update Student set mark =80
where name='Bala';

delete from Student 
where name='Dinesh';

select * from Student;

create table employees(
emp_id int primary key,
emp_name varchar(50) not null,
role varchar(50) not null,salary decimal(10,2)
);
select * from employees;

insert into employees (emp_id, emp_name, role, salary) values
(201, 'Ravi', 'Manager', 50000),
(202, 'Kumar', 'Developer', 30000),
(203, 'Siva', 'Tester', 25000),
(204, 'Mani', 'Clerk', 15000),
(205, 'Raj', 'HR', 20000);

select * from employees where salary > 25000;

update employees
set salary = 35000
where emp_name = 'Kumar';

delete from employees
where emp_name='Mani';

select * from employees;

create table products(
product_id int primary key,product_name varchar(100) not null,
price decimal(10,2)check (price > 0),stock int check(stock>=0)
);
insert into products (product_id, product_name, price, stock)values
(301, 'Pen', 10, 100),
(302, 'Book', 50, 200),
(303, 'Bag', 500, 50),
(304, 'Bottle', 150, 0),
(305, 'Box', 80, 20);
 select * from products where stock=0;

update products set price =550 where product_name='Bag';
select * from products;

delete from products where product_name='Pen';

select *from products
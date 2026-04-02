SELECT * FROM ORDERS
SELECT * FROM  CUSTOMERS
CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id INT NOT NULL,
    amount DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);
select * from orders;
select * from customers;


INSERT INTO customers (customer_id, customer_name, city) VALUES
(101, 'Vijay', 'Chennai'),
(102, 'Divya Raj', 'Bangalore'),
(103, 'Karthik S', 'Hyderabad'),
(104, 'Meena R', 'Coimbatore'),
(105, 'Suresh P', 'Mumbai'),
(106, 'Anitha L', 'Delhi'),
(107, 'Vignesh T', 'Pune'),
(108, 'Priya M', 'Kolkata'),
(109, 'Rahul N', 'Madurai'),
(110, 'Sneha K', 'Trichy');

INSERT INTO orders (order_id, customer_id, amount) VALUES
(201, 101, 7500.00),
(202, 102, 3200.00),
(203, 103, 9800.00),
(204, 104, 4500.00),
(205, 105, 12000.00),
(206, 106, 6000.00),
(207, 107, 2500.00),
(208, 108, 8300.00),
(209, 109, 1500.00),
(210, 110, 5400.00);

select o.order_id,c.customer_name,c.city,o.amount
from orders o
inner join customers c
on o.customer_id = c.customer_id where o.amount > 5000;

CREATE TABLE departments (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(100) NOT NULL
);
drop table employees
create table employees (
emp_id int primary key,emp_name varchar(100)not null,
dept_id int,salary decimal(10,2) not null,
foreign key (dept_id) references departments(dept_id)
);

insert into departments(
dept_id,dept_name) values
(1, 'HR'),
(2, 'Finance'),
(3, 'IT'),
(4, 'Marketing'),
(5, 'Sales');

insert into employees(emp_id, emp_name, dept_id, salary) VALUES
(101, 'Arun', 1, 30000),
(102, 'Divya', 3, 55000),
(103, 'Karthik', 2, 45000),
(104, 'Meena', 4, 40000),
(105, 'Suresh', 3, 70000),
(106, 'Anitha', 5, 35000);

select * from employees

select * from departments

select e.emp_id, d.dept_name,e.salary
from employees e inner join departments d
on e.dept_id=d.dept_id where e.salary> 30000 and d.dept_name='HR';

update employees set salary=40000 where emp_id=101

select * from orders where amount>(select avg(amount) from orders);
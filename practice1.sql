create table orders(order_id int primary key,
customer_name varchar(50) not null,product_name varchar(50)not null,
quantity int check (quantity>0),status varchar(25) default 'placed');
select * from orders;

insert into orders values
(401, 'Arun', 'Laptop', 1, 'Placed'),
(402, 'Bala', 'Mobile', 2, 'Placed'),
(403, 'Charan', 'Tablet', 1, 'Placed'),
(404, 'Dinesh', 'Mouse', 3, 'Placed'),
(405, 'Ezhil', 'Keyboard', 1, 'Placed');

select * from orders
where  status = 'Placed';

update orders set status = 'Shipped'
where customer_name = 'Bala';

delete from orders where customer_name='Bala'

delete from orders where customer_name='Dinesh'

select * from orders

create table patients(patient_id int primary key,
patient_name varchar(50)not null,age int, disease varchar(100)not null,
phone varchar(15)unique )

insert into patients values
(501, 'Kumar', 45, 'Fever', '9876543210'),
(502, 'Ravi', 30, 'Cold', '9876543211'),
(503, 'Siva', 60, 'Diabetes', '9876543212'),
(504, 'Mani', 25, 'Headache', '9876543213'),
(505, 'Raj', 50, 'BP', '9876543214');

select *from patients where age>40

update patients
set disease = 'Migraine'
where patient_name = 'Mani';

delete from patients where patient_name='Ravi'
select * from patients

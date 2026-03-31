CREATE TABLE Student_details(id INT PRIMARY KEY ,
name VARCHAR(50),age INT ,date_of_birth DATE);

insert into Student_details(id,name,age,date_of_birth)
values(1, 'Arun', 20, '2005-06-10'),(2, 'Priya', 22, '2003-02-15')

select * from Student_details;
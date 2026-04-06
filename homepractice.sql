create table department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50) not null,
    location VARCHAR(50) not null
);
create table employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50) NOT NULL,
    age INT,
    salary DECIMAL(10,2),
    dept_id INT,
    job_role VARCHAR(50),
    FOREIGN KEY (dept_id) REFERENCES department(dept_id)
);
INSERT INTO department VALUES
(10, 'HR', 'Chennai'),
(20, 'IT', 'Madurai'),
(30, 'Finance', 'Trichy'),
(40, 'Sales', 'Coimbatore');

INSERT INTO employee VALUES
(101, 'Arun', 23, 25000, 20, 'Developer'),
(102, 'Bala', 30, 40000, 10, 'Recruiter'),
(103, 'Charan', 27, 35000, 20, 'Tester'),
(104, 'Divya', 35, 50000, 30, 'Accountant'),
(105, 'Eswar', 29, 28000, 40, 'Sales Executive'),
(106, 'Farhana', 26, 32000, 20, 'Developer'),
(107, 'Gokul', 31, 45000, 30, 'Analyst'),
(108, 'Hari', 24, 22000, 10, 'Assistant');

select e.emp_name,d.dept_name from employee e join department d 
on e.dept_id=d.dept_id

select e.emp_name, e.salary, d.location
FROM employee e JOIN department d
ON e.dept_id = d.dept_id

select e.emp_name
FROM employee e JOIN department d
on e.dept_id = d.dept_id
WHERE d.dept_name = 'IT';

select e.emp_name
FROM employee e
JOIN department d
ON e.dept_id = d.dept_id
WHERE d.location = 'Chennai'

select e.emp_name, e.salary, d.dept_name
from employee e join department d on e.dept_id = d.dept_id
where e.salary > 30000

select d.dept_name, count(e.emp_id) AS total_employees
FROM department d join employee e
ON d.dept_id = e.dept_id group by d.dept_name;

select d.dept_name, COUNT(e.emp_id) AS total_employees
FROM department d join employee e on d.dept_id = e.dept_id
GROUP BY d.dept_name having count(e.emp_id) > 1;


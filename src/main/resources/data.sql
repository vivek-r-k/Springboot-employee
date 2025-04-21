CREATE TABLE employee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    department VARCHAR(255),
    salary DOUBLE
);

INSERT INTO employee (name, department, salary) VALUES ('Alice', 'HR', 50000);
INSERT INTO employee (name, department, salary) VALUES ('Bob', 'IT', 60000);
-- Initializing database
CREATE TABLE Employees (
    EmployeeID   NUMBER PRIMARY KEY,
    Name         VARCHAR2(50),
    Department   VARCHAR2(50),
    Salary       NUMBER(10,2)
);

-- Inserting Sample Records
INSERT INTO Employees VALUES (101, 'John',     'HR',       50000);
INSERT INTO Employees VALUES (102, 'Meena',    'Finance',  60000);
INSERT INTO Employees VALUES (103, 'Rahul',    'IT',       75000);
INSERT INTO Employees VALUES (104, 'Priya',    'HR',       52000);
INSERT INTO Employees VALUES (105, 'Suresh',   'IT',       70000);
INSERT INTO Employees VALUES (106, 'Anita',    'Finance',  58000);
INSERT INTO Employees VALUES (107, 'Kiran',    'IT',       72000);

COMMIT;

-- PL/SQL Procedure
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (dept IN VARCHAR2, bonus IN NUMBER)
	IS
		i NUMBER := 101;
        name VARCHAR2(50);
        d VARCHAR2(50);
        sal NUMBER(10,2);
        b NUMBER := bonus/100;
    BEGIN
    	LOOP
    		SELECT Name,Department,Salary INTO name,d,sal FROM Employees WHERE EmployeeID=i;
            If(dept = d)THEN
            	UPDATE Employees SET Salary = Salary + (Salary * b) WHERE EmployeeID=i;
            	sal := sal + (sal*b);
        		dbms_output.put_line('EMPLOYEE NAME: ' || name || ',');
        		dbms_output.put_line('We have added a bonus of ' || bonus || '% to your current salary. Your new salary is ' || sal);
        	END IF;
            i := i+1;
        	exit when i>107;
    	END LOOP;
    	COMMIT;
    END;
/

--PL/SQL main
EXECUTE UpdateEmployeeBonus('IT',10);

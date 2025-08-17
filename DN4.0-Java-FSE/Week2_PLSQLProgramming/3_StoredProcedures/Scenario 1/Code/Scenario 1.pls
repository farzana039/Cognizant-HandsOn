-- Initializing database
CREATE TABLE CustomerLoans (
    CustomerID      NUMBER PRIMARY KEY,
    Name            VARCHAR2(50),
    Age             NUMBER,
    Balance         NUMBER(10,2),
    IsVIP           CHAR(1) DEFAULT 'F',        -- 'T' or 'F'
    InterestRate    NUMBER(5,2),
    DueDate         DATE
);

-- Inserting Sample Records
INSERT INTO CustomerLoans VALUES (1, 'Alice',   65, 15000.00, 'N', 7.5, SYSDATE + 20);
INSERT INTO CustomerLoans VALUES (2, 'Bob',     45, 8000.00,  'N', 8.0, SYSDATE + 40);
INSERT INTO CustomerLoans VALUES (3, 'Charlie', 70, 12000.00, 'N', 7.0, SYSDATE + 15);
INSERT INTO CustomerLoans VALUES (4, 'Diana',   30, 5000.00,  'N', 9.0, SYSDATE + 5);
INSERT INTO CustomerLoans VALUES (5, 'Edward',  61, 11000.00, 'N', 8.5, SYSDATE + 50);

COMMIT;

-- PL/SQL Procedure
CREATE PROCEDURE ProcessMonthlyInterest
	IS
		i NUMBER := 1;
        name VARCHAR2(50);
        bal NUMBER(10,2);
    BEGIN
    	LOOP
    		SELECT Name,Balance INTO name,bal FROM CustomerLoans WHERE CustomerID=i;
            UPDATE CustomerLoans SET Balance = Balance + (Balance * 0.01) WHERE CustomerID=i;
            bal := bal + (bal*0.01);
        	dbms_output.put_line('Dear ' || name || ',');
        	dbms_output.put_line('1% Interest Rate is applied to your current balance. Your new balance is ' || bal);
        	i := i+1;
        	exit when i>5;
    	END LOOP;
    	COMMIT;
    END;
/

--PL/SQL main
EXECUTE ProcessMonthlyInterest;

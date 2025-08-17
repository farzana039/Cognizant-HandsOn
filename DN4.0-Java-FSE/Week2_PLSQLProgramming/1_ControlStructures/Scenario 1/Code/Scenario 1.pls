-- Initializing database
CREATE TABLE CustomerLoans (
    CustomerID      NUMBER PRIMARY KEY,
    Name            VARCHAR2(50),
    Age             NUMBER,
    Balance         NUMBER(10,2),
    IsVIP           CHAR(1) DEFAULT 'N',        -- 'Y' or 'N'
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

--PL/SQL Program
DECLARE
	i NUMBER := 1;
	name VARCHAR2(50);
    age NUMBER;
    ir NUMBER(5,2);
BEGIN
	LOOP
    	SELECT Name,Age,InterestRate INTO name,age,ir FROM CustomerLoans WHERE CustomerID=i;
        if(age > 60) then
        	UPDATE CustomerLoans SET InterestRate = InterestRate - 1 WHERE CustomerID=i;
            ir := ir-1;
        	dbms_output.put_line('CUSTOMER DETAILS:');
        	dbms_output.put_line('NAME:' || name);
        	dbms_output.put_line('AGE:' || age); 
        	dbms_output.put_line('INTEREST RATE:' || ir); 
        END IF;
        i := i+1;
        exit when i>5;
    END LOOP;
    COMMIT;
END;

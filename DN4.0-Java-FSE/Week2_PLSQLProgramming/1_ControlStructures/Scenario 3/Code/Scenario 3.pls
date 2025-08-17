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

--PL/SQL Program
DECLARE
	i NUMBER := 1;
	name VARCHAR2(50);
    due DATE;
    today DATE;
BEGIN
	today := SYSDATE;
	LOOP
    	SELECT Name,DueDate INTO name,due FROM CustomerLoans WHERE CustomerID=i;
        IF(due - today < 30) then
        	dbms_output.put_line('CUSTOMER DETAILS:');
        	dbms_output.put_line('NAME:' || name);
        	dbms_output.put_line('Dear ' || name || ', Your due date is on ' || due || '. This is a reminder message sent to remind you that your due date is less than 30 days.'); 
        END IF;
        i := i+1;
        exit when i>5;
    END LOOP;
    COMMIT;
END;

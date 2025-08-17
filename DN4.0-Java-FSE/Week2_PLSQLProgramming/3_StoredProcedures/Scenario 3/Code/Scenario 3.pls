-- Initializing database
CREATE TABLE Accounts (
    AccountID     NUMBER PRIMARY KEY,
    CustomerName  VARCHAR2(50),
    Balance       NUMBER(10,2)
);

-- Inserting Sample Records
INSERT INTO Accounts VALUES (201, 'Alice',   10000.00);
INSERT INTO Accounts VALUES (202, 'Bob',      8000.00);
INSERT INTO Accounts VALUES (203, 'Charlie', 12000.00);
INSERT INTO Accounts VALUES (204, 'Diana',    5000.00);
INSERT INTO Accounts VALUES (205, 'Edward',   15000.00);

COMMIT;

-- PL/SQL Procedure
CREATE OR REPLACE PROCEDURE TransferFunds(srcid IN NUMBER, destid IN NUMBER, amt NUMBER)
	IS
        srcname VARCHAR2(50);
        destname VARCHAR2(50);
        srcbal NUMBER(10,2);
        destbal NUMBER(10,2);
    BEGIN
        SELECT CustomerName,Balance INTO srcname,srcbal FROM Accounts WHERE AccountID=srcid;
        SELECT CustomerName,Balance INTO destname,destbal FROM Accounts WHERE AccountID=destid;
        IF(srcbal-amt>0)THEN
        	srcbal := srcbal - amt;
            destbal := destbal + amt;
        	dbms_output.put_line('TRANSFER SUCCESSFUL');
            dbms_output.put_line('Amount Transferred: ' || amt);
        	dbms_output.put_line('FROM Account ID: ' || srcid || ' |Name: '|| srcname || ' |Remaining Balance: ' || srcbal);
            dbms_output.put_line('TO Account ID: ' || destid || ' |Name: '|| destname || ' |Remaining Balance: ' || destbal);
        ELSE
            dbms_output.put_line('TRANSFER FAILED DUE TO INSUFFICIENT BALANCE');
            dbms_output.put_line('Available Balance: ' || srcbal || ' |Requested Amount: ' || amt);
        END IF;
    	COMMIT;
    END;
/

--PL/SQL main
EXECUTE TransferFunds(201,203, 2000);
EXECUTE TransferFunds(204,201, 6000);

-- Scenario 1: Apply 1% discount for customers above 60

DECLARE
    CURSOR customer_cursor IS
        SELECT CustomerID, Age
        FROM Customers;

BEGIN
    FOR customer_rec IN customer_cursor LOOP
        IF customer_rec.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = customer_rec.CustomerID;
        END IF;
    END LOOP;

    COMMIT;
END;
/
-- Scenario 2: Promote customers to VIP status

DECLARE
    CURSOR customer_cursor IS
        SELECT CustomerID, Balance
        FROM Customers;

BEGIN
    FOR customer_rec IN customer_cursor LOOP
        IF customer_rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = customer_rec.CustomerID;
        END IF;
    END LOOP;

    COMMIT;
END;
/
-- Scenario 3: Loan Due Reminders

DECLARE
    CURSOR loan_cursor IS
        SELECT LoanID, CustomerID, DueDate
        FROM Loans
        WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30;

BEGIN
    FOR loan_rec IN loan_cursor LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ' || loan_rec.LoanID ||
            ' for Customer ' || loan_rec.CustomerID ||
            ' is due on ' || loan_rec.DueDate
        );
    END LOOP;
END;
/

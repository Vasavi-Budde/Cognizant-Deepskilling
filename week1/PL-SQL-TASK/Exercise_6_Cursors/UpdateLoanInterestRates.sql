SET SERVEROUTPUT ON;

DECLARE

    CURSOR loan_cursor IS
        SELECT LoanID
        FROM Loans;

    v_loanid Loans.LoanID%TYPE;

BEGIN

    OPEN loan_cursor;

    LOOP

        FETCH loan_cursor
        INTO v_loanid;

        EXIT WHEN loan_cursor%NOTFOUND;

        UPDATE Loans
        SET InterestRate = InterestRate + 1
        WHERE LoanID = v_loanid;

    END LOOP;

    CLOSE loan_cursor;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Loan Interest Rates Updated Successfully');

END;
/
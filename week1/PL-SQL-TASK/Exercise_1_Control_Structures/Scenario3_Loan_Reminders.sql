SET SERVEROUTPUT ON;

BEGIN

FOR loan_rec IN(SELECT LoanID , CustomerID ,EndDate
FROM Loans)
LOOP

IF loan_rec.EndDate BETWEEN SYSDATE AND SYSDATE + 30
THEN
DBMS_OUTPUT.PUT_LINE('Reminder: Loan' || loan_rec.LoanID ||
'for Customer' ||loan_rec.CustomerID || 'is ending soon');
END IF;
END LOOP;
END;
/
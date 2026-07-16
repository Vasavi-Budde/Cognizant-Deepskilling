SET SERVEROUTPUT ON;

DECLARE

    CURSOR trans_cursor IS
        SELECT TransactionID,
               AccountID,
               Amount,
               TransactionType
        FROM Transactions
        WHERE EXTRACT(MONTH FROM TransactionDate) =
              EXTRACT(MONTH FROM SYSDATE);

    v_transactionid Transactions.TransactionID%TYPE;
    v_accountid Transactions.AccountID%TYPE;
    v_amount Transactions.Amount%TYPE;
    v_type Transactions.TransactionType%TYPE;

BEGIN

    OPEN trans_cursor;

    LOOP

        FETCH trans_cursor
        INTO v_transactionid,
             v_accountid,
             v_amount,
             v_type;

        EXIT WHEN trans_cursor%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE(
            'Transaction ID: ' || v_transactionid ||
            ' Account ID: ' || v_accountid ||
            ' Amount: ' || v_amount ||
            ' Type: ' || v_type
        );

    END LOOP;

    CLOSE trans_cursor;

END;
/
SET SERVEROUTPUT ON;

DECLARE

    CURSOR trans_cursor IS
        SELECT TransactionID,
               AccountID,
               Amount,
               TransactionType
        FROM Transactions
        WHERE TO_CHAR(TransactionDate, 'MMYYYY') =
              TO_CHAR(SYSDATE, 'MMYYYY');

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
            'Transaction ID: ' || v_transactionid
        );

        DBMS_OUTPUT.PUT_LINE(
            'Account ID: ' || v_accountid
        );

        DBMS_OUTPUT.PUT_LINE(
            'Amount: ' || v_amount
        );

        DBMS_OUTPUT.PUT_LINE(
            'Transaction Type: ' || v_type
        );

        DBMS_OUTPUT.PUT_LINE(
            '----------------------'
        );

    END LOOP;

    CLOSE trans_cursor;

END;
/
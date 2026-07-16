CREATE OR REPLACE PROCEDURE SafeTransferFunds(
    p_from_account NUMBER,
    p_to_account NUMBER,
    p_money NUMBER
)
 Is
    v_balance NUMBER;
BEGIN
    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_from_account;

    IF v_balance < p_money THEN
    RAISE_ERROR('Insufficient Balnace');
    END IF;

    UPDATE Accounts
    SET Balance = Balance-p_money
    WHERE AccountID = p_to_account;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Transfer Successful');

EXCEPTION

WHEN OTHERS THEN
ROLLBACK;
DBMS_OUTPUT.PUT_LINE('ERROR: ' ||SQLERRM);
END;
/

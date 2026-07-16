CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT ON Transactions 
FOR EACH ROW

DECLARE
    v_balance NUMBER;
BEGIN
    IF:NEW.TransactionType = 'Deposit' THEN

        IF:NEW.Amount<=0 THEN
            RAISE_APPLICATION_ERROR('DEPOSIT AMOUNT MUST BE POSITIVE');
        END IF;

    ELSE IF : NEW.TransactionType = 'Withdrawl' THEN

    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = :NEW.AccountID;

    IF :NEW.AMOUNT > v_balance THEN
        RAISE_APPLICATION_ERROR('INSUFFIECIENT BALANCE');
    END IF;
END IF;
END;
/
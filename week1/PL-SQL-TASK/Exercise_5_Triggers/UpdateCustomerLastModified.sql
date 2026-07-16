CREATE OR REPLACE TRIGGER UpdateCustomerLastModified
BEFORE UPDATE ON UpdateCustomers 
FOR EACH ROW
BEGIN
    :NEW.LastModified := SYSDATE;
END;
/
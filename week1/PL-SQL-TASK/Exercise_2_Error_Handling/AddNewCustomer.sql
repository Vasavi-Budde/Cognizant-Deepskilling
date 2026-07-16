CREATE OR REPLACE PROCEDURE AddNewCustomer(
     p_customerid NUMBER,
    p_name VARCHAR2,
    p_dob DATE,
    p_balance NUMBER
)

IS 
    v_count NUMBER
BEGIN

SELECT COUNT(*)
INTO v_count
FROM Customers
WHERE CustomerID = p_customerid;

IF v_count > 0 THEN
    DBMS_OUTPUT.PUT_LINE('Customer ID already exists');
ELSE
    INSERT INTO Customers(
        CustomerID,
        Name,
        DOB,
        Balance,
        LastModified
    )
    VALUES(
        p_customerid,
        p_name,
        p_dob,
        p_balance,
        SYSDATE
    );

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('customer added successfully');
END IF;

EXCEPTION

    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Erro: ' ||SQLERRM);
END;
/

 
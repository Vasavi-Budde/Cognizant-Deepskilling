CREATE OR REPLACE PACKAGE BODY CustomerManagement AS

    PROCEDURE AddCustomer(
        p_customerid NUMBER,
        p_name VARCHAR2,
        p_dob DATE,
        p_balance NUMBER
    )
    IS
    BEGIN

        INSERT INTO Customers
        VALUES(
            p_customerid,
            p_name,
            p_dob,
            p_balance,
            SYSDATE,
            NULL
        );

        COMMIT;

    END AddCustomer;

    PROCEDURE UpdateCustomer(
        p_customerid NUMBER,
        p_name VARCHAR2
    )
    IS
    BEGIN

        UPDATE Customers
        SET Name = p_name
        WHERE CustomerID = p_customerid;

        COMMIT;

    END UpdateCustomer;

    FUNCTION GetBalance(
        p_customerid NUMBER
    )
    RETURN NUMBER
    IS
        v_balance NUMBER;
    BEGIN

        SELECT Balance
        INTO v_balance
        FROM Customers
        WHERE CustomerID = p_customerid;

        RETURN v_balance;

    END GetBalance;

END CustomerManagement;
/

CREATE OR REPLACE PACKAGE BODY EmployeeManagement AS

    PROCEDURE HireEmployee(
        p_employeeid NUMBER,
        p_name VARCHAR2,
        p_position VARCHAR2,
        p_salary NUMBER,
        p_department VARCHAR2
    )
    IS
    BEGIN

        INSERT INTO Employees
        VALUES (
            p_employeeid,
            p_name,
            p_position,
            p_salary,
            p_department,
            SYSDATE
        );

        COMMIT;

    END HireEmployee;


    PROCEDURE UpdateEmployee(
        p_employeeid NUMBER,
        p_salary NUMBER
    )
    IS
    BEGIN

        UPDATE Employees
        SET Salary = p_salary
        WHERE EmployeeID = p_employeeid;

        COMMIT;

    END UpdateEmployee;


    FUNCTION CalculateAnnualSalary(
        p_employeeid NUMBER
    )
    RETURN NUMBER
    IS
        v_salary NUMBER;
    BEGIN

        SELECT Salary
        INTO v_salary
        FROM Employees
        WHERE EmployeeID = p_employeeid;

        RETURN v_salary * 12;

    END CalculateAnnualSalary;

END EmployeeManagement;
/
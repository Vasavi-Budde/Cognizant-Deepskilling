CREATE OR REPLACE PROCEDURE UpdateSalary(
    p_employeeid NUMBER,
    p_percentage NUMBER
)

IS 
    v_salary NUMBER;
BEGIN

    SELECT Salary
    INTO v_salary
    FROM Employees
    WHERE EmployeeID = p_employeeid;

    UPDATE Employees
    SET Salary = Salary+(Salary * p_percentage / 100 )
    WHERE EmployeeID = p_employeeid;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Salary updated successfully');

EXCEPTION

WHEN NO_DATA_FOUND THEN
    DBMS_OUTPUT.PUT_LINE('Employee ID NOT Found');

WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/
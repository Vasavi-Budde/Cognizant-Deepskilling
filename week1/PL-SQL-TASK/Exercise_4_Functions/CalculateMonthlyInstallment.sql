CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    p_loanamount NUMBER,
    p_interestrate NUMBER,
    p_years NUMBER
)
RETURN NUMBER
IS
    v_interest NUMBER;
    v_totalamount NUMBER;
    v_installment NUMBER;
BEGIN

    v_interest := (p_loanamount * p_interestrate * p_years)/100;
    v_totalamount := p_loanamount + v_interest;
    v_installment := v_totalamount/(p_years * 12);

    RETURN v_installment;
END;
/
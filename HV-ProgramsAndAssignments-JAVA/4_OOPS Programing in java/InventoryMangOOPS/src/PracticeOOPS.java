// Getter & setter Method

public class PracticeOOPS {
    private double AccBal=500;
    private String AccNo;
    private String CustName;

    public double getAccBal() {
        return AccBal;
    }

    public void setAccBal(double accBal) {
        AccBal = accBal;
    }

    public String getAccNo() {
        return AccNo;
    }

    public void setAccNo(String accNo) {
        AccNo = accNo;
    }

    public String getCustName() {
        return CustName;
    }

    public void setCustName(String custName) {
        CustName = custName;
    }

    public double despositeMoney (int money){
        AccBal +=money;
        System.out.println(AccBal);
        return  AccBal;
    }


}

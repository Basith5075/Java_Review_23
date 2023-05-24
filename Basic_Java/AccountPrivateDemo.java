class Account{
    
    private int accNo;
    private int bal;
    private String custName;

    Account(int acno, int ba, String cusname){
        accNo = acno;
        bal = ba;
        custName = cusname;
    }

    public String toString() {
        // TODO Auto-generated method stub
        return ("Account Number :\t\t"+accNo+"\nBalance :\t\t"+bal+"\nName :\t\t"+custName);
    }

}
public class AccountPrivateDemo {

    public static void main(String[] args) {
        Account ac = new Account(12, 34, "Abdul Basith Mohammed");
        System.out.println(ac);
    }
}

public class bankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

public bankAccount(){
    System.out.println("Empity constructor declared");
}
public bankAccount(int accountNumber,int balance,String customerName,String email,String phoneNumber){
    System.out.println("constructor with parameters");
    this.accountNumber=accountNumber;
    this.balance=balance;
    this.customerName=customerName;
   this.email=email;
    this.phoneNumber=phoneNumber;
}

    public void  depositFunds (double depositAmount){
        balance+=depositAmount;
        System.out.println("Deposit of  "+depositAmount +"has been made.New balance is $" +balance);
    }

    public void withdrawFunds(double withdrawnAmount){
        if(balance-withdrawnAmount<0){
            System.out.println("Are you trying rob me mr. Ami" );
        }else {
            balance-=withdrawnAmount;
            System.out.println("withdrawn amount "+withdrawnAmount
                    + "processed and the remaining balance is "+balance);
        }
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAccountNumber(){
    return accountNumber;

}

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String  phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}

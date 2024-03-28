public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer(String name, double creditLimit, String emailAddress)
    {
   // System.out.println("new constructor with params");
    this.name=name;
    this.creditLimit=creditLimit;
    this.emailAddress=emailAddress;}
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}

class Account {
    String name;
    short age;
    String address;
    String contact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

}

enum Type {
    SAVINGS,
    SALARY
}

public class Customer extends Account {
    Type customer_type;
    double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Type getCustomer_type() {
        return customer_type;
    }

    public void setCustomer_type(Type customer_type) {
        this.customer_type = customer_type;
    }

    Customer() {
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCustomer_type(Type.SAVINGS);
        customer.setName("Nishavak Naik");
        System.out.println(customer.getName());
        System.out.println(customer.getCustomer_type());
    }
}
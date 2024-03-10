public abstract class Employee4 {
    private String name;
    private String address;
    private int number;
    public void employee4(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
        System.out.println("Constructing an Employee");
    }
    public abstract double computePay();
    // remainder of class definition

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

package pojo;

public class Address {
    public String address;

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

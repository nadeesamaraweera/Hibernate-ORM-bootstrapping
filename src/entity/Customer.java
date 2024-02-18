package entity;

import javax.persistence.*;


@Entity
@Table(name = "customer")
public class Customer {

    @Id //  Tells Hibernate that this is the primary key  of table
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "customer_id")
   private  int id;

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    @Column(name = "Customer_name")
    private  String name;

    @Column(name = "Customer_address")
    private  String address;


}

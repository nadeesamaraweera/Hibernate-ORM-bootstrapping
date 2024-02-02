package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity(name = "customer")

@Entity
@Table(name = "customer")

public class Customer {

    @Id //  Tells Hibernate that this is the primary key  of table
    @Column(name = "customer_id")
    private  int id;

    @Column(name = "customer_name")
    private  String name;

    @Column(name = "customer_address")
    private  String address;

    @Column(name = "customer_salary")
    private  double salary;


    public Customer() {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


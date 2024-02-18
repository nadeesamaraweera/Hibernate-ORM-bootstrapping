package repository;

import config.SessionFactoryConfig;
import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerRepository {

    private  final  Session session;
    public  CustomerRepository(){
         session = SessionFactoryConfig
                .getInstance()
                .getSession();
    }

    public  int saveCustomer(Customer customer){


        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
    }
}

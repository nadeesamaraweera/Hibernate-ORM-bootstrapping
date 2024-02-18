package config;

import entity.CustomerOld;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryConfig {

    private static SessionFactoryConfig factoryConfig;

    private  final SessionFactory sessionFactory;

    private SessionFactoryConfig() {
//        //1.create a Service Registry
//        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
//                .configure()
//                .build();

        // 2.create a MetaData object
//        Metadata metadata = new MetadataSources( new StandardServiceRegistryBuilder()
//                .configure()
//                .build())
//                .addAnnotatedClass(Customer.class)
//                .getMetadataBuilder()
//                .build();
//

        // 3.Create a Session Factory
//        sessionFactory = new MetadataSources(
//                new StandardServiceRegistryBuilder()
//                .configure()
//                .build())
//                .addAnnotatedClass(Customer.class)
//                .getMetadataBuilder()
//                .build()
//                .buildSessionFactory();

        sessionFactory =new Configuration()
                .configure()
                .addAnnotatedClass(CustomerOld.class)
                .buildSessionFactory();

    }

    public static SessionFactoryConfig getInstance() {

        return (null == factoryConfig)
                ? factoryConfig = new SessionFactoryConfig()
                : factoryConfig;
    }

    public Session getSession(){
        // create and open the session
       return sessionFactory.openSession();
    }


}




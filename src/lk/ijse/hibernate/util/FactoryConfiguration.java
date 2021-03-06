

package lk.ijse.hibernate.util;

        import lk.ijse.hibernate.entity.Customer;
        import lk.ijse.hibernate.entity.Item;
        import org.hibernate.Session;
        import org.hibernate.SessionFactory;
        import org.hibernate.cfg.Configuration;


public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration(){
        Configuration configuration=new Configuration().configure().addAnnotatedClass(Customer.class).addAnnotatedClass(Item.class);

        sessionFactory=configuration.buildSessionFactory();


    }

    public static FactoryConfiguration getInstance(){
        return (null==factoryConfiguration) ? (factoryConfiguration=new FactoryConfiguration()) :(factoryConfiguration);

    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}


package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {
    public static void main(String[] args) {
        Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session= sessionFactory.openSession();
        Session session1=sessionFactory.openSession();
        try {
            Employee employee = session.load(Employee.class, 1);
            System.out.println(employee.getName() + " " + employee.getSalary());

            session.close();

            employee = session1.load(Employee.class, 1);
            System.out.println(employee.getName() + " " + employee.getSalary());

            session1.close();

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}

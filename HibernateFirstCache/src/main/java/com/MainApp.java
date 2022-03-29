package com;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainApp {
    public static void main(String[] args) {
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Session session1=HibernateUtil.getSessionFactory().openSession();
        session1.beginTransaction();
       try{
           Employee employee=session.load(Employee.class, 2);
           System.out.println(employee.getName());

           employee=session.load(Employee.class, 2);
           System.out.println(employee.getName());

           // session.clear();//session.evict

           employee=session1.load(Employee.class, 2);
           System.out.println(employee.getName());


       }catch(Exception e){
           e.printStackTrace();
       }
    }
}

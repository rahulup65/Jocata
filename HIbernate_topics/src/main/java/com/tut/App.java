package com.tut;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import javax.imageio.IIOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )throws IOException
    {
      
        
        Configuration cfg=new Configuration();//configuration is the class
        
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        
        
        //_____________created student object__________________//
        Student st=new Student();
        st.setCity("varanasi");
        st.setName("Rahul Gupta");
        
        
        //_________________created Address object_______________//
        
        Address ad=new Address();
        ad.setStreet("street2");
        ad.setCity("Gurugram");
        ad.setOpen(true);
        ad.setAddedData(new Date());
        ad.setX(1234.234);//this value will not go in the database//
        
        //______reading image_______________//
        
//        FileInputStream fis=new FileInputStream("src/main/java/IMG_20210423_000523.png");
//        
//        byte [] data=new byte[fis.available()];//create one byte array
//        fis.read(data);
//        ad.setImage(data);        
//        
        
        
        
        
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(st);
        session.save(ad);
        tx.commit();
        session.close();
        System.out.println("done...............");
 
        
        
        
        
      
    }
}
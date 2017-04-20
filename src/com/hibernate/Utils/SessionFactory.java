package com.hibernate.Utils;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class SessionFactory {
 private static org.hibernate.SessionFactory sessionFactory;
  static{
	  Configuration conf=new Configuration().configure();
	  sessionFactory=conf.buildSessionFactory();
  }
 public static Session getSession(){
	 Session session=sessionFactory.openSession();
	 return session;
 }
 public void close(Session session){
	 if(session!=null){
		 session.close();
	 }
 }
}

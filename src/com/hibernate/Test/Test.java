package com.hibernate.Test;

import org.hibernate.Session;

import com.hibernate.Utils.SessionFactory;
import com.hibernate.entity.UserInfo;

public class Test {

	public static void main(String[] args) {
		Session session=SessionFactory.getSession();
//		System.out.println(session);
//		SQLQuery sqlquery = session.createSQLQuery("SELECT COUNT(*) count FROM USER");
//		sqlquery.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
//		List<Map<String,String>> list = sqlquery.list(); 
//		Map<String,String> map =(Map)sqlquery.uniqueResult();
//		session.close();
//		System.out.println(list);
//		System.out.println(map);
		
		
		UserInfo userInfo = (UserInfo)session.get(UserInfo.class, 2);
		
		
//		Address userInfo = (Address)session.get(Address.class, 2);
		System.out.println(userInfo);
		session.close();
	}

}

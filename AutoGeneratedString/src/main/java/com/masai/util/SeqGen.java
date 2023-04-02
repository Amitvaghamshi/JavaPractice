package com.masai.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import com.mysql.cj.protocol.Resultset;

public class SeqGen implements IdentifierGenerator{
	
	private static int count=100;

	public Object generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		  
		
		try {
			Connection conn=session.getJdbcConnectionAccess().obtainConnection();
			
		PreparedStatement st=conn.prepareStatement("select count(*) as ct from student");
		
		ResultSet set= st.executeQuery();
		
		 if(set.next()) {
			 return  "fw21_"+set.getInt("ct");
		 }
		
			
		} catch (SQLException e) {
			
		}
		 count++;
		 
		  return null;
	}

}

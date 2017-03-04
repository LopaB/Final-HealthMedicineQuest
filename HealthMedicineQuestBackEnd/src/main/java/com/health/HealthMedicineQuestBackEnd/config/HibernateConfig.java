package com.health.HealthMedicineQuestBackEnd.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages={"com.health.HealthMedicineQuestBackEnd.model"})
@EnableTransactionManagement
public class HibernateConfig {
	
	//Database related information
	public static final String DATABASE_URL="jdbc:h2:tcp://localhost/~/Health2";
	public static final String DATABASE_DRIVER="org.h2.Driver";
	public static final String DATABASE_DIALECT="org.hibernate.dialect.H2Dialect";
	public static final String DATABASE_USERNAME="sa2";
	public static final String DATABASE_PASSWORD="";
	
	
	@Bean
	public DataSource getDataSource(){
		BasicDataSource dataSource=new BasicDataSource();
		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);
		//datasource bean will be available
		return dataSource;
	}
	//sessionFactory will be available
	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource){
		LocalSessionFactoryBuilder builder= new LocalSessionFactoryBuilder(dataSource);
		builder.addProperties(getHibernateProperties());
		builder.scanPackages("com.health.HealthMedicineQuestBackEnd.model");
		return builder.buildSessionFactory();
	}
	//All the hibernate properties will be returned by this method
	public Properties getHibernateProperties(){
		Properties prop=new Properties();
		prop.put("hibernate.dialect", DATABASE_DIALECT);
		prop.put("hibernate.show_sql", "true");
		prop.put("hibernate.format_sql", "true");
		return prop;
	}
	//Transaction Management
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory){
		HibernateTransactionManager transactionManager=new HibernateTransactionManager(sessionFactory);
		return transactionManager;
		
	}
}

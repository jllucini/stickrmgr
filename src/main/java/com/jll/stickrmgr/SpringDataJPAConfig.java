package com.jll.stickrmgr;

import javax.inject.Inject;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

@Configuration
@ComponentScan
@EnableTransactionManagement
@EnableJpaRepositories(basePackages={"com.jll.stickrmgr.db","com.jll.stickrmgr.db.jpa"}, entityManagerFactoryRef="emf")
public class SpringDataJPAConfig {

  @Bean
  public DataSource dataSource() {
    EmbeddedDatabaseBuilder edb = new EmbeddedDatabaseBuilder();
    edb.setType(EmbeddedDatabaseType.H2);
    edb.addScript("com/jll/stickrmgr/db/jpa/schema.sql");
    //edb.addScript("spittr/db/jpa/test-data.sql");
    EmbeddedDatabase embeddedDatabase = edb.build();
    return embeddedDatabase;
  }

  @Bean
  public LocalContainerEntityManagerFactoryBean emf(){
  //(DataSource dataSource, JpaVendorAdapter jpaVendorAdapter) {
    LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
    emf.setDataSource(dataSource());
    emf.setPersistenceUnitName("sticker");
    emf.setJpaVendorAdapter(jpaVendorAdapter());
    emf.setPackagesToScan("com.jll.stickrmgr.domain");
    return emf;
  }
  
  @Bean
  public JpaTransactionManager transactionManager() {
          JpaTransactionManager transactionManager = new JpaTransactionManager();
          transactionManager.setEntityManagerFactory(emf().getObject());
          return transactionManager;
  }
  
  
  @Bean
  public JpaVendorAdapter jpaVendorAdapter() {
    HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
    adapter.setDatabase(Database.H2);
    adapter.setShowSql(true);
    adapter.setGenerateDdl(false);
    adapter.setDatabasePlatform("org.hibernate.dialect.H2Dialect");
    return adapter;
  }
  
/*
  
  @Configuration
  @EnableTransactionManagement
  public static class TransactionConfig implements TransactionManagementConfigurer {
    @Inject
    private EntityManagerFactory emf;

    public PlatformTransactionManager annotationDrivenTransactionManager() {
      JpaTransactionManager transactionManager = new JpaTransactionManager();
      transactionManager.setEntityManagerFactory(emf);
      return transactionManager;
    }    
  }
  */

}
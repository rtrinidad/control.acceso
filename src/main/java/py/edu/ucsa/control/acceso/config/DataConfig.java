package py.edu.ucsa.control.acceso.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

/**
 * Toda la configuracion de acceso a datos sucede aqui
 * @author Pablo
 */
@Configuration
@MapperScan({"py.edu.ucsa.control.acceso.core.mappers"})
@EnableTransactionManagement
public class DataConfig implements TransactionManagementConfigurer {


	@Bean
	public DataSource dataSource() {
		final JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
		dsLookup.setResourceRef(true);
		DataSource dataSource = dsLookup.getDataSource("java:jboss/datasources/M4-172-DS");
		return dataSource;
	}

	@Bean
    public PlatformTransactionManager txManager() {
        return new DataSourceTransactionManager(dataSource());
    }

	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setTypeAliasesPackage("py.edu.ucsa.control.acceso.core.domain");
		sessionFactory.setTypeHandlersPackage("py.edu.ucsa.control.acceso.core.mybatis");
		sessionFactory.setConfigurationProperties(getProperties());
		return sessionFactory;
	}

	private Properties getProperties() {
		final Properties myBatisProperties = new Properties();
		myBatisProperties.put("jdbcTypeForNull", "NULL");
		return myBatisProperties;
	}

	@Override
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		return txManager();
	}
}
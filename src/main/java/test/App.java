package test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;


/*
 * This Java source file was generated by the Gradle 'init' task.
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
    	SpringApplication.run(App.class);
    }
    
	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory() {
		LocalEntityManagerFactoryBean em = new LocalEntityManagerFactoryBean();
		em.setPersistenceUnitName("testdb");
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		return em;
	}
}
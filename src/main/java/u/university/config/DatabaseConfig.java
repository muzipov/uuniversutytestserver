package u.university.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

@Configuration
@EnableJpaRepositories("u.university.repository")
@EnableTransactionManagement
@ComponentScan("u.university")
@PropertySource("classpath:db.properties")

public class DatabaseConfig {

    @Resource
    private Environment env;

}

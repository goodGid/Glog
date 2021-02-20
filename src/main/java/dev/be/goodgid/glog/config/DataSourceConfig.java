package dev.be.goodgid.glog.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/application.yml")
public class DataSourceConfig {

    @Value("${db.url}")
    private String url;

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    @Value("${db.driver-class-name}")
    private String driverClassName;
//
//    @Bean
//    public DataSource datasource() {
//        return DataSourceBuilder.create()
//                                .url(url)
//                                .username(username)
//                                .password(password)
//                                .driverClassName(driverClassName)
//                                .build();
//    }
//

//    @Bean
//    @Primary
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSourceProperties primaryDataSourceProperties() {
//        DataSourceProperties sourceProperty = new DataSourceProperties();
//        return sourceProperty;
//    }
//
//    @Bean
//    @Primary
//    @Qualifier("primaryDataSource")
//    public DataSource primaryDataSource(DataSourceProperties properties) {
//        return properties.initializeDataSourceBuilder().build();
//        return primaryDataSourceProperties().initializeDataSourceBuilder().build();
//    }
}

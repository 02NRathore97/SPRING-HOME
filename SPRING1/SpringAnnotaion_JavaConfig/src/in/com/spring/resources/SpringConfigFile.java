package in.com.spring.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("in.com.spring.beans")
//@ComponentScan({"in.com.spring.beans"})
@ComponentScan(basePackages = {"in.com.spring.beans"})//we can give more than one package name separating comma
public class SpringConfigFile {

}

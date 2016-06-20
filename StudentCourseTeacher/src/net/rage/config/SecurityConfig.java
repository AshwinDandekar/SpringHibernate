package net.rage.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth)throws Exception{
		auth.inMemoryAuthentication().withUser("rage").password("gunner").roles("SUPERTEACH");
		auth.inMemoryAuthentication().withUser("noob").password("password").roles("TEACH");
		auth.inMemoryAuthentication().withUser("user").password("user").roles("STUD");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/","/mainpage").access("hasAnyRole('STUD','TEACH')").antMatchers("/manageCourse","/manageStud").access("hasAnyRole('TEACH')")
		.antMatchers("/manageTeacher").access("hasAnyRole('SUPERTEACH')").and().formLogin().loginPage("/login").and().exceptionHandling().accessDeniedPage("/deny");
	}
	
}

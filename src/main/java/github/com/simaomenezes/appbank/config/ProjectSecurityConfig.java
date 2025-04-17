package github.com.simaomenezes.appbank.config;

import github.com.simaomenezes.appbank.exceptionhandling.CustomAccessDeniedHandler;
import github.com.simaomenezes.appbank.exceptionhandling.CustomBasicAuthenticationEntryPoint;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.password.CompromisedPasswordChecker;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.password.HaveIBeenPwnedRestApiPasswordChecker;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@Profile("!prod")
public class ProjectSecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        // http.authorizeHttpRequests((requests) -> requests.anyRequest().authenticated());
        // http.authorizeHttpRequests((requests) -> requests.anyRequest().permitAll());
        // http.authorizeHttpRequests((requests) -> requests.anyRequest().denyAll());

        /*
        http.authorizeHttpRequests((requests) -> requests
                .requestMatchers("/myAccount","myBalance","myLoans","myCards").authenticated()
                .requestMatchers("/notices","/contact","error","/register").permitAll());

        // http.formLogin(flc->flc.disable());
        // http.httpBasic(hbc->hbc.disable());

        http.formLogin(withDefaults());
        http.httpBasic(withDefaults());
        return http.build();
        */
/*
        http
                .requiresChannel(rcc->rcc.anyRequest().requiresInsecure()) // Only HTTP
                .csrf(csrfConfig -> csrfConfig.disable())
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/myAccount", "/myBalance", "/myLoans", "/myCards").authenticated()
                        .requestMatchers("/notices", "/contact", "/error", "/register", "/invalidSession").permitAll());
        http.formLogin(withDefaults());
        http.httpBasic(withDefaults());
        return http.build();

 */



        http.sessionManagement(smc ->smc.invalidSessionUrl("/invalidSession").maximumSessions(3).maxSessionsPreventsLogin(true))
                .requiresChannel(rcc ->rcc.anyRequest().requiresInsecure()) // Only HTTP
                .csrf(csrfConfig -> csrfConfig.disable())
                .authorizeHttpRequests((requests)->requests
                        .requestMatchers("/myAccount", "/myBalance", "/myLoans", "/myCards").authenticated()
                        .requestMatchers("/notices", "/contact", "/error", "/register", "/invalidSession").permitAll());

        http.formLogin(withDefaults());
        http.httpBasic(hbc -> hbc.authenticationEntryPoint(new CustomBasicAuthenticationEntryPoint()));
        http.exceptionHandling(ehc -> ehc.accessDeniedHandler(new CustomAccessDeniedHandler()));
        return http.build();
    }

    /*
    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withUsername("user").password("{noop}123").authorities("read").build();
        UserDetails admin = User.withUsername("admin").password("{noop}321").authorities("admin").build();
        return new InMemoryUserDetailsManager(user, admin);
    }
    */


    @Bean
    public PasswordEncoder passwordEncoder(){
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }


    /**
     * From Spring Security 6.3 version
     *
     */
    @Bean
    public CompromisedPasswordChecker compromisedPasswordChecker(){
        return new HaveIBeenPwnedRestApiPasswordChecker();
    }
}


package gt.edu.url.apoyo_educativo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain seguridadActividades(HttpSecurity http) throws Exception {

        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers(
                    "/login-actividades",
                    "/acceso-denegado",
                    "/error",
                    "/estilos.css"
                ).permitAll()
                .requestMatchers(HttpMethod.GET, "/actividades/nuevo")
                    .hasAnyRole("ADMIN", "DOCENTE")
                .requestMatchers(HttpMethod.POST, "/actividades")
                    .hasAnyRole("ADMIN", "DOCENTE")
                .requestMatchers("/actividades/editar/**")
                    .hasRole("ADMIN")
                .requestMatchers(HttpMethod.POST, "/actividades/actualizar/**")
                    .hasRole("ADMIN")
                .requestMatchers(HttpMethod.POST, "/actividades/eliminar/**")
                    .hasRole("ADMIN")
                .anyRequest().authenticated()
            )
            .formLogin(login -> login
                .loginPage("/login-actividades")
                .loginProcessingUrl("/login-actividades")
                .defaultSuccessUrl("/actividades", true)
                .permitAll()
            )
            .logout(logout -> logout
                .logoutUrl("/actividades/logout")
                .logoutSuccessUrl("/login-actividades?salio")
                .invalidateHttpSession(true)
                .permitAll()
            )
            .exceptionHandling(errores ->
                errores.accessDeniedPage("/acceso-denegado")
            );

        return http.build();
    }
}

package hu.flowacademy.appointmentmaker.Config;

import hu.flowacademy.appointmentmaker.Repository.CompanyRepository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@Transactional

public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return companyRepository.findFirstByEmail(s).orElseThrow(() -> new UsernameNotFoundException(s));
    }
}

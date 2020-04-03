package hu.flowacademy.appointmentmaker.Config;

import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import hu.flowacademy.appointmentmaker.Model.Company;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;

@Slf4j
public class CustomTokenEnhancer implements TokenEnhancer {
    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken token,
                                     OAuth2Authentication auth) {
        Object principal = auth.getPrincipal();
        if (principal instanceof Company) {
            var user = (Company) principal;
            ((DefaultOAuth2AccessToken) token).setAdditionalInformation(
                    Map.of("id", user.getId()));
            return token;
        }
        log.error("Principal is not User.class");
        return token;
    }
}

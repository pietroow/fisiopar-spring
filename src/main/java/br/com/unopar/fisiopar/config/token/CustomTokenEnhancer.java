package br.com.unopar.fisiopar.config.token;

import br.com.unopar.fisiopar.domains.Usuario;
import br.com.unopar.fisiopar.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class CustomTokenEnhancer implements TokenEnhancer {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        Optional<Usuario> usuario = usuarioRepository.findByEmail(authentication.getName());
        if (usuario.isPresent()) {
            Map<String, Object> addInfo = new HashMap<>();
            addInfo.put("usuario", usuario.get().getUserSimplified());
            ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(addInfo);
        }
        return accessToken;
    }

}

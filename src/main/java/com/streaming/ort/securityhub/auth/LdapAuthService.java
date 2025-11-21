package com.streaming.ort.securityhub.auth;
import org.springframework.ldap.core.support.LdapContextSource;

public class LdapAuthService {

    private final LdapContextSource contextSource;

    public LdapAuthService(LdapContextSource contextSource) {
        this.contextSource = contextSource;
    }

    public boolean authenticate(String userDn, String password) {
        try {
            contextSource.getContext(userDn, password);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}


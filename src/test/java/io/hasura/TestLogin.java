package io.hasura;

import org.junit.Test;

import java.io.IOException;

import io.hasura.auth.LoginResponse;

public class TestLogin {

    @Test
    public void run() throws IOException, AuthException {

        AuthService authService = new AuthService("http://104.155.219.208");
        LoginResponse r = authService.login("aladdin", "abracadabra", null).execute();
        System.out.println(r.getHasuraId());
        System.out.println(r.getHasuraRole());

    }
}

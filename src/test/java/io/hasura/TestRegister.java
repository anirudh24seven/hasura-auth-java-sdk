package io.hasura;

import org.junit.Test;

import java.io.IOException;

import io.hasura.auth.RegisterRequest;
import io.hasura.auth.RegisterResponse;

public class TestRegister {

    @Test
    public void run() throws IOException, AuthException {

        AuthService authService = new AuthService("http://104.155.219.208");
        RegisterRequest rq = new RegisterRequest();
        rq.setUsername("aladdin");
        rq.setPassword("abracadabra");
        rq.setEmail("aladdin@genie.io");
        rq.setMobile("1010011000");
        RegisterResponse rr = authService.register(rq).execute();
        System.out.println(rr.getHasuraId());

    }
}

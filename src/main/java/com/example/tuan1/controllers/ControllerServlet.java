package com.example.tuan1.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.core.Response;
import com.example.tuan1.models.Account;
import com.example.tuan1.repositories.AccountRepository;

public class ControllerServlet {


    @Inject
    private AccountRepository accountRepository;


    @POST
    public Response login(Account account) throws Exception {
        accountRepository.insert(account);

        return Response.ok("OK").build();
    }


}

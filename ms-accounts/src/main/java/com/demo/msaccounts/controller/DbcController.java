package com.demo.msaccounts.controller;

import com.demo.msaccounts.model.Dbc;
import com.demo.msaccounts.model.Dcp;
import com.demo.msaccounts.service.DBCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/dbc")
public class DbcController {

    @Autowired
    private DBCService dbcService;
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Dbc> getAccountById(@PathVariable("id") String id) {
        Mono<Dbc> data = this.dbcService.findById(id);
        return data;
    }

    @GetMapping("/search")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Dcp> findByDocument(@RequestParam(name = "dbcId") String dbcId) {
        return this.dbcService.findDcpByIdDbc(dbcId);
    }
}

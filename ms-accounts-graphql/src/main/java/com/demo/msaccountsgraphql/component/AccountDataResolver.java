package com.demo.msaccountsgraphql.component;

import com.demo.msaccountsgraphql.codegen.DgsConstants;
import com.demo.msaccountsgraphql.codegen.types.*;
import com.netflix.graphql.dgs.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

@DgsComponent
@Slf4j
public class AccountDataResolver {

    private final WebClient webClient;

    public AccountDataResolver(WebClient webClient) {
        this.webClient = webClient;
    }


    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.Dbc)
    public Mono<Dbc> findDbcById(@InputArgument String id) {
        return webClient
                .get()
                .uri("/dbc/" + id)
                .retrieve()
                .bodyToMono(Dbc.class);
    }

    @DgsData(parentType = DgsConstants.DBC.TYPE_NAME, field = DgsConstants.DBC.Dpc)
    public Mono<Dpc> findDpcById(DgsDataFetchingEnvironment dfe) {
        log.info("customer - before");
        Dbc dbc = dfe.getSource();
        var uri = UriComponentsBuilder.fromUriString("/dbc/search")
                .queryParam("dbcId", dbc.getPersonId())
                .build().toUri();
        return webClient
                .get()
                .uri(uri.toString())
                .retrieve()
                .bodyToMono(Dpc.class);
    }

}

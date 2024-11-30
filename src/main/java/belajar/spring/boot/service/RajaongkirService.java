package belajar.spring.boot.service;

import belajar.spring.boot.entity.RajaongkirRequest;
import belajar.spring.boot.entity.RajaongkirResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class RajaongkirService {

    private static final String API_URL = "https://api.rajaongkir.com/starter/cost";
    private static final String API_KEY = "0d0c-435f-a36b-440b02257c5b";  // Ganti dengan API key Anda

    @Autowired
    private RestTemplate restTemplate;

    public RajaongkirResponse getCost(RajaongkirRequest request) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("key", API_KEY);

        HttpEntity<RajaongkirRequest> entity = new HttpEntity<>(request, headers);

        ResponseEntity<RajaongkirResponse> response = restTemplate.exchange(
                API_URL,
                HttpMethod.POST,
                entity,
                RajaongkirResponse.class
        );

        return response.getBody();
    }

}

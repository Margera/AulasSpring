package com.curso.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import com.curso.hrpayroll.entities.Payment;
import com.curso.hrpayroll.entities.Worker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaymentService {

    @Value("${hr-worker.host}")
    private String workerHost;

    /* Com o RestTemplate posso chamar o endpoint do outro worker
       Apenas tenho que ter a classe do trabalhador junto 
    */
    @Autowired
    private RestTemplate restTemplate;

    public Payment getPayment(long workerId, int days){
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", ""+workerId);
        
        Worker worker = restTemplate.getForObject(workerHost+"/workers/{id}", Worker.class, uriVariables);
        
        return new Payment(worker.getName(), worker.getDaily_income(), days);
    }    
}

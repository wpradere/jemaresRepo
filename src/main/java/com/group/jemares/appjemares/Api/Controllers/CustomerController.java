package com.group.jemares.appjemares.Api.Controllers;

import com.group.jemares.appjemares.Api.Models.Request.CustomerRequest;
import com.group.jemares.appjemares.Api.Models.Response.CustomerResponse;
import com.group.jemares.appjemares.Infraestructure.AbsService.ICustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jem")
@AllArgsConstructor
public class CustomerController {

private final ICustomerService customerService;



@PostMapping("/create")
    public ResponseEntity<CustomerResponse> crear (@RequestBody CustomerRequest request){
    return ResponseEntity.ok(customerService.create(request));

}




}

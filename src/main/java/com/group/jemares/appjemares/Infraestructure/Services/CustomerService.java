package com.group.jemares.appjemares.Infraestructure.Services;

import com.group.jemares.appjemares.Api.Models.Request.CustomerRequest;
import com.group.jemares.appjemares.Api.Models.Response.CustomerResponse;
import com.group.jemares.appjemares.Domain.Entity.CustomerEntity;
import com.group.jemares.appjemares.Domain.Repository.CustomerRepository;
import com.group.jemares.appjemares.Infraestructure.AbsService.ICustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Service
@Slf4j
@AllArgsConstructor
public class CustomerService implements ICustomerService {

    private final CustomerRepository customerRepository;


    @Override
    public CustomerResponse create(CustomerRequest request) {
        var customer = CustomerEntity.builder()
                .customerID(request.getCustomerID())
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .idIdentificator(request.getIdIdentificator())
                .email(request.getEmail())
                .createAt(LocalDateTime.now())
                .build();
        var customerPersisted =this.customerRepository.save(customer);



        return this.entityToResponse(customerPersisted) ;
    }

    @Override
    public CustomerResponse readById(Long aLong) {


        return null;
    }

    @Override
    public List<CustomerResponse> getAll() {
        var listaCustomer = this.customerRepository.findAll();
        List <CustomerResponse> laCustomer = listaCustomer.stream().map(x->entityToResponse(x)).collect(Collectors.toList());
        laCustomer.forEach(x->System.out.println(x));
        return laCustomer;
    }

    @Override
    public CustomerResponse update(CustomerRequest request, Long aLong) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    private  CustomerResponse entityToResponse(CustomerEntity entity){
        var response = new CustomerResponse();
        BeanUtils.copyProperties(entity,response);
        return response;
    }


}

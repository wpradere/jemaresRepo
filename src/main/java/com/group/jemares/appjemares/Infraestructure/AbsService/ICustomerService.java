package com.group.jemares.appjemares.Infraestructure.AbsService;

import com.group.jemares.appjemares.Api.Models.Request.CustomerRequest;
import com.group.jemares.appjemares.Api.Models.Response.CustomerResponse;

public interface ICustomerService extends CrudService<CustomerRequest, CustomerResponse,Long>{
}

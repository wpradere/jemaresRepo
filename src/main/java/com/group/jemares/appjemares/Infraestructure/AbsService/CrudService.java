package com.group.jemares.appjemares.Infraestructure.AbsService;

public interface CrudService <REQUEST,RESPONSE,ID>{

    RESPONSE create(REQUEST request);


}

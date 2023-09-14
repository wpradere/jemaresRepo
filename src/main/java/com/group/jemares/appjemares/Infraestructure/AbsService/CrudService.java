package com.group.jemares.appjemares.Infraestructure.AbsService;

import java.util.List;

public interface CrudService <REQUEST,RESPONSE,ID>{

    RESPONSE create(REQUEST request);

    RESPONSE readById(ID id);

   List<RESPONSE> getAll();


    RESPONSE update(REQUEST request,ID id);


    void delete (ID id);






}

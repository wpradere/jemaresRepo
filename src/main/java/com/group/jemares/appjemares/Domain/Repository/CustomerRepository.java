package com.group.jemares.appjemares.Domain.Repository;


import com.group.jemares.appjemares.Domain.Entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerEntity,Long> {
}

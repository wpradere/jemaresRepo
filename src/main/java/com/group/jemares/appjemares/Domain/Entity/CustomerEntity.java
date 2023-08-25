package com.group.jemares.appjemares.Domain.Entity;

import com.group.jemares.appjemares.Util.IdentificatorCustomer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(value = "customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerEntity {
    @Id
    private Long customerID;
    private String firstName;
    private String lastName;
    private String idIdentificator;
    private IdentificatorCustomer tipeIdentificator;
    private String email;
    private LocalDateTime createAt;

}

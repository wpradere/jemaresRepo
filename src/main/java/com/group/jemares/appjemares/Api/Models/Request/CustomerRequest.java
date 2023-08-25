package com.group.jemares.appjemares.Api.Models.Request;

import com.group.jemares.appjemares.Util.IdentificatorCustomer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CustomerRequest {
    private Long customerID;
    private String firstName;
    private String lastName;
    private String idIdentificator;
    private IdentificatorCustomer tipeIdentificator;
    private String email;
}

package com.group.jemares.appjemares.Api.Models.Response;

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
public class CustomerResponse {
    private Long customerID;
    private String firstName;
    private String lastName;
    private String idIdentificator;
    private IdentificatorCustomer tipeIdentificator;
    private String email;
    private LocalDateTime createAt;
}

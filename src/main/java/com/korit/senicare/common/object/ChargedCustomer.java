package com.korit.senicare.common.object;

import java.util.ArrayList;
import java.util.List;

import com.korit.senicare.entity.CustomerEntity;

import lombok.Getter;

@Getter
public class ChargedCustomer {
    private Integer customerNumber;
    private String name;
    private String birth;
    private String location;

    private ChargedCustomer (CustomerEntity customerEntity) {
        this.customerNumber = customerEntity.getCustomerNumber();
        this.name = customerEntity.getName();
        this.birth = customerEntity.getBirth();
        this.location = customerEntity.getLocation();
    }

    public static List<ChargedCustomer> getList(List<CustomerEntity> customerEntites) {
        List<ChargedCustomer> customers = new ArrayList<>();

        for(CustomerEntity customerEntity: customerEntites){
            ChargedCustomer customer = new ChargedCustomer(customerEntity);
            customers.add(customer);
        }
        return customers;
    }

}



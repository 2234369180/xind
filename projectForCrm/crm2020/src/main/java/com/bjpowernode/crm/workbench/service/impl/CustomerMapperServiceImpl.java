package com.bjpowernode.crm.workbench.service.impl;

import com.bjpowernode.crm.workbench.domain.Customer;
import com.bjpowernode.crm.workbench.mapper.CustomerMapper;
import com.bjpowernode.crm.workbench.service.CustomerMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerMapperServiceImpl implements CustomerMapperService {
    @Autowired
    private CustomerMapper customerMapper;


    @Override
    public List<Customer> selectCustomerByName(String name) {
        return customerMapper.selectCustomerByName(name);
    }
}

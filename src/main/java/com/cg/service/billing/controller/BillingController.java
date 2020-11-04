package com.cg.service.billing.controller;

import com.cg.service.billing.data.Bill;
import com.cg.service.billing.data.Order;
import com.cg.service.billing.service.BillingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class BillingController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BillingController.class);

    private final BillingService billingService;

    public BillingController(BillingService billService) {
        this.billingService = billService;
    }

    @RequestMapping(value = "/api/v1/billing/create", method = RequestMethod.POST)
    public Bill createBill(@RequestBody Order orderObj) {
        LOGGER.info("Billing calculation started...");
        return this.billingService.generateBill(orderObj);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<String> getAllUsers() {
        LOGGER.info("Getting all strings...");
        List<String> supplierNames = Arrays.asList("string1", "string2", "string3");
        return supplierNames;
    }

}

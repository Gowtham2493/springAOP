package com.demo.springAOP.controller;

import com.demo.springAOP.model.Merchant;
import com.demo.springAOP.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MerchantController {
      @Autowired
        private MerchantService merchantService;

        @RequestMapping(value = "/add/merchant", method = RequestMethod.GET)
        public Merchant addMerchant() {
            String name ="Test Name";
            String merchantId = "1";
            return merchantService.createMerchant(name, merchantId);

        }

        @RequestMapping(value = "/remove/merchant", method = RequestMethod.GET)
        public String removeMerchant( @RequestParam("merchantId") String merchantId) {

            merchantService.deleteMerchant(merchantId);

            return "Merchant removed";
        }

}


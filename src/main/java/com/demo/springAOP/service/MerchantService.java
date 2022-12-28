package com.demo.springAOP.service;

import com.demo.springAOP.model.Merchant;
import org.springframework.stereotype.Service;

@Service
public class MerchantService {

    public Merchant createMerchant(String name, String merchantId) {
        Merchant merchant = new Merchant();
        merchant.setName(name);
        merchant.setMerchantId(merchantId);
        return merchant;
    }

    public void deleteMerchant(String merchantId) {

    }
}

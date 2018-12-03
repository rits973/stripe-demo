package com.rits.stripedemo.controller;

import com.rits.stripedemo.dto.ChargeInformation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 03/12/18
 */
@Controller
public class PaymentController {

        @Value("${STRIPE_PUBLIC_KEY}")
        private String stripePublicKey;

        @RequestMapping("/checkout")
        public String checkout(Model model) {
            model.addAttribute("amount", 50 * 100); // in cents
            model.addAttribute("stripePublicKey", stripePublicKey);
            model.addAttribute("currency", ChargeInformation.Currency.EUR);
            return "checkout";
        }
}

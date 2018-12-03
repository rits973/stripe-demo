package com.rits.stripedemo.dto;

import lombok.Data;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 03/12/18
 */
@Data
public class ChargeInformation {
        public enum Currency {
            EUR, USD;
        }
        private String description;
        private int amount;
        private Currency currency;
        private String stripeEmail;
        private String stripeToken;
}

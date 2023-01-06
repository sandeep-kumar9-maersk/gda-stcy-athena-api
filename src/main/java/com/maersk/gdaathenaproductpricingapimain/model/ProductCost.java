package com.maersk.gdaathenaproductpricingapimain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductCost {
    private double oceanCore_STCost;
    private double oceanTHC_STCost;
    private double inlandHaulage_STCost;
    private double total_CYCost;
}

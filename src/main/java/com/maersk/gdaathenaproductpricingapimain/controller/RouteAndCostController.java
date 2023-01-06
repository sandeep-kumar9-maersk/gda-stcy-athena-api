package com.maersk.gdaathenaproductpricingapimain.controller;

import com.maersk.gdaathenaproductpricingapimain.dao.ProductRequest;
import com.maersk.gdaathenaproductpricingapimain.dao.ProductResponse;
import com.maersk.gdaathenaproductpricingapimain.service.RouteAndCostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product-pricing")
public class RouteAndCostController {
    @Autowired
    private final RouteAndCostService routeAndCostService;

    @PostMapping ("/getRouteAndCost")
    Mono<ProductResponse> getRouteDetail(@RequestBody ProductRequest productRequest) {
        return routeAndCostService.getCostAndRouteInfo(productRequest);
    }
}

package com.maersk.gdaathenaproductpricingapimain.service;

import com.maersk.gdaathenaproductpricingapimain.dao.ProductRequest;
import com.maersk.gdaathenaproductpricingapimain.dao.ProductResponse;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public interface RouteAndCostService {

    Mono<ProductResponse> getCostAndRouteInfo(ProductRequest productRequest);

}

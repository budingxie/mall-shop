package com.mall.shopweb.filterconfig;


import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;

@Order(-1)
@Component
public class GlobalTokenFilter implements GlobalFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String token = exchange.getRequest().getQueryParams().getFirst("token");
        //统一进行token验证，鉴权，登录等逻辑暂时没有
        if (StringUtils.isBlank(token)) {
            ServerHttpResponse response = exchange.getResponse();
            response.getHeaders().add("Content-Type", "text/plain;charset=UTF-8");
            response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR);
            byte[] bytes = "token 为空".getBytes(StandardCharsets.UTF_8);
            DataBuffer buffer = response.bufferFactory().wrap(bytes);
            return response.writeWith(Flux.just(buffer));
        }
        return chain.filter(exchange);
    }

}

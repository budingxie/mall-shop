package com.mall.shopweb.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DemoData implements Serializable {

    private static final long serialVersionUID = 58643L;

    private Long id;

    private String name;

    private Integer age;
}

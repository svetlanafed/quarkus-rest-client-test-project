package com.svetlanafedorova.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Episode {

    private Long id;
    private String name;
    private Long season;
    private String summary;
}

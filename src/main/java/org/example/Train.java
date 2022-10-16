package org.example;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Train extends Transport{

    private String id;
    private int carriageCount;
    private boolean isExpress;

    @Override
    public float getPrice(City city) {
        return 0;
    }
}

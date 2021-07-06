package com.nikolayvaklinov.tacocloud.tacocloud_email.tacos.email;

import java.util.ArrayList;
import java.util.List;

import com.nikolayvaklinov.tacocloud.Taco;
import lombok.Data;

@Data
public class OrderEmail {

    private final String email;
    private List<TacoEmail> tacos = new ArrayList<>();

    public void addTaco(TacoEmail taco) {
        this.tacos.add(taco);
    }

}


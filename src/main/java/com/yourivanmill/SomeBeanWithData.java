package com.yourivanmill.test;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class SomeBeanWithData implements Serializable {

    private String data;

    @PostConstruct
    public void doSomething()
    {
        this.data = "Hey";
    }

    public String getData() {
        return data;
    }
}

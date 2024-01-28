package com.sky.coreonlinestore.component;


import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Cart {

    public final List<Integer> items;

    public Cart(List<Integer> items) {
        this.items = items;
    }

    public List<Integer> addItems(List<Integer> idList) {
        items.addAll(idList);
        return idList;
    }

    public List<Integer> getItems() {
        return Collections.unmodifiableList(items);
    }
}

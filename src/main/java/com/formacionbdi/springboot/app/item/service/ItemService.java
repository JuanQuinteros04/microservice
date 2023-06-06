package com.formacionbdi.springboot.app.item.service;

import com.formacionbdi.springboot.app.item.model.Item;

import java.util.List;

public interface ItemService {
    public List<Item> findAll();
    public Item findById(Long id, Integer cantidad);
}

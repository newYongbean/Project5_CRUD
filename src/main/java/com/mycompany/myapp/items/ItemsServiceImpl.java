package com.mycompany.myapp.items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemsServiceImpl implements ItemsService{

    @Autowired
    ITEMSDAO itemsDAO;

    @Override
    public int insertItems(ITEMSVO vo) {
        return itemsDAO.insertItems(vo);
    }

    @Override
    public int deleteItems(int seq) {
        return itemsDAO.deleteItems(seq);
    }

    @Override
    public int updateItems(ITEMSVO vo) {
        return itemsDAO.updateItems(vo);
    }

    @Override
    public ITEMSVO getItems(int seq) {
        return itemsDAO.getItems(seq);
    }

    @Override
    public List<ITEMSVO> getItemsList() {
        return itemsDAO.getItemsList();
    }
}

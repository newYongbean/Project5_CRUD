package com.mycompany.myapp.items;

import java.util.List;

public interface ItemsService {
    public int insertItems(ITEMSVO vo);

    public int deleteItems(int seq);

    public int updateItems(ITEMSVO vo);

    public ITEMSVO getItems(int seq);

    public List<ITEMSVO> getItemsList();

}

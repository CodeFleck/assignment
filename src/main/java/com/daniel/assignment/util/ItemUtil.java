package com.daniel.assignment.util;

import com.daniel.assignment.model.Item;
import java.util.HashMap;

public class ItemUtil {

    static HashMap<Item, Integer> itemVisualizationCounterMap = new HashMap<>();
    static HashMap<Item, Integer> itemStockMap = new HashMap<>();
    //TODO esta parte de data preciso ver online
//    static HashMap<Item, Date> itemVisualizationTimeStampMap = new HashMap<>();

    public static HashMap<Item, Integer> increaseVisualizationCounter(Item item) {
        if (!itemVisualizationCounterMap.containsKey(item)){
            itemVisualizationCounterMap.put(item, 1);
        } else {
            itemVisualizationCounterMap.put(item, itemVisualizationCounterMap.get(item).intValue()+1);
        }
        return itemVisualizationCounterMap;
    }

    public static HashMap<Item, Integer> decreaseInventory(Item item) { //TODO method to decrease stock, create verification for stock levels upon purchase
        if (!itemStockMap.containsKey(item)){
            itemStockMap.put(item, 4);
        } else {
            itemStockMap.put(item, itemStockMap.get(item).intValue()-1);
        }
        return itemStockMap;
    }
}

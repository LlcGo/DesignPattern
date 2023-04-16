package com.lc.behavioralPattern.command;

import java.util.HashMap;

/**
 * @Author Lc
 * @Date 2023/4/12
 * @Description
 */
public class Order {
    private int diningTable;
    private HashMap<String,Integer> foodDic;

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public HashMap<String, Integer> getFoodDic() {
        return foodDic;
    }

    public void setFoodDic(HashMap<String, Integer> foodDic) {
        this.foodDic = foodDic;
    }
}

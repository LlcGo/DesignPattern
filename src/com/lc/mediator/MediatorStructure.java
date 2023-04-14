package com.lc.mediator;

/**
 * @Author Lc
 * @Date 2023/4/14
 * @Description
 */
public class MediatorStructure implements Mediator{

    HouseOwner houseOwner;

    Tenant tenant;

    @Override
    public void constack(String message, Person person) {
         if(person == houseOwner){
             tenant.getMessage(message);
         }else {
             houseOwner.getMessage(message);
         }
    }

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
}

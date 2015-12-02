package org.common.kspring.rest.model;

/**
 * Created by jiazhong on 12/2/15.
 */
public class Shop {
    public String name;
    public String [] staffName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getStaffName() {
        return staffName;
    }

    public void setStaffName(String[] staffName) {
        this.staffName = staffName;
    }
}

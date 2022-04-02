package com.aranya.mall.tiny.emun;

public enum OrderType {
    EARLY(1,"尽快"),
    YUDING(2,"预定时间"),
    DABAO(3,"打包自提");
    private Integer code;
    private String name;

    OrderType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    OrderType(){

    }
    OrderType getByCode(Integer code){
        for (OrderType ot: OrderType.values()){
            if (ot.getCode().equals(code)){
                return ot;
            }
        }
        return null;
    }


}

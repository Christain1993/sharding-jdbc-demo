package cn.iocoder.springboot.lab18.shardingdatasource.dataobject;

import lombok.Data;

@Data
public class OrderDO {

    /**
     * 订单编号
     */
    private Long id;
    /**
     * 用户编号
     */
    private Integer userId;

}
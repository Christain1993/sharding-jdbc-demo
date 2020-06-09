package cn.iocoder.springboot.lab18.shardingdatasource.dataobject;

import lombok.Data;

@Data
public class OrderConfigDO {

    /**
     * 编号
     */
    private Integer id;
    /**
     * 支付超时时间
     *
     * 单位：分钟
     */
    private Integer payTimeout;

}

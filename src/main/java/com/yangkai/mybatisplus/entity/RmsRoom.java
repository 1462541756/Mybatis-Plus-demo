package com.yangkai.mybatisplus.entity;

import java.math.BigDecimal;
import com.yangkai.mybatisplus.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2021-03-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RmsRoom extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 房间名
     */
    private String name;

    /**
     * 房间状态(0-不可用/1-空闲)
     */
    private Integer status;

    /**
     * 清洁状态(0-未清洁，1-清洁中，2-已清洁)
     */
    private Integer clean;

    /**
     * 维修状态(0-未维修，1-维修中，2-维修完成)
     */
    private Integer maintenance;

    /**
     * 房间描述
     */
    private String description;

    /**
     * 楼层数
     */
    private Integer floor;

    /**
     * 房间序号
     */
    private String serial;

    /**
     * 排序号
     */
    private Long sort;

    /**
     * 房间价格
     */
    private BigDecimal price;

    /**
     * 房间图片地址
     */
    private String pic;


}

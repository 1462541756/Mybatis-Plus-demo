package com.yangkai.mybatisplus.entity;

import com.yangkai.mybatisplus.base.BaseEntity;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 入住记录
 * </p>
 *
 * @author jobob
 * @since 2021-03-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CmsCheck extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 订单号
     */
    private String orderSn;

    /**
     * 姓名
     */
    private String name;

    /**
     * 身份证号
     */
    private String cardId;

    /**
     * 入住登记时间
     */
    private LocalDateTime checkInTime;

    /**
     * 退房时间
     */
    private LocalDateTime checkOutTime;


}

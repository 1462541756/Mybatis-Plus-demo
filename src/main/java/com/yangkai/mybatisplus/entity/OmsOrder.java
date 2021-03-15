package com.yangkai.mybatisplus.entity;

import java.math.BigDecimal;
import com.yangkai.mybatisplus.base.BaseEntity;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author jobob
 * @since 2021-03-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OmsOrder extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 订单编号
     */
    private String orderSn;

    /**
     * 用户账号
     */
    private String username;

    /**
     * 应付金额（实际支付金额）
     */
    private BigDecimal payAmount;

    /**
     * 支付方式：0->未支付；1->支付宝；2->微信，3->现金
     */
    private Integer payType;

    /**
     * 订单来源：0->PC订单；1->app订单，2->线下订单
     */
    private Integer sourceType;

    /**
     * 订单状态：0->未付款；1->已付款；，2->已取消
     */
    private Integer status;

    /**
     * 订单类型：0->正常订单；1->秒杀订单
     */
    private Integer orderType;

    /**
     * 订单备注
     */
    private String note;

    /**
     * 支付时间
     */
    private LocalDateTime paymentTime;

    /**
     * 评价时间
     */
    private LocalDateTime commentTime;

    /**
     * 提交时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime modifyTime;

    /**
     * 房间名
     */
    private String roomName;

    /**
     * 楼层号
     */
    private Integer floor;

    /**
     * 房间号
     */
    private String serial;

    /**
     * 房间图片
     */
    private String pic;

    /**
     * 房间id
     */
    private Long roomId;

    /**
     * 身份证号
     */
    private String cardId;

    /**
     * 登记入住状态：0->未登记入住；1->已登记入住；2->已退房
     */
    private Integer registerStatus;

    private LocalDateTime checkInTime;

    private LocalDateTime checkOutTime;


}

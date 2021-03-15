package com.yangkai.mybatisplus.entity;

import com.yangkai.mybatisplus.base.BaseEntity;
import java.time.LocalDateTime;
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
public class EmsEvent extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 事件主题
     */
    private String subject;

    /**
     * 事件类别：1清洁,2修理
     */
    private Integer type;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 审核时间
     */
    private LocalDateTime checkTime;

    /**
     * 任务接收时间
     */
    private LocalDateTime receiveTime;

    /**
     * 完成时间
     */
    private LocalDateTime finishTime;

    /**
     * 事件状态：0未提交,1待审核、2审核不通过、3审核通过
     */
    private Integer checkStatus;

    /**
     * 上报人
     */
    private String reportPeople;

    /**
     * 审核人
     */
    private String checkPeople;

    /**
     * 审核意见
     */
    private String checkOpinion;

    /**
     * 处理人
     */
    private String handlePeople;

    /**
     * 相关图片
     */
    private String pic;

    /**
     * 事件状态：0->待处理，1->处理中，2->处理完成
     */
    private Integer status;


}

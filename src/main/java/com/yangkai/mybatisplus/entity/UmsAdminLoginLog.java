package com.yangkai.mybatisplus.entity;

import com.yangkai.mybatisplus.base.BaseEntity;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 后台用户登录日志表
 * </p>
 *
 * @author jobob
 * @since 2021-03-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UmsAdminLoginLog extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long adminId;

    private LocalDateTime createTime;

    private String ip;

    private String address;

    /**
     * 浏览器登录类型
     */
    private String userAgent;


}

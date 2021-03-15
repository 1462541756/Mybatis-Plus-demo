package com.yangkai.mybatisplus.entity;

import com.yangkai.mybatisplus.base.BaseEntity;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 资源分类表
 * </p>
 *
 * @author jobob
 * @since 2021-03-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UmsResourceCategory extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 排序
     */
    private Integer sort;


}

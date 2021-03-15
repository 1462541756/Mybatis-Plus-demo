package com.yangkai.mybatisplus.entity;

import com.yangkai.mybatisplus.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 后台用户和角色关系表
 * </p>
 *
 * @author jobob
 * @since 2021-03-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UmsAdminRoleRelation extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long adminId;

    private Long roleId;


}

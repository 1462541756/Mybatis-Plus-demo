package com.yangkai.mybatisplus.service.impl;

import com.yangkai.mybatisplus.entity.OmsOrder;
import com.yangkai.mybatisplus.mapper.OmsOrderMapper;
import com.yangkai.mybatisplus.service.IOmsOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2021-03-15
 */
@Service
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderMapper, OmsOrder> implements IOmsOrderService {

}

package com.mybatis.plus.bug.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mybatis.plus.bug.demo.entity.EncryptTestDo;
import com.mybatis.plus.bug.demo.mapper.EncryptTestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class EncryptTestGateway extends ServiceImpl<EncryptTestMapper, EncryptTestDo> {

    private final EncryptTestMapper mapper;

    public EncryptTestDo getByCode(String code) {
        return getBaseMapper().selectOne(new LambdaQueryWrapper<EncryptTestDo>().eq(EncryptTestDo::getCode, code));
    }

    public void testEqAndIn(String code, ArrayList<String> strings) {
        remove(lambdaQuery().eq(EncryptTestDo::getCode, code).in(EncryptTestDo::getVar, strings));
    }
}

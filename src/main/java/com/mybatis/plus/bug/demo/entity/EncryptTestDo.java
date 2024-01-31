package com.mybatis.plus.bug.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
@Accessors(chain = true)
@TableName(value = "encrypt_test", autoResultMap = true)
public class EncryptTestDo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @TableField(value = "code")
    private String code;

    @TableField(value = "name")
    private String name;

    @TableField(value = "var")
    private String var;

}

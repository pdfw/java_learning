package com.beyond_h.ota.week04.model;

import lombok.Data;
import lombok.experimental.Builder;

/**
 * 通过Lombok注解方式创建一个实体
 * 创建一个构建器(Builder)模式实例
 */
public @Data @Builder class Student {

    String studentId;
    String studentName;
}

package com.itheima.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = -3589348446974976773L;

    private Integer id;
    private Integer age;
    private String username;
    private String password;
    private String email;
    private String sex;


}

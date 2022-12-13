package com.test.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author llfdd
 * @since 2022-11-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_user")
public class User implements Serializable {


    /**
     * 用户id
     */
    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    /**
     * 用户名
     */
    private String uname;

    /**
     * 用户密码
     */
    private String upwd;

    /**
     * 用户图片;默认为黑白头像
     */
    private String uimg;

    /**
     * 用户手机号
     */
    private String utelnum;

    /**
     * 用户性别
     */
    private String usex;

    /**
     * 用户生日
     */
    private LocalDate ubirthday;

    /**
     * 用户地址
     */
    private String uaddr;

    /**
     * 0:普通用户；1：会员 ；2管理员
     */
    private Integer utype;

    private String b1;

    private String b2;

    private String b3;


}

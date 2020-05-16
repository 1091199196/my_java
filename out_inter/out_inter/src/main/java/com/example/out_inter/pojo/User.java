package com.example.out_inter.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "用户信息")
public class User {

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "性别")
    private String sex;


    @ApiModelProperty(value = "民族")
    private String nation;

     @ApiModelProperty(value = "生日")
    private String birthday;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "身份证号码")
    private String idNumber;

    @ApiModelProperty(value = "头像图片base64")
    private String headBase64;

    @ApiModelProperty(value = "身份证正面图片")
    private String frontBase64;

    @ApiModelProperty(value = "身份证反面图片")
    private String backBase64;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getHeadBase64() {
        return headBase64;
    }

    public void setHeadBase64(String headBase64) {
        this.headBase64 = headBase64;
    }

    public String getFrontBase64() {
        return frontBase64;
    }

    public void setFrontBase64(String frontBase64) {
        this.frontBase64 = frontBase64;
    }

    public String getBackBase64() {
        return backBase64;
    }

    public void setBackBase64(String backBase64) {
        this.backBase64 = backBase64;
    }
}

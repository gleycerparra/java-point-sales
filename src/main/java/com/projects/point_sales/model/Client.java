package com.projects.point_sales.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.projects.point_sales.constants.Constants;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(length = 50, name = "document")
    @NotNull(message = Constants.MESSAGE_NOT_NULL)
    @NotBlank(message = Constants.MESSAGE_NOT_BLANK)
    @NotEmpty(message = Constants.MESSAGE_NOT_EMPTY)
    private String document;

    @Column(length = 50, name = "name")
    @NotNull(message = Constants.MESSAGE_NOT_NULL)
    @NotBlank(message = Constants.MESSAGE_NOT_BLANK)
    @NotEmpty(message = Constants.MESSAGE_NOT_EMPTY)
    private String name;

    @Column(length = 50, name = "lastnames")
    @NotNull(message = Constants.MESSAGE_NOT_NULL)
    @NotBlank(message = Constants.MESSAGE_NOT_BLANK)
    @NotEmpty(message = Constants.MESSAGE_NOT_EMPTY)
    private String lastnames;

    @Column(length = 50, name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "mobilePhone")
    private String mobilePhone;

    @Column(name = "email")
    private String email;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "updatedAt")
    private Date updatedAt;

    @Column(name = "state")
    @NotNull(message = Constants.MESSAGE_NOT_NULL)
    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastnames() {
        return lastnames;
    }

    public void setLastnames(String lastnames) {
        this.lastnames = lastnames;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }


}
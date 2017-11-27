package org.liyubo.spring.restsecurity.entity;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

public class User {
    public interface UserSimpleView{};
    public interface UserDetailView extends UserSimpleView{};

    private Integer id;
    private int age;
    private String userName;
    private String password;

    @JsonView(UserSimpleView.class)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @JsonView(UserSimpleView.class)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @JsonView(UserSimpleView.class)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    @JsonView(UserDetailView.class)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

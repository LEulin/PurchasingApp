/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicinepurchasingapp;

/**
 *
 * @author 2ndyrGroupB
 */
public class User {
    private String name;
    private int age;
    private int discount;
    private String username;
    private String password;
    

    public User() {
    }

    public User(String name, int age, int discount, String username, String password) {
        this.name = name;
        this.age = age;
        this.discount = discount;
        this.username = username;
        this.password = password;
    }

    public User(String name, int age, String username, String password) {
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getDiscount() {
        return discount;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }  
}

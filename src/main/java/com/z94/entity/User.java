
package com.z94.entity;

/**
 * This is a entity.
 *
 * @author Z94
 * @since jdk1.7
 * @version 2018年1月17日 Z94
 */
public class User {
    
    /** account */
    private String account;
    
    /** password */
    private String password;
    
    /**
     * get account
     *
     * @return account
     */
    public String getAccount() {
        return account;
    }
    
    /**
     * set account
     *
     * @param account account
     */
    public void setAccount(String account) {
        this.account = account;
    }
    
    /**
     * get password
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * set password
     *
     * @param password password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}

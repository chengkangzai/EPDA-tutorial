/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author guan.kiat
 */
@Entity
public class MyCustomer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private int password;
    
    @OneToMany
    private ArrayList<Account> myAccount = new ArrayList<Account>();

    public MyCustomer(String id, int password, Account a) {
        this.id = id;
        this.password = password;
        myAccount.add(a);
    }

    public MyCustomer() {
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public ArrayList<Account> getMyAccount() {
        return myAccount;
    }

    public void setMyAccount(ArrayList<Account> myAccount) {
        this.myAccount = myAccount;
    }

    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MyCustomer)) {
            return false;
        }
        MyCustomer other = (MyCustomer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.MyCustomer[ id=" + id + " ]";
    }
    
}

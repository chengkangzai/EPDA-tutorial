package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Account;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-01-28T17:49:58")
@StaticMetamodel(MyCustomer.class)
public class MyCustomer_ { 

    public static volatile SingularAttribute<MyCustomer, Integer> password;
    public static volatile SingularAttribute<MyCustomer, String> id;
    public static volatile ListAttribute<MyCustomer, Account> myAccount;

}
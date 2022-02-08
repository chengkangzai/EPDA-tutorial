/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author CCK
 */
@Stateless
public class MyCustomerFacade extends AbstractFacade<MyCustomer> {

    @PersistenceContext(unitName = "WebApp-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MyCustomerFacade() {
        super(MyCustomer.class);
    }

    public List<MyCustomer> searchByGender(char g) {
        Query q = em.createNamedQuery("MyCustomer.byGender");
        q.setParameter("b", g);
        return q.getResultList();
    }

}

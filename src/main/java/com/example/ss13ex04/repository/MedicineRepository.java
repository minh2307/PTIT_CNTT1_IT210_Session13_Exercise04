package com.example.ss13ex04.repository;

import com.example.ss13ex04.model.Medicine;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MedicineRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }


    public void save(Medicine medicine) {
        Session session = getCurrentSession();
        session.persist(medicine);
    }

    public void update(Medicine medicine) {
        Session session = getCurrentSession();
        session.merge(medicine);
    }


    public List<Medicine> findAll() {
        Session session = getCurrentSession();
        String hql = "FROM Medicine m ORDER BY m.expiryDate ASC";
        Query<Medicine> query = session.createQuery(hql, Medicine.class);
        return query.list();
    }

    public List<Medicine> findByName(String medicineName) {
        Session session = getCurrentSession();String hql = "FROM Medicine m WHERE m.name LIKE :name ORDER BY m.expiryDate ASC";

        return session.createQuery(hql, Medicine.class)
                .setParameter("name", "%" + medicineName + "%")
                .getResultList();
    }

}

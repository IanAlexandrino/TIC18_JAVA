package org.example;

import academico.Estudante;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        //Estudante e1 = new Estudante(null, "Tõe", "toe@tutu", "111111");
        //Estudante e2 = new Estudante(null, "Lia", "lia@tutu", "222222");
        //Estudante e3 = new Estudante(null, "Tuca", "tuca@tutu", "333333");

        //EntityManagerFactory emf =
        //Persistence.createEntityManagerFactory("unit_academico");

        // EntityManager em = emf.createEntityManager();

        //em.getTransaction().begin();
        //em.persist(e1);
        //em.persist(e2);
        //em.persist(e3);
        //em.getTransaction().commit();
        //em.close();
        //emf.close();

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("unit_academico");
        EntityManager em = emf.createEntityManager();

        Estudante r = em.find(Estudante.class, 2);

        System.out.println(r.getNome());
        em.close();
        emf.close();
    }
}
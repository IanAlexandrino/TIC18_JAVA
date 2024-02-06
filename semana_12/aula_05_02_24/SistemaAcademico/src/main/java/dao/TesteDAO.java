package dao;

import academico.Curso;
import academico.Estudante;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class TesteDAO {

    public static void preparaBD(EntityManager em){

        Curso c1 = new Curso(null, "Matemática", 8);
        Curso c2 = new Curso(null, "Computação", 10);
        Curso c3 = new Curso(null, "Matemática", 8);

        Estudante e1 = new Estudante(null, c1, "Tõe", "toe@tutu", "111111");
        Estudante e2 = new Estudante(null, c1, "Lia", "lia@tutu", "222222");
        Estudante e3 = new Estudante(null, c1, "Tuca", "tuca@tutu", "333333");
        Estudante e4 = new Estudante(null, c2, "Peu", "peu@tutu", "444444");
        Estudante e5 = new Estudante(null, c2, "Leo", "leo@tutu", "555555");
        Estudante e6 = new Estudante(null, c3, "Val", "val@tutu", "666666");

        em.getTransaction().begin();
        em.persist(c1);
        em.persist(c2);
        em.persist(c3);
        em.persist(e1);
        em.persist(e2);
        em.persist(e3);
        em.persist(e4);
        em.persist(e5);
        em.persist(e6);
        em.getTransaction().commit();

    }

    public static void listarTodosEstudantes(EntityManager em){

        String jpql = "select e from Estudante e";
        TypedQuery<Estudante> typedQuery =
                em.createQuery(jpql, Estudante.class);
        List<Estudante> lista = typedQuery.getResultList();
        for (Estudante e : lista){

            System.out.println(e.getNome());

        }

    }

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("unit_academico");

        EntityManager em = emf.createEntityManager();
        TesteDAO.preparaBD(em);

        TesteDAO.listarTodosEstudantes(em);

        em.close();
        emf.close();

        System.out.println("BD Recriado");

    }

}

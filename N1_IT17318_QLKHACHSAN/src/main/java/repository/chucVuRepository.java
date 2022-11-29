package repository;

import java.util.List;
import javax.persistence.TypedQuery;
import domainModels.ChucVu;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import utilities.HibernateUtil;

/**
 *
 * @author thanh
 */
public class chucVuRepository implements IchucVuRepository {

    @Override
    public List<ChucVu> getlistChucVu() {
        List<ChucVu> listChucVu;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT p FROM ChucVu p";
            TypedQuery<ChucVu> query = session.createQuery(hql, ChucVu.class);
            listChucVu = query.getResultList();
        }
        return listChucVu;
    }

    @Override
    public ChucVu save(ChucVu chucVu) {
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(chucVu);
                trans.commit();
            } catch (Exception e) {
                trans.rollback();
                chucVu = null;
            }
        } finally {
            return chucVu;
        }
    }

    @Override
    public String delete(String maCV) {
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                String hql = "DELETE ChucVu m WHERE m.maChucVu = :MaChucVu";
                Query query = session.createQuery(hql);
                query.setParameter("MaChucVu", maCV);
                int result = query.executeUpdate();
                if (result == 0) {
                    maCV = null;
                }
                trans.commit();
            } catch (Exception e) {
            }

        }
        return maCV;
    }

    @Override
    public List<ChucVu> getChucVuByMa(String maCV) {
        List<ChucVu> listChucVu;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT s FROM ChucVu s WHERE s.maChucVu = :MaChucVu";
            TypedQuery<ChucVu> query = session.createQuery(hql, ChucVu.class);
            query.setParameter("MaChucVu", maCV);
            listChucVu = query.getResultList();
        }
        return listChucVu;
    }

    @Override
    public List<ChucVu> getChucVuByName(String tenCV) {
        List<ChucVu> listChucVu;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT s FROM ChucVu s WHERE s.tenChucVu = :TenChucVu";
            TypedQuery<ChucVu> query = session.createQuery(hql, ChucVu.class);
            query.setParameter("TenChucVu", tenCV);
            listChucVu = query.getResultList();
        }
        return listChucVu;
    }

    @Override
    public ChucVu getChucVu(String tenCV) {
        ChucVu chucVu;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT s FROM ChucVu s WHERE s.tenChucVu = :TenChucVu";
            TypedQuery<ChucVu> query = session.createQuery(hql, ChucVu.class);
            query.setParameter("TenChucVu", tenCV);
            chucVu = query.getSingleResult();
        }
        return chucVu;
    }

}

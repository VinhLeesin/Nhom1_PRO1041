package repository;

import domainModels.TaiKhoan;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import utilities.HibernateUtil;

/**
 *
 * @author ADMIN
 */
public class taiKhoanRepository implements ItaiKhoanRepository {

    @Override
    public List<TaiKhoan> getListTaiKhoan() {
        List<TaiKhoan> listTaiKhoan;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT p FROM TaiKhoan p";
            TypedQuery<TaiKhoan> query = session.createQuery(hql, TaiKhoan.class);
            listTaiKhoan = query.getResultList();
        }
        return listTaiKhoan;
    }

    @Override
    public List<TaiKhoan> getTaiKhoanByName(String tenTK) {
        List<TaiKhoan> listTaiKhoan;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT p FROM TaiKhoan p WHERE p.tenTK = :tenTK";
            TypedQuery<TaiKhoan> query = session.createQuery(hql, TaiKhoan.class);
            query.setParameter("tenTK", tenTK);
            listTaiKhoan = query.getResultList();
        }
        return listTaiKhoan;
    }

    @Override
    public TaiKhoan save(TaiKhoan taiKhoan) {
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(taiKhoan);
                trans.commit();
            } catch (Exception e) {
                trans.rollback();
                taiKhoan = null;
            }
        } finally {
            return taiKhoan;
        }
    }

    @Override
    public String deleteTaiKhoan(String tenTK) {
                try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                String hql = "DELETE TaiKhoan m WHERE m.tenTK = :TenTK";
                Query query = session.createQuery(hql);
                query.setParameter("TenTK", tenTK);
                int result = query.executeUpdate();
                if (result == 0) {
                    tenTK = null;
                }
                trans.commit();
            } catch (Exception e) {
            }

        }
        return tenTK;
    }

}

package repository;

import java.util.List;
import javax.persistence.TypedQuery;
import domainModels.NhanVien;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import utilities.HibernateUtil;

/**
 *
 * @author ADMIN
 */
public class nhanVienRepository implements InhanVienRepository {

    @Override
    public List<NhanVien> getListNhanVien() {
        List<NhanVien> listNhanVien;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT p FROM NhanVien p";
            TypedQuery<NhanVien> query = session.createQuery(hql, NhanVien.class);
            listNhanVien = query.getResultList();
        }
        return listNhanVien;
    }

    @Override
    public NhanVien save(NhanVien nhanVien) {
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(nhanVien);
                trans.commit();
            } catch (Exception e) {
                trans.rollback();
                nhanVien = null;
            }
        } finally {
            return nhanVien;
        }
    }

    @Override
    public String deleteNhanVien(String maNV) {
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                String hql = "DELETE NhanVien m WHERE m.maNV = :maNV";
                Query query = session.createQuery(hql);
                query.setParameter("maNV", maNV);
                int result = query.executeUpdate();
                if (result == 0) {
                    maNV = null;
                }
                trans.commit();
            } catch (Exception e) {
            }

        }
        return maNV;
    }

    @Override
    public List<NhanVien> getNhanVienByMaNV(String maNV) {
        List<NhanVien> listNhanVien;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT s FROM NhanVien s WHERE s.maNV = :maNV";
            TypedQuery<NhanVien> query = session.createQuery(hql, NhanVien.class);
            query.setParameter("maNV", maNV);
            listNhanVien = query.getResultList();
        }
        return listNhanVien;
    }

    @Override
    public List<NhanVien> getNhanVienByName(String tenNV) {
        List<NhanVien> listNhanVien;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT s FROM NhanVien s WHERE s.tenNV = :tenNV";
            TypedQuery<NhanVien> query = session.createQuery(hql, NhanVien.class);
            query.setParameter("tenNV", tenNV);
            listNhanVien = query.getResultList();
        }
        return listNhanVien;
    }

    @Override
    public List<NhanVien> findNhanVienByName(String tenNV, String diaChiNV) {
        List<NhanVien> listNhanVien;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT s FROM NhanVien s WHERE s.tenNV like :tenNV or s.diaChiNV like :diaChiNV";
            TypedQuery<NhanVien> query = session.createQuery(hql, NhanVien.class);
            query.setParameter("tenNV", "%" + tenNV + "%");
            query.setParameter("diaChiNV", "%" + diaChiNV + "%");
            listNhanVien = query.getResultList();
        }
        return listNhanVien;
    }

    @Override
    public List<NhanVien> OrderNhanVienByMaNV() {
        List<NhanVien> listNhanVien;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT s FROM NhanVien s ORDER BY MaNV ASC";
            TypedQuery<NhanVien> query = session.createQuery(hql, NhanVien.class);
            listNhanVien = query.getResultList();
        }
        return listNhanVien;
    }

    @Override
    public List<NhanVien> OrderNhanVienByName() {
        List<NhanVien> listNhanVien;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT s FROM NhanVien s ORDER BY TenNhanVien ASC";
            TypedQuery<NhanVien> query = session.createQuery(hql, NhanVien.class);
            listNhanVien = query.getResultList();
        }
        return listNhanVien;
    }

    @Override
    public List<NhanVien> OrderNhanVienByDiaChi() {
        List<NhanVien> listNhanVien;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT s FROM NhanVien s ORDER BY DiaChi ASC";
            TypedQuery<NhanVien> query = session.createQuery(hql, NhanVien.class);
            listNhanVien = query.getResultList();
        }
        return listNhanVien;
    }

    @Override
    public NhanVien getNhanVien(String tenNV) {
        NhanVien nhanVien;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT s FROM NhanVien s WHERE s.tenNV = :tenNV";
            TypedQuery<NhanVien> query = session.createQuery(hql, NhanVien.class);
            query.setParameter("tenNV", tenNV);
            nhanVien = query.getSingleResult();
        }
        return nhanVien;
    }
}
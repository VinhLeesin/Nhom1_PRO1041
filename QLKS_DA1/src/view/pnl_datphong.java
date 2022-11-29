/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import domainmodel.dKhachhang;
import domainmodel.dloaiphong;
import domainmodel.dphong;
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import services.ILoaiphong;
import services.IPhong;
import services.impl.Lphong_service;
import services.impl.Phong_service;
import static view.pnl_Phong.form;
import viewmodel.vPhong;

/**
 *
 * @author MrpDuy
 */
public class pnl_datphong extends javax.swing.JPanel {

    public static pnl_datphong form;
    List<vPhong> LPH = new ArrayList<>();
    List<dphong> LVH;
    List<dloaiphong> LLP;
    IPhong psv = new Phong_service();
    ILoaiphong lpsv = new Lphong_service();

    /**
     * Creates new form pn_datphong
     */
    public pnl_datphong() {
        initComponents();
        form = this;

        Fillphong();

    }

    public void Fillphong() {
        pnl.removeAll();

        LPH = psv.getAlldataPhong();
//        ResultSet rs = DAO.DAO_Phong.LayPhong(TrangThai);
        int sapxep = LPH.size();
        pnl.setLayout(new GridLayout(1, 5, 2, 5));

        if (LPH != null) {
            JButton[] btn = new JButton[LPH.size()];
            for (int i = 0; i < LPH.size(); i++) {
                btn[i] = new javax.swing.JButton();
                //  btn[i].setText("Phòng " + String.valueOf(arrPhong.get(i).getMaPhong()) + "(" + arrPhong.get(i).getTenLoaiPhong() + ")");
                //  btn[i].setBackground(Color.decode("#F8E6E0"));
                btn[i].setFont(new java.awt.Font("Segoe", 1, 13));
                btn[i].setPreferredSize(new Dimension(150, 150));
                btn[i].setHorizontalTextPosition((int) CENTER_ALIGNMENT);
                btn[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btn[i].setFont(new java.awt.Font("Segoe", 1, 15));
                btn[i].setForeground(Color.decode("#000000"));
               
                if (LPH.get(i).getTtrang() == 0) {
                    JButton btnPhong = btn[i];
                    btn[i].setBackground(Color.decode("#CCFFCC"));
                     String MaPhong = String.valueOf(LPH.get(i).getMap());
                double Giagio = LPH.get(i).getLoaip().getgGio();
                double Giangay = LPH.get(i).getLoaip().getgNgay();
                    String a = ("<html><div style=\"text-align: center;\">Phòng " + String.valueOf(LPH.get(i).getMap()) + "<br>" + "Sẵn sàng...</div></html>");
                    btn[i].setText(a);
                    btn[i].setToolTipText(a);
                    btn[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_bed_100px.png")));
                    btn[i].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            DatphongUI frm = new DatphongUI();
                            DatphongUI.MaPhong = MaPhong;
                            DatphongUI.GiaTheoGio = Giagio;
                            DatphongUI.GiaTheoNgay = Giangay;
                            frm.setVisible(true);

                        }
                    });
                } else if (LPH.get(i).getTtrang() == 1) {

                    btn[i].setBackground(Color.decode("#6666FF"));
                     String MaPhong = String.valueOf(LPH.get(i).getMap());
                double Giagio = LPH.get(i).getLoaip().getgGio();
                double Giangay = LPH.get(i).getLoaip().getgNgay();
                    String a = ("<html><div style=\"text-align: center;\">Phòng " + String.valueOf(LPH.get(i).getMap()) + "<br>" + "Dọn dẹp...</div></html>");
                    btn[i].setText(a);
                    btn[i].setMinimumSize(new Dimension(101, 101));
                    btn[i].setToolTipText(a);
                    btn[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_broom_with_a_lot_of_dust_100px.png")));
                    btn[i].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            int chon = JOptionPane.showConfirmDialog(null, "Dọn phòng hoàn tất", "OK", JOptionPane.OK_CANCEL_OPTION);
                            if (chon == 0) {
                               psv.doitt(0, MaPhong);
                                MenuUIFull frm = MenuUIFull.b;
                                frm.tab.remove(pnl_datphong.form);
                                pnl_datphong pnl = new pnl_datphong();
                                frm.tab.add("Danh sách phòng", pnl);
                                frm.tab.setSelectedComponent(pnl);
                            }
                        }
                    });

                } else if (LPH.get(i).getTtrang() == 2) {
                    btn[i].setForeground(Color.decode("#FFFFFF"));
                    btn[i].setBackground(Color.decode("#FF3333"));
                     String MaPhong = String.valueOf(LPH.get(i).getMap());
                double Giagio = LPH.get(i).getLoaip().getgGio();
                double Giangay = LPH.get(i).getLoaip().getgNgay();
                    String a = ("<html><div style=\"text-align: center;\">Phòng " + String.valueOf(LPH.get(i).getMap()) + "<br>" + "Sử dụng...</div></html>");
                    btn[i].setText(a);
                    btn[i].setMinimumSize(new Dimension(101, 101));
//                    btn[i].setMaximumSize(new Dimension(101, 101));
                    btn[i].setToolTipText(a);
                    btn[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Dreaming_In_Bed_100px.png")));
                    btn[i].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            int chon = JOptionPane.showConfirmDialog(null, "Xem chi tiết thuê phòng", "Chi tiết thuê phòng", JOptionPane.OK_CANCEL_OPTION);
                            if (chon == 0) {
   
                                CTThuePhongUI frm = new CTThuePhongUI();
                                CTThuePhongUI.MaP = MaPhong;
                                CTThuePhongUI.GiaTheoGio = Giagio;
                                CTThuePhongUI.GiaTheoNgay = Giangay;
                                frm.setVisible(true);
                            }
                        }
                    });

                } else if (LPH.get(i).getTtrang() == 3) {

                    btn[i].setBackground(Color.decode("#99FFFF"));

                    String a = ("<html><div style=\"text-align: center;\">Phòng " + String.valueOf(LPH.get(i).getMap()) + "<br>" + "Đặt trước...</div></html>");
                    btn[i].setText(a);
                    btn[i].setMinimumSize(new Dimension(101, 101));
//                    btn[i].setMaximumSize(new Dimension(101, 101));
                    btn[i].setToolTipText(a);

                    btn[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_time_100px.png")));

                }
                pnl.add(btn[i]);
                pnl.updateUI();
            }

        }

    }
    
    
    public void Fillphong1(int Tinhtrang) {
            pnl.removeAll();

        LPH = psv.getAlldataPhong();
//        ResultSet rs = DAO.DAO_Phong.LayPhong(TrangThai);
        int sapxep = LPH.size();
        pnl.setLayout(new GridLayout(1, 5, 2, 5));

        if (LPH != null) {
            JButton[] btn = new JButton[LPH.size()];
            for (int i = 0; i < LPH.size(); i++) {
                btn[i] = new javax.swing.JButton();
                //  btn[i].setText("Phòng " + String.valueOf(arrPhong.get(i).getMaPhong()) + "(" + arrPhong.get(i).getTenLoaiPhong() + ")");
                //  btn[i].setBackground(Color.decode("#F8E6E0"));
                btn[i].setFont(new java.awt.Font("Segoe", 1, 13));
                btn[i].setPreferredSize(new Dimension(150, 150));
                btn[i].setHorizontalTextPosition((int) CENTER_ALIGNMENT);
                btn[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btn[i].setFont(new java.awt.Font("Segoe", 1, 15));
                btn[i].setForeground(Color.decode("#000000"));
                String MaPhong = String.valueOf(LPH.get(i).getMap());
                double Giagio = LPH.get(i).getLoaip().getgGio();
                double Giangay = LPH.get(i).getLoaip().getgNgay();
                if (LPH.get(i).getTtrang() == 0) {
                    JButton btnPhong = btn[i];
                    btn[i].setBackground(Color.decode("#CCFFCC"));

                    String a = ("<html><div style=\"text-align: center;\">Phòng " + String.valueOf(LPH.get(i).getMap()) + "<br>" + "Sẵn sàng...</div></html>");
                    btn[i].setText(a);
                    btn[i].setToolTipText(a);
                    btn[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_bed_100px.png")));
                    btn[i].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            DatphongUI frm = new DatphongUI();
                            DatphongUI.MaPhong = MaPhong;
                            DatphongUI.GiaTheoGio = Giagio;
                            DatphongUI.GiaTheoNgay = Giangay;
                            frm.setVisible(true);

                        }
                    });
                } else if (LPH.get(i).getTtrang() == 1) {

                    btn[i].setBackground(Color.decode("#6666FF"));

                    String a = ("<html><div style=\"text-align: center;\">Phòng " + String.valueOf(LPH.get(i).getMap()) + "<br>" + "Dọn dẹp...</div></html>");
                    btn[i].setText(a);
                    btn[i].setMinimumSize(new Dimension(101, 101));
                    btn[i].setToolTipText(a);
                    btn[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_broom_with_a_lot_of_dust_100px.png")));
                    btn[i].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            int chon = JOptionPane.showConfirmDialog(null, "Dọn phòng hoàn tất", "OK", JOptionPane.OK_CANCEL_OPTION);
                            if (chon == 0) {
                               psv.doitt(0, MaPhong);
                                MenuUIFull frm = MenuUIFull.b;
                                frm.tab.remove(pnl_datphong.form);
                                pnl_datphong pnl = new pnl_datphong();
                                frm.tab.add("Danh sách phòng", pnl);
                                frm.tab.setSelectedComponent(pnl);
                            }
                        }
                    });

                } else if (LPH.get(i).getTtrang() == 2) {
                    btn[i].setForeground(Color.decode("#FFFFFF"));
                    btn[i].setBackground(Color.decode("#FF3333"));

                    String a = ("<html><div style=\"text-align: center;\">Phòng " + String.valueOf(LPH.get(i).getMap()) + "<br>" + "Sử dụng...</div></html>");
                    btn[i].setText(a);
                    btn[i].setMinimumSize(new Dimension(101, 101));
//                    btn[i].setMaximumSize(new Dimension(101, 101));
                    btn[i].setToolTipText(a);
                    btn[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Dreaming_In_Bed_100px.png")));
                    btn[i].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            int chon = JOptionPane.showConfirmDialog(null, "Xem chi tiết thuê phòng", "Chi tiết thuê phòng", JOptionPane.OK_CANCEL_OPTION);
                            if (chon == 0) {
                                //UPDATE Tranf=g thai phong

                                //Tai lai form
                                CTThuePhongUI frm = new CTThuePhongUI();
                                CTThuePhongUI.MaP = MaPhong;
                                CTThuePhongUI.GiaTheoGio = Giagio;
                                CTThuePhongUI.GiaTheoNgay = Giangay;
                                frm.setVisible(true);
                            }
                        }
                    });

                } else if (LPH.get(i).getTtrang() == 3) {

                    btn[i].setBackground(Color.decode("#99FFFF"));

                    String a = ("<html><div style=\"text-align: center;\">Phòng " + String.valueOf(LPH.get(i).getMap()) + "<br>" + "Đặt trước...</div></html>");
                    btn[i].setText(a);
                    btn[i].setMinimumSize(new Dimension(101, 101));
//                    btn[i].setMaximumSize(new Dimension(101, 101));
                    btn[i].setToolTipText(a);

                    btn[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_time_100px.png")));

                }
                pnl.add(btn[i]);
                pnl.updateUI();
            }

        }
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        p_nut = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        pnl = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        p_nut.setLayout(new java.awt.GridLayout(1, 0));

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Dọn dẹp");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 255, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Đặt trước");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Có khách");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Trống");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pnl.setBackground(new java.awt.Color(255, 255, 255));
        pnl.setRequestFocusEnabled(false);
        pnl.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 976, Short.MAX_VALUE)
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("Tất cả");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addGap(0, 0, 0)
                                .addComponent(jButton4)
                                .addGap(32, 32, 32)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(556, 556, 556)
                    .addComponent(p_nut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(744, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(280, 280, 280)
                    .addComponent(p_nut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(350, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int tt = 0;
        psv.getdatawhereTT(tt);
        Fillphong1(tt);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int tt = 1;
        psv.getdatawhereTT(tt);
        Fillphong1(tt);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Fillphong();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int tt = 2;
        psv.getdatawhereTT(tt);
        Fillphong1(tt);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       int tt = 3;
       psv.getdatawhereTT(tt);
       Fillphong1(tt);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel p_nut;
    private javax.swing.JPanel pnl;
    // End of variables declaration//GEN-END:variables
}

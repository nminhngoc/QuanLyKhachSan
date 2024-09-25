package Form;

import database.KetNoi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;


import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    
    String manhanvien;
    String matkhau;
    String ten;
    String ngaysinh;
    String sdt;
    String chucvu = "";
    public void setmanv(String ma){
        txtTaikhoan.setText(ma);
    }
    
    public Login() {
        initComponents();
        setTitle("Đăng nhập");
        lbNgaysinh.setVisible(false);
        lbSdt.setVisible(false);
        txtSdt.setVisible(false);
        dateNgaysinh.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtMatkhau = new javax.swing.JPasswordField();
        rbQuanly = new javax.swing.JRadioButton();
        lbDanghap = new javax.swing.JLabel();
        txtSdt = new javax.swing.JTextField();
        lbSdt = new javax.swing.JLabel();
        lbNgaysinh = new javax.swing.JLabel();
        lbMatkhau = new javax.swing.JLabel();
        lbManhanvien = new javax.swing.JLabel();
        txtTaikhoan = new javax.swing.JTextField();
        btnDangnhap = new javax.swing.JButton();
        dateNgaysinh = new com.toedter.calendar.JDateChooser();
        rbAn = new javax.swing.JRadioButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 350));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(217, 255, 255));

        txtMatkhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMatkhau.setActionCommand("<Not Set>");

        rbQuanly.setBackground(new java.awt.Color(217, 255, 255));
        rbQuanly.setText("Quản lý");
        rbQuanly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbQuanlyActionPerformed(evt);
            }
        });

        lbDanghap.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lbDanghap.setText("Đăng nhập");

        txtSdt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbSdt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbSdt.setText("Số điện thoại");

        lbNgaysinh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbNgaysinh.setText("Ngày sinh");

        lbMatkhau.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbMatkhau.setText("Mật khẩu");

        lbManhanvien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbManhanvien.setText("Mã nhân viên");

        txtTaikhoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTaikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaikhoanActionPerformed(evt);
            }
        });

        btnDangnhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangnhap.setText("Đăng nhập");
        btnDangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangnhapActionPerformed(evt);
            }
        });

        dateNgaysinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        rbAn.setBackground(new java.awt.Color(217, 255, 255));
        rbAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAnActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbManhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(lbNgaysinh, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(lbSdt, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(lbMatkhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(rbAn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(lbDanghap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(122, 122, 122)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbQuanly)
                    .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDangnhap, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lbDanghap, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbManhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtMatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbMatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(rbAn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(dateNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSdt)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(rbQuanly)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 250, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangnhapActionPerformed
        Connection kn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        if ("Đăng nhập".equals(btnDangnhap.getText())) {
            manhanvien = txtTaikhoan.getText();
            matkhau = txtMatkhau.getText();
            if (rbQuanly.isSelected()) {
                chucvu = "Quản lý";
            } else {
                chucvu = "Nhân viên";
            }
            if (!manhanvien.isEmpty() && !matkhau.isEmpty() && !chucvu.isEmpty()) {
                try {
                    kn = (Connection) KetNoi.ketNoi();
                    if (kn == null) {
                        JOptionPane.showMessageDialog(this, "Kết nối cơ sở dữ liệu thất bại!");
                        return;
                    }
                    String sqlDangnhap = "SELECT * FROM nhanvien WHERE manhanvien = ? AND pass = ? AND chucvu = ?";
                    pstmt = kn.prepareStatement(sqlDangnhap);
                    pstmt.setString(1, manhanvien);
                    pstmt.setString(2, matkhau);
                    pstmt.setString(3, chucvu);
                    rs = pstmt.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
                        if ("Quản lý".equals(chucvu)) {
                            Menu mainForm = new Menu();                            
                            mainForm.setmanv(manhanvien);                            
                            this.dispose();
                            mainForm.setVisible(true);
                        } else if ("Nhân viên".equals(chucvu)) {
                            ThuePhong NVForm = new ThuePhong();
                            NVForm.setmanv(manhanvien);
                            NVForm.loadALL();
                            this.dispose();
                            NVForm.setVisible(true);
                        }
                    } else {
                        Object[] options = {"Quên mật khẩu", "Nhập lại"};
                        int choice = JOptionPane.showOptionDialog(
                            this,
                            "Thông tin đăng nhập không chính xác hoặc không có quyền truy cập!",
                            "Lỗi đăng nhập",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.ERROR_MESSAGE,
                            null,
                            options,
                            options[1]
                        );

                        if (choice == JOptionPane.YES_OPTION) {
                            lbDanghap.setText("Quên mật khẩu");
                            rbQuanly.setVisible(false);
                            lbMatkhau.setText("Tên nhân viên");
                            btnDangnhap.setText("Quên");
                            lbNgaysinh.setVisible(true);
                            lbSdt.setVisible(true);
                            txtSdt.setVisible(true);
                            dateNgaysinh.setVisible(true);
                            txtMatkhau.setText("");
                            btnThoat.setText("Huỷ");                            
                            rbAn.setSelected(true);
                            if(!rbAn.isSelected()){
                                txtMatkhau.setEchoChar('*');
                            } else {
                                txtMatkhau.setEchoChar((char) 0);
                            }
                            rbAn.setVisible(false);
                            this.setTitle("Quên mật khẩu");
                        } else if (choice == JOptionPane.NO_OPTION) {
                            txtMatkhau.setText("");
                        }
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
                } finally {
                    try {
                        if (rs != null) {
                            rs.close();
                        }
                        if (pstmt != null) {
                            pstmt.close();
                        }
                        if (kn != null) {
                            kn.close();
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin đăng nhập!", "Lỗi!", JOptionPane.ERROR_MESSAGE);
            }
        } else if ("Quên".equals(btnDangnhap.getText().trim())) {
            matkhau ="";
            manhanvien = txtTaikhoan.getText().trim();
            ten = txtMatkhau.getText().trim();
            sdt = txtSdt.getText().trim();

            Date ns = dateNgaysinh.getDate();
            if (dateNgaysinh == null) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày đến và ngày đi!");
                return;
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            ngaysinh = dateFormat.format(ns);

            if (!manhanvien.isEmpty() && !ten.isEmpty() && !ngaysinh.isEmpty() && !sdt.isEmpty()) {
                try {
                    kn = (Connection) KetNoi.ketNoi();
                    if (kn == null) {
                        JOptionPane.showMessageDialog(this, "Kết nối cơ sở dữ liệu thất bại!");
                        return;
                    }
                    String sqlDangnhap = "SELECT * FROM nhanvien WHERE manhanvien = ? AND tennhanvien = ? AND ngaysinh = ? AND sdt = ?";
                    pstmt = kn.prepareStatement(sqlDangnhap);
                    pstmt.setString(1, manhanvien);
                    pstmt.setString(2, ten);
                    pstmt.setString(3, ngaysinh);
                    pstmt.setString(4, sdt);
                    rs = pstmt.executeQuery();
                    if (rs.next()) {
                        matkhau = rs.getString("pass");
                        JOptionPane.showMessageDialog(this, "Mật khẩu hiện tại của bạn là: "+ matkhau);
                        rbQuanly.setVisible(true);
                    //    lbMatkhau.setText("");
                        btnDangnhap.setText("Quên");
                        lbNgaysinh.setVisible(false);
                        lbSdt.setVisible(false);
                        txtSdt.setVisible(false);
                        dateNgaysinh.setVisible(false);
                        txtMatkhau.setText("");
                        lbMatkhau.setText("Mật khẩu");
                        btnDangnhap.setText("Đăng nhập");
                        lbDanghap.setText("Đăng nhập");
                        rbAn.setSelected(false);
                        if(!rbAn.isSelected()){
                            txtMatkhau.setEchoChar('*');
                        } else {
                            txtMatkhau.setEchoChar((char) 0);
                        }
                        rbAn.setVisible(true);
                        this.setTitle("Đăng nhập");
                    } else {
                        JOptionPane.showMessageDialog(this, "Thông tin nhân viên không chính xác!\nVui lòng nhập lại.");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
                } finally {
                    try {
                        if (rs != null) {
                            rs.close();
                        }
                        if (pstmt != null) {
                            pstmt.close();
                        }
                        if (kn != null) {
                            kn.close();
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin đăng nhập!", "Lỗi!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDangnhapActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        if(btnThoat.getText().equals("Thoát")){
            int thoat = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "Thoát!", JOptionPane.YES_NO_OPTION);
            if (thoat == JOptionPane.YES_OPTION) {
                System.exit(0);
            } else {
                setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
            }
        } else if (btnThoat.getText().equals("Huỷ")) {
            rbQuanly.setVisible(true);
          //  lbMatkhau.setText("Tên nhân viên");
            btnDangnhap.setText("Quên");
            lbNgaysinh.setVisible(false);
            lbSdt.setVisible(false);
            txtSdt.setVisible(false);    
            dateNgaysinh.setVisible(false);
            txtMatkhau.setText("");
            lbMatkhau.setText("Mật khẩu");
            btnDangnhap.setText("Đăng nhập");
            btnThoat.setText("Thoát");
            lbDanghap.setText("Đăng nhập");
            this.setTitle("Đăng nhập");
            rbAn.setSelected(false);
            if(!rbAn.isSelected()){
                txtMatkhau.setEchoChar('*');
            } else {
                txtMatkhau.setEchoChar((char) 0);
            }
            rbAn.setVisible(true);
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void rbQuanlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbQuanlyActionPerformed

    }//GEN-LAST:event_rbQuanlyActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int thoat = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "Thoát!", JOptionPane.YES_NO_OPTION);
            if (thoat == JOptionPane.YES_OPTION) {
                System.exit(0);
            } else {
                setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        }       
    }//GEN-LAST:event_formWindowClosing

    private void rbAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAnActionPerformed
        if(!rbAn.isSelected()){
            txtMatkhau.setEchoChar('*');
        } else {
            txtMatkhau.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_rbAnActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      //  lbMatkhau.setText("Mật khẩu");
    }//GEN-LAST:event_formWindowActivated

    private void txtTaikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaikhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaikhoanActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangnhap;
    private javax.swing.JButton btnThoat;
    private com.toedter.calendar.JDateChooser dateNgaysinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDanghap;
    private javax.swing.JLabel lbManhanvien;
    private javax.swing.JLabel lbMatkhau;
    private javax.swing.JLabel lbNgaysinh;
    private javax.swing.JLabel lbSdt;
    private javax.swing.JRadioButton rbAn;
    private javax.swing.JRadioButton rbQuanly;
    private javax.swing.JPasswordField txtMatkhau;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTaikhoan;
    // End of variables declaration//GEN-END:variables
}

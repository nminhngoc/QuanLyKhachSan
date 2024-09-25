package Form;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import database.KetNoi;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Menu extends javax.swing.JFrame {
    String manhanvien;
    public void setmanv(String manvString){
        manhanvien = manvString;
    }
    
    public Menu() {
        initComponents();        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_NV = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        Makh10 = new javax.swing.JLabel();
        Makh11 = new javax.swing.JLabel();
        Makh12 = new javax.swing.JLabel();
        Makh14 = new javax.swing.JLabel();
        Makh15 = new javax.swing.JLabel();
        Makh16 = new javax.swing.JLabel();
        pass_NV = new javax.swing.JTextField();
        txtDC_NV = new javax.swing.JTextField();
        txtSdt_NV = new javax.swing.JTextField();
        txtHoten_NV = new javax.swing.JTextField();
        NS_NV = new com.toedter.calendar.JDateChooser();
        Makh18 = new javax.swing.JLabel();
        txtSua_NV = new javax.swing.JButton();
        btnThem_NV = new javax.swing.JButton();
        txtXoa_NV = new javax.swing.JButton();
        btnHienthi_NV = new javax.swing.JButton();
        btnTimkiem_NV = new javax.swing.JButton();
        cbGioitinh_NV = new javax.swing.JComboBox<>();
        Makh26 = new javax.swing.JLabel();
        txtMnv_NV = new javax.swing.JTextField();
        Makh31 = new javax.swing.JLabel();
        txtTK_NV = new javax.swing.JTextField();
        txtCv_NV = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Makh1 = new javax.swing.JLabel();
        txtMP_Phong = new javax.swing.JTextField();
        Makh2 = new javax.swing.JLabel();
        Makh3 = new javax.swing.JLabel();
        txtTT_Phong = new javax.swing.JTextField();
        Makh4 = new javax.swing.JLabel();
        txtGia_Phong = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table_Phong = new javax.swing.JTable();
        btnThem_Phong = new javax.swing.JButton();
        btnSua_Phong = new javax.swing.JButton();
        btnXoa_Phong = new javax.swing.JButton();
        Makh5 = new javax.swing.JLabel();
        txtGhichu_Phong = new javax.swing.JTextField();
        btnHienthi_Phong = new javax.swing.JButton();
        btnTimkiem_Phong = new javax.swing.JButton();
        Makh6 = new javax.swing.JLabel();
        txtTimkiem_Phong = new javax.swing.JTextField();
        txtLP_Phong = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        txtMkh_PT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMp_PT = new javax.swing.JTextField();
        Makh13 = new javax.swing.JLabel();
        Makh17 = new javax.swing.JLabel();
        jDateNgayden = new com.toedter.calendar.JDateChooser();
        Makh20 = new javax.swing.JLabel();
        Makh21 = new javax.swing.JLabel();
        Makh22 = new javax.swing.JLabel();
        btnSua_PT = new javax.swing.JButton();
        Makh23 = new javax.swing.JLabel();
        btnThem_PT = new javax.swing.JButton();
        txtTimkiem_PT = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        table_PT = new javax.swing.JTable();
        txtMpt_PT = new javax.swing.JTextField();
        btnXoa_PT = new javax.swing.JButton();
        btnTimkiem_PT = new javax.swing.JButton();
        Makh24 = new javax.swing.JLabel();
        jDateNgaydi = new com.toedter.calendar.JDateChooser();
        btnHienthi_PT = new javax.swing.JButton();
        Makh32 = new javax.swing.JLabel();
        txtGhichu_PT = new javax.swing.JTextField();
        cbThanhtoan_PT = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Makh = new javax.swing.JLabel();
        txtDiachi = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTenkh = new javax.swing.JLabel();
        txtDC_KH = new javax.swing.JTextField();
        txtSDT_KH = new javax.swing.JTextField();
        txtTKH_KH = new javax.swing.JTextField();
        txtMKH_KH = new javax.swing.JTextField();
        txtCMND_KH = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_KH = new javax.swing.JTable();
        btnXoa_KH = new javax.swing.JButton();
        btnSua_KH = new javax.swing.JButton();
        btnThem_KH = new javax.swing.JButton();
        btnHienthi_KH = new javax.swing.JButton();
        btnTimkiem_KH = new javax.swing.JButton();
        lb3214 = new javax.swing.JLabel();
        cbGioitinh_KH = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtTimkiem_KH = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        txtTimkiem_HD = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Makh19 = new javax.swing.JLabel();
        Makh25 = new javax.swing.JLabel();
        NgayTT_HD = new com.toedter.calendar.JDateChooser();
        Makh27 = new javax.swing.JLabel();
        Makh28 = new javax.swing.JLabel();
        Makh29 = new javax.swing.JLabel();
        btnSua_HD = new javax.swing.JButton();
        Makh30 = new javax.swing.JLabel();
        btnTimkiem_HD = new javax.swing.JButton();
        txtMpt_HD = new javax.swing.JTextField();
        btnHienthi_HD = new javax.swing.JButton();
        txtTienphong_HD = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        table_HD = new javax.swing.JTable();
        txtTongtien_HD = new javax.swing.JTextField();
        btnXoa_HD = new javax.swing.JButton();
        Makh33 = new javax.swing.JLabel();
        txtPhiDV_HD = new javax.swing.JTextField();
        txtMHD_HD = new javax.swing.JTextField();
        btnDangxuat_menu = new javax.swing.JButton();
        btOpenThuePhong = new javax.swing.JButton();
        btThoat_Menu = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTabbedPane2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane2StateChanged(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));

        table_NV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Pass", "Tên nhân viên", "Ngày sinh", "Giới tính", "Địa chỉ", "Số điện thoại", "Chức vụ"
            }
        ));
        table_NV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_NVMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(table_NV);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Quản lý nhân viên");
        jLabel6.setAlignmentY(0.0F);

        Makh10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh10.setText("Mã nhân viên");

        Makh11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh11.setText("Ngày sinh");

        Makh12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh12.setText("Giới tính");

        Makh14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh14.setText("Số điện thoại");

        Makh15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh15.setText("Địa chỉ");

        Makh16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh16.setText("Chức vụ");

        Makh18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh18.setText("Tên nhân viên");

        txtSua_NV.setText("Sửa");
        txtSua_NV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSua_NVActionPerformed(evt);
            }
        });

        btnThem_NV.setText("Thêm");
        btnThem_NV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_NVActionPerformed(evt);
            }
        });

        txtXoa_NV.setText("Xóa");
        txtXoa_NV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtXoa_NVActionPerformed(evt);
            }
        });

        btnHienthi_NV.setText("Hiển thị");
        btnHienthi_NV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienthi_NVActionPerformed(evt);
            }
        });

        btnTimkiem_NV.setText("Tìm kiếm");
        btnTimkiem_NV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiem_NVActionPerformed(evt);
            }
        });

        cbGioitinh_NV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", " " }));

        Makh26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh26.setText("Mật khẩu");

        Makh31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh31.setText("Tìm kiếm");

        txtCv_NV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân viên", "Quản lý" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Makh10)
                            .addComponent(Makh18)
                            .addComponent(Makh11)
                            .addComponent(Makh26))
                        .addGap(146, 146, 146)
                        .addComponent(jLabel6))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(btnThem_NV)
                            .addGap(37, 37, 37)
                            .addComponent(txtSua_NV)
                            .addGap(42, 42, 42)
                            .addComponent(txtXoa_NV)
                            .addGap(302, 302, 302)
                            .addComponent(btnHienthi_NV))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(Makh12)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(cbGioitinh_NV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(98, 98, 98))
                            .addComponent(txtHoten_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMnv_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NS_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Makh15)
                            .addComponent(Makh16)
                            .addComponent(Makh14)
                            .addComponent(Makh31))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDC_NV)
                            .addComponent(txtSdt_NV)
                            .addComponent(btnTimkiem_NV, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTK_NV)
                            .addComponent(txtCv_NV, 0, 165, Short.MAX_VALUE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(txtMnv_NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Makh18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHoten_NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addComponent(NS_NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Makh11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Makh12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbGioitinh_NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pass_NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Makh26, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Makh10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Makh16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCv_NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Makh15)
                            .addComponent(txtDC_NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Makh14)
                            .addComponent(txtSdt_NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Makh31)
                            .addComponent(txtTK_NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimkiem_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSua_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtXoa_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHienthi_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Quản lý nhân viên", jPanel4);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setForeground(new java.awt.Color(168, 229, 90));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Quản lý phòng");
        jLabel2.setAlignmentY(0.0F);

        Makh1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh1.setText("Mã phòng");

        Makh2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh2.setText("Loại phòng");

        Makh3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh3.setText("Tình trạng");

        Makh4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh4.setText("Giá phòng");

        Table_Phong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phòng", "Loại phòng", "Tình trạng", "Giá", "Ghi chú"
            }
        ));
        Table_Phong.getTableHeader().setReorderingAllowed(false);
        Table_Phong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_PhongMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Table_Phong);

        btnThem_Phong.setText("Thêm");
        btnThem_Phong.setToolTipText("");
        btnThem_Phong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_PhongActionPerformed(evt);
            }
        });

        btnSua_Phong.setText("Sửa");
        btnSua_Phong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_PhongActionPerformed(evt);
            }
        });

        btnXoa_Phong.setText("Xoá");
        btnXoa_Phong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_PhongActionPerformed(evt);
            }
        });

        Makh5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh5.setText("Ghi chú");

        txtGhichu_Phong.setAlignmentX(0.0F);
        txtGhichu_Phong.setAlignmentY(0.0F);
        txtGhichu_Phong.setName(""); // NOI18N

        btnHienthi_Phong.setText("Hiển thị");
        btnHienthi_Phong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienthi_PhongActionPerformed(evt);
            }
        });

        btnTimkiem_Phong.setText("Tìm kiếm");
        btnTimkiem_Phong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiem_PhongActionPerformed(evt);
            }
        });

        Makh6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh6.setText("Tìm kiếm");

        txtLP_Phong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đơn", "Đôi" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jLabel2)
                .addContainerGap(363, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btnThem_Phong)
                        .addGap(30, 30, 30)
                        .addComponent(btnSua_Phong)
                        .addGap(26, 26, 26)
                        .addComponent(btnXoa_Phong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHienthi_Phong))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Makh2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Makh3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Makh1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTT_Phong, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMP_Phong, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(txtLP_Phong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Makh4)
                                    .addComponent(Makh5)
                                    .addComponent(Makh6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtGia_Phong)
                                    .addComponent(txtGhichu_Phong)
                                    .addComponent(txtTimkiem_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(btnTimkiem_Phong)))))
                .addGap(0, 74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMP_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Makh1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Makh3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTT_Phong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Makh4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGia_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Makh5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGhichu_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Makh2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Makh6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimkiem_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLP_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiem_Phong))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHienthi_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        jTabbedPane2.addTab("Quản lý phòng", jPanel2);

        jPanel7.setBackground(new java.awt.Color(204, 255, 204));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Quản lý phiếu thuê");
        jLabel7.setAlignmentY(0.0F);

        Makh13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh13.setText("Mã khách hàng");

        Makh17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh17.setText("Mã phòng");

        Makh20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh20.setText("Mã phiếu thuê");

        Makh21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh21.setText("Ngày đến");

        Makh22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh22.setText("Thanh toán");

        btnSua_PT.setText("Sửa");
        btnSua_PT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_PTActionPerformed(evt);
            }
        });

        Makh23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh23.setText("Ngày đi");

        btnThem_PT.setText("Thêm");
        btnThem_PT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_PTActionPerformed(evt);
            }
        });

        table_PT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu thuê", "Mã khách hàng", "Mã phòng", "Ngày đến", "Ngày đi", "Thanh toán", "Ghi chú"
            }
        ));
        table_PT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_PTMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(table_PT);

        btnXoa_PT.setText("Xóa");
        btnXoa_PT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_PTActionPerformed(evt);
            }
        });

        btnTimkiem_PT.setText("Tìm kiếm");
        btnTimkiem_PT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiem_PTActionPerformed(evt);
            }
        });

        Makh24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh24.setText("Ghi chú");

        btnHienthi_PT.setText("Hiển thị");
        btnHienthi_PT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienthi_PTActionPerformed(evt);
            }
        });

        Makh32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh32.setText("Tìm kiếm");

        cbThanhtoan_PT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chưa thanh toán", "Đã thanh toán" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Makh20)
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel7Layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(Makh17))
                                                .addComponent(Makh13)))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addComponent(Makh22)
                                        .addGap(43, 43, 43)))
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMpt_PT, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMkh_PT, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMp_PT, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbThanhtoan_PT, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(82, 82, 82)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Makh23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Makh21)
                                            .addComponent(Makh24)
                                            .addComponent(Makh32))
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(txtTimkiem_PT, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnTimkiem_PT))
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jDateNgayden, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jDateNgaydi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtGhichu_PT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(btnThem_PT)
                                        .addGap(44, 44, 44)
                                        .addComponent(btnSua_PT)
                                        .addGap(42, 42, 42)
                                        .addComponent(btnXoa_PT)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnHienthi_PT))))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(jLabel7)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Makh20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMpt_PT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Makh21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateNgayden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Makh13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMkh_PT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Makh23, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Makh17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMp_PT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Makh22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbThanhtoan_PT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Makh32, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jDateNgaydi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGhichu_PT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Makh24, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimkiem_PT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimkiem_PT))))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa_PT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHienthi_PT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua_PT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem_PT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Quản lý phiếu thuê", jPanel7);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Quản lý khách hàng");
        jLabel1.setAlignmentY(0.0F);

        Makh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh.setText("Mã khách hàng");

        txtDiachi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDiachi.setText("Địa chỉ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("CMND");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Số điện thoại");

        txtTenkh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTenkh.setText("Giới tính");

        txtMKH_KH.setText("Tự động");
        txtMKH_KH.setEnabled(false);

        Table_KH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Giới tính", "Địa chỉ", "Số điện thoại", "CMND"
            }
        ));
        Table_KH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_KHMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table_KH);

        btnXoa_KH.setText("Xóa");
        btnXoa_KH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_KHActionPerformed(evt);
            }
        });

        btnSua_KH.setText("Sửa");
        btnSua_KH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_KHActionPerformed(evt);
            }
        });

        btnThem_KH.setText("Thêm");
        btnThem_KH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_KHActionPerformed(evt);
            }
        });

        btnHienthi_KH.setText("Hiển thị");
        btnHienthi_KH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienthi_KHActionPerformed(evt);
            }
        });

        btnTimkiem_KH.setText("Tìm kiếm");
        btnTimkiem_KH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiem_KHActionPerformed(evt);
            }
        });

        lb3214.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb3214.setText("Tên khách hàng");

        cbGioitinh_KH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Tìm kiếm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Makh)
                            .addComponent(lb3214)
                            .addComponent(txtTenkh, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiachi, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbGioitinh_KH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtMKH_KH, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTKH_KH, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDC_KH, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCMND_KH, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(txtSDT_KH, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(txtTimkiem_KH)
                            .addComponent(btnTimkiem_KH, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnThem_KH)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua_KH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoa_KH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHienthi_KH))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(58, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Makh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMKH_KH))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTKH_KH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb3214, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenkh)
                            .addComponent(cbGioitinh_KH, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDC_KH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDT_KH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCMND_KH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTimkiem_KH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTimkiem_KH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa_KH, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua_KH, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem_KH, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHienthi_KH, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Quản lý khách hàng", jPanel1);

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Quản lý hóa đơn");
        jLabel8.setAlignmentY(0.0F);

        Makh19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh19.setText("Mã phiếu thuê");

        Makh25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh25.setText("Ngày thanh toán");

        Makh27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh27.setText("Tiền phòng");

        Makh28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh28.setText("Tổng tiền");

        Makh29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh29.setText("Phí dịch vụ");

        btnSua_HD.setText("Sửa");
        btnSua_HD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_HDActionPerformed(evt);
            }
        });

        Makh30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh30.setText("Mã hóa đơn");

        btnTimkiem_HD.setText("Tìm kiếm");
        btnTimkiem_HD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiem_HDActionPerformed(evt);
            }
        });

        txtMpt_HD.setEnabled(false);

        btnHienthi_HD.setText("Hiển thị");
        btnHienthi_HD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienthi_HDActionPerformed(evt);
            }
        });

        table_HD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Mã phiếu thuê", "Ngày thanh toán", "Tiền phòng", "Tổng tiền", "Phí dịch vụ"
            }
        ));
        table_HD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_HDMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(table_HD);

        txtTongtien_HD.setEnabled(false);
        txtTongtien_HD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTongtien_HDMouseClicked(evt);
            }
        });
        txtTongtien_HD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongtien_HDActionPerformed(evt);
            }
        });

        btnXoa_HD.setText("Xóa");
        btnXoa_HD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_HDActionPerformed(evt);
            }
        });

        Makh33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Makh33.setText("Tìm kiếm");

        txtMHD_HD.setEditable(false);
        txtMHD_HD.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(335, 335, 335)
                            .addComponent(jLabel8))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Makh27)
                                .addComponent(Makh25))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(NgayTT_HD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTienphong_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Makh19)
                                .addComponent(Makh30))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMpt_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(Makh33)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTimkiem_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Makh28)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(txtMHD_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(73, 73, 73)
                                                .addComponent(Makh29)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPhiDV_HD)
                                            .addComponent(txtTongtien_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnTimkiem_HD))))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btnSua_HD)
                        .addGap(43, 43, 43)
                        .addComponent(btnXoa_HD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHienthi_HD)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Makh30)
                    .addComponent(txtPhiDV_HD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Makh29)
                    .addComponent(txtMHD_HD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Makh19)
                        .addGap(22, 22, 22)
                        .addComponent(Makh25)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Makh27)
                            .addComponent(txtTienphong_HD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMpt_HD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Makh28)
                            .addComponent(txtTongtien_HD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(NgayTT_HD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTimkiem_HD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Makh33))))
                        .addGap(18, 18, 18)
                        .addComponent(btnTimkiem_HD)))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHienthi_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        jTabbedPane2.addTab("Quản lý hóa đơn", jPanel5);

        btnDangxuat_menu.setText("Đăng xuất");
        btnDangxuat_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangxuat_menuActionPerformed(evt);
            }
        });

        btOpenThuePhong.setText("Thuê phòng");
        btOpenThuePhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOpenThuePhongActionPerformed(evt);
            }
        });

        btThoat_Menu.setText("Thoát");
        btThoat_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThoat_MenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnDangxuat_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btOpenThuePhong, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btThoat_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangxuat_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(btOpenThuePhong, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(btThoat_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("Quản lý phòng");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void updateTableNhanVien() {
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
        conn = KetNoi.ketNoi(); // Mở kết nối đến cơ sở dữ liệu
        String sql = "SELECT manhanvien, pass, tennhanvien, ngaysinh, gioitinh, diachi,sdt,chucvu FROM nhanvien";
        pstmt = conn.prepareStatement(sql);
        rs = pstmt.executeQuery();

        DefaultTableModel model = (DefaultTableModel) table_NV.getModel();
        model.setRowCount(0); // Xóa tất cả các dòng hiện có trong bảng

        // Lặp qua tất cả các hàng kết quả từ câu truy vấn
        while (rs.next()) {
            String manhanvien = rs.getString("manhanvien");
            String pass = rs.getString("pass");//lay nv từ tung hang kq
            String tennhanvien = rs.getString("tennhanvien");
            String ngaysinh = rs.getString("ngaysinh");
            String gioitinh = rs.getString("gioitinh");
            String diachi = rs.getString("diachi");
            String sdt = rs.getString("sdt");
            String cv = rs.getString("chucvu");


            // Thêm hàng mới vào bảng
            Object[] row = {manhanvien, pass , tennhanvien, ngaysinh, gioitinh, diachi,sdt, cv };
            model.addRow(row);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
    } finally {
        try {
   
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
    private void updateTableHoaDon() {
    // Thực hiện truy vấn và cập nhật dữ liệu cho bảng hóa đơn
    try {
        Connection kn = KetNoi.ketNoi();
        String sql = "SELECT * FROM hoadon";
        PreparedStatement pst = kn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        DefaultTableModel model = (DefaultTableModel) table_HD.getModel();
        model.setRowCount(0); // Xóa các dòng hiện có trong bảng

        while (rs.next()) {
            Object[] row = new Object[] {
                rs.getString("mahoadon"),
                rs.getString("maphieuthue"),
                rs.getString("ngaythanhtoan"),
                rs.getString("tienphong"),
                rs.getString("tongtien"),
                rs.getString("phidv")
            };
            model.addRow(row);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
    } 
}
            private void updateTablePhieuThue() {
    // Thực hiện truy vấn và cập nhật dữ liệu cho bảng
    try {
        Connection kn = (Connection) KetNoi.ketNoi();
        String sql = "SELECT * FROM phieuthue";
        PreparedStatement pst = kn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        DefaultTableModel model = (DefaultTableModel) table_PT.getModel();
        model.setRowCount(0); // Xóa các dòng hiện có trong bảng

        while (rs.next()) {
            Object[] row = new Object[] {
                rs.getString("maphieuthue"),
                rs.getString("makh"),
                rs.getString("maphong"),
                rs.getString("ngayden"),
                rs.getString("ngaydi"),
                rs.getString("thanhtoan"),
                rs.getString("ghichu")
            };
            model.addRow(row);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
    }
}
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setTitle("Quản lý( Mã quản lý: "+manhanvien+")");
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        Login lg = new Login();
        lg.setmanv(manhanvien);
        lg.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void jTabbedPane2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane2StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane2StateChanged

    private void btnXoa_HDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_HDActionPerformed
        int row = table_HD.getSelectedRow();
        if(row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa!");
            return;
        }

        String manhoadon = (String) table_HD.getValueAt(row, 0);

        try {
            Connection kn = (Connection) KetNoi.ketNoi();
            String sql = "DELETE FROM hoadon WHERE mahoadon = ?";
            PreparedStatement pst = kn.prepareStatement(sql);
            pst.setString(1, manhoadon);
            pst.executeUpdate();

            updateTableHoaDon();

            JOptionPane.showMessageDialog(this, "Xóa hóa đơn thành công!");
            txtMHD_HD.setText("");
            txtMpt_HD.setText("");
            NgayTT_HD.setDate(null);
            txtTienphong_HD.setText("");
            txtTongtien_HD.setText("");
            txtPhiDV_HD.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        }
    }//GEN-LAST:event_btnXoa_HDActionPerformed

    private void txtTongtien_HDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongtien_HDActionPerformed

    }//GEN-LAST:event_txtTongtien_HDActionPerformed

    private void txtTongtien_HDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTongtien_HDMouseClicked
        /*  double tienphong = Double.parseDouble(txtTienphong_HD.getText());
        double tienphi = Double.parseDouble(txtPhiDV_HD.getText());
        double tongtien = tienphong + tienphi;
        txtTongtien_HD.setText(String.valueOf(tongtien));*/
    }//GEN-LAST:event_txtTongtien_HDMouseClicked

    private void table_HDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_HDMouseClicked

        int row = table_HD.getSelectedRow();

        String manhoadon = (String) table_HD.getValueAt(row, 0);
        String maphieuthue = (String) table_HD.getValueAt(row, 1);
        String ngaythanhtoan = (String) table_HD.getValueAt(row, 2);
        String tienphong = (String) table_HD.getValueAt(row, 3);
        String tongtien = (String) table_HD.getValueAt(row, 4);
        String phidv = (String) table_HD.getValueAt(row, 5);

        txtMHD_HD.setText(manhoadon);
        txtMpt_HD.setText(maphieuthue);
        // Chuyển đổi ngày đến và ngày đi từ chuỗi sang định dạng Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date ns = dateFormat.parse(ngaythanhtoan);
            NS_NV.setDate(ns);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        txtTienphong_HD.setText(tienphong);
        txtTongtien_HD.setText(tongtien);
        txtPhiDV_HD.setText(phidv);
        txtMHD_HD.setEnabled(false);
    }//GEN-LAST:event_table_HDMouseClicked

    private void btnHienthi_HDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienthi_HDActionPerformed
        updateTableHoaDon();
        txtMHD_HD.setEnabled(true);
        txtMHD_HD.setText("");
        txtMpt_HD.setText("");
        NgayTT_HD.setDate(null);
        txtTienphong_HD.setText("");
        txtTongtien_HD.setText("");
        txtPhiDV_HD.setText("");
    }//GEN-LAST:event_btnHienthi_HDActionPerformed

    private void btnTimkiem_HDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiem_HDActionPerformed
        txtMHD_HD.setEnabled(true);
        txtMHD_HD.setText("");
        txtMpt_HD.setText("");
        NgayTT_HD.setDate(null);
        txtTienphong_HD.setText("");
        txtTongtien_HD.setText("");
        txtPhiDV_HD.setText("");
        String mahoadonTK = txtTimkiem_HD.getText().trim();
        if (mahoadonTK == null || mahoadonTK.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã hóa đơn cần tìm kiếm.");
            return;
        }

        Connection kn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            kn = KetNoi.ketNoi();

   
            String sqlSearch = "SELECT * FROM hoadon WHERE mahoadon = ?";
            pst = kn.prepareStatement(sqlSearch);
            pst.setString(1, mahoadonTK.trim());
            rs = pst.executeQuery();

            // Xóa dữ liệu cũ trong bảng
            DefaultTableModel model = (DefaultTableModel) table_HD.getModel();
            model.setRowCount(0);

            // Hiển thị kết quả tìm kiếm lên bảng
            while (rs.next()) {
                model.addRow(new Object[] {
                    rs.getString("mahoadon"),
                    rs.getString("maphieuthue"),
                    rs.getString("ngaythanhtoan"),
                    rs.getString("tienphong"),
                    rs.getString("tongtien"),
                    rs.getString("phidv"),
                });
            }

            // Nếu không tìm thấy nhân viên, hiển thị thông báo
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy hóa đơn với mã " + mahoadonTK);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (kn != null) kn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnTimkiem_HDActionPerformed

    private void btnSua_HDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_HDActionPerformed
        int row = table_HD.getSelectedRow();
        if(row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để sửa!");
            return;
        }

        String mahoadon = txtMHD_HD.getText();
        String maphieuthue = txtMpt_HD.getText();
        Date ngaythanhtoan = NgayTT_HD.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String NTT = dateFormat.format(ngaythanhtoan);
        String tienphong = txtTienphong_HD.getText();

        String phidv = txtPhiDV_HD.getText();
        txtTongtien_HD.setText("0");
        double tienphong1 = Double.parseDouble(txtTienphong_HD.getText());
        double tienphi = Double.parseDouble(txtPhiDV_HD.getText());
        double tongtien1 = tienphong1 + tienphi;
        txtTongtien_HD.setText(String.valueOf(tongtien1));
        String tongtien = txtTongtien_HD.getText();

        try {
            Connection kn = (Connection) KetNoi.ketNoi();
            String sql = "UPDATE hoadon SET maphieuthue = ?, ngaythanhtoan = ?, tienphong = ? ,tongtien = ?, phidv = ? WHERE mahoadon = ?";
            PreparedStatement pst = kn.prepareStatement(sql);

            pst.setString(1, maphieuthue.trim());
            pst.setString(2, NTT.trim());
            pst.setString(3, tienphong.trim());
            pst.setString(4, tongtien.trim());
            pst.setString(5, phidv.trim());
            pst.setString(6, mahoadon.trim());
            pst.executeUpdate();

            updateTableHoaDon();

            JOptionPane.showMessageDialog(this, "Cập nhật thông tin hóa đơn thành công!");
            txtMHD_HD.setText("");
            txtMpt_HD.setText("");
            NgayTT_HD.setDate(null);
            txtTienphong_HD.setText("");
            txtTongtien_HD.setText("");
            txtPhiDV_HD.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSua_HDActionPerformed

    private void btnTimkiem_KHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiem_KHActionPerformed
        txtMKH_KH.setText("");
        txtTKH_KH.setText("");
        cbGioitinh_KH.setSelectedIndex(0);
        txtDC_KH.setText("");
        txtSDT_KH.setText("");
        txtCMND_KH.setText("");
        btnThem_KH.setEnabled(true);
        String cmndTK = txtTimkiem_KH.getText().trim();
        if (cmndTK == null || cmndTK.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập cmnd cần tìm kiếm.");
            return;
        }
        Connection kn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            kn = KetNoi.ketNoi();

            // Thực hiện truy vấn tìm kiếm nhân viên
            String sqlSearch = "SELECT * FROM khachhang WHERE cmnd = ?";
            pst = kn.prepareStatement(sqlSearch);
            pst.setString(1, cmndTK.trim());
            rs = pst.executeQuery();

            // Xóa dữ liệu cũ trong bảng
            DefaultTableModel model = (DefaultTableModel) Table_KH.getModel();
            model.setRowCount(0);

            // Hiển thị kết quả tìm kiếm lên bảng
            while (rs.next()) {
                model.addRow(new Object[] {
                    rs.getString("makh"),
                    rs.getString("tenkh"),
                    rs.getString("gioitinh"),
                    rs.getString("diachi"),
                    rs.getString("sdt"),
                    rs.getString("cmnd")
                });
            }

            // Nếu không tìm thấy nhân viên, hiển thị thông báo
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy khách hàng với mã CMND: " + cmndTK);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (kn != null) kn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnTimkiem_KHActionPerformed

    private void btnHienthi_KHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienthi_KHActionPerformed
        updateTableData();
        txtMKH_KH.setText("");
        txtTKH_KH.setText("");
        cbGioitinh_KH.setSelectedIndex(0);
        txtDC_KH.setText("");
        txtSDT_KH.setText("");
        txtCMND_KH.setText("");
        btnThem_KH.setEnabled(true);
    }//GEN-LAST:event_btnHienthi_KHActionPerformed

    private void btnThem_KHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_KHActionPerformed
        String tenkh = txtTKH_KH.getText();
        String gioitinh = cbGioitinh_NV.getSelectedItem().toString();
        String diachi = txtDC_KH.getText();
        String sdt = txtSDT_KH.getText();
        String cmnd = txtCMND_KH.getText();

        // Kiểm tra đầu vào của các trường JTextField
        if (tenkh.trim().isEmpty() || diachi.trim().isEmpty() || sdt.trim().isEmpty() || cmnd.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin!");
            return;
        }

        Connection kn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            kn = KetNoi.ketNoi();

            // Truy vấn mã khách hàng lớn nhất hiện tại
            String sqlMaxMakh = "SELECT MAX(makh) AS max_makh FROM khachhang";
            pst = kn.prepareStatement(sqlMaxMakh);
            rs = pst.executeQuery();
            String newMakh;
            if (rs.next()) {
                String maxMakh = rs.getString("max_makh");
                if (maxMakh != null) {
                    // Tăng mã khách hàng lên 1
                    int newMakhInt = Integer.parseInt(maxMakh.substring(2)) + 1;
                    newMakh = "KH" + String.format("%06d", newMakhInt);
                } else {
                    // Trường hợp bảng rỗng, bắt đầu với mã KH00001
                    newMakh = "KH00001";
                }
            } else {
                // Trường hợp bảng rỗng, bắt đầu với mã KH00001
                newMakh = "KH00001";
            }

            // Thực hiện truy vấn thêm khách hàng mới
            String sqlInsert = "INSERT INTO khachhang (makh, tenkh, gioitinh, diachi, sdt, cmnd) VALUES (?, ?, ?, ?, ?, ?)";
            pst = kn.prepareStatement(sqlInsert);
            pst.setString(1, newMakh);
            pst.setString(2, tenkh.trim());
            pst.setString(3, gioitinh.trim());
            pst.setString(4, diachi.trim());
            pst.setString(5, sdt.trim());
            pst.setString(6, cmnd.trim());
            pst.executeUpdate();

            // Xóa các trường nhập liệu
            txtMKH_KH.setText(newMakh);
            txtTKH_KH.setText("");
            cbGioitinh_NV.setSelectedIndex(0);
            txtDC_KH.setText("");
            txtSDT_KH.setText("");
            txtCMND_KH.setText("");

            // Thông báo thành công
            JOptionPane.showMessageDialog(this, "Thêm khách hàng thành công!");

            // Cập nhật bảng dữ liệu
            updateTableData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (kn != null) kn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnThem_KHActionPerformed

    private void btnSua_KHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_KHActionPerformed
        int row = Table_KH.getSelectedRow();
        if(row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để sửa!");
            return;
        }
        try {
            Connection kn = (Connection) KetNoi.ketNoi();
            String sql = "UPDATE khachhang SET tenkh = ?, gioitinh = ?, diachi = ?, sdt = ?, cmnd = ? WHERE makh = ?";
            PreparedStatement pst = kn.prepareStatement(sql);
            pst.setString(1, txtTKH_KH.getText());
            String gioiTinh = cbGioitinh_KH.getSelectedItem().toString();
            pst.setString(2, gioiTinh);
            pst.setString(3, txtDC_KH.getText());
            pst.setString(4, txtSDT_KH.getText());
            pst.setString(5, txtCMND_KH.getText());
            pst.setString(6, txtMKH_KH.getText());
            pst.executeUpdate();

            updateTableData();

            JOptionPane.showMessageDialog(this, "Cập nhật thông tin khách hàng thành công!");
            txtMKH_KH.setText("");
            txtTKH_KH.setText("");
            cbGioitinh_KH.setSelectedIndex(0);
            txtDC_KH.setText("");
            txtSDT_KH.setText("");
            txtCMND_KH.setText("");
            btnThem_KH.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSua_KHActionPerformed

    private void btnXoa_KHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_KHActionPerformed
        int row = Table_KH.getSelectedRow();
        if(row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa!");
            return;
        }

        String makh = (String) Table_KH.getValueAt(row, 0);

        try {
            Connection kn = (Connection) KetNoi.ketNoi();
            String sql = "DELETE FROM khachhang WHERE makh = ?";
            PreparedStatement pst = kn.prepareStatement(sql);
            pst.setString(1, makh);
            pst.executeUpdate();

            updateTableData();

            JOptionPane.showMessageDialog(this, "Xóa khách hàng thành công!");
            txtMKH_KH.setText("");
            txtTKH_KH.setText("");
            cbGioitinh_KH.setSelectedIndex(0);
            txtDC_KH.setText("");
            txtSDT_KH.setText("");
            txtCMND_KH.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        }
    }//GEN-LAST:event_btnXoa_KHActionPerformed

    private void Table_KHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_KHMouseClicked
        btnThem_KH.setEnabled(false);
        int row = Table_KH.getSelectedRow();

        String makh = (String) Table_KH.getValueAt(row, 0);
        String tenkh = (String) Table_KH.getValueAt(row, 1);
        String gioitinh = (String) Table_KH.getValueAt(row, 2);
        String diachi = (String) Table_KH.getValueAt(row, 3);
        String sdt = (String) Table_KH.getValueAt(row, 4);
        String cmnd = (String) Table_KH.getValueAt(row, 5);

        txtMKH_KH.setText(makh);
        txtTKH_KH.setText(tenkh);
        cbGioitinh_KH.setSelectedItem(gioitinh);
        txtDC_KH.setText(diachi);
        txtSDT_KH.setText(sdt);
        txtCMND_KH.setText(cmnd);

        txtMKH_KH.setEditable(false);
    }//GEN-LAST:event_Table_KHMouseClicked

    private void btnHienthi_PTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienthi_PTActionPerformed
        updateTablePhieuThue();
        txtMpt_PT.setText("");
        txtMkh_PT.setText("");
        txtMp_PT.setText("");
        jDateNgayden.setDate(null);
        jDateNgaydi.setDate(null);
        cbThanhtoan_PT.setSelectedIndex(0);
        txtGhichu_PT.setText("");
        btnThem_PT.setEnabled(true);
    }//GEN-LAST:event_btnHienthi_PTActionPerformed

    private void btnTimkiem_PTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiem_PTActionPerformed
        btnThem_PT.setEnabled(true);
        String mptTK = txtTimkiem_PT.getText().trim();
        if (mptTK == null || mptTK.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã phiếu thuê cần tìm kiếm.");
            return;
        }

        Connection kn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            kn = KetNoi.ketNoi();

            // Thực hiện truy vấn tìm kiếm
            String sqlSearch = "SELECT * FROM phieuthue WHERE maphieuthue = ?";
            pst = kn.prepareStatement(sqlSearch);
            pst.setString(1, mptTK.trim());
            rs = pst.executeQuery();

            // Xóa dữ liệu cũ trong bảng
            DefaultTableModel model = (DefaultTableModel) table_PT.getModel();
            model.setRowCount(0);

            // Hiển thị kết quả tìm kiếm lên bảng
            while (rs.next()) {
                model.addRow(new Object[] {
                    rs.getString("maphieuthue"),
                    rs.getString("makh"),
                    rs.getString("maphong"),
                    rs.getString("ngayden"),
                    rs.getString("ngaydi"),
                    rs.getString("thanhtoan"),
                    rs.getString("ghichu")
                });
            }

         
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy phiếu thuê với mã " + mptTK);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (kn != null) kn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnTimkiem_PTActionPerformed

    private void btnXoa_PTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_PTActionPerformed
        int row = table_PT.getSelectedRow();
        if(row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa!");
            return;
        }

        String maphieuthue = (String) table_PT.getValueAt(row, 0);

        try {
            Connection kn = (Connection) KetNoi.ketNoi();
            String sql = "DELETE FROM phieuthue WHERE maphieuthue = ?";
            PreparedStatement pst = kn.prepareStatement(sql);
            pst.setString(1, maphieuthue);
            pst.executeUpdate();

            updateTablePhieuThue();

            JOptionPane.showMessageDialog(this, "Xóa phiếu thuê thành công!");
            txtMpt_PT.setText("");
            txtMkh_PT.setText("");
            txtMp_PT.setText("");
            jDateNgayden.setDate(null);
            jDateNgaydi.setDate(null);
            cbThanhtoan_PT.setSelectedIndex(0);
            txtGhichu_PT.setText("");
            btnThem_PT.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        }
    }//GEN-LAST:event_btnXoa_PTActionPerformed

    private void table_PTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_PTMouseClicked
        int row = table_PT.getSelectedRow();
        if (row != -1) {
            String maphieuthue = (String) table_PT.getValueAt(row, 0);
            String makhachhang = (String) table_PT.getValueAt(row, 1);
            String maphong = (String) table_PT.getValueAt(row, 2);
            String ngayden = (String) table_PT.getValueAt(row, 3);
            String ngaydi = (String) table_PT.getValueAt(row, 4);
            String thanhtoan = (String) table_PT.getValueAt(row, 5);
            String ghichu = (String) table_PT.getValueAt(row, 6);

            // Hiển thị thông tin lên các thành phần giao diện
            txtMpt_PT.setText(maphieuthue);
            txtMkh_PT.setText(makhachhang);
            txtMp_PT.setText(maphong);

            // Chuyển đổi ngày đến và ngày đi từ chuỗi sang định dạng Date
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date dateNgayDen = dateFormat.parse(ngayden);
                Date dateNgayDi = dateFormat.parse(ngaydi);
                jDateNgayden.setDate(dateNgayDen);
                jDateNgaydi.setDate(dateNgayDi);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }

            cbThanhtoan_PT.setSelectedItem(thanhtoan);
            txtGhichu_PT.setText(ghichu);
            btnThem_PT.setEnabled(false);
        }
    }//GEN-LAST:event_table_PTMouseClicked

    private void btnThem_PTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_PTActionPerformed
        String maphieutthue = txtMpt_PT.getText();
        String makhachhang = txtMkh_PT.getText();
        String maphong = txtMp_PT.getText();
        Date ngayDenDate = jDateNgayden.getDate();
        Date ngayDiDate = jDateNgaydi.getDate();
        if (ngayDenDate == null || ngayDiDate == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày đến và ngày đi!");
            return;
        }

        if (ngayDiDate.before(ngayDenDate)) {
            JOptionPane.showMessageDialog(this, "Ngày đi phải lớn hơn hoặc bằng ngày đến!");
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String ngayden = dateFormat.format(ngayDenDate);
        String ngaydi = dateFormat.format(ngayDiDate);
        String thanhtoan = cbThanhtoan_PT.getSelectedItem().toString();
        String ghichu = txtGhichu_PT.getText();

        try {
            Connection kn = (Connection) KetNoi.ketNoi();
            String sql = "INSERT INTO phieuthue (maphieuthue, makh, maphong, ngayden, ngaydi, thanhtoan, ghichu) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = kn.prepareStatement(sql);
            pst.setString(1, maphieutthue);
            pst.setString(2, makhachhang);
            pst.setString(3, maphong);
            pst.setString(4, ngayden);
            pst.setString(5, ngaydi);
            pst.setString(6, thanhtoan);
            pst.setString(7, ghichu);

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Thêm thông tin phiếu thuê thành công!");
                updateTableData();
                txtMpt_PT.setText("");
                txtMp_PT.setText("");
                txtMkh_PT.setText("");
                jDateNgayden.setDate(null);
                jDateNgaydi.setDate(null);
                cbThanhtoan_PT.setSelectedIndex(0);
                txtGhichu_PT.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        }
    }//GEN-LAST:event_btnThem_PTActionPerformed

    private void btnSua_PTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_PTActionPerformed
        int row = table_PT.getSelectedRow();
        if(row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để sửa!");
            return;
        }

        String maphieutthue = txtMpt_PT.getText();
        String makhachhang = txtMkh_PT.getText();
        String maphong = txtMp_PT.getText();
        Date ngayDenDate = jDateNgayden.getDate();
        Date ngayDiDate = jDateNgaydi.getDate();
        if (ngayDenDate == null || ngayDiDate == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày đến và ngày đi!");
            return;
        }

        if (ngayDiDate.before(ngayDenDate)) {
            JOptionPane.showMessageDialog(this, "Ngày đi phải lớn hơn hoặc bằng ngày đến!");
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String ngayden = dateFormat.format(ngayDenDate);
        String ngaydi = dateFormat.format(ngayDiDate);
        String thanhtoan = cbThanhtoan_PT.getSelectedItem().toString();
        String ghichu = txtGhichu_PT.getText();
        try {
            Connection kn = (Connection) KetNoi.ketNoi();
            String sql = "UPDATE phieuthue SET makh = ?, maphong = ?, ngayden = ?, ngaydi = ?, thanhtoan = ?, ghichu = ? WHERE maphieuthue = ?";
            PreparedStatement pst = kn.prepareStatement(sql);
            pst.setString(1, makhachhang);
            pst.setString(2, maphong);
            pst.setString(3, ngayden);
            pst.setString(4, ngaydi);
            pst.setString(5, thanhtoan);
            pst.setString(6, ghichu);
            pst.setString(7, maphieutthue);

            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Cập nhật thông tin phiếu thuê thành công!");
                updateTablePhieuThue();
                txtMpt_PT.setText("");
                txtMkh_PT.setText("");
                txtMp_PT.setText("");
                jDateNgayden.setDate(null);
                jDateNgaydi.setDate(null);
                cbThanhtoan_PT.setSelectedIndex(0);
                txtGhichu_PT.setText("");
                btnThem_PT.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSua_PTActionPerformed

    private void btnTimkiem_PhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiem_PhongActionPerformed
        String mpTK = txtTimkiem_Phong.getText().trim();
        if (mpTK == null || mpTK.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã phòng cần tìm kiếm.");
            return;
        }
        Connection kn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            kn = KetNoi.ketNoi();

          
            String sqlSearch = "SELECT * FROM phong WHERE maphong = ?";
            pst = kn.prepareStatement(sqlSearch);
            pst.setString(1, mpTK.trim());
            rs = pst.executeQuery();

            // Xóa dữ liệu cũ trong bảng
            DefaultTableModel model = (DefaultTableModel) Table_Phong.getModel();
            model.setRowCount(0);

            // Hiển thị kết quả tìm kiếm lên bảng
            while (rs.next()) {
                model.addRow(new Object[] {
                    rs.getString("maphong"),
                    rs.getString("loaiphong"),
                    rs.getString("tinhtrang"),
                    rs.getString("gia"),
                    rs.getString("ghichu")
                });
            }

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy phòng với mã: " + mpTK);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (kn != null) kn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnTimkiem_PhongActionPerformed

    private void btnHienthi_PhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienthi_PhongActionPerformed
        updateRoomTableData();
        txtMP_Phong.setText("");
        txtMP_Phong.setEnabled(true);
        txtLP_Phong.setSelectedIndex(0);
        txtTT_Phong.setText("");
        txtGia_Phong.setText("");
        txtGhichu_Phong.setText("");
    }//GEN-LAST:event_btnHienthi_PhongActionPerformed

    private void btnXoa_PhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_PhongActionPerformed
        int row = Table_Phong.getSelectedRow();
        if(row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa!");
            return;
        }

        String maphong = (String) Table_Phong.getValueAt(row, 0);

        try {
            Connection kn = (Connection) KetNoi.ketNoi();
            String sql = "DELETE FROM phong WHERE maphong = ?";
            PreparedStatement pst = kn.prepareStatement(sql);
            pst.setString(1, maphong);
            pst.executeUpdate();

            updateRoomTableData();

            JOptionPane.showMessageDialog(this, "Xóa phòng thành công!");
            txtMP_Phong.setText("");
            txtMP_Phong.setEnabled(true);
            txtLP_Phong.getSelectedItem().toString();
            txtTT_Phong.setText("");
            txtGia_Phong.setText("");
            txtGhichu_Phong.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        }
    }//GEN-LAST:event_btnXoa_PhongActionPerformed

    private void btnSua_PhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_PhongActionPerformed
        int row = Table_Phong.getSelectedRow();
        if(row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để sửa!");
            return;
        }

        String maphong = (String) Table_Phong.getValueAt(row, 0);
        String loaiphong = txtLP_Phong.getSelectedItem().toString();
        String tinhtrang = txtTT_Phong.getText();
        String gia = txtGia_Phong.getText();
        String ghichu = txtGhichu_Phong.getText();

        try {
            Connection kn = (Connection) KetNoi.ketNoi();
            String sql = "UPDATE phong SET loaiphong = ?, tinhtrang = ?, gia = ?, ghichu = ? WHERE maphong = ?";
            PreparedStatement pst = kn.prepareStatement(sql);
            pst.setString(1, loaiphong.trim());
            pst.setString(2, tinhtrang.trim());
            pst.setString(3, gia.trim());
            pst.setString(4, ghichu.trim());
            pst.setString(5, maphong.trim());
            pst.executeUpdate();

            updateRoomTableData();

            JOptionPane.showMessageDialog(this, "Cập nhật thông tin phòng thành công!");
            txtMP_Phong.setText("");
            txtLP_Phong.setSelectedIndex(0);
            txtTT_Phong.setText("");
            txtGia_Phong.setText("");
            txtGhichu_Phong.setText("");
            btnThem_Phong.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSua_PhongActionPerformed

    private void btnThem_PhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_PhongActionPerformed
        String maphong = txtMP_Phong.getText();
        String loaiphong = txtLP_Phong.getSelectedItem().toString();
        String tinhtrang = txtTT_Phong.getText();
        String gia = txtGia_Phong.getText();
        String ghichu = txtGhichu_Phong.getText();

        // Kiểm tra đầu vào
        if (maphong.trim().isEmpty() || loaiphong.trim().isEmpty() || tinhtrang.trim().isEmpty() || gia.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin!");
            return;
        }

        Connection kn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            kn = KetNoi.ketNoi();

            // Kiểm tra mã phòng đã tồn tại trong cơ sở dữ liệu
            String sqlCheckMaPhong = "SELECT * FROM phong WHERE maphong = ?";
            pst = kn.prepareStatement(sqlCheckMaPhong);
            pst.setString(1, maphong.trim());
            rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Mã phòng đã tồn tại! Vui lòng nhập mã phòng khác.");
                return;
            }

            // Thực hiện truy vấn thêm phòng mới
            String sqlInsert = "INSERT INTO phong (maphong, loaiphong, tinhtrang, gia, ghichu) VALUES (?, ?, ?, ?, ?)";
            pst = kn.prepareStatement(sqlInsert);
            pst.setString(1, maphong.trim());
            pst.setString(2, loaiphong.trim());
            pst.setString(3, tinhtrang.trim());
            pst.setString(4, gia.trim());
            pst.setString(5, ghichu.trim());
            pst.executeUpdate();

            // Xóa các trường nhập liệu
            txtMP_Phong.setText("");
            txtLP_Phong.setSelectedIndex(0);
            txtTT_Phong.setText("");
            txtGia_Phong.setText("");
            txtGhichu_Phong.setText("");

            // Thông báo thành công
            JOptionPane.showMessageDialog(this, "Thêm phòng thành công!");

            // Cập nhật bảng dữ liệu
            updateRoomTableData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (kn != null) kn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnThem_PhongActionPerformed

    private void Table_PhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_PhongMouseClicked
        int row = Table_Phong.getSelectedRow();

        String maphong = (String) Table_Phong.getValueAt(row, 0);
        String loaiphong = (String) Table_Phong.getValueAt(row, 1);
        String tinhtrang = (String) Table_Phong.getValueAt(row, 2);
        String gia = (String) Table_Phong.getValueAt(row, 3);
        String ghichu = (String) Table_Phong.getValueAt(row, 4);

        txtMP_Phong.setText(maphong);
        txtLP_Phong.setSelectedItem(loaiphong);
        txtTT_Phong.setText(tinhtrang);
        txtGia_Phong.setText(gia);
        txtGhichu_Phong.setText(ghichu);

        txtMP_Phong.setEnabled(false);
    }//GEN-LAST:event_Table_PhongMouseClicked

    private void btnTimkiem_NVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiem_NVActionPerformed
        String maNhanVienTimKiem = txtTK_NV.getText().trim();
        if (maNhanVienTimKiem == null || maNhanVienTimKiem.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã nhân viên cần tìm kiếm.");
            return;
        }

        Connection kn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            kn = KetNoi.ketNoi();

            // Thực hiện truy vấn tìm kiếm nhân viên
            String sqlSearch = "SELECT * FROM nhanvien WHERE manhanvien = ?";
            pst = kn.prepareStatement(sqlSearch);
            pst.setString(1, maNhanVienTimKiem.trim());
            rs = pst.executeQuery();

            // Xóa dữ liệu cũ trong bảng
            DefaultTableModel model = (DefaultTableModel) table_NV.getModel();//lay ta dl cua bang
            model.setRowCount(0);

            // Hiển thị kết quả tìm kiếm lên bảng
            while (rs.next()) {
                model.addRow(new Object[] {
                    rs.getString("manhanvien"),
                    rs.getString("pass"),
                    rs.getString("tennhanvien"),
                    rs.getString("ngaysinh"),
                    rs.getString("gioitinh"),
                    rs.getString("diachi"),
                    rs.getString("sdt"),
                    rs.getString("chucvu")
                });
            }

            // Nếu không tìm thấy nhân viên, hiển thị thông báo
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên với mã " + maNhanVienTimKiem);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (kn != null) kn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnTimkiem_NVActionPerformed

    private void btnHienthi_NVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienthi_NVActionPerformed
        updateTableNhanVien();
        txtMnv_NV.setText("");
        pass_NV.setText("");
        txtHoten_NV.setText("");
        NS_NV.setDate(null);
        cbGioitinh_NV.getSelectedItem();
        txtDC_NV.setText("");
        txtSdt_NV.setText("");
        txtCv_NV.setSelectedIndex(0);

    }//GEN-LAST:event_btnHienthi_NVActionPerformed

    private void txtXoa_NVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtXoa_NVActionPerformed
        int row = table_NV.getSelectedRow();
        if(row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa!");
            return;
        }

        String manhanvien = (String) table_NV.getValueAt(row, 0);//lay gt tai cot mnv

        try {
            Connection kn = (Connection) KetNoi.ketNoi();
            String sql = "DELETE FROM nhanvien WHERE manhanvien = ?";
            PreparedStatement pst = kn.prepareStatement(sql);//truy van sql xoa nv
            pst.setString(1, manhanvien);
            pst.executeUpdate();

            updateTableNhanVien();

            JOptionPane.showMessageDialog(this, "Xóa nhân viên thành công!");
            txtMnv_NV.setText("");
            pass_NV.setText("");
            txtHoten_NV.setText("");
            NS_NV.setDate(null);
            cbGioitinh_NV.getSelectedItem();
            txtDC_NV.setText("");
            txtSdt_NV.setText("");
            txtCv_NV.setSelectedIndex(0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        }
    }//GEN-LAST:event_txtXoa_NVActionPerformed

    private void btnThem_NVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_NVActionPerformed
        String mnv = txtMnv_NV.getText();
        String pass = pass_NV.getText();
        String hoten = txtHoten_NV.getText();
        Date ngaysinh = NS_NV.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String NS = dateFormat.format(ngaysinh);
        String gioitinh = cbGioitinh_NV.getSelectedItem().toString();
        String diachi = txtDC_NV.getText();
        String sdt = txtSdt_NV.getText();
        String cv = txtCv_NV.getSelectedItem().toString();

        // Kiểm tra đầu vào
        if (mnv.trim().isEmpty() || pass.trim().isEmpty() || hoten.trim().isEmpty() || diachi.trim().isEmpty() || sdt.trim().isEmpty() || cv.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin!");
            return;
        }

        Connection kn = null;
        PreparedStatement pst = null;//thuc hien truy van csdl
        ResultSet rs = null;//luu kq truy van
        try {
            kn = KetNoi.ketNoi();

            // Kiểm tra mã nhân viên đã tồn tại trong cơ sở dữ liệu
            String sqlCheckMaNV = "SELECT * FROM nhanvien WHERE manhanvien = ?";
            pst = kn.prepareStatement(sqlCheckMaNV);
            pst.setString(1, mnv.trim());
            rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại! Vui lòng nhập mã nhân viên khác.");
                return;
            }

            // Thực hiện truy vấn thêm nhân viên mới
            String sqlInsert = "INSERT INTO nhanvien (manhanvien,pass, tennhanvien, ngaysinh, gioitinh, diachi, sdt,chucvu) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            pst = kn.prepareStatement(sqlInsert);
            pst.setString(1, mnv.trim());
            pst.setString(2, pass.trim());
            pst.setString(3, hoten.trim());
            pst.setString(4, NS);
            pst.setString(5, gioitinh);
            pst.setString(6, diachi.trim());
            pst.setString(7, sdt.trim());
            pst.setString(8, cv.trim());

            pst.executeUpdate();

            updateTableNhanVien();

            // Xóa dữ liệu trong các ô nhập liệu
            txtMnv_NV.setText("");
            pass_NV.setText("");
            txtHoten_NV.setText("");
            NS_NV.setDate(null); // Đặt lại bộ chọn ngày về null
            cbGioitinh_NV.setSelectedIndex(0); // Đặt lại JComboBox về mục đầu tiên
            txtDC_NV.setText("");
            txtSdt_NV.setText("");
            txtCv_NV.setSelectedIndex(0);
            // Thông báo thành công
            JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        } finally {//tat ca tai nguyen duoc dong bat ke ngoai le
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (kn != null) kn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnThem_NVActionPerformed

    private void txtSua_NVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSua_NVActionPerformed
        int row = table_NV.getSelectedRow();
        if(row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để sửa!");
            return;
        }

        String mnv = txtMnv_NV.getText();
        String pass = pass_NV.getText();
        String hoten = txtHoten_NV.getText();
        Date ngaysinh = NS_NV.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String NS = dateFormat.format(ngaysinh);
        String gioitinh = cbGioitinh_NV.getSelectedItem().toString();//lay ra item trong ds
        String diachi = txtDC_NV.getText();
        String sdt = txtSdt_NV.getText();
        String cv = txtCv_NV.getSelectedItem().toString();

        try {
            Connection kn = (Connection) KetNoi.ketNoi();
            String sql = "UPDATE nhanvien SET pass = ?, tennhanvien = ?, ngaysinh = ? ,gioitinh = ?, diachi = ?, sdt = ?, chucvu = ? WHERE manhanvien = ?";
            PreparedStatement pst = kn.prepareStatement(sql);

            pst.setString(1, pass.trim());
            pst.setString(2, hoten.trim());
            pst.setString(3, NS.trim());
            pst.setString(4, gioitinh.trim());
            pst.setString(5, diachi.trim());
            pst.setString(6, sdt.trim());
            pst.setString(7, cv.trim());
            pst.setString(8, mnv.trim());
            pst.executeUpdate();

            updateTableNhanVien();

            JOptionPane.showMessageDialog(this, "Cập nhật thông tin nhân viên thành công!");
            txtMnv_NV.setText("");
            pass_NV.setText("");
            txtHoten_NV.setText("");
            NS_NV.setDate(null);
            cbGioitinh_NV.getSelectedItem();
            txtDC_NV.setText("");
            txtSdt_NV.setText("");
            txtCv_NV.setSelectedIndex(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        }
    }//GEN-LAST:event_txtSua_NVActionPerformed

    private void table_NVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_NVMouseClicked
        int row = table_NV.getSelectedRow();

        String manhanvien = (String) table_NV.getValueAt(row, 0);
        String pass = (String) table_NV.getValueAt(row, 1);
        String tennhanvien = (String) table_NV.getValueAt(row, 2);
        String ngaysinh = (String) table_NV.getValueAt(row, 3);
        String gioitinh = (String) table_NV.getValueAt(row, 4);
        String diachi = (String) table_NV.getValueAt(row, 5);
        String sdt = (String) table_NV.getValueAt(row, 6);
        String cv = (String) table_NV.getValueAt(row, 7);

        txtMnv_NV.setText(manhanvien);
        pass_NV.setText(pass);
        txtHoten_NV.setText(tennhanvien);

        // Chuyển đổi ngày đến và ngày đi từ chuỗi sang định dạng Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date ns = dateFormat.parse(ngaysinh);
            NS_NV.setDate(ns);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        cbGioitinh_NV.setSelectedItem(gioitinh);
        txtDC_NV.setText(diachi);
        txtSdt_NV.setText(sdt);
        txtCv_NV.setSelectedItem(cv);

        txtMP_Phong.setEnabled(false);
    }//GEN-LAST:event_table_NVMouseClicked

    private void btnDangxuat_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangxuat_menuActionPerformed
        this.dispose();
        Login lg = new Login();
        lg.setmanv(manhanvien);//dat gt cua thuoc tinh mnv cho lg
        lg.setVisible(true);
    }//GEN-LAST:event_btnDangxuat_menuActionPerformed

    private void btOpenThuePhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOpenThuePhongActionPerformed
        ThuePhong tp= new ThuePhong();
        tp.setMaQL(manhanvien);//dat gt thuoc tinh mql cua tp = mnv
        this.dispose();
        tp.setVisible(true);
    }//GEN-LAST:event_btOpenThuePhongActionPerformed

    private void btThoat_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoat_MenuActionPerformed
        int thoat = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "Thoát!", JOptionPane.YES_NO_OPTION);
            if (thoat == JOptionPane.YES_OPTION) {
                System.exit(0);
            } else {
                setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
            }
    }//GEN-LAST:event_btThoat_MenuActionPerformed
    private void updateTableData() {
        try {
            Connection kn = (Connection) KetNoi.ketNoi();

            String sql = "SELECT * FROM KhachHang";
            Statement st = kn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            DefaultTableModel model = (DefaultTableModel) Table_KH.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                Object[] row = {rs.getString("makh"), rs.getString("tenkh"), rs.getString("gioitinh"), rs.getString("diachi"), rs.getString("sdt"), rs.getString("cmnd")};
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        }
    }
    private void updateRoomTableData() {
        Connection kn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            kn = KetNoi.ketNoi();
            String sqlSelect = "SELECT * FROM phong";
            pst = kn.prepareStatement(sqlSelect);
            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) Table_Phong.getModel();
            model.setRowCount(0); // Xóa tất cả các dòng trong bảng

            while (rs.next()) {
                String maphong = rs.getString("maphong");
                String loaiphong = rs.getString("loaiphong");
                String tinhtrang = rs.getString("tinhtrang");
                String gia = rs.getString("gia");
                String ghichu = rs.getString("ghichu");

                Object[] row = {maphong, loaiphong, tinhtrang, gia, ghichu};
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (kn != null) kn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Makh;
    private javax.swing.JLabel Makh1;
    private javax.swing.JLabel Makh10;
    private javax.swing.JLabel Makh11;
    private javax.swing.JLabel Makh12;
    private javax.swing.JLabel Makh13;
    private javax.swing.JLabel Makh14;
    private javax.swing.JLabel Makh15;
    private javax.swing.JLabel Makh16;
    private javax.swing.JLabel Makh17;
    private javax.swing.JLabel Makh18;
    private javax.swing.JLabel Makh19;
    private javax.swing.JLabel Makh2;
    private javax.swing.JLabel Makh20;
    private javax.swing.JLabel Makh21;
    private javax.swing.JLabel Makh22;
    private javax.swing.JLabel Makh23;
    private javax.swing.JLabel Makh24;
    private javax.swing.JLabel Makh25;
    private javax.swing.JLabel Makh26;
    private javax.swing.JLabel Makh27;
    private javax.swing.JLabel Makh28;
    private javax.swing.JLabel Makh29;
    private javax.swing.JLabel Makh3;
    private javax.swing.JLabel Makh30;
    private javax.swing.JLabel Makh31;
    private javax.swing.JLabel Makh32;
    private javax.swing.JLabel Makh33;
    private javax.swing.JLabel Makh4;
    private javax.swing.JLabel Makh5;
    private javax.swing.JLabel Makh6;
    private com.toedter.calendar.JDateChooser NS_NV;
    private com.toedter.calendar.JDateChooser NgayTT_HD;
    private javax.swing.JTable Table_KH;
    private javax.swing.JTable Table_Phong;
    private javax.swing.JButton btOpenThuePhong;
    private javax.swing.JButton btThoat_Menu;
    private javax.swing.JButton btnDangxuat_menu;
    private javax.swing.JButton btnHienthi_HD;
    private javax.swing.JButton btnHienthi_KH;
    private javax.swing.JButton btnHienthi_NV;
    private javax.swing.JButton btnHienthi_PT;
    private javax.swing.JButton btnHienthi_Phong;
    private javax.swing.JButton btnSua_HD;
    private javax.swing.JButton btnSua_KH;
    private javax.swing.JButton btnSua_PT;
    private javax.swing.JButton btnSua_Phong;
    private javax.swing.JButton btnThem_KH;
    private javax.swing.JButton btnThem_NV;
    private javax.swing.JButton btnThem_PT;
    private javax.swing.JButton btnThem_Phong;
    private javax.swing.JButton btnTimkiem_HD;
    private javax.swing.JButton btnTimkiem_KH;
    private javax.swing.JButton btnTimkiem_NV;
    private javax.swing.JButton btnTimkiem_PT;
    private javax.swing.JButton btnTimkiem_Phong;
    private javax.swing.JButton btnXoa_HD;
    private javax.swing.JButton btnXoa_KH;
    private javax.swing.JButton btnXoa_PT;
    private javax.swing.JButton btnXoa_Phong;
    private javax.swing.JComboBox<String> cbGioitinh_KH;
    private javax.swing.JComboBox<String> cbGioitinh_NV;
    private javax.swing.JComboBox<String> cbThanhtoan_PT;
    private com.toedter.calendar.JDateChooser jDateNgayden;
    private com.toedter.calendar.JDateChooser jDateNgaydi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb3214;
    private javax.swing.JTextField pass_NV;
    private javax.swing.JTable table_HD;
    private javax.swing.JTable table_NV;
    private javax.swing.JTable table_PT;
    private javax.swing.JTextField txtCMND_KH;
    private javax.swing.JComboBox<String> txtCv_NV;
    private javax.swing.JTextField txtDC_KH;
    private javax.swing.JTextField txtDC_NV;
    private javax.swing.JLabel txtDiachi;
    private javax.swing.JTextField txtGhichu_PT;
    private javax.swing.JTextField txtGhichu_Phong;
    private javax.swing.JTextField txtGia_Phong;
    private javax.swing.JTextField txtHoten_NV;
    private javax.swing.JComboBox<String> txtLP_Phong;
    private javax.swing.JTextField txtMHD_HD;
    private javax.swing.JTextField txtMKH_KH;
    private javax.swing.JTextField txtMP_Phong;
    private javax.swing.JTextField txtMkh_PT;
    private javax.swing.JTextField txtMnv_NV;
    private javax.swing.JTextField txtMp_PT;
    private javax.swing.JTextField txtMpt_HD;
    private javax.swing.JTextField txtMpt_PT;
    private javax.swing.JTextField txtPhiDV_HD;
    private javax.swing.JTextField txtSDT_KH;
    private javax.swing.JTextField txtSdt_NV;
    private javax.swing.JButton txtSua_NV;
    private javax.swing.JTextField txtTKH_KH;
    private javax.swing.JTextField txtTK_NV;
    private javax.swing.JTextField txtTT_Phong;
    private javax.swing.JLabel txtTenkh;
    private javax.swing.JTextField txtTienphong_HD;
    private javax.swing.JTextField txtTimkiem_HD;
    private javax.swing.JTextField txtTimkiem_KH;
    private javax.swing.JTextField txtTimkiem_PT;
    private javax.swing.JTextField txtTimkiem_Phong;
    private javax.swing.JTextField txtTongtien_HD;
    private javax.swing.JButton txtXoa_NV;
    // End of variables declaration//GEN-END:variables
}

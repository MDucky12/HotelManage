/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.dao;

import com.hotelmanage.entity.HMStaff;
import com.hotelmanage.utils.SqlStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author duchmps23300
 */
public class HMStaffDAO extends HMDAO<HMStaff, Integer> {
    String INSERT_SQL = "INSERT INTO NguoiHoc(MaNH,HoTen,GioiTinh,NgaySinh,DienThoai,Email,GhiChu,MaNV,NgayDK) VALUES(?,?,?,?,?,?,?,?,?";
    String UPDATE_SQL = "UPDATE NguoiHoc SET HoTen =? ,GioiTinh = ?, NgaySinh = ?,DienThoai=?,Email=?,GhiChu=?,MaNV=?,NgayDK=? WHERE MaNH =?";
    String DELETE_SQL = "DELETE FROM NguoiHoc WHERE MaNH =?";
    String SELECT_ALL_SQL = "SELECT * FROM NguoiHoc";
    String SELECT_BY_ID_SQL = "SELECT * FROM NguoiHoc WHERE MaNH = ?";
    
    @Override
    public void insert(HMStaff entity) {
        SqlStatement.update(INSERT_SQL, entity.getIdUser(), entity.getUsername(), entity.getPassword(), entity.getIdBranch());
    }


    @Override
    public void update(HMStaff entity) {
        SqlStatement.update(UPDATE_SQL, entity.getIdUser(), entity.getUsername(), entity.getPassword(), entity.getIdBranch());
    }

    @Override
    public void delete(String id) {
        SqlStatement.update(DELETE_SQL, id);
    }

    @Override
    public List<HMStaff> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public HMStaff selectById(String id) {
        List<HMStaff> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<HMStaff> selectBySQL(String sql, Object... args) {
        List<HMStaff> list = new ArrayList<HMStaff>();
        try {
            ResultSet rs = null;
            try {
                rs = SqlStatement.query(sql, args);
                while (rs.next()) {
                    HMStaff nv = new HMStaff();
                    list.add(nv);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public List<HMStaff> selectByKeywords(String key) {
        String sql = "SELECT * FROM NguoiHoc WHERE MaNH LIKE ?";
        return this.selectBySQL(sql, "%" + key + "%");
    }
 
}

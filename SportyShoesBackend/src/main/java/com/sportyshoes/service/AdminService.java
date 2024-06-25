package com.sportyshoes.service;

import com.sportyshoes.model.Admin;

import java.util.List;

public interface AdminService {

    List<Admin> getAllAdmins();

    Admin getAdminById(Long id);

    Admin createAdmin(Admin admin);

    Admin updateAdmin(Long id, Admin adminDetails);

    void deleteAdmin(Long id);

    boolean authenticateAdmin(String username, String password);

    Admin changePassword(Long id, String newPassword);
}

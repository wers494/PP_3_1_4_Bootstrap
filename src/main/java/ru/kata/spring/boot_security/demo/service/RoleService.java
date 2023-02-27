package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.entities.Role;

import java.util.List;

public interface RoleService {
    void save(Role role);

    List<Role> getAllRoles();

    Role getOneRole(Long id);

    List<Role> getRoles(Long[] roleId);
}

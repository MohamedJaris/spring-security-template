package com.springSecurity.spring_security_template.entity;

import java.util.Set;

public enum Role {
    ADMIN(Set.of(Permissions.USERS_READ,Permissions.USERS_WRITE, Permissions.USERS_DELETE)),
    USER(Set.of(Permissions.USERS_READ));

    private final Set<Permissions> permissions;

    Role(Set<Permissions> permissions) {
        this.permissions = permissions;
    }

    public Set<Permissions> getPermissions() {
        return permissions;
    }
}

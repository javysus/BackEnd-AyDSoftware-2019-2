package com.nogal.nogal.Autentificacion.Modelos;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
import java.util.stream.Collectors;

public class MyUserDetails implements UserDetails {
    private static final long serialVersionUID = 752647229368576147L;  // unique id

    private final String userName;
    private final String password;
    private final String nombre;
    private final String apellido;
    private final boolean active;
    private final List<GrantedAuthority> roles;
    
    public MyUserDetails(User user){
        this.userName = user.getUserName();
        this.password = user.getPassword();
        this.nombre = user.getNombre();
        this.apellido = user.getApellido();
        this.active = user.isActive();
        this.roles = Arrays.stream(user.getRoles().split(","))
                    .map(SimpleGrantedAuthority::new)
                    .collect(Collectors.toList());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        return this.roles;
    }

    public String getNombre() {
        // TODO Auto-generated method stub
        return this.nombre;
    }

    public String getApellido() {
        // TODO Auto-generated method stub
        return this.apellido;
    }

    public boolean getActive() {
        // TODO Auto-generated method stub
        return this.active;
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return this.password;
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return this.userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        // return this.active;
        return true;
    }
    
}
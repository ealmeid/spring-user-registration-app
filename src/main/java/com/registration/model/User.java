/**
 * User Entity class (aka our POJO - Plain Old Java Object). This is where the
 * values/attributes (columns in our database) are created. The table is also
 * created as well. This class will allow us to set and get the username, password
 * and id.
 */

package com.registration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User{
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name="id")
    private long id;
	
	@Column(name="username")
    private String username;
	
	@Column(name="password")
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
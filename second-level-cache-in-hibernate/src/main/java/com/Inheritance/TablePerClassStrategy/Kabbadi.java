package com.Inheritance.TablePerClassStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Kabbadi  extends Sports{
    @Column
    private String team;
    @Column
    private String P_name;
    
    
    public Kabbadi() {
	super();
	// TODO Auto-generated constructor stub
    }


    public Kabbadi(String name, String team, String p_name) {
	super(name);
	this.team = team;
	P_name = p_name;
    }


    public String getTeam() {
        return team;
    }


    public void setTeam(String team) {
        this.team = team;
    }


    public String getP_name() {
        return P_name;
    }


    public void setP_name(String p_name) {
        P_name = p_name;
    }
    
    
    
    

}

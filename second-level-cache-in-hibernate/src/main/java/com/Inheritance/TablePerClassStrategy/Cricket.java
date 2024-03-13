package com.Inheritance.TablePerClassStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Cricket extends Sports {
    @Column
    private String Team;
    @Column
    private String P_name;

    public Cricket() {
	super();
	// TODO Auto-generated constructor stub
    }

    public Cricket(String name, String team, String p_name) {
	super(name);
	Team = team;
	P_name = p_name;
    }

    public String getTeam() {
	return Team;
    }

    public void setTeam(String team) {
	Team = team;
    }

    public String getP_name() {
	return P_name;
    }

    public void setP_name(String p_name) {
	P_name = p_name;
    }

}

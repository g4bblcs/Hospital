/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.hospital;

import java.util.ArrayList;

/**
 *
 * @author Gabriela Campo
 */
public class Hospital {

    private ArrayList<Team> teams = new ArrayList<>();
    private ArrayList<Ward> wards = new ArrayList<>();

    public Hospital() {
        this.teams = new ArrayList<>();
        this.wards = new ArrayList<>();
    }

    public void addTeam(int teamid, int leaderid) {
        this.teams.add(new Team(teamid));
        this.getTeam(teamid).addLeader(leaderid);
    }

    public Team getTeam(int id) {
        for (Team team : this.teams) {
            if (team.getid() == id) {
                return team;
            }
        }
        return null;
    }
}


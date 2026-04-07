/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.hospital.Team;

/**
 *
 * @author Gabriela Campo
 */
public class ConsultantDoctor extends Doctor {
    private boolean leaderOf;
    public ConsultantDoctor(Team team, int id) {
        super(team, id);
    }

    public int getId() {
        return this.id;
    }
    
    
}

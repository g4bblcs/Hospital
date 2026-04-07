/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.hospital.*;
import java.util.ArrayList;

/**
 *
 * @author Gabriela Campo
 */
public abstract class Doctor {
    protected int id;
    protected Team team;
    protected ArrayList<Appoiment> appoiments = new ArrayList<>();
    protected ArrayList<Patient> patients = new ArrayList<>();

    public Doctor(Team team, int id) {
        this.id = id;
        this.team = team;
        this.appoiments = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    
}


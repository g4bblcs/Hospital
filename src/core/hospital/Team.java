/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.hospital;

import java.util.ArrayList;
import core.person.*;

/**
 *
 * @author Gabriela Campo
 */
public class Team {

    private int id;
    private ConsultantDoctor teamLeader;
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Patient> patients = new ArrayList<>();

    public Team(int id) {
        this.id = id;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
        this.teamLeader = null;
    }

    public void addLeader(int leaderId) {
        this.teamLeader = this.getConsultantDoctor(leaderId);
    }

    public ConsultantDoctor getConsultantDoctor(int id) {
        for (Doctor doctor : this.doctors) {
            if (doctor.getId() == id && doctor instanceof ConsultantDoctor) {
                return (ConsultantDoctor) doctor;
            }
        }
        return null;
    }
     public int getid() {
        return this.id;
    }

    public JuniorDoctor getJunior(int id) {
        for (Doctor doctor : this.doctors) {
            if (doctor.getId() == id && doctor instanceof JuniorDoctor) {
                return (JuniorDoctor) doctor;
            }
        }
        return null;
    }
}

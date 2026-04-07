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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ConsultantDoctor getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(ConsultantDoctor teamLeader) {
        this.teamLeader = teamLeader;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void addPatient(Patient patient) {
        if (!this.patients.contains(patient)){
            this.patients.add(patient);
        } 
    }

    
}

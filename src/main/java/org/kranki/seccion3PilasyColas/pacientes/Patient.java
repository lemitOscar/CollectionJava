package org.kranki.seccion3PilasyColas.pacientes;

public class Patient implements Comparable<Patient> {

    private String name;
    private Gravity gravity;

    public Patient(String name, Gravity gravity) {
        this.name = name;
        this.gravity = gravity;
    }

    @Override
    public int compareTo(Patient patient) {
        int currentLevel = this.gravity.getLevel();
        int copareLevel = patient.gravity.getLevel();
        return copareLevel - currentLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gravity getGravity() {
        return gravity;
    }

    public void setGravity(Gravity gravity) {
        this.gravity = gravity;
    }
}

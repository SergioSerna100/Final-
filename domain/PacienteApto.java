package com.sergio.domain;

public class PacienteApto extends Paciente implements Operable {

    public PacienteApto(String nombre, int edad, boolean necesitaCirugia) {
        super(nombre, edad, necesitaCirugia);
    }


    @Override
    public void operar() {
    }
}

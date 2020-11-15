package com.sergio.main;

import com.sergio.domain.Oftalmologo;

public class AppOftalmologo {
    public static void main(String[] args) {
        Oftalmologo oftalmologo = new Oftalmologo();

        System.out.println(oftalmologo.revisarPaciente("ANTONIO", 30));
        System.out.println(oftalmologo.revisarPaciente("JULIETA", 25));
        System.out.println(oftalmologo.revisarPaciente("Alberto", 50));
        System.out.println(oftalmologo.revisarPaciente("Francisco", 29));
        System.out.println(oftalmologo.revisarPaciente("Alejandro", 18));

        System.out.println( "\n");
        System.out.println("Listado de Pacientes Aptos para la operación");
        System.out.println(oftalmologo.getPacienteAOperar());

        System.out.println( "\n");
        System.out.println("Pacientes, operables o no");
        oftalmologo.operarPaciente();
    }
}

package com.admin.demo.enums;

public enum Cargo {
    VENDEDOR(950), GERENTE(2500), ADMINISTRADOR(1800);
    private float sueldo;

    Cargo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
}

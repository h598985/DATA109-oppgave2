package com.func.selskap;

public class Kredittkort {
    private int id;
    private String nummer;

    public Kredittkort(int id, String nummer) {
        this.id = id;
        this.nummer = nummer;
    }

    public int getId() {
        return id;
    }

    public String getNummer() {
        return nummer;
    }

}

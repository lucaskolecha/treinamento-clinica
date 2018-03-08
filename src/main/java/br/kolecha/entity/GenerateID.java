package br.kolecha.entity;

import java.util.UUID;

public class GenerateID {

    private GenerateID () {
    }

    public static String gerarID() {
        return UUID
                .randomUUID()
                .toString()
                .toUpperCase()
                .replace("-","");
    }

}

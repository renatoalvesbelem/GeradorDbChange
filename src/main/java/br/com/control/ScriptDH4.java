package br.com.control;

import java.io.BufferedReader;
import java.io.FileReader;

public class ScriptDH4 {
    private String descricao;

    public ScriptDH4(String file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while (br.ready()) {
                if ((descricao = br.readLine()).contains("Objetivo")) {
                    descricao = descricao.split(":")[1].trim();
                    break;
                }
            }
            br.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

    }

    public String getDescricao() {
        return descricao;
    }
}

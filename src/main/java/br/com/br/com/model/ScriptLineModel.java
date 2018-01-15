package br.com.br.com.model;


import br.com.ParametrosDbChange;

import java.util.ArrayList;
import java.util.List;

public class ScriptLineModel extends ParametrosDbChange {
    private List<String> nomeScript = new ArrayList<String>();

    public List<String> getNomeScriptFormatado() {
        return nomeScript;
    }


    public void setNomeScript(String[] listaScripts) {
        for (int i = 0; i < listaScripts.length; i++) {
            if (listaScripts[i].contains(EXTENSAO_SCRIPT)) {
                nomeScript.add(INICIO_SCRIPT + listaScripts[i]+FIM_SCRIPT);
            }

        }
    }
}

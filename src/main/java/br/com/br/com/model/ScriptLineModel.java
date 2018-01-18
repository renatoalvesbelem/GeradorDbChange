package br.com.br.com.model;


import br.com.ParametrosDbChange;
import br.com.control.ScriptDH4;

import java.util.ArrayList;
import java.util.List;

public class ScriptLineModel extends ParametrosDbChange {
    private List<String> nomeScript = new ArrayList<String>();

    public List<String> getNomeScriptFormatado() {
        return nomeScript;
    }


    public void setNomeScript(String[] listaScripts) {
        for (String listaScript : listaScripts) {
            if (listaScript.contains(EXTENSAO_SCRIPT)) {
                nomeScript.add(INICIO_SCRIPT + listaScript + FIM_NAME + ESPACO + INICIO_DESCRIPTION + new ScriptDH4(listaScript).getDescricao() + FIM_DESCRIPTION + FIM_SCRIPT);
            }

        }
    }
}

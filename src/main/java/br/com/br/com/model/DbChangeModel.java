package br.com.br.com.model;

import br.com.ParametrosDbChange;

import java.util.List;

public class DbChangeModel extends ParametrosDbChange {
    private List<String> scriptLineModel;


    public String getCabecalho() {
        return CABECALHO;
    }

    public List<String> getScriptLineModel() {
        return scriptLineModel;
    }

    public void setScriptLineModel(String[] scripts) {
        ScriptLineModel scriptLineModel = new ScriptLineModel();
        scriptLineModel.setNomeScript(scripts);
        this.scriptLineModel = scriptLineModel.getNomeScriptFormatado();

    }

    public String getRodape() {
        return RODAPE;
    }

}

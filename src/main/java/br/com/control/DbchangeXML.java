package br.com.control;

import br.com.ParametrosDbChange;
import br.com.br.com.model.DbChangeModel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DbchangeXML extends ParametrosDbChange {
    public void escreverArquivo(DbChangeModel dbChangeModel) throws IOException {
        FileWriter arquivo;
        arquivo = new FileWriter(new File(DBCHANGE));
        arquivo.write(dbChangeModel.getCabecalho());
        if (dbChangeModel.getScriptLineModel().size() ==0){
            throw new IOException();
        }
        for (String linha : dbChangeModel.getScriptLineModel()) {
            arquivo.write(linha);
        }
        arquivo.write(dbChangeModel.getRodape());
        arquivo.close();
    }
}

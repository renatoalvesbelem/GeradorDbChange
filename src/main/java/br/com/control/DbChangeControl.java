package br.com.control;

import br.com.br.com.model.DbChangeModel;
import br.com.br.com.model.ScriptLineModel;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class DbChangeControl {
    private DbChangeModel dbChangeModel = new DbChangeModel();
    private File file;


    public void criadbChange() {
        file = new File(new File("").getAbsolutePath());

        DbchangeXML dbchangeXML = new DbchangeXML();
        dbChangeModel.setScriptLineModel(file.list());
        try {
            dbchangeXML.escreverArquivo(dbChangeModel);
            JOptionPane.showMessageDialog(null, "O arquivo foi gerado com sucesso");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gerar o arquivo");
        }
    }


}

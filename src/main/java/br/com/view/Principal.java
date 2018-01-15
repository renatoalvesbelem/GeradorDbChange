package br.com.view;

import br.com.control.DbChangeControl;

public class Principal {
    public static void main(String[] args) {
        DbChangeControl dbChangeControl = new DbChangeControl();
        dbChangeControl.criadbChange();
    }
}

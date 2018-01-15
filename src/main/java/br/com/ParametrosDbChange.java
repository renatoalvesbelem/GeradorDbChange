package br.com;

public class ParametrosDbChange {
    public String CABECALHO = "\uFEFF<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<havillan>\n";

    public static String RODAPE = "</havillan>";
    public static String INICIO_SCRIPT = "\t<script a_name=\"";
    public static String FIM_SCRIPT = "\"/>\n";
    public static String EXTENSAO_SCRIPT = ".DH4";
    public static String DBCHANGE = "dbChange.xml";
}

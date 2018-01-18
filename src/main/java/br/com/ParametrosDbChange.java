package br.com;

public class ParametrosDbChange {
    protected String CABECALHO = "\uFEFF<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<havillan>\n";

    protected static String RODAPE = "</havillan>";
    protected static String INICIO_SCRIPT = "\t<script a_name=\"";
    protected static String FIM_NAME = "\"";
    protected static String FIM_SCRIPT = "/>\n";
    protected static String EXTENSAO_SCRIPT = ".DH4";
    protected static String DBCHANGE = "dbChange.xml";
    protected static String INICIO_DESCRIPTION="z_description=\"";
    protected static String FIM_DESCRIPTION = "\"";
    protected static String ESPACO = " ";
}

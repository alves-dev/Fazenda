package ClassesDados;

import java.util.Date;

public class lotes {
/*
id_lote int (auto incremento)
cod_fazenda
numeroLote int
statusLote varchar
pasto varchaar
qtdAnimais_Compra int
qtdMachos_Compra int
qtdFemea_Compra int
rsArroba_Compra (money)
rsManejo_Compra (money)
rsTotal_Compra (money)
kgArrobaTotal_Compra numerico(4,2)
kgArrobaMedia_Compra numerico(4,2)
idade_Compra int
qtdAnimais_Venda int
qtdMachos_Venda int
qtdFemea_Venda int
rsArroba_Venda (money)
rsManejo_Venda (money)
rsTotal_Venda (money)
kgArrobaTotal_Venda numerico(4,2)
kgArrobaMedia_Venda numerico(4,2)
idade_Venda int
animaiMortos int
periodoConfinamento int
dt_Compra date
dt_Venda date
        */

private int id_lote;
private int cod_fazenda;
private int numeroLote;
private String statusLote;
private String pasto;
private int qtdAnimais_Compra;
private int qtdMachos_Compra;
private int qtdFemea_Compra;
private double rsArroba_Compra;
private double rsManejo_Compra;
private double rsTotal_Compra;
private double kgArrobaTotal_Compra;
private double kgArrobaMedia_Compra;
private int idade_Compra;
private int qtdAnimais_Venda;
private int qtdMachos_Venda;
private int qtdFemea_Venda;
private double rsArroba_Venda;
private double rsManejo_Venda;
private double rsTotal_Venda;
private double kgArrobaTotal_Venda;
private double kgArrobaMedia_Venda;
private int idade_Venda;
private int animaiMortos;
private int periodoConfinamento;
private Date dt_Compra;
private Date dt_Venda;

    public lotes(){
        
    }

    public lotes(int id_lote, int cod_fazenda, int numeroLote, String statusLote, String pasto, int qtdAnimais_Compra, 
            int qtdMachos_Compra, int qtdFemea_Compra, double rsArroba_Compra, double rsManejo_Compra, double rsTotal_Compra, 
            double kgArrobaTotal_Compra, double kgArrobaMedia_Compra, int idade_Compra, int qtdAnimais_Venda, 
            int qtdMachos_Venda, int qtdFemea_Venda, double rsArroba_Venda, double rsManejo_Venda, double rsTotal_Venda, 
            double kgArrobaTotal_Venda, double kgArrobaMedia_Venda, int idade_Venda, int animaiMortos, 
            int periodoConfinamento, Date dt_Compra, Date dt_Venda) {
        this.id_lote = id_lote;
        this.cod_fazenda = cod_fazenda;
        this.numeroLote = numeroLote;
        this.statusLote = statusLote;
        this.pasto = pasto;
        this.qtdAnimais_Compra = qtdAnimais_Compra;
        this.qtdMachos_Compra = qtdMachos_Compra;
        this.qtdFemea_Compra = qtdFemea_Compra;
        this.rsArroba_Compra = rsArroba_Compra;
        this.rsManejo_Compra = rsManejo_Compra;
        this.rsTotal_Compra = rsTotal_Compra;
        this.kgArrobaTotal_Compra = kgArrobaTotal_Compra;
        this.kgArrobaMedia_Compra = kgArrobaMedia_Compra;
        this.idade_Compra = idade_Compra;
        this.qtdAnimais_Venda = qtdAnimais_Venda;
        this.qtdMachos_Venda = qtdMachos_Venda;
        this.qtdFemea_Venda = qtdFemea_Venda;
        this.rsArroba_Venda = rsArroba_Venda;
        this.rsManejo_Venda = rsManejo_Venda;
        this.rsTotal_Venda = rsTotal_Venda;
        this.kgArrobaTotal_Venda = kgArrobaTotal_Venda;
        this.kgArrobaMedia_Venda = kgArrobaMedia_Venda;
        this.idade_Venda = idade_Venda;
        this.animaiMortos = animaiMortos;
        this.periodoConfinamento = periodoConfinamento;
        this.dt_Compra = dt_Compra;
        this.dt_Venda = dt_Venda;
    }

    public int getId_lote() {
        return id_lote;
    }

    public void setId_lote(int id_lote) {
        this.id_lote = id_lote;
    }

    public int getCod_fazenda() {
        return cod_fazenda;
    }

    public void setCod_fazenda(int cod_fazenda) {
        this.cod_fazenda = cod_fazenda;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public String getStatusLote() {
        return statusLote;
    }

    public void setStatusLote(String statusLote) {
        this.statusLote = statusLote;
    }

    public String getPasto() {
        return pasto;
    }

    public void setPasto(String pasto) {
        this.pasto = pasto;
    }

    public int getQtdAnimais_Compra() {
        return qtdAnimais_Compra;
    }

    public void setQtdAnimais_Compra(int qtdAnimais_Compra) {
        this.qtdAnimais_Compra = qtdAnimais_Compra;
    }

    public int getQtdMachos_Compra() {
        return qtdMachos_Compra;
    }

    public void setQtdMachos_Compra(int qtdMachos_Compra) {
        this.qtdMachos_Compra = qtdMachos_Compra;
    }

    public int getQtdFemea_Compra() {
        return qtdFemea_Compra;
    }

    public void setQtdFemea_Compra(int qtdFemea_Compra) {
        this.qtdFemea_Compra = qtdFemea_Compra;
    }

    public double getRsArroba_Compra() {
        return rsArroba_Compra;
    }

    public void setRsArroba_Compra(double rsArroba_Compra) {
        this.rsArroba_Compra = rsArroba_Compra;
    }

    public double getRsManejo_Compra() {
        return rsManejo_Compra;
    }

    public void setRsManejo_Compra(double rsManejo_Compra) {
        this.rsManejo_Compra = rsManejo_Compra;
    }

    public double getRsTotal_Compra() {
        return rsTotal_Compra;
    }

    public void setRsTotal_Compra(double rsTotal_Compra) {
        this.rsTotal_Compra = rsTotal_Compra;
    }

    public double getKgArrobaTotal_Compra() {
        return kgArrobaTotal_Compra;
    }

    public void setKgArrobaTotal_Compra(double kgArrobaTotal_Compra) {
        this.kgArrobaTotal_Compra = kgArrobaTotal_Compra;
    }

    public double getKgArrobaMedia_Compra() {
        return kgArrobaMedia_Compra;
    }

    public void setKgArrobaMedia_Compra(double kgArrobaMedia_Compra) {
        this.kgArrobaMedia_Compra = kgArrobaMedia_Compra;
    }

    public int getIdade_Compra() {
        return idade_Compra;
    }

    public void setIdade_Compra(int idade_Compra) {
        this.idade_Compra = idade_Compra;
    }

    public int getQtdAnimais_Venda() {
        return qtdAnimais_Venda;
    }

    public void setQtdAnimais_Venda(int qtdAnimais_Venda) {
        this.qtdAnimais_Venda = qtdAnimais_Venda;
    }

    public int getQtdMachos_Venda() {
        return qtdMachos_Venda;
    }

    public void setQtdMachos_Venda(int qtdMachos_Venda) {
        this.qtdMachos_Venda = qtdMachos_Venda;
    }

    public int getQtdFemea_Venda() {
        return qtdFemea_Venda;
    }

    public void setQtdFemea_Venda(int qtdFemea_Venda) {
        this.qtdFemea_Venda = qtdFemea_Venda;
    }

    public double getRsArroba_Venda() {
        return rsArroba_Venda;
    }

    public void setRsArroba_Venda(double rsArroba_Venda) {
        this.rsArroba_Venda = rsArroba_Venda;
    }

    public double getRsManejo_Venda() {
        return rsManejo_Venda;
    }

    public void setRsManejo_Venda(double rsManejo_Venda) {
        this.rsManejo_Venda = rsManejo_Venda;
    }

    public double getRsTotal_Venda() {
        return rsTotal_Venda;
    }

    public void setRsTotal_Venda(double rsTotal_Venda) {
        this.rsTotal_Venda = rsTotal_Venda;
    }

    public double getKgArrobaTotal_Venda() {
        return kgArrobaTotal_Venda;
    }

    public void setKgArrobaTotal_Venda(double kgArrobaTotal_Venda) {
        this.kgArrobaTotal_Venda = kgArrobaTotal_Venda;
    }

    public double getKgArrobaMedia_Venda() {
        return kgArrobaMedia_Venda;
    }

    public void setKgArrobaMedia_Venda(double kgArrobaMedia_Venda) {
        this.kgArrobaMedia_Venda = kgArrobaMedia_Venda;
    }

    public int getIdade_Venda() {
        return idade_Venda;
    }

    public void setIdade_Venda(int idade_Venda) {
        this.idade_Venda = idade_Venda;
    }

    public int getAnimaiMortos() {
        return animaiMortos;
    }

    public void setAnimaiMortos(int animaiMortos) {
        this.animaiMortos = animaiMortos;
    }

    public int getPeriodoConfinamento() {
        return periodoConfinamento;
    }

    public void setPeriodoConfinamento(int periodoConfinamento) {
        this.periodoConfinamento = periodoConfinamento;
    }

    public Date getDt_Compra() {
        return dt_Compra;
    }

    public void setDt_Compra(Date dt_Compra) {
        this.dt_Compra = dt_Compra;
    }

    public Date getDt_Venda() {
        return dt_Venda;
    }

    public void setDt_Venda(Date dt_Venda) {
        this.dt_Venda = dt_Venda;
    }
    
    

}

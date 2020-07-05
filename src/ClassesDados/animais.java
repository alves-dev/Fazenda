package ClassesDados;

import java.util.Date;

public class animais {

    public animais(int identificacao, String identificacao2, int cod_status, String status, int cod_tipoAnimal, String tipoAnimal, int cod_raca, String raca, int idade, int cod_pasto, String pasto, int loteCompra, int loteVenda, char sexo, String obs, Date dtCadastro, Date dtUltimaAteracao, int cod_fazenda) {
        this.identificacao = identificacao;
        this.identificacao2 = identificacao2;
        this.cod_status = cod_status;
        this.status = status;
        this.cod_tipoAnimal = cod_tipoAnimal;
        this.tipoAnimal = tipoAnimal;
        this.cod_raca = cod_raca;
        this.raca = raca;
        this.idade = idade;
        this.cod_pasto = cod_pasto;
        this.pasto = pasto;
        this.loteCompra = loteCompra;
        this.loteVenda = loteVenda;
        this.sexo = sexo;
        this.obs = obs;
        this.dtCadastro = dtCadastro;
        this.dtUltimaAteracao = dtUltimaAteracao;
        this.cod_fazenda = cod_fazenda;
    }

    private int identificacao;
    private String identificacao2;
    private int cod_status;
    private String status;
    private int cod_tipoAnimal;
    private String tipoAnimal;
    private int cod_raca;
    private String raca;
    private int idade;
    private int cod_pasto;
    private String pasto;
    private int loteCompra;
    private int loteVenda;
    private char sexo;
    private String obs;
    private Date dtCadastro;
    private Date dtUltimaAteracao;
    private int cod_fazenda;

    public animais() {

    }

    /**
     * @return the identificacao
     */
    public int getIdentificacao() {
        return identificacao;
    }

    /**
     * @param identificacao the identificacao to set
     */
    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    /**
     * @return the identificacao2
     */
    public String getIdentificacao2() {
        return identificacao2;
    }

    /**
     * @param identificacao2 the identificacao2 to set
     */
    public void setIdentificacao2(String identificacao2) {
        this.identificacao2 = identificacao2;
    }

    /**
     * @return the cod_status
     */
    public int getCod_status() {
        return cod_status;
    }

    /**
     * @param cod_status the cod_status to set
     */
    public void setCod_status(int cod_status) {
        this.cod_status = cod_status;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the cod_tipoAnimal
     */
    public int getCod_tipoAnimal() {
        return cod_tipoAnimal;
    }

    /**
     * @param cod_tipoAnimal the cod_tipoAnimal to set
     */
    public void setCod_tipoAnimal(int cod_tipoAnimal) {
        this.cod_tipoAnimal = cod_tipoAnimal;
    }

    /**
     * @return the tipoAnimal
     */
    public String getTipoAnimal() {
        return tipoAnimal;
    }

    /**
     * @param tipoAnimal the tipoAnimal to set
     */
    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    /**
     * @return the cod_raca
     */
    public int getCod_raca() {
        return cod_raca;
    }

    /**
     * @param cod_raca the cod_raca to set
     */
    public void setCod_raca(int cod_raca) {
        this.cod_raca = cod_raca;
    }

    /**
     * @return the raca
     */
    public String getRaca() {
        return raca;
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the cod_pasto
     */
    public int getCod_pasto() {
        return cod_pasto;
    }

    /**
     * @param cod_pasto the cod_pasto to set
     */
    public void setCod_pasto(int cod_pasto) {
        this.cod_pasto = cod_pasto;
    }

    /**
     * @return the pasto
     */
    public String getPasto() {
        return pasto;
    }

    /**
     * @param pasto the pasto to set
     */
    public void setPasto(String pasto) {
        this.pasto = pasto;
    }

    /**
     * @return the loteCompra
     */
    public int getLoteCompra() {
        return loteCompra;
    }

    /**
     * @param loteCompra the loteCompra to set
     */
    public void setLoteCompra(int loteCompra) {
        this.loteCompra = loteCompra;
    }

    /**
     * @return the loteVenda
     */
    public int getLoteVenda() {
        return loteVenda;
    }

    /**
     * @param loteVenda the loteVenda to set
     */
    public void setLoteVenda(int loteVenda) {
        this.loteVenda = loteVenda;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the obs
     */
    public String getObs() {
        return obs;
    }

    /**
     * @param obs the obs to set
     */
    public void setObs(String obs) {
        this.obs = obs;
    }

    /**
     * @return the dtCadastro
     */
    public Date getDtCadastro() {
        return dtCadastro;
    }

    /**
     * @param dtCadastro the dtCadastro to set
     */
    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    /**
     * @return the dtUltimaAteracao
     */
    public Date getDtUltimaAteracao() {
        return dtUltimaAteracao;
    }

    /**
     * @param dtUltimaAteracao the dtUltimaAteracao to set
     */
    public void setDtUltimaAteracao(Date dtUltimaAteracao) {
        this.dtUltimaAteracao = dtUltimaAteracao;
    }

    public int getCod_fazenda() {
        return cod_fazenda;
    }

    public void setCod_fazenda(int cod_fazenda) {
        this.cod_fazenda = cod_fazenda;
    }

}

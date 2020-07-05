package ClassesDados;

public class racaAnimais {

    public racaAnimais(int cod_raca, String raca, int cod_tipo, String tipoDescricao) {
        this.cod_raca = cod_raca;
        this.raca = raca;
        this.cod_tipo = cod_tipo;
        this.tipoDescricao = tipoDescricao;
    }

    private int cod_raca;
    private String raca;
    private int cod_tipo;
    private String tipoDescricao;

    public racaAnimais() {
      
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
     * @return the cod_tipo
     */
    public int getCod_tipo() {
        return cod_tipo;
    }

    /**
     * @param cod_tipo the cod_tipo to set
     */
    public void setCod_tipo(int cod_tipo) {
        this.cod_tipo = cod_tipo;
    }

    /**
     * @return the tipoDescricao
     */
    public String getTipoDescricao() {
        return tipoDescricao;
    }

    /**
     * @param tipoDescricao the tipoDescricao to set
     */
    public void setTipoDescricao(String tipoDescricao) {
        this.tipoDescricao = tipoDescricao;
    }

}

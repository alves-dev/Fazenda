package ClassesDados;

public class tipoAnimal {

    public tipoAnimal(int cod_tipo, String descricao) {
        this.cod_tipo = cod_tipo;
        this.descricao = descricao;
    }

    private int cod_tipo;
    private String descricao;

    public tipoAnimal() {

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
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}

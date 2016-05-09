/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author 12121001933
 */
public class CargoBean {
    int idCargo;
    String nomeCargo,descCargo;
    
    CargoBean(int id,String nome,String desc){
        this.idCargo=id;
        this.descCargo=desc;
        this.nomeCargo=nome;
    }
    
    CargoBean(String nome,String desc){
        this.descCargo=desc;
        this.nomeCargo=nome;
    }

    public CargoBean() {
    }
    
    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public String getDescCargo() {
        return descCargo;
    }

    public void setDescCargo(String descCargo) {
        this.descCargo = descCargo;
    }
    
    
    
    
    
}

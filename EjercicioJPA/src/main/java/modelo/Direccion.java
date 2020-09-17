package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
// creacion de la tabla direccion 
@Entity
@Table(name = "DIRECCION")
public class Direccion implements Serializable {
// creacion de los paramentros
    @Id
    @Column(name="COD_DIRECCION")// llave principal
    private Long id;
    @Column(name = "CALLEPRINCIPAL")
    private String calleprincipal;
    @Column(name = "CALLESECUNDARIA")
    private String callesecundaria;
    @Column(name = "NUMERO")
    private int numero;
    @Column(name = "BARRIO")
    private String barrio;
    @Column(name = "TELEFONO")
    private String telefono;
    // creacion de la relacion uno a uno
    @OneToOne(mappedBy = "direccion",fetch = FetchType.LAZY)
    private Empleado empleado;

    public Direccion() {
    }

    public Direccion(Long id, String calleprincipal, String callesecundaria, int numero, String barrio, String telefono) {
        this.id = id;
        this.calleprincipal = calleprincipal;
        this.callesecundaria = callesecundaria;
        this.numero = numero;
        this.barrio = barrio;
        this.telefono = telefono;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCalleprincipal() {
        return calleprincipal;
    }

    public void setCalleprincipal(String calleprincipal) {
        this.calleprincipal = calleprincipal;
    }

    public String getCallesecundaria() {
        return callesecundaria;
    }

    public void setCallesecundaria(String callesecundaria) {
        this.callesecundaria = callesecundaria;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Direccion{" + "id=" + id + ", calleprincipal=" + calleprincipal + ", callesecundaria=" + callesecundaria + ", numero=" + numero + ", barrio=" + barrio + ", telefono=" + telefono + ", empleado=" + empleado.getCodigo()+ '}';
    }

    

   

}

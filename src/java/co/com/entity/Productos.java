/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author macbook
 */
@Entity
@XmlRootElement
public class Productos implements Serializable {

private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)  
private Long id;

private double precio ;  
private String nombre ;  
private int cantidad;

public double getPrecio() {  return precio;
}
public void setPrecio(double precio) {
this.precio = precio;
}
public String getNombre() {
return nombre;
}
public void setNombre(String nombre) {
this.nombre = nombre;
}
public int getCantidad() {
return cantidad;
}
public void setCantidad(int cantidad) {
this.cantidad = cantidad;
} public Long getId() {
return id;
}
public void setId(Long id) {
this.id = id;
}
@Override
public int hashCode() {
int hash = 0;
hash += (id != null ? id.hashCode() : 0);  return hash;
}
@Override
public boolean equals(Object object) {
// TODO: Warning - this method won't work in the case the id fields are not set
if (!(object instanceof Productos)) {
return false;
}
Productos other = (Productos) object;
if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
return false;
}
return true;
}
@Override
public String toString() {
return "co.com.entity.Productos[ id=" + id + " ]";
}
}
    
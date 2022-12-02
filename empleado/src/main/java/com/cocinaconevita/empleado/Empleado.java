package com.cocinaconevita.empleado;

/**
 *@version 09.12
 * @author Eva Mª Sanchez<br>
 * evasancas@alumni.gva.es<br>
 * <br>
 * Clase Empleado Contiene informacion de cada empleado
 */

public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;
    
    /**
     * Suma un plus de 88 euros al salario del empleado si el empleado tiene mas de 34 años
     * @param sueldoPlus  cantidad en euros que se suma al salario
     * 
     * @return <ul>
 *          <li>true: se suma el plus al sueldo</li>
 *          <li>false: no se suma el plus al sueldo</li>
 *          </ul>

     */
public boolean plus (double sueldoPlus) {
    boolean aumento = false;
    if (edad > 40 && compruebaNombre ( ) ) {
        salario += sueldoPlus;
        aumento = true ;
}
    return aumento;
}

/**
 * 
 * @return <ul>
 *          <li>true: se suma el plus al sueldo</li>
 *          <li>false: no se suma el plus al sueldo</li>
 *          </ul>
 */

private boolean compruebaNombre ( ) {
    if (nombre.equals ( " " ) ) {
        return false;
}
        return true ;
}

//Constructores
/**
 * Constructor por defecto
 */
public Empleado ( ) {
    this("","",0,0);
}

/**
 * Constructor con 4 parametros
 * @param nombre nombre del empleado
 * @param apellido apellido del empleado
 * @param edad edad del empleado
 * @param salario salario del empleado 
 */
public Empleado (String nombre , String apellido , int edad, double salario) {
this.nombre = nombre;
this.apellido = apellido;
this.edad = edad;
this.salario = salario;
}
}



package com.biblioteca.gestion_libros.config;


public class ConfiguracionAppSingleton {

    // Instancia única de la clase
    private static ConfiguracionAppSingleton instancia;

    // Atributos de configuración
    private String BDUName;
    private String nombreAplicacion;

    // Constructor privado
    private ConfiguracionAppSingleton() {
        // Inicializar configuraciones con valores por defecto o cargarlos de un archivo de propiedades
        this.BDUName = "SPRINGBOOT_FEL";
        this.nombreAplicacion = "gestion-libros";
    }

   
    public static ConfiguracionAppSingleton getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionAppSingleton();
        }
        return instancia;
    }

    public String getBDUName() {
        return BDUName;
    }

    public String getNombreAplicacion() {
        return nombreAplicacion;
    }

    public void setBDUName(String BDUName) {
        this.BDUName = BDUName;
    }

    public void setNombreAplicacion(String nombreAplicacion) {
        this.nombreAplicacion = nombreAplicacion;
    }
}
package com.aluracursos.literaturapp.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}

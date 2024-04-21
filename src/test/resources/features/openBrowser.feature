#language: es
#encoding: UTF-8

  @Browser
  Característica: Interactuar con navegadores

    Escenario: Abrir navegador de chrome
      Dado actor quien desea abrir chrome
      Cuando use el webDriver
      Entonces pueda visualizar la apertura del navegador
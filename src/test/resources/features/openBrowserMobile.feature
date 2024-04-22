#language: es
#encoding: UTF-8

  @BrowserMobile
  Característica: Interactuar con navegadores

    Escenario: Abrir navegador de chrome
      Dado actor quien desea abrir chrome en su telefono
      Cuando use el webDriver
      Entonces pueda visualizar la apertura del navegador
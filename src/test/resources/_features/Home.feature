#language: pt
#encoding: utf-8

Funcionalidade: Home

  #exemplo
  Esquema do Cenario: Acessar a PDP de um produto pela pesquisa
    Dado que pesquiso por um produto <produto>
    E acesso o primeiro produto da pesquisa
    Exemplos:
    |produto|
    |BLOUSE|
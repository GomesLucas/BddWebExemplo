#Encoding:Cp1252
@Test
Feature: Especificar o objetivo da Feature

Background:
	Given Estou com a tela do Firefox aberta

Scenario: Abrir a p�gina do google e buscar teste
	When Acesso p�gina do google
		And digito a palavra "teste"
		And Clico no bot�o pesquisar
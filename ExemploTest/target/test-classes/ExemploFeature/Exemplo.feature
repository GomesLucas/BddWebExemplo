#Encoding:Cp1252
@Test
Feature: Especificar o objetivo da Feature

Background:
	Given Estou com a tela do Firefox aberta

Scenario: Abrir a página do google e buscar teste
	When Acesso página do google
		And digito a palavra "teste"
		And Clico no botão pesquisar
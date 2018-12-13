# SambaTech
Teste

Antes de iniciar a aplicação certifique-se de que no endereço da propriedade "System.setProperty" contém o geckodriver.exe;

Adotei a seguinte estrutura no meu Projeto de Testes:
SambaTech (Projeto)
	testesChrome (package)
		Canal.java
		Estatistica.java
		Main.java
		OutrasClasses...
	testesIE (package)
		Canal.java
		Estatistica.java
		Main.java
		OutrasClasse...
	testesFirefox (package)
		Canal.java
		Estatistica.java
		Main.java
		OutrasClasse...

Com esta estrutura criada, seria possível testar o site e suas funcionalidades em cada navegador, afim de prevenir quanto ao aparecimento de algum problema, devido à possíveis nuanças de navegadores.

Desta maneira a minha classe Main.java, será a classe principal, nela ocorre a chamada do .exe e por ela inicialmente que conseguimos fazer o login no site. Após o login com êxito, através da classe Main será possível a chamada de outras classes, passando parâmetros ou não, dependendo da necessidade de cada funcionalidade.

Optei por implementar apenas um caso de teste de login contendo o retorno se o login ocorreu falha ou não, devido à estar um pouco enferrujado com a linguagem JAVA, gastei muito tempo instalando, configurando e preparando todo o ambiente de desenvolvimento e meus recursos computacionais não são tão bons. Atualmente sou desenvolvedor/tester .NET, mais quem tem a lógica de programação nada que uma estudada não resolva, rsrs...

Achei extremamente interessante trabalhar com Webdriver, criei um robô e pretendo criar inúmeras tarefas para ele.

Lembrando que a minha teoria quanto à testes nas aplicações é não testar com intuito de estar tudo funcionamendo perfeitamente e, sim com o intuito de esmiuçar toda a aplicação afim de realmente encontrar alguma falha, erro, caso de uso não contemplado em especificação e desenvolvimento, provendo melhorias contínuas aumentando assim a qualidade do software.

Estou à disposição para maiores esclarecimentos.

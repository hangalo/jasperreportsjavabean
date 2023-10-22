# Criação de relatórios e sobrelatorio no Jaspert Studio usado JavaBeans como data source

No desenho de relatorios com o Jasper Studio, os exemplos mais comuns são apresentados com o uso de instruções SQL puras. É uma opção prática para alguns projectos .No entanto, para outros projectos, é pratico o uso dos Java Beans como datasource.
Um Java Bean é uma classe Java que expõe os seus atributos atráves dos métodos get. Os Java Beans, também,  podem ser chamados POJO embora,  em termos conceituais sejam, entidades diferentes.
A seguir, vai ser apresentado um exemplo de construção de um relatório com esquema master/detail, ou seja, uma estrutura com um relatorio princiapal que contem um relatório usando Java Beans como datasource e sem usar um Data Adapter no Jaspersof Studio.
O exemplo será feito com hard code, portanto, sem recurso a uma base de dados. Entretanto, é facilmente adaptável a um contexto que usa base de dados ou outra fonte de dados.

Ferramentas e tecnologias: 
TIBCO Jaspersoft® Studio 6.20.0 - Visual Designer for JasperReports 6.20.0. 
Apache Netbeans IDE 19
Java EE version: Jakarta EE 10 Web
Java Plataform: JDK 17
Jakarta Faces 3.0
Código fonte em:
https://github.com/hangalo/jasperreportsjavabean
Feedback para: joaquimhangalo@gmail.com

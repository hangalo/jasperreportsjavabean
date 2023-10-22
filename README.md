# jasperreportsjavabean
Criação de relatórios e sobrelatorio no Jaspert Studio usado JavaBeans como data source

No desenho de relatorios com Jasper Studio os exemplos mais comuns são apresentados com o uso de instruções SQL puras. É uma opção prática para alguns projectos .No entanto, para outros projectos, é pratico o uso dos JavaBean como datasource.
Um JavaBean é uma classe Java que expõe os seus atributos atráves dos métodos get. Os JavaBean podem ser chamados POJO embora em termos conceituais sejam diferentes
A seguir vai ser apresentado um exemplo de construção de um relatório com esquema master/detail, ou seja, uma estrutura com um relatorio princiapal que contem um relatório usando Java Beans como datasource e sem usar um Data Adapter no Jaspersof Studio.

Ferramentas e tecnologias: 
TIBCO Jaspersoft® Studio 6.20.0 - Visual Designer for JasperReports 6.20.0. 
Apache Netbeans IDE 19
Java EE version: Jakarta EE 10 Web
Java Plataform: JDK 17
Jakarta Faces 3.0

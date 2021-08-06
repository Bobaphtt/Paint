<h1> RELATÓRIO DO TP1 </h1>

<h4> Você fez uso do conceito de sobrecarga de funções? Onde?  </h4>  

>Não tive a necessidade de usar sobrecarga.

<h4> Você fez uso do conceito de Herança de funções? Onde? Você vê que houve benefícios?</h4>

>Sim, <code>Quadrilatero.java</code> e <code>PoligonosRegulares.java</code> herdam <code>FiguraGeometrica.java</code>. 
> No entanto seria interessante criar outras classes como <code>Circulo.java</code>, <code>Triangulo.java</code> e 
> <code>Quadrado.java</code> herdassem de uma classe genérica que tornasse a criação dessas figuras mais limpa. 

<h4> Você fez uso da função super() em construtores mesmo que indiretamente? Onde?</h4>

>Não teve o uso do <code>super()</code> nos contrutores já que figura geométrica é Abstrato e os métodos só possuem a assinatura.

<h4> Você fez uso da função this() em construtores mesmo que indiretamente? Onde?</h4>

>Não tive a necessidade de usar <code>this()</code>.

<h4> Você fez uso de sobreescrita de funções? onde? só de Object ou de alguma função sua mesmo?</h4>

>O único uso de sobrescrita foi de <code>toString()</code>

<h4> Qual o benefício do uso de classes ENUM?</h4>

>A leitura do código e evita erros já que as opções são limitadas a quantitade de elementos no ENUM.

<h4> Cole a imagem do diagrama de classe do seu sistema e faça um paragrafo se você entende este diagrama e 
ele representa realmente objetos do mundo real, com nomes de Metodos coerentes.</h4>

>Alguns métodos como <code>listar()</code> e <code>apagar()</code> deixam abrangentes o que eles listam. Um outro método
> que poderia ser renomeado é o método <code>pedeMedida()</code> para <code>pedeDouble()</code>.
> 
>![](diagrama.png)

<h4> Você fez uso da palavra Protected? Ela foi relevante onde?</h4>

>Sim, apenas no Scanner. Não teve muita relevancia já que dentro do pacote <code>view</code> não tem outra classe "ativa".

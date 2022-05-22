# Backend Java OOP Banking System

**Clone and import project to Intellij IDE - Notes**

I had to import this forked project into IntelliJ IDE because IntelliJ is the IDE that I normally use.
But for that I had to import appropriately to resolve conflicts or erros caused by the fact that the original project was build
with Eclipse IDE and there are underlying settings regarding the classpath.

So, Did the following steps:
1. After clone the project.
2. Click **'File -> New -> Module from Existing Sources...'** in the navigation menu.
3. **Select** the directory and click **'OK'**.
4. At **'Import module from external model'** section select **'eclipse'** and click **'Next'**.
5. Then, keep selected **'Create module files near .classpath files'** and click **'Next'**.
6. At 'Select Eclipse projects to import' select the project and click **'Next'**.
7. Then, keep selected **'use default code style'**.
8. Select project 'SDK -> name' -> click **'Create'**

After the steps above It was necessary to select the SDK version, so:

1. Click at the project name with the righ mouse button and go to 'Open Module Settings'
2. Then, at 'Module SDK' select the version available.

That's all!


##### Criando um br.com.xgeovanedamasceno.bankingsystem.domain.Banco Digital com Java e Orientação a Objetos

##### 02/08/2021 - [Mentoria #1: Tire Suas Dúvidas Sobre Orientação a Objetos](https://www.youtube.com/watch?v=YS6ouOhkyNI)

Desafio: Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java. Para isso, vamos interpretar o seguinte cenário:
“Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”

##### Abstração
Habilidade de concentrar-se nos aspectos essenciais de um domínio, ignorando características menos importantes ou acidentais. Nesse contexto, objetos são abstrações de entidades existentes no domínio em questão.

##### Encapsulamento
Encapsular significa esconder a implementação dos objetos, criando assim interfaces de uso mais concisas e fáceis de usar/entender. O encapsulamento favorece principalmente dois aspectos de um sistema: a manutenção e a evolução.

##### Herança
Permite que você defina uma classe filha que reutiliza (herda), estende ou modifica o comportamento de uma classe pai. A classe cujos membros são herdados é chamada de classe base. A classe que herda os membros da classe base é chamada de classe derivada.

##### Polimorfismo
Capacidade de um objeto poder ser referenciado de várias formas, ou seja, é capacidade de tratar objetos criados a partir das classes específicas como objetos de uma classe genérica. Cuidado, polimorfismo não quer dizer que o objeto fica se transformando, muito pelo contrário, um objeto nasce de um tipo e morre daquele tipo, o que pode mudar é a maneira como nos referimos a ele.

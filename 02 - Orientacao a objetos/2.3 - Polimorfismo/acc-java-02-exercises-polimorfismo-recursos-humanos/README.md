### Termos e acordos

Ao iniciar este projeto, você concorda com as diretrizes do Código de Ética e Conduta e do Manual da Pessoa Estudante da Trybe.

---

# Boas vindas ao repositório do desafio da Aceleração Java!

Você já usa o GitHub diariamente para desenvolver os exercícios, certo? Agora, para desenvolver o desafio, você deverá seguir as instruções a seguir. Fique atento a cada passo, e se tiver qualquer dúvida, nos envie por _Slack_! #vqv 🚀

Aqui você vai encontrar os detalhes de como estruturar o desenvolvimento do seu desafio a partir deste repositório, utilizando uma branch específica e um _Pull Request_ para colocar seus códigos.

---
# Instruções para entregar seu projeto

## Não se esqueça de consultar as documentações!

⚠️ **Importante**:

Esse projeto tem como intuito te treinar para ter mais familiaridade com a documentação de aplicações, por tanto, poderão haver alguns comandos ou atributos que não estão no curso, mas que devem ser descritos no decorrer dos requisitos.

Nesses casos, é importante se atentar a aquilo que o requisito pede, e lembrar sempre de utilizar a [documentação oficial](https://docs.oracle.com/en/java/javase/11/) do Java para pesquisar detalhes sobre comandos.


## Antes de começar a desenvolver

Lembre-se que você pode consultar nosso conteúdo sobre [Git & GitHub](https://course.betrybe.com/intro/git/) sempre que precisar!

1. Clone o repositório
  * Por exemplo: `git clone git@github.com:tryber/desafio-aceleracao.git`
  * Entre no diretório do repositório que você acabou de clonar:
    * neste caso `cd desafio-aceleracao`

2. Instale as dependências:
    * `mvn install`

3. Crie uma branch a partir da branch `main`

  * Verifique que você está na branch `main`
    * Exemplo: `git branch`
  * Se não estiver, mude para a branch `main`
    * Exemplo: `git checkout main`
  * Agora, crie uma branch onde você vai guardar os commits do seu desafio
    * Você deve criar uma branch no seguinte formato: `nome-de-usuario-nome-do-desafio`
    * Exemplo:
      * `git checkout -b joaozinho-acc-java-sample`

4. Adicione a sua branch com o novo `commit` ao repositório remoto

  - Usando o exemplo anterior:
    - `git push -u origin joaozinho-acc-java-sample`

5. Crie um novo `Pull Request` _(PR)_
  * Vá até a aba de _Pull Requests_ deste repositório no GitHub
  * Clique no botão verde _"New pull request"_
  * Clique na caixa de seleção _"Compare"_ e escolha a sua branch **com atenção**
  * Clique no botão verde _"Create pull request"_
  * Adicione uma descrição para o _Pull Request_ e clique no botão verde _"Create pull request"_
  * **Não se preocupe em preencher mais nada por enquanto!**
  * Volte até a página de _Pull Requests_ do repositório e confira que o seu _Pull Request_ está criado
 
 ⚠️ **Lembre-se do CheckStyle! Deixe seu Eclipse configurado para arrumar o estilo automaticamente. Qualquer dúvida, volte no conteúdo.**

---

## Durante o desenvolvimento

* ⚠ **PULL REQUESTS COM ISSUES NO CHECKSTYLE NÃO SERÃO AVALIADAS, ATENTE-SE PARA RESOLVÊ-LAS ANTES DE FINALIZAR O DESENVOLVIMENTO!** ⚠

* Faça `commits` das alterações que você fizer no código regularmente

* Lembre-se de sempre após um (ou alguns) `commits` atualizar o repositório remoto

* Os comandos que você utilizará com mais frequência são:
  1. `git status` _(para verificar o que está em vermelho - fora do stage - e o que está em verde - no stage)_
  2. `git add` _(para adicionar arquivos ao stage do Git)_
  3. `git commit` _(para criar um commit com os arquivos que estão no stage do Git)_
  4. `git push -u origin nome-da-branch` _(para enviar o commit para o repositório remoto na primeira vez que fizer o `push` de uma nova branch)_
  5. `git push` _(para enviar o commit para o repositório remoto após o passo anterior)_

---

## Depois de terminar o desenvolvimento (opcional)

Para **"entregar"** seu projeto, siga os passos a seguir:

* Vá até a página **DO SEU** _Pull Request_, adicione a label de _"code-review"_ e marque seus colegas
  * No menu à direita, clique no _link_ **"Labels"** e escolha a _label_ **code-review**
  * No menu à direita, clique no _link_ **"Assignees"** e escolha **o seu usuário**
  * No menu à direita, clique no _link_ **"Reviewers"** e digite `students`, selecione o time `tryber/students-sd-0x`

Se ainda houver alguma dúvida sobre como entregar seu projeto, [aqui tem um video explicativo](https://vimeo.com/362189205).

---

# Requisitos do desafio: Sistema de Recursos Humanos

Neste desafio, você deverá implementar um sistema de recursos humanos utilizando os conceitos de métodos abstratos e `Override`.

Imagine que você está trabalhando em uma equipe e ficou responsável pela criação da classe `Funcionario`, que deve ter como atributos `String nome`, `String cpf` e `double salarioBruto`, bem como seus respectivos métodos `Getters` e `Setters`. A classe também deve ter o método `calcularSalarioLiquido()`, que retorna um valor do tipo `double` representando o salário líquido do funcionário (esse método não recebe nenhum parâmetro). 

No sistema de recursos humanos, haverá dois tipos de funcionários: as pessoas físicas e as pessoas jurídicas. Assim, o código deve ter mais duas classes: a classe `FuncionarioPessoaFisica` e a classe `FuncionarioPessoaJuridica`, ambas herdando da classe `Funcionario`. Como os funcionários serão ou pessoa física ou pessoa jurídica, nenhum objeto deve ser instanciado da classe `Funcionario`.

A taxa do imposto de renda é diferente para a pessoa física e para a pessoa jurídica, então cada classe terá seu próprio método `calcularSalarioLiquido()`. Para exemplificar o cálculo do salário líquido, considere uma taxa de imposto de renda:

- de 20% pessoa física — ou seja, se o salário bruto da pessoa física é R$ 5.000,00, o salário líquido dela será R$ 4.000,00.
- de 10% para pessoa jurídica — ou seja, se o salário bruto da pessoa jurídica é R$ 5.000,00, seu salário líquido será R$ 4.500,00.


Resumindo, você implementará 3 classes: `Funcionario`, `FuncionarioPessoaFisica` e `FuncionarioPessoaJuridica`. A classe `Funcionario` deve ser abstrata e conter os atributos `String nome`, `String cpf`, e `double salarioBruto`, com seus respectivos métodos `Getters` e `Setters`, e também com o método `calcularSalarioLiquido()`. As classes `FuncionarioPessoaFisica` e `FuncionarioPessoaJuridica` devem herdar de `Funcionario` e implementar o método `calcularSalarioLiquido()` com suas respectivas taxas de imposto de renda.

# Exemplo
Se eu escrever um método `main` e instanciar os objetos das classes `FuncionarioPessoaFisica` e `FuncionarioPessoaJuridica`, setando seus respectivos salários brutos, por exemplo:
```java
public static void main(String[] args) {
    
    FuncionarioPessoaFisica pessoaFisica = new FuncionarioPessoaFisica();
    pessoaFisica.setSalarioBruto(5000);
    System.out.println("O salário líquido pessoa física: " + pessoaFisica.calcularSalarioLiquido());
    
    
    FuncionarioPessoaJuridica pessoaJuridica = new FuncionarioPessoaJuridica();
    pessoaJuridica.setSalarioBruto(5000);    
    System.out.println("O salário líquido pessoa jurídica: " + pessoaJuridica.calcularSalarioLiquido());
}
```
a saída deverá ser:
```
O salário líquido pessoa física: 4000.0
O salário líquido pessoa jurídica: 4500.0
```

Após resolver esse desafio, você saberá exatamente quando e por que usar classes abstratas, e estará um passo mais perto do profissionalismo!



---

# Avisos Finais

Ao finalizar e submeter o desafio, não se esqueça de avaliar sua experiência preenchendo o formulário. Leva menos de 3 minutos!

Link: A ser definido

O avaliador automático não necessariamente avalia seu projeto na ordem em que os requisitos aparecem no readme. Isso acontece para deixar o processo de avaliação mais rápido. Então, não se assuste se isso acontecer, ok?

---


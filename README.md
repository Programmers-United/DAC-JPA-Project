<div align="center">
  <h1 align="center" id="titulo">Sistema de Gerênciamento de Biblioteca</h1>
</div>

## Sobre
A demanda por tecnologia na área de informação vem sendo cada vez mais
crescente em todo o mundo, atraindo várias pessoas para exercer trabalho na área
ou obter essa tecnologia em seu dia a dia. 

Com isso, uma biblioteca traz a oportunidade de ter essa atualidade na vida de todos, além de poder adquirir essa
tecnologia, também terá a assistência para resolver casos de problemas
relacionados aos bens materiais. 

Para tanto, foi pensado em um cenário onde uma
biblioteca ainda não tenha uma forma simples e eficaz de gerenciar seus negócios,
com um ambiente desorganizado e com falhas, podendo causar problemas e
prejuízos a tal estabelecimento. 

Com isso, a melhor forma de promover o seu domínio é a criação de uma aplicação mais rápida e com todas as utilidades
necessárias para atrair novas pessoas e gerar um crescimento e desenvolvimento
gradativamente alto nos serviços prestados por essa biblioteca, sem causar tais
prejuízos ou problemas no estabelecimento em questão. 

[Documentação completa](https://github.com/user-attachments/files/16938970/Trabalho.de.Banco.de.Dados.pdf)

### Diagrama de Classes

<div align="center">
  <img src="https://github.com/user-attachments/assets/7fe32c39-78d1-4e56-8ff3-e4bebacd43d2"/>
</div>

## Executando

Os requisitos necessários para a execução desse projeto são:

- JDK versão 17. Download [aqui](https://www.oracle.com/br/java/technologies/downloads/#jdk17) ou use um gerenciador de versões como [SDKMAN!](https://sdkman.io/install) (Recomendado!)
- [Docker](https://www.docker.com/products/docker-desktop/)

Ao fazer o clone do repositório, abra o terminal no diretório do projeto e execute os comandos linha por linha.

```bash
docker compose up 
./mvnw clean
./mvnw install
./mvnw spring-boot:run
```

## Resolução de problemas
- Pode ser que o comando do docker seja `docker-compose` (com hífen) na sua máquina. Faça o ajuste de acordo;
- Pode ser que você tenha o PostgreSQL instalado na sua máquina. Se for esse o caso, altere o arquivo `docker-compose.yml`, substituindo o mapeamento da porta na linha 11 por outra porta além da `5432`. Exemplo utilizando a porta 5433: `5433:5432`. No caso de alterar essa porta, altere a URL de conexão no arquivo `application.properties`;
- Em caso do erro "No compiler is provided in this environment" ao executar os comandos `mvnw`, verifique se a variável JAVA_HOME está definida no seu ambiente. Caso não esteja, siga [esse tutorial](https://www.baeldung.com/java-home-on-windows-mac-os-x-linux)

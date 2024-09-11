<div align="center">
  <h1 align="center" id="titulo">Sistema de Gerênciamento para Biblioteca</h1>
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

### Diagrama Entidade Relacionamento

<div align="center">
  <img src="https://github.com/user-attachments/assets/043fb04b-bfaa-42c6-a787-05047543a958"/>
</div>

### Diagrama de Classes

<div align="center">
  <img src="https://github.com/user-attachments/assets/cc7b38f3-24d4-4383-864e-3f69b8eddd01"/>
</div>

### Tecnologias usadas
  
  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
  ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
  ![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
  ![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)
  ![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)

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

## Autores
- João Darwin
- Douglas Silva
- José Gabriel
- Marcos Paulo
- João Pedro

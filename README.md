<div align="center">
  <h1 align="center">
    <code>─── WORKSHOP-SPRING-JPA ───</code>
  </h1>
  <p>API backend em Java desenvolvida com Spring Boot e JPA/Hibernate, <br> focada em mapeamento objeto-relacional e persistência em banco de dados H2/PostgreSQL.</p>
</div>

## 🛠 Tecnologias
- **Java** (JDK 17+)
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate** (ORM)
- **H2 Database** (Banco de dados em memória para testes)
- **PostgreSQL** (Banco de dados de produção/homologação)
- **Maven Wrapper** (mvnw)
- **Postman**
- **Git/GitHub**

## ⚙️ Funcionalidades
- Modelo de domínio (Entidades, Associações e Coleções)
- Mapeamento Objeto-Relacional com JPA
- Operações CRUD (Busca, Inserção, Atualização e Deleção)
- Tratamento de exceções customizado
- Seed de banco de dados (instanciação automática de dados)
- Estrutura organizada por camadas (Resource/Controller, Service, Repository)

## 🟣 Como executar (local)

### 1) Pré-requisitos
Instale e confirme que estão funcionando:
- Java JDK 17 (ou superior)
- Maven

### 2) Clonar o repositório
No terminal:

```bash
git clone [https://github.com/camillifidelis/workshop-springboot4-jpa.git](https://github.com/camillifidelis/workshop-springboot4-jpa.git)
cd workshop-springboot4-jpa
```

### 3) Configurar o Banco de Dados
Por padrão, o perfil de test está ativo e utiliza o banco H2.
Os dados são populados automaticamente ao iniciar a aplicação através da classe TestConfig.

Se desejar alterar para PostgreSQL, edite o arquivo:
`src/main/resources/application.properties`

### 4) Compilar e executar

**Linux/Mac**
```bash
./mvnw clean install
./mvnw spring-boot:run
```
**Windows (PowerShell ou CMD)**
```bash
.\mvnw.cmd clean install
.\mvnw.cmd spring-boot:run
```

### 5) Acessar a aplicação
Com a aplicação rodando, a API ficará disponível em:
http://localhost:8080

Para acessar o console do banco H2 (em memória):
http://localhost:8080/h2-console

### Testar a API
Utilize o Postman para testar os endpoints disponíveis (Users, Orders, Categories, Products).

### 🎓 Créditos
Este é um projeto prático desenvolvido sob a orientação do professor Nelio Alves, como parte do curso Java Completo na Udemy. A implementação foi realizada de forma guiada para fins de estudo sobre Spring Boot e a especificação JPA (Java Persistence API).

---
<div align="center">
  <picture>
    <source media="(prefers-color-scheme: light)" srcset="https://raw.githubusercontent.com/camillifidelis/cami-projeto-mongo/main/assets/logo-dark.svg">
    <source media="(prefers-color-scheme: dark)" srcset="https://raw.githubusercontent.com/camillifidelis/cami-projeto-mongo/main/assets/logo-light.svg">
    <img alt="CamiDev Logo" src="https://raw.githubusercontent.com/camillifidelis/cami-projeto-mongo/main/assets/logo-dark.svg" width="300">
  </picture>
</div>

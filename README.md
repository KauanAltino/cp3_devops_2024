# Sistema de Gerenciamento de Pedidos

## 📋 Descrição

Aplicação **Spring Boot CRUD** para gerenciamento de pedidos, produtos e usuários. Este projeto demonstra boas práticas de desenvolvimento em Java com arquitetura em camadas (Controller → Service → Repository → Database).

## 🎯 Funcionalidades

- ✅ **Gerenciamento de Usuários** - Criar, ler, atualizar e deletar usuários
- ✅ **Catálogo de Produtos** - Manutenção de produtos disponíveis
- ✅ **Pedidos de Clientes** - Sistema completo de pedidos
- ✅ **Itens de Pedidos** - Detalhamento de produtos por pedido
- ✅ **API REST** - Endpoints para integração

## 🏗️ Arquitetura

```
com.cp3devops.app
├── controller/          → Endpoints HTTP
├── service/             → Lógica de negócio
├── repository/          → Acesso a dados (JPA)
├── model/               → Entidades JPA
└── AppApplication.java  → Classe principal
```

## 🛠️ Tecnologias

| Tecnologia | Versão | Descrição |
|-----------|--------|-----------|
| Java | 17 LTS | Linguagem de programação |
| Spring Boot | 3.3.5 | Framework web |
| Spring Data JPA | - | ORM e acesso a dados |
| SQL Server | 11.2.0 | Banco de dados |
| Maven | 4.0.0 | Gerenciador de dependências |
| JUnit | - | Testes unitários |

## 📦 Modelos de Dados

### AppUser
Representa um usuário da aplicação
- ID, nome, email, e outras informações de autenticação

### Product
Catálogo de produtos disponíveis
- ID, nome, descrição, preço, estoque

### CustomerOrder
Pedidos realizados pelos clientes
- ID, usuário associado, data, status, total

### OrderItem
Itens que compõem um pedido
- ID, produto, quantidade, preço unitário, pedido associado

## 🚀 Como Rodar o Projeto

### Pré-requisitos

- **Java 17** ou superior
- **Maven 3.6+**
- **SQL Server** configurado e rodando
- **Git** (opcional)

### 1. Clone o Repositório

```bash
git clone https://github.com/KauanAltino/cp3_devops_2024.git
cd cp3_devops_2024
```

### 2. Configure o Banco de Dados

Edite o arquivo `app/src/main/resources/application.properties` com suas credenciais:

```properties
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.datasource.driver-class-name=com.microsoft.sqlserver.jdbc.SQLServerDriver
spring.jpa.database-platform=org.hibernate.dialect.SQLServer2012Dialect
```

### 3. Execute a Aplicação

**Com Maven:**
```bash
cd app
./mvnw spring-boot:run
```

**Ou no Windows:**
```bash
cd app
mvnw.cmd spring-boot:run
```

**Ou compile e execute:**
```bash
cd app
./mvnw clean install
java -jar target/app-0.0.1-SNAPSHOT.jar
```

A aplicação estará disponível em: **http://localhost:8080**

## 📡 Endpoints da API

### Usuários
- `GET /api/users` - Listar todos os usuários
- `GET /api/users/{id}` - Buscar usuário por ID
- `POST /api/users` - Criar novo usuário
- `PUT /api/users/{id}` - Atualizar usuário
- `DELETE /api/users/{id}` - Deletar usuário

### Produtos
- `GET /api/products` - Listar todos os produtos
- `GET /api/products/{id}` - Buscar produto por ID
- `POST /api/products` - Criar novo produto
- `PUT /api/products/{id}` - Atualizar produto
- `DELETE /api/products/{id}` - Deletar produto

### Pedidos
- `GET /api/orders` - Listar todos os pedidos
- `GET /api/orders/{id}` - Buscar pedido por ID
- `POST /api/orders` - Criar novo pedido
- `PUT /api/orders/{id}` - Atualizar pedido
- `DELETE /api/orders/{id}` - Deletar pedido

### Itens de Pedidos
- `GET /api/order-items` - Listar todos os itens
- `GET /api/order-items/{id}` - Buscar item por ID
- `POST /api/order-items` - Criar novo item
- `PUT /api/order-items/{id}` - Atualizar item
- `DELETE /api/order-items/{id}` - Deletar item

## 🧪 Testes

Execute os testes automatizados:

```bash
cd app
./mvnw test
```

Os testes estão localizados em `src/test/java/com/cp3devops/app/`

## 📁 Estrutura do Projeto

```
cp3_devops_2024/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/cp3devops/app/
│   │   │   │   ├── controller/      → REST Controllers
│   │   │   │   ├── service/         → Lógica de negócio
│   │   │   │   ├── repository/      → Acesso a dados
│   │   │   │   ├── model/           → Entidades
│   │   │   │   └── AppApplication.java
│   │   │   └── resources/
│   │   │       ├── application.properties
│   │   │       └── application-test.properties
│   │   └── test/
│   │       └── java/...             → Testes unitários
│   ├── pom.xml                       → Dependências Maven
│   ├── mvnw / mvnw.cmd              → Maven Wrapper
│   └── target/                       → Compiled classes
├── README.md                         → Este arquivo
└── .gitignore                        → Arquivos ignorados pelo Git

```

## ⚙️ Configurações

### Perfis de Execução

- **development** (padrão): Conecta ao banco de dados de desenvolvimento
- **test**: Usa `application-test.properties` para testes

Para usar um perfil específico:
```bash
./mvnw spring-boot:run -Dspring-boot.run.arguments="--spring.profiles.active=test"
```

## 📝 Propriedades da Aplicação

| Propriedade | Descrição | Valor Padrão |
|-----------|-----------|--------------|
| `spring.application.name` | Nome da aplicação | app |
| `server.port` | Porta do servidor | 8080 |
| `spring.jpa.hibernate.ddl-auto` | Estratégia do Hibernate | update |
| `spring.jpa.show-sql` | Mostrar SQL no console | false |

## 🔧 Troubleshooting

### Erro de Conexão com SQL Server
- Verifique se o SQL Server está rodando
- Confirme as credenciais em `application.properties`
- Verifique a URL de conexão: `jdbc:sqlserver://localhost:1433`

### Erro de Build Maven
```bash
./mvnw clean install -U
```

### Porta 8080 já em uso
```bash
./mvnw spring-boot:run -Dserver.port=8081
```

## 📚 Referências

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Microsoft SQL Server Driver](https://docs.microsoft.com/sql/connect/jdbc/download-microsoft-jdbc-driver-for-sql-server)
- [Maven Documentation](https://maven.apache.org/guides/)

## 🤝 Contribuindo

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request


## 👨‍💻 Autor

Desenvolvido como parte do projeto **CP3 DevOps 2024 - FIAP**

---
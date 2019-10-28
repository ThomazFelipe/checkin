# CHECKIN

Api de serviços utilizados na matéria de TCC-2

## Padrão de Desenvolvimento:

#### Nomenclatura dos métodos, variáveis e classes:
Inglês e utilizando Camel Case.

>>>
 *Não obrigatório para entidades que representa entidades de banco.
>>>


```
# application.properties exemplo

server.port=8080
server.servlet.context-path=/api
spring.datasource.url=jdbc:mysql://localhost:3306/CHECKIN
spring.datasource.username=user
spring.datasource.password=pass
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.naming.implicit-strategy=org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyJpaImpl
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
spring.jpa.hibernate.ddl-auto=update
spring.jpa.open-in-view=true
spring.jackson.serialization.fail-on-empty-beans=false
```
### Necessário para construir ###

* Java 8
* Maven
* MySql (local)

### Como construir ###
```
#!bash

$ mvn clean install
```

### Como executar ###

```
#!bash

$ mvn spring-boot:run
```

# Desafio GetNet

Este é um projeto de testes automatizado de API usando RestAssured.

Teste Realizados:

* Criar um usurio com sucesso
* Criar um usuario não enviando o nome 
* Criar um usuario não enviando o Job
* Validar contrato de retorna da Rota User

## Execução
via Maven
```shell
mvn test
```
via Maven Wrapper

```shell
./mvnw test
```


### Gerando Allure Report

via Maven
```shell
mvn allure:report
```
via Maven Wrapper
```shell
./mvnw allure:report
```

### Gerando Allure Report via serve
via Maven
```shell
mvn allure:serve
```
via Maven Wrapper
```shell
./mvnw allure:serve
```



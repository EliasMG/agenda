# Exemplo Java Records

Java Records foi introduzido no Java 14 e se tornou disponível definitivamente no Java 17 LTS.

Proposta oficial: JEP 359 [Records](https://openjdk.org/jeps/359)

Quando precisamos de objetos apenas para representar dados fixos, sem necessidade e ou possibilidade de alteração desses dados, criamos classes imutáveis para deixar nosso código mais seguro.

Antes do Java 14, era preciso escrever muito código boilerplate para criar classes imutáveis que eram suscetíveis a erros triviais e intenções confusas.

A partir do JDK 14, podemos substituir nossas classes que representa dados fixos por records. Records são classes de dados imutáveis que requerem apenas o tipo e o nome dos campos.

### Benefícios
- equals(), hashCode(), toString(), constructor() assim como os campos private, final e public, são gerados pelo compilador Java.
- Podem implementar interfaces

### Restrições
- Um record não pode ser estendido, ele é uma classe final
- Um record não pode estender uma classe
- O valor (referência) de um campo é final e não pode ser alterado
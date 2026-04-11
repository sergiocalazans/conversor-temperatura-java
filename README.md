---

# Conversor de Temperatura (Java)

Um sistema de conversão de escalas térmicas desenvolvido em **Java**. O projeto aplica conceitos fundamentais de **Programação Orientada a Objetos (POO)**, como encapsulamento e separação de responsabilidades, para realizar transformações precisas entre as escalas Celsius e Fahrenheit.

## 🚀 Funcionalidades

O programa oferece uma interface via terminal que permite:
* **Conversão Fahrenheit para Celsius**: Transforma temperaturas utilizando a fórmula matemática padrão.
* **Conversão Celsius para Fahrenheit**: Permite a visualização rápida da equivalência na escala americana.
* **Formatação de Saída**: Os resultados são exibidos com precisão de uma casa decimal para facilitar a leitura.

## 🏗️ Arquitetura do Código

O projeto foi estruturado em três classes principais para garantir a modularidade:

1.  **`Temperatura.java` (Modelo)**: Atua como um *POJO (Plain Old Java Object)*, utilizando **encapsulamento** (atributos privados com getters e setters) para armazenar o valor da temperatura.
2.  **`Conversao.java` (Serviço)**: Contém a lógica de negócio e as fórmulas matemáticas. É responsável pelo cálculo e pela exibição formatada do resultado.
3.  **`ConversaoTemperatura.java` (Main)**: Gerencia o fluxo da aplicação, recebe a entrada do usuário via `Scanner` e coordena a interação entre os objetos.

## 📋 Fórmulas Utilizadas

O sistema implementa as seguintes conversões:

* **De Fahrenheit para Celsius:**
    $$C = \frac{5 \times (F - 32)}{9}$$
* **De Celsius para Fahrenheit:**
    $$F = \frac{C \times 9}{5} + 32$$

## 🛠️ Tecnologias Utilizadas

* **Linguagem**: Java 8+
* **Biblioteca Padrão**: `java.util.Scanner` para entrada de dados e `java.text.DecimalFormat` para formatação numérica.

---
*Este projeto foi desenvolvido como um exercício prático de POO, focando na criação de métodos reutilizáveis e na organização de pacotes em Java.*

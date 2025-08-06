<style>
body {
  background-color: #121212;
  color: #FFFFFF;
  font-family: Consolas, monospace;
}
h1, h2 {
  color: #39FF14; /* Neon green */
}
code {
  background-color: #1e1e1e;
  padding: 4px;
  border-radius: 4px;
  color: #00ffff; /* Neon cyan */
}
</style>

# Guia Rápido – Revisão de Java

## Método `main`

Todo programa Java começa a execução pelo método `main`:

```java
public class Programa {
    public static void main(String[] args) {
        // Código aqui
    }
}


---

### 🧪 Mini Questionário (para Google Forms ou Moodle)

**Título:** *Pré-Aula – Revisão de Java*

**Perguntas (múltipla escolha):**

1. O que é o método `main` em um programa Java?
   - ( ) Um tipo de variável
   - (✓) O ponto de entrada da aplicação
   - ( ) Um comando de saída
   - ( ) Um nome reservado para bibliotecas

2. Em qual caso devemos usar a estrutura `switch` ao invés de `if-else`?
   - (✓) Quando queremos testar vários valores fixos de uma variável
   - ( ) Quando queremos usar laços
   - ( ) Quando o número de comparações é indefinido
   - ( ) Quando usamos números decimais

3. Qual saída é gerada pelo seguinte código?

```java
for (int i = 1; i <= 3; i++) {
    System.out.print(i + " ");
}
   - ( ) 0 1 2

   - (✓) 1 2 3

   - ( ) 1 2 3 4

   - ( ) 0 1 2 3

4. O que acontece se a condição de um while nunca se tornar falsa?

   - ( ) O programa é compilado incorretamente

   - ( ) O laço é ignorado

   - (✓) Um laço infinito é executado

   - ( ) O programa é pausado

5. Qual estrutura permite repetir uma ação enquanto uma condição for verdadeira?

   - ( ) if

   - ( ) switch

   - (✓) while

   - ( ) case
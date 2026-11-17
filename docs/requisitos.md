# Documento de Requisitos: VidaPet

**Aluno:** Lorhan Messias\
**Disciplina:** Projeto de Bloco: Desenvolvimento Back-End [26E4_5]\
**Versão:** 1.0 (TP1)

## 1. Visão geral

Hoje a clínica tem dois principais problemas: a agenda fica em um caderno, o
que causa horários duplicados e consultas esquecidas.

O objetivo é organizar o cadastro dos animais e a agenda das consultas dos
veterinários de forma interativa e funcional.

## 2. Atores

| Ator | Descrição |
|---|---|
| Veterinário | Consulta sua agenda do dia e registra a consulta como realizada, com as observações do atendimento |
| Recepcionista | Cadastra animais e veterinários, agenda e cancela consultas |

## 3. Entidades

| Entidade | Atributos |
|---|---|
| Animal | nome,<br/>espécie (cão ou gato),<br/>idade,<br/>nome do tutor,<br/>telefone do tutor |
| Veterinário | nome,<br/>CRMV |
| Consulta | animal,<br/>veterinário,<br/>data,<br/>horário,<br/>situação (agendada, realizada ou cancelada),<br/>observações |

## 4. Requisitos funcionais

| ID | Descrição | Ator | Prioridade | Origem |
|---|---|---|---|---|
| RF01 | Agendar consultas | Recepcionista | Essencial | Atores: Recepcionista |
| RF02 | Cancelar consultas | Recepcionista | Essencial | Atores: Recepcionista |
| RF03 | Cadastrar animais | Recepcionista | Essencial | Atores: Recepcionista |
| RF04 | Cadastrar veterinários | Recepcionista | Essencial | Atores: Recepcionista |
| RF05 | Concluir consulta com observações | Veterinário | Essencial | Atores: Veterinário |
| RF06 | Consultar agenda do dia | Veterinário | Essencial | Atores: Veterinário |

## 5. Requisitos não funcionais

| ID | Descrição | Categoria | Origem |
|---|---|---|---|
| RNF01 | O sistema deve ser interativo com o usuário, sempre com navegação por menu numerado | Usabilidade | Visão geral |
| RNF02 | O sistema deve estar em português | Usabilidade | Visão geral |
| RNF03 | O sistema sempre deve trazer as consultas de forma rápida, com no máximo 2 segundos de espera | Desempenho | Suposição |
| RNF04 | O sistema sempre tem que ter uma rota de saída; por exemplo, se a API ou o console bloquear uma requisição, uma mensagem de erro avisando ou um botão para limpar ou sair da tela | Usabilidade | Suposição |
| RNF05 | O sistema usa Java como linguagem principal; o JDK deve estar na versão 21 (LTS) | Restrição técnica | Enunciado |

## 6. Regras de negócio

| ID | Descrição | Requisitos relacionados |
|---|---|---|
| RN01 | Consultas duram 30 minutos e só podem ser marcadas de segunda a sexta, das 8h às 18h | RF01 |
| RN02 | Um veterinário não pode ter duas consultas agendadas no mesmo horário | RF01 |
| RN03 | Não é possível agendar consultas em datas que já passaram | RF01 |
| RN04 | Uma consulta só pode ser cancelada se ainda estiver como agendada | RF02 |
| RN05 | Somente consultas agendadas podem ser marcadas como realizadas, e apenas pelo veterinário da consulta | RF05 |

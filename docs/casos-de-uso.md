# Casos de Uso: VidaPet

**Aluno:** Lorhan Messias
**Disciplina:** Projeto de Bloco: Desenvolvimento Back-End [26E4_5]
**Versão:** 1.0 (TP1)

## Diagrama

![Diagrama de casos de uso](Sistema%20VidaPet.drawio.png)

---

## UC01: Agendar Consultas

**Ator:** Recepcionista

**Requisitos e regras:**
- As consultas duram 30 minutos e só podem ser marcadas de segunda a sexta, das 8h às 18h.
- Um veterinário não pode ter duas consultas agendadas no mesmo horário.
- Não é possível agendar consultas em datas que já passaram.

**Pré-condição:** Animal e veterinário cadastrados.

**Fluxo principal:**
1. A recepcionista escolhe um horário.
2. A recepcionista informa a agenda.
3. O sistema verifica se pode agendar.
4. O sistema agenda a consulta.

**Fluxo alternativo A: Agendamento no mesmo horário**
Na etapa 3, se não for possível agendar:
1. O sistema mostra um erro.
2. A recepcionista refaz o agendamento em um novo horário, que siga as regras de negócio.
3. Volta para a etapa 3.

**Pós-condição:** Consulta agendada.

---

## UC02: Cancelar Consultas

**Ator:** Recepcionista

**Requisitos e regras:**
- Uma consulta só pode ser cancelada se ainda estiver como agendada.

**Pré-condição:** Consulta agendada.

**Fluxo principal:**
1. A recepcionista informa a agenda.
2. O sistema verifica se a consulta ainda está agendada.
3. O sistema cancela a consulta.

**Fluxo alternativo A: Consulta não está agendada**
Na etapa 2, se a consulta não estiver agendada:
1. O sistema informa que não é possível cancelar.

**Pós-condição:** Se a consulta existe, ela é cancelada; se não existe, o sistema apenas informa que a consulta não existe.

---

## UC03: Concluir Consulta

**Ator:** Veterinário

**Requisitos e regras:**
- Somente consultas agendadas podem ser marcadas como realizadas, e apenas pelo veterinário da consulta.

**Pré-condição:** Consulta agendada.

**Fluxo principal:**
1. O veterinário escolhe a consulta.
2. O veterinário informa a agenda.
3. O sistema verifica se ele é o veterinário responsável pela consulta e se ela está agendada.
4. O sistema conclui a consulta.

**Fluxo alternativo A: Veterinário diferente ou consulta não agendada**
Na etapa 3, se alguma das condições não for atendida:
1. O sistema informa o veterinário e retorna um erro ou aviso.

**Pós-condição:** Se a consulta existe e é do veterinário, ela é concluída; se não atende às duas condições, não é concluída.

# Proposition

| Statement      | if p then q         |
| -------------- | ------------------- |
| Converse       | if q then p         |
| Inverse        | if not p then not q |
| Contrapositive | if not q then not p |
| Negation       | if p then not q     |

$p\to q\equiv\neg q\to \neg p$



conditional propositions get **false** only if the antecedent is true and consequent is false

| p    | q    | $p\to q$ |
| ---- | ---- | -------- |
| T    | F    | F        |

Biconditional proposition gets true if p and q have the same value

## Order

| Operator          | Precedence |
| ----------------- | ---------- |
| $\neg$            | 1          |
| $\and$            | 2          |
| $\or$             | 3          |
| $\to$             | 4          |
| $\leftrightarrow$ | 5          |



## Laws of logic

- Identity Laws

  $p \and T \equiv p$

  $p \or F \equiv p$

- Domination laws

  $p \or T \equiv T$

  $p \and F \equiv F$

- Idempotent laws

  $p\or p \equiv p$

  $p \and p \equiv p$

- Double negation law

  $\neg(\neg p)\equiv p$

- Commutative laws

  $p\or q\equiv q\or p$

  $p\and q \equiv q\or p$

- Associate laws

  $(p\or q)\or r\equiv p\or (q\or r)$

  $(p\and q)\and r\equiv p\and (q\and r)$

- Distributive law

  $p \or (q\and r)\equiv (p\or q)\and (p\or r)$

  $p\and (q\or r)\equiv(p\and q)\or(p\and r)$

- De Morgan's laws

  $\neg(p\and q)\equiv\neg p\or \neg q$

  $\neg(p\or q)\equiv\neg p\and \neg q$

- Absorption laws

  $p\or(p\and q)\equiv p$

  $p\and(p\or q)\equiv p$

- Negation Laws

  $p \or \neg p\equiv T$

  $p \and \neg p\equiv F$

- **Law of Implication**

  $p\to q\equiv\neg p\or q$

## Exercise

| p    | q    | r    | $p \and q\to r$ | $p\or q \to \neg r$ | $p \to (q\to r)$ |
| ---- | ---- | ---- | --------------- | ------------------- | ---------------- |
| T    | T    | T    | T               | F                   | T                |
| T    | T    | F    | F               | T                   | F                |
| T    | F    | T    | T               | F                   | T                |
| T    | F    | F    | T               | T                   | T                |
| F    | T    | T    | T               | F                   | T                |
| F    | T    | F    | T               | T                   | T                |
| F    | F    | T    | T               | T                   | T                |
| F    | F    | F    | T               | T                   | T                |


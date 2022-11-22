# Predicate Logic and Proof

## Nested Quantifiers

have more than one vars

**Example**: 

- $Q(x,y):f(x)=y$

- Every author wrote some books

  $\forall x\exist y\ W(x,y),\ W:{\rm\ writer\ }x{\rm\ wrote\ book\ }y$

### Order

- $\forall x\exist y\ M(x,y)\neq\exist y\forall x\ M(x,y)$
- $\exist x\forall y\ M(x,y)\neq\forall y\exist x\ M(x,y)$

- $\forall x\forall y\ M(x,y)= \forall y\forall x\ M(x,y)$

- $\exist x\exist y\ M(x,y)= \exist y\exist x\ M(x,y)$

### Rule of inference

$\forall xP(x)\to P(c)$

$P(c)\ {\rm for\ every\ c\ in\ domain}\to\forall xP(x)$

$\exist xP(x)\to P(c){\ \rm for\ some\ }c$

$P(c)\to \exist xP(x)$

# Proof

can disprove something with counterexample, can't prove something with an example 

## Example

$P:m\ {\rm is\ odd\ and\ }n{\rm\ is\ even}$
$Q:m+n{\rm\ is\ odd}$

## Prove by Contradiction and prove by Contrapositive

- If $P(x)\to \neg Q(x)$ is false, then $P(x)\to Q(x)$ is true
- If $\neg Q(x)\to\neg P(x)$ is true, then $P(x)\to Q(x)$ is true




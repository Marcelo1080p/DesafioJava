# Diagrama ER

## Entidades e Relacionamentos

### Cliente
- **CPF** (PK)
- Nome
- Saldo

### Empresa
- **CNPJ** (PK)
- Nome
- Saldo

### Transação
- **ID** (PK)
- Valor
- Tipo (Saque/Depósito)
- Data
- Valor da Taxa (FK)
- **CPF** (FK) -> Cliente
- **CNPJ** (FK) -> Empresa

### Taxa
- **Tipo** (PK)
- Valor
- **CNPJ** (FK) -> Empresa

## Relacionamentos

- **Cliente** [1] --- [N] **Transação**
  - Um Cliente pode ter várias Transações.
  
- **Empresa** [1] --- [N] **Transação**
  - Uma Empresa pode estar envolvida em várias Transações.

- **Empresa** [1] --- [N] **Taxa**
  - Uma Empresa pode ter várias Taxas.

- **Transação** [N] --- [1] **Taxa**
  - Cada Transação está associada a uma Taxa específica.

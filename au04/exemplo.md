Classe ContaBanco
    // ATRIBUTOS
    publico numConta: Inteiro
    protegido tipo: Caractere
    privado dono: Caractere
    privado saldo: Real
    privado status: Logico

    // METODOS
    publico Metodo abrirConta(t:caractere)
        setTipo(t)
        setStatus(verdadeiro)
        se (t = "CC") entao
            saldo = 50
        senao se (t = "PC") entao
            saldo = 150
        FimSe
    FimMetodo

    publico Metodo fecharConta()
        se (saldo > 0) entao
            Escreva("conta com dinheiro")
        senao se (saldo < 0) entao
            Escreva("conta em debito")
        senao
            setStatus(false)
        FimSe
    FimMetodo

    publico Metodo depositar(v:Real)
        se (status = verdadeiro) entao
            setSaldo(getSaldo() + v)
        senao
            Escreva("Impossivel depositar")
        FimSe
    FimMetodo

    publico Metodo sacar()
        se (status = verdadeiro) entao
            se (saldo > v) entao
                setSaldo(getSaldo - v)
            senao
                Escreva("Saldo insuficiente")
            FimSe
        senao
            Escreva("Impossivel sacar")
        FimSe
    FimMetodo

    publico Metodo pagarMensal()
        var v: Real
        se (tipo = "CC") entao
            v = 12
        senao se (tipo = "PC") entao
            v = 20
        FimSe
        se (status = verdadeiro) entao
            se (saldo > v) entao
                saldo = saldo - v
            senao
                Escreva("Saldo insuficiente")
            FimSe
        senao
            Escreva("Impossivel pagar")
        FimSe
    FimMetodo

    // METODOS ESPECIAIS
    publico Metodo Construtor()
        saldo = 0
        status = falso
    fimMetodo

    publico Metodo setNumConta(n:Inteiro)
        numConta = n
    fimMetodo
    publico Metodo getNumConta()
        retorne numConta
    fimMetodo

    publico Metodo setTipo(t:caractere)
        tipo = t
    FimMetodo
    publico Metodo getTipo()
        retorne tipo
    FimMetodo

    publico Metodo setDono(d:caractere)
        dono = d
    FimMetodo
    publico Metodo getDono()
        retorne dono
    FimMetodo

    publico Metodo setSaldo(s:real)
        saldo = s
    FimMetodo
    publico Metodo getSaldo()
        retorne saldo
    fimMetodo

    publico Metodo setStatus(s:logico)
        status = s
    FimMetodo
    publico Metodo getStatus()
        retorne status
    FimMetodo

FimClasse
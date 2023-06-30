# Reutilização de Software
<style>

article {counter-reset:section figuras;}

h2 {counter-reset:subsection;}

h2:before{
    counter-increment:section;
    content:counter(section) ". ";
}

h3:before{
    counter-increment:subsection;
    content:counter(section) "." counter(subsection) " ";
}

.legenda:before{
    counter-increment:figuras;
    content:"Figura " counter(figuras) ". ";
}

</style>
## Histórico de Versão

| Versão | Data       | Descrição                                  | Autor(es)             | Revisor(es) |
| ------ | ---------- | ------------------------------------------ | --------------------- | ----------- |
| `1.0`  | 13/06/2023 | Criação do documento com estrutura padrão. | Lucas Felipe          | Nicolas     |
| `1.1`  | 24/06/2023 | Adição da Padronização, introdução, metodologia e reutilização interna. | Davi Lima e Guilherme | João Pedro e Lucas Felipe     |

## Introdução

O presente artefato visa documentar a reutilização de software dentro do projeto. essa que é uma abordagem essencial na engenharia de software moderna, visando a maximização da eficiência, produtividade e qualidade no desenvolvimento de sistemas.

## Metodologia

O artefato está sendo elaborado seguindo os pontos de vista coletados e discutidos pelo grupo e aprovado pela professora. Para elaboração do mesmo. As principais discussões foram trazidas para dentro da issue do repósitorio no [Github]("https://github.com/UnBArqDsw2023-1/2023.1_G5_ProjetoRiHappy/issues/16"). 

## Reutilização Interna

[Reutilização Interna](./interna.md ':include')

## Reutilização Externa

[Reutilização externa](./externa.md ':include')
## Arquitetura

[Reutilização arquitetura](./arquitetura.md ':include')
## Referências

[1] Arquitetura e Desenho de software - Aula ARQUITETURA & DAS  - Prof. Milene <br/>
[2] Engenharia de software - Ian Sommerville - 9 edição <br/>
[3] O que é o GitHub <br/> 






# Grupo 5 - RiHappy

Repositório que deve ser utilizado como template inicial pelos grupos da matéria de Arquitetura e Desenho de Software.

## Introdução

Este repositório traz um template de repo de documentação a ser seguido pelos grupos de arquitetura e desenho de
software.

## Tecnologia

A geração do site estático é realizada utilizando o [docsify](https://docsify.js.org/).

```shell
"Docsify generates your documentation website on the fly. Unlike GitBook, it does not generate static html files. Instead, it smartly loads and parses your Markdown files and displays them as a website. To start using it, all you need to do is create an index.html and deploy it on GitHub Pages."
```

### Rodando o docsify em container

- Requisitos: possuir docker instalado.

Comando, executado na raiz do projeto:

```shell
docker compose up -d 
```

Esse comando iniciará a documentação na porta 3000 do localhost.  


A flag -d significa "detached", dessa forma o terminal não ficará atrelado ao container. 

> Observação: dessa maneira, provavelmente, a documentação não atualizará automaticamente.



### Instalando o docsify

Execute o comando:

```shell
npm i docsify-cli -g
```

### Executando localmente

Para iniciar o site localmente, utilize o comando:

```shell
docsify serve ./docs
```

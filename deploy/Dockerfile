# A imagem gradle alpine é mais leve, contendo apenas as bibliotecas necessárias.
FROM gradle:7.6-jdk17-alpine as build

WORKDIR /app

# Copia todos os arquivos para dentro do container, para fazer o build do projeto.
COPY . .

# Executa o comando do gradle responsável por buildar o arquivo .jar
RUN gradle clean build

FROM openjdk:17-alpine as deploy

WORKDIR /app

COPY --from=build /app/build/libs/avaliacaoService-0.0.1-SNAPSHOT.jar/ /app/app.jar

CMD java -jar -Dspring.profiles.active=prod app.jar



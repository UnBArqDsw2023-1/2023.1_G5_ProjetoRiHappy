# Referência: https://sabe.io/tutorials/serve-static-files-nginx-docker

FROM nginx:alpine

WORKDIR /app/static

COPY . .

COPY ./conf/nginx.conf /etc/nginx/nginx.conf

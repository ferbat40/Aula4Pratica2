@echo off
call mvn clean package
call docker build -t com.mycompany/Aula4Praticas2 .
call docker rm -f Aula4Praticas2
call docker run -d -p 9080:9080 -p 9443:9443 --name Aula4Praticas2 com.mycompany/Aula4Praticas2
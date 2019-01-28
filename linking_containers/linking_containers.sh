#!/bin/bash

docker run --name our-mysql -e MYSQL_ROOT_PASSWORD="12345" -d mysql:latest

docker ps

docker run --name link_cont --link "our-mysql:db" -p 8080:8080 -d adminer

docker ps

docker logs link_cont 

#!/bin/bash

docker run --name our-mysql -e MYSQL_ROOT_PASSWORD=password -d mysql:latest

docker run --link "our-mysql:db" -p 8080:8080 adminer


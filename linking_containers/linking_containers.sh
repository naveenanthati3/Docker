#!/bin/bash
#pulling sql latest version and assigning password
docker run --name our-mysql -e MYSQL_ROOT_PASSWORD=password -d mysql:latest
#pulling adminer app and linking to sql and assigning port no
docker run --link "our-mysql:db" -p 8080:8080 adminer

#!/bin/bash
<<<<<<< HEAD

docker run --name our-mysql -e MYSQL_ROOT_PASSWORD="12345" -d mysql:latest

docker ps

docker run --name link_cont --link "our-mysql:db" -p 8080:8080 -d adminer

docker ps

docker logs link_cont 
=======
#pulling sql latest version and assigning password
docker run --name our-mysql -e MYSQL_ROOT_PASSWORD=password -d mysql:latest
#pulling adminer app and linking to sql and assigning port no
docker run --link "our-mysql:db" -p 8080:8080 adminer
>>>>>>> b93c97660e3bb7620a4a051ad09dd06a7a7ef8f8

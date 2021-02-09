Generate SSH Keys on the Master
 <!-- ssh-keygen -t rsa -b 4096 -->

Exchange SSH Keys by ssh-copy-id command
 <!-- ssh-copy-id -i ~/.ssh/id_rsa.pub slave1@x.x.x.x -->
 <!-- ssh-copy-id -i ~/.ssh/id_rsa.pub slave2@x.x.x.x -->
 <!-- ssh-copy-id -i ~/.ssh/id_rsa.pub slave3@x.x.x.x -->

Intiate Swarm Cluster on Master
 <!-- docker swarm init -->

Copy the docker swarm join command to joins slaves to master
 <!-- docker swarm join --token SWMTKN-1-2errcm8pecvxi8tzjyny1ns1k2ca4ipoji38rf2rwetrvk32vf-a4pvp4eeyi9870czvqkhohkm0 192.168.0.105:2377 -->
 do this on three slaves to join docker swarm cluster

To list the Master and Slaves
 <!-- docker node ls -->

Start local Docker registry as service

Since a Docker swarm consists of any number of Docker engines, applications can only be run in a cluster if all Docker engines involved have access to the application’s image. For this, you need a central service that allows you to manage images and prepare them in a cluster. Such a service is called a registry.

<!-- docker service create --name registry --publish 5000:5000 registry:2 -->

Before you can run your multi-container app as a divided application in the cluster, you need to prepare all of the required images via the registry service.
<!-- sudo docker-compose push -->

Deploy Docker Stack in Cluster
<!-- sudo docker stack deploy --compose-file docker-compose.yml srs_stack -->

#!/bin/bash

#to stop all running containers

docker stop $(docker ps -q)

echo "all running containers has been stoped successfully"

#to remove all stopped containers

echo "all stoped containers has been removed successfully"

docker rm $(docker ps -a -q)

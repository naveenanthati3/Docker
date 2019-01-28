#!/bin/bash

#to remove containers by status=exited,dead,stopped,

docker rm $(docker ps --filter=exited -q)

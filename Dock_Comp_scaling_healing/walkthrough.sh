#!/bin/bash
docker-compose  -p challenge -f docker-compose.yml up -d

docker-compose  -p challenge -f docker-compose.yml up -d --scale web=3


#!/bin/bash
docker-compose  -p challenge -f docker-compose.yml up -d
#adding scale to server
docker-compose  -p challenge -f docker-compose.yml up -d --scale web=3
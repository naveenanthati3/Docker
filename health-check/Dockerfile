#Install http server latest version
FROM httpd:latest

#update and install curl
RUN apt-get update && apt-get install -y --no-install-recommends curl && apt-get clean

#assign the port number for the server
EXPOSE 80

#adding healthcheck to monitor the health status of a server
HEALTHCHECK --interval=15s --retries=5 --timeout=30s CMD curl -I -f "http://localhost:80" || exit 1

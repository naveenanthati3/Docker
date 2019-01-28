FROM tomcat:latest

RUN apt-get update && apt-get install -y --no-install-recommends curl && apt-get clean

EXPOSE 8080

HEALTHCHECK --interval=20s --retries=5 --timeout=30s CMD curl -I -f "http://localhost:8080" || exit 1

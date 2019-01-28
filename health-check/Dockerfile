FROM httpd:latest

RUN apt-get update && apt-get install -y --no-install-recommends curl && apt-get clean

EXPOSE 80

HEALTHCHECK --interval=15s --retries=5 --timeout=30s CMD curl -I -f "http://localhost:80" || exit 1

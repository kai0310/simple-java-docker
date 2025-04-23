FROM eclipse-temurin:21-jdk

RUN apt-get update && apt-get install -y \
    curl \
    maven \
    && apt-get clean

WORKDIR /usr/src

EXPOSE 8080

CMD ["bash"]
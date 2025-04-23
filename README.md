# Simple Java Docker

A simple Java application running in Docker.

# 概要

このリポジトリは、Dockerを使用して実行するシンプルなJavaアプリケーションです。

## Requirements / 必要条件

- Docker
- Docker Compose

## Project Structure / プロジェクト構造

```tree
.
├── docker/
│ └── java/
│ └── Dockerfile # Java application Docker configuration
├── server/
│ └── src/
│ └── Main.java # Simple Java Hello World application
└── docker compose.yml # Docker Compose configuration
```

## Setup and Run / セットアップと実行方法

### Build and start the container / コンテナのビルドと起動

```bash
docker compose up -d
```

### Access the container / コンテナへのアクセス

docker compose exec java bash

### Compile and run the Java application / Javaアプリケーションのコンパイルと実行

Inside the container:

```bash
cd /usr/src
javac Main.java
java Main
```

You should see the output: `Hello World!`

### Stop the container / コンテナの停止

```bash
docker compose down
```

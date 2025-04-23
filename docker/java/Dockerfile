FROM eclipse-temurin:21-jdk-jammy

# Install essential tools
RUN apt-get update && apt-get install -y \
    curl \
    git \
    maven \
    vim \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

# Set Maven options
ENV MAVEN_OPTS="-Xmx1024m"

# Set working directory
WORKDIR /usr/src

# Copy Maven settings if you have any
# COPY maven-settings.xml /root/.m2/settings.xml

# Default command when starting the container
CMD ["bash"]

# Expose the application port
EXPOSE 8080
FROM openjdk:22-ea-17-jdk-slim-bullseye

VOLUME /tmp
RUN export DEBIAN_FRONTEND=noninteractive \
    && apt-get update \
    && apt-get install -y --no-install-recommends \
    && apt-get install -y curl \
    && apt-get install -y procps \
    && apt-get install tzdata \
	&& rm -rf /var/lib/apt/lists/*; \
	echo America/Lima > /etc/timezone; \
    rm /etc/localtime; \
	dpkg-reconfigure -fnoninteractive tzdata

ADD build/libs/ms-accounts-graphql-*-SNAPSHOT.jar app.jar
ADD src/main/docker/entrypoint.sh entrypoint.sh
RUN chmod +x entrypoint.sh

ENV MSACCOUNTS_URL="http://localhost:9061/"

ENTRYPOINT ["/entrypoint.sh"]
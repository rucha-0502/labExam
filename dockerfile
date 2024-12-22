FROM openjdk:11

WORKDIR /app

COPY . /app

RUN javac  largestnum.java

CMD ["java", "largestnum"]
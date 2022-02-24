From Java:8
EXPOSE 8080
ADD target/dockerdemo2.jar dockerdemo2.jar
ENTRYPOINT ["java","-jar","dockerdemo2.jar"]
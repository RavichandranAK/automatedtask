FROM eclipse-temurin:17
COPY target/automatedtask.jar automatedtask.jar
CMD [ "java","-jar","automatedtask.jar" ]
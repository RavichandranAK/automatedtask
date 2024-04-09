FROM eclipse-temurin:17
COPY target/automatedtask automatedtask
CMD [ "java","-jar","automatedtask" ]
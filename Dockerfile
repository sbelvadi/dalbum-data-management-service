FROM openjdk:8
ADD build/libs/dalbum-data-management-service-1.0.0-SNAPSHOT.jar dalbum-data-management-service.jar
EXPOSE 9087
ENTRYPOINT [ "java", "-jar", "dalbum-data-management-service.jar"]
# Stage 1
FROM amazoncorretto:17-alpine as build

LABEL maintainer="Maria Mihai <maria.ic.mihai@gmail.com>"

COPY target/*.jar app.jar

RUN mkdir -p target/dependency && (cd target/dependency; jar -xf /app.jar)

# Stage 2
FROM amazoncorretto:17-alpine

VOLUME /tmp

ARG DEPENDENCY=/target/dependency
COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app

# Execute
ENTRYPOINT ["java", "-cp", "app:app/lib/*", "com.optimagrowth.license.LicensingServiceApplication"]
# Spring Microservices in Action, Second Edition

Overview of all projects from the "Spring Microservices in Action" by John Carnell and Illary Huaylupo Sanchez, for the 
second edition of the book published in 2021.

My implementation for the first edition can be found [here](https://github.com/mariamihai/sma-overview).

| Project                | Description                             | Status |
| :------------:         | :---------------                        | :----- |
| [licensing-service](./licensing-service)      | Backend licensing service for O-Stock   | [![licensing-service](https://github.com/mariamihai/sma-2nd-ed-overview/actions/workflows/licensing-service.yaml/badge.svg)](https://github.com/mariamihai/sma-2nd-ed-overview/actions/workflows/licensing-service.yaml) [![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=sma-licensing-service&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=sma-licensing-service) [![Docker image](https://badgen.net/badge/icon/docker?icon=docker&label=licensing-service)](https://hub.docker.com/r/mariamihai/sma2-licensing-service)|
| [organization-service](./organization-service)   | Organization service for O-Stock        | [![organization-service](https://github.com/mariamihai/sma-2nd-ed-overview/actions/workflows/organization-service.yaml/badge.svg)](https://github.com/mariamihai/sma-2nd-ed-overview/actions/workflows/organization-service.yaml) [![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=sma-organization-service&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=sma-organization-service) [![Docker image](https://badgen.net/badge/icon/docker?icon=docker&label=organization-service)](https://hub.docker.com/r/mariamihai/sma2-organization-service)|

## Project
Implementing a software product for a fictitious company named **Optima Growth**, a software development company whose 
core product named **Optima Stock** (or **O-Stock**) provides an enterprise-grade asset management delivery, license 
management, compliance, cost, and resource management.

Initial architecture as explained in the book:
![Architecture](images/Initial%20architecture.png)

### Running locally
Build the image for the service to be run locally:

```
cd <service_folder>

mvn clean package dockerfile:build
```

The image name will be of format `mariamihai/sma2-<service-name>:latest` (like `mariamihai/sma-licensing-service:latest`)

Either run this with `docker run` or from `local.yaml` Docker Compose file in Docker folder (`docker-compose -f docker/local.yaml up`)

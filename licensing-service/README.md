[![licensing-service](https://github.com/mariamihai/sma-2nd-ed-overview/actions/workflows/licensing-service.yaml/badge.svg)](https://github.com/mariamihai/sma-2nd-ed-overview/actions/workflows/licensing-service.yaml) [![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=sma-licensing-service&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=sma-licensing-service) [![Docker image](https://badgen.net/badge/icon/docker?icon=docker&label=licensing-service)](https://hub.docker.com/r/mariamihai/sma2-licensing-service)

# Licensing Service

My implementation of the **Licensing Service** described in **Spring Microservices in Action** by John Carnell and Illary Huaylupo Sanchez, for the
second edition of the book published in 2021.

An overview of all the projects can be found [here](../../..).

## API

### Get license by licenseId and organizationId

* **/v1/organization/:organizationId/license/:licenseId**

* **Method:** `GET`

* **URL Params**

   **Required:**

   `organizationId=[string]`

   `licenseId=[string]`

   **Optional:** - 

* **Data Params** - 

* **Headers**

  `Accept-Language` - us and ro supported

* **Success Response:**
    * **Code:** 200 <br />
      **Content:**
    ```
    {
      "id": 564,
      "licenseId": "1234-5678",
      "description": "Software product",
      "organizationId": "1234-abcd-5678-efgh",
      "productName": "O-Stock",
      "licenseType": "full"
    }
    ```

* **Error Response:**

    No defined errors at the moment.

### Create a new license

* **/v1/organization/:organizationId/license**

* **Method:** `POST`

* **URL Params**

  **Required:**

  `organizationId=[string]`

  **Optional:** -

* **Data Params** 
  ```
  {
    "licenseId": "1234-5678",
    "description": "Software product",
    "productName": "O-Stock",
    "licenseType": "full"
  }
  ```

* **Headers**

  `Accept-Language` - us and ro supported

* **Success Response:**
    * **Code:** 200 <br />
      **Content:**
    ```
    {
      "id": 144,
      "licenseId": "1234-5678",
      "description": "Software product",
      "organizationId": "1234-abcd-5678-efgh",
      "productName": "O-Stock",
      "licenseType": "full"
    }
    ```

* **Error Response:**

  No defined errors at the moment.

### Update an existing license

* **/v1/organization/:organizationId/license**

* **Method:** `PUT`

* **URL Params**

  **Required:**

  `organizationId=[string]`

  **Optional:** -

* **Data Params**
  ```
  {
    "licenseId": "1234-5678",
    "description": "Software product",
    "productName": "O-Stock",
    "licenseType": "full"
  }
  ```

* **Headers**

  `Accept-Language` - us and ro supported

* **Success Response:**
  * **Code:** 200 <br />
    **Content:**
    ```
    {
      "id": 211,
      "licenseId": "1234-5678",
      "description": "Software product",
      "organizationId": "1234-abcd-5678-efgh",
      "productName": "O-Stock",
      "licenseType": "full"
    }
    ```

* **Error Response:**

  No defined errors at the moment.

### Delete an existing license

* **/v1/organization/:organizationId/license/:licenseId**

* **Method:** `DELETE`

* **URL Params**

  **Required:**

  `organizationId=[string]`

  `licenseId=[string]`

  **Optional:** -

* **Data Params** -

* **Headers**

  `Accept-Language` - us and ro supported

* **Success Response:**
  * **Code:** 200 <br />
    **Content:**
    ```
    {
      "id": 254,
      "licenseId": "1234-5678",
      "description": "Software product",
      "organizationId": "1234-abcd-5678-efgh",
      "productName": "O-Stock",
      "licenseType": "full"
    }
    ```

* **Error Response:**

  No defined errors at the moment.


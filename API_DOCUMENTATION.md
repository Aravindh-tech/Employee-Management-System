{
  "info": {
    "_postman_id": "7f47c391-435b-4ef0-9ac6-f6583a56b522",
    "name": "jwt",
    "schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
    "_exporter_id": "51291267",
    "_collection_link": "https://go.postman.co/collection/51291267-7f47c391-435b-4ef0-9ac6-f6583a56b522?source=collection_link"
  },
  "item": [
    {
      "name": "createCompanyData",
      "request": {
        "auth": {
          "type": "noauth"
        },
        "method": "POST",
        "header": [
          {
            "key": "Content-Type",
            "value": "application/json",
            "type": "text",
            "disabled": true
          }
        ],
        "body": {
          "mode": "raw",
          "raw": "{\r\n   \"companyName\":\"Kriha\",\r\n   \"companyMail\":\"krihait@gmail.com\",\r\n   \"status\":1\r\n}",
          "options": {
            "raw": {
              "language": "json"
            }
          }
        },
        "url": {
          "raw": "http://localhost:8080/api/company/add",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8080",
          "path": [
            "api",
            "company",
            "add"
          ]
        }
      },
      "response": [
        {
          "name": "createCompanyData",
          "originalRequest": {
            "method": "POST",
            "header": [
              {
                "key": "Content-Type",
                "value": "application/json",
                "type": "text",
                "disabled": true
              }
            ],
            "body": {
              "mode": "raw",
              "raw": "{\r\n   \"companyName\":\"Kriha\",\r\n   \"companyMail\":\"krihait@gmail.com\",\r\n   \"status\":1\r\n}",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": {
              "raw": "http://localhost:8080/api/company/add",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "company",
                "add"
              ]
            }
          },
          "status": "OK",
          "code": 200,
          "_postman_previewlanguage": "Text",
          "header": [
            {
              "key": "Vary",
              "value": "Origin"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Method"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Headers"
            },
            {
              "key": "X-Content-Type-Options",
              "value": "nosniff"
            },
            {
              "key": "X-XSS-Protection",
              "value": "0"
            },
            {
              "key": "Cache-Control",
              "value": "no-cache, no-store, max-age=0, must-revalidate"
            },
            {
              "key": "Pragma",
              "value": "no-cache"
            },
            {
              "key": "Expires",
              "value": "0"
            },
            {
              "key": "X-Frame-Options",
              "value": "DENY"
            },
            {
              "key": "Content-Type",
              "value": "application/json"
            },
            {
              "key": "Transfer-Encoding",
              "value": "chunked"
            },
            {
              "key": "Date",
              "value": "Fri, 30 Oct 2026 06:43:55 GMT"
            },
            {
              "key": "Keep-Alive",
              "value": "timeout=60"
            },
            {
              "key": "Connection",
              "value": "keep-alive"
            }
          ],
          "cookie": [],
          "body": "{\n    \"id\": 1,\n    \"companyName\": \"Kriha\",\n    \"companyMail\": \"krihait@gmail.com\",\n    \"status\": 1\n}"
        }
      ]
    },
    {
      "name": "getCompanyDetails",
      "request": {
        "method": "GET",
        "header": [],
        "url": {
          "raw": "http://localhost:8080/api/company",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8080",
          "path": [
            "api",
            "company"
          ]
        }
      },
      "response": [
        {
          "name": "getCompanyDetails",
          "originalRequest": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "http://localhost:8080/api/company",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "company"
              ]
            }
          },
          "status": "OK",
          "code": 200,
          "_postman_previewlanguage": "Text",
          "header": [
            {
              "key": "Vary",
              "value": "Origin"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Method"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Headers"
            },
            {
              "key": "X-Content-Type-Options",
              "value": "nosniff"
            },
            {
              "key": "X-XSS-Protection",
              "value": "0"
            },
            {
              "key": "Cache-Control",
              "value": "no-cache, no-store, max-age=0, must-revalidate"
            },
            {
              "key": "Pragma",
              "value": "no-cache"
            },
            {
              "key": "Expires",
              "value": "0"
            },
            {
              "key": "X-Frame-Options",
              "value": "DENY"
            },
            {
              "key": "Content-Type",
              "value": "application/json"
            },
            {
              "key": "Transfer-Encoding",
              "value": "chunked"
            },
            {
              "key": "Date",
              "value": "Fri, 30 Oct 2026 07:06:03 GMT"
            },
            {
              "key": "Keep-Alive",
              "value": "timeout=60"
            },
            {
              "key": "Connection",
              "value": "keep-alive"
            }
          ],
          "cookie": [],
          "body": "[\n    {\n        \"id\": 1,\n        \"companyName\": \"Kriha\",\n        \"companyMail\": \"krihait@gmail.com\",\n        \"status\": 1\n    }\n]"
        }
      ]
    },
    {
      "name": "getUsersDetails",
      "request": {
        "method": "GET",
        "header": [],
        "url": {
          "raw": "http://localhost:8080/api/users",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8080",
          "path": [
            "api",
            "users"
          ]
        }
      },
      "response": [
        {
          "name": "getUsersDetails",
          "originalRequest": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "http://localhost:8080/api/users",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "users"
              ]
            }
          },
          "status": "OK",
          "code": 200,
          "_postman_previewlanguage": "Text",
          "header": [
            {
              "key": "Vary",
              "value": "Origin"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Method"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Headers"
            },
            {
              "key": "X-Content-Type-Options",
              "value": "nosniff"
            },
            {
              "key": "X-XSS-Protection",
              "value": "0"
            },
            {
              "key": "Cache-Control",
              "value": "no-cache, no-store, max-age=0, must-revalidate"
            },
            {
              "key": "Pragma",
              "value": "no-cache"
            },
            {
              "key": "Expires",
              "value": "0"
            },
            {
              "key": "X-Frame-Options",
              "value": "DENY"
            },
            {
              "key": "Content-Type",
              "value": "application/json"
            },
            {
              "key": "Transfer-Encoding",
              "value": "chunked"
            },
            {
              "key": "Date",
              "value": "Fri, 30 Oct 2026 07:05:22 GMT"
            },
            {
              "key": "Keep-Alive",
              "value": "timeout=60"
            },
            {
              "key": "Connection",
              "value": "keep-alive"
            }
          ],
          "cookie": [],
          "body": "[\n    {\n        \"id\": 1,\n        \"userName\": \"Aravind\",\n        \"password\": \"arav123\",\n        \"email\": \"aravind232004@gmail.com\",\n        \"mobileNumber\": 8638264264,\n        \"status\": 1,\n        \"companyId\": 1\n    }\n]"
        }
      ]
    },
    {
      "name": "deleteUserData",
      "request": {
        "method": "DELETE",
        "header": [],
        "url": {
          "raw": "http://localhost:8080/api/users/delete-user/1",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8080",
          "path": [
            "api",
            "users",
            "delete-user",
            "1"
          ]
        }
      },
      "response": []
    },
    {
      "name": "createUserData",
      "request": {
        "method": "POST",
        "header": [],
        "body": {
          "mode": "raw",
          "raw": " {\r\n    \"userName\":\"Aravind\",\r\n    \"password\":\"arav123\",\r\n    \"email\":\"aravind232004@gmail.com\",\r\n    \"mobileNumber\":8638264264,\r\n    \"status\":1,\r\n    \"companyId\":1\r\n }",
          "options": {
            "raw": {
              "language": "json"
            }
          }
        },
        "url": {
          "raw": "http://localhost:8080/api/users/add-user",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8080",
          "path": [
            "api",
            "users",
            "add-user"
          ]
        }
      },
      "response": []
    },
    {
      "name": "Employee",
      "request": {
        "method": "POST",
        "header": [
          {
            "key": "Authorization",
            "value": "Bearer {{json_web_token}}",
            "type": "text"
          }
        ],
        "body": {
          "mode": "raw",
          "raw": "{\r\n    \"empName\":\"Joseph\",\r\n    \"empEmail\":\"josephjp@gmail.com\",\r\n    \"empPassword\":\"joseph123\",\r\n    \"empNumber\":6322001502,\r\n    \"empSalary\":30000,\r\n    \"department\":\"Testing\",\r\n    \"empSkills\":[\r\n        \"HTML\",\r\n        \"CSS\",\r\n        \"JavaScript\",\r\n        \"Java\",\r\n        \"Spring Boot\"\r\n    ],\r\n    \"empAddress\":{\r\n        \"Area\":\"Anna nagar\",\r\n        \"Location\":\"Chennai\"\r\n    },\r\n    \"status\":true\r\n}",
          "options": {
            "raw": {
              "language": "json"
            }
          }
        },
        "url": {
          "raw": "http://localhost:8080/api/employees/data",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8080",
          "path": [
            "api",
            "employees",
            "data"
          ]
        }
      },
      "response": [
        {
          "name": "createUserData",
          "originalRequest": {
            "method": "POST",
            "header": [],
            "body": {
              "mode": "raw",
              "raw": " {\r\n     \"userName\":\"Aravind\",\r\n    \"password\":\"arav123\",\r\n    \"email\":\"aravind232004@gmail.com\",\r\n    \"mobileNumber\":8638264264,\r\n    \"status\":1,\r\n    \"companyId\":1\r\n }",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": {
              "raw": "http://localhost:8080/api/users/add-user",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "users",
                "add-user"
              ]
            }
          },
          "status": "OK",
          "code": 200,
          "_postman_previewlanguage": "Text",
          "header": [
            {
              "key": "Vary",
              "value": "Origin"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Method"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Headers"
            },
            {
              "key": "X-Content-Type-Options",
              "value": "nosniff"
            },
            {
              "key": "X-XSS-Protection",
              "value": "0"
            },
            {
              "key": "Cache-Control",
              "value": "no-cache, no-store, max-age=0, must-revalidate"
            },
            {
              "key": "Pragma",
              "value": "no-cache"
            },
            {
              "key": "Expires",
              "value": "0"
            },
            {
              "key": "X-Frame-Options",
              "value": "DENY"
            },
            {
              "key": "Content-Type",
              "value": "application/json"
            },
            {
              "key": "Transfer-Encoding",
              "value": "chunked"
            },
            {
              "key": "Date",
              "value": "Fri, 30 Oct 2026 07:04:11 GMT"
            },
            {
              "key": "Keep-Alive",
              "value": "timeout=60"
            },
            {
              "key": "Connection",
              "value": "keep-alive"
            }
          ],
          "cookie": [],
          "body": "{\n    \"id\": 1,\n    \"userName\": \"Aravind\",\n    \"password\": \"arav123\",\n    \"email\": \"aravind232004@gmail.com\",\n    \"mobileNumber\": 8638264264,\n    \"status\": 1,\n    \"companyId\": 1\n}"
        },
        {
          "name": "Employee",
          "originalRequest": {
            "method": "POST",
            "header": [
              {
                "key": "Authorization",
                "value": "Bearer {{json_web_token}}",
                "type": "text"
              }
            ],
            "body": {
              "mode": "raw",
              "raw": "{\r\n    \"empName\":\"Joseph\",\r\n    \"empEmail\":\"josephjp@gmail.com\",\r\n    \"empPassword\":\"joseph123\",\r\n    \"empNumber\":6322001502,\r\n    \"empSalary\":30000,\r\n    \"department\":\"Testing\",\r\n    \"empSkills\":[\r\n        \"HTML\",\r\n        \"CSS\",\r\n        \"JavaScript\",\r\n        \"Java\",\r\n        \"Spring Boot\"\r\n    ],\r\n    \"empAddress\":{\r\n        \"Area\":\"Anna nagar\",\r\n        \"Location\":\"Chennai\"\r\n    },\r\n    \"status\":true\r\n}",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": {
              "raw": "http://localhost:8080/api/employees/data",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "employees",
                "data"
              ]
            }
          },
          "status": "Created",
          "code": 201,
          "_postman_previewlanguage": "Text",
          "header": [
            {
              "key": "Vary",
              "value": "Origin"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Method"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Headers"
            },
            {
              "key": "X-Content-Type-Options",
              "value": "nosniff"
            },
            {
              "key": "X-XSS-Protection",
              "value": "0"
            },
            {
              "key": "Cache-Control",
              "value": "no-cache, no-store, max-age=0, must-revalidate"
            },
            {
              "key": "Pragma",
              "value": "no-cache"
            },
            {
              "key": "Expires",
              "value": "0"
            },
            {
              "key": "X-Frame-Options",
              "value": "DENY"
            },
            {
              "key": "Content-Type",
              "value": "text/plain;charset=UTF-8"
            },
            {
              "key": "Content-Length",
              "value": "16"
            },
            {
              "key": "Date",
              "value": "Wed, 04 Nov 2026 07:09:57 GMT"
            },
            {
              "key": "Keep-Alive",
              "value": "timeout=60"
            },
            {
              "key": "Connection",
              "value": "keep-alive"
            }
          ],
          "cookie": [],
          "body": "Employee created"
        }
      ]
    },
    {
      "name": "login",
      "request": {
        "method": "POST",
        "header": [],
        "body": {
          "mode": "raw",
          "raw": "{\r\n    \"userName\":\"Aravind\",\r\n    \"password\": \"arav123\"\r\n}",
          "options": {
            "raw": {
              "language": "json"
            }
          }
        },
        "url": {
          "raw": "http://localhost:8080/api/auth/login",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8080",
          "path": [
            "api",
            "auth",
            "login"
          ]
        }
      },
      "response": []
    },
    {
      "name": "getEmployeeDetails",
      "request": {
        "method": "GET",
        "header": [],
        "url": {
          "raw": ""
        }
      },
      "response": [
        {
          "name": "getEmployeeDetails",
          "originalRequest": {
            "method": "GET",
            "header": [
              {
                "key": "Authorization",
                "value": "Bearer {{json_web_token}}",
                "type": "text"
              }
            ],
            "body": {
              "mode": "raw",
              "raw": "",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": {
              "raw": "http://localhost:8080/api/employees?search=subash",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "employees"
              ],
              "query": [
                {
                  "key": "page",
                  "value": "1",
                  "type": "text",
                  "disabled": true
                },
                {
                  "key": "size",
                  "value": "2",
                  "type": "text",
                  "disabled": true
                },
                {
                  "key": "sortBy",
                  "value": "empId",
                  "type": "text",
                  "disabled": true
                },
                {
                  "key": "sortDirection",
                  "value": "desc",
                  "type": "text",
                  "disabled": true
                },
                {
                  "key": "search",
                  "value": "subash"
                }
              ]
            }
          },
          "status": "OK",
          "code": 200,
          "_postman_previewlanguage": "Text",
          "header": [
            {
              "key": "Vary",
              "value": "Origin"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Method"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Headers"
            },
            {
              "key": "X-Content-Type-Options",
              "value": "nosniff"
            },
            {
              "key": "X-XSS-Protection",
              "value": "0"
            },
            {
              "key": "Cache-Control",
              "value": "no-cache, no-store, max-age=0, must-revalidate"
            },
            {
              "key": "Pragma",
              "value": "no-cache"
            },
            {
              "key": "Expires",
              "value": "0"
            },
            {
              "key": "X-Frame-Options",
              "value": "DENY"
            },
            {
              "key": "Content-Type",
              "value": "application/json"
            },
            {
              "key": "Transfer-Encoding",
              "value": "chunked"
            },
            {
              "key": "Date",
              "value": "Wed, 04 Nov 2026 07:13:13 GMT"
            },
            {
              "key": "Keep-Alive",
              "value": "timeout=60"
            },
            {
              "key": "Connection",
              "value": "keep-alive"
            }
          ],
          "cookie": [],
          "body": "{\n    \"content\": [\n        {\n            \"createdDate\": \"2026-11-03T12:03:31.117557\",\n            \"createdBy\": 5,\n            \"lastModifiedDate\": \"2026-11-03T12:03:31.117557\",\n            \"lastModifiedBy\": 5,\n            \"empId\": 1,\n            \"empName\": \"Subash P\",\n            \"empEmail\": \"ictsubashsp@gmail.com\",\n            \"empPassword\": \"$2a$10$mjfJqmTjyPC32WHPi8owQuPyA9/BHzt9P/xajsjL2P8fFDNGInFP.\",\n            \"empNumber\": 7812800482,\n            \"empSalary\": 50000,\n            \"department\": \"Testing\",\n            \"empSkills\": [\n                \"HTML\",\n                \"CSS\",\n                \"JavaScript\",\n                \"Java\",\n                \"Spring Boot\",\n                \"PostgreSQL\"\n            ],\n            \"empAddress\": {\n                \"Area\": \"Anna nagar\",\n                \"Location\": \"Chennai\"\n            },\n            \"active\": true\n        }\n    ],\n    \"pageable\": {\n        \"pageNumber\": 0,\n        \"pageSize\": 5,\n        \"sort\": {\n            \"empty\": false,\n            \"sorted\": true,\n            \"unsorted\": false\n        },\n        \"offset\": 0,\n        \"paged\": true,\n        \"unpaged\": false\n    },\n    \"last\": true,\n    \"totalElements\": 1,\n    \"totalPages\": 1,\n    \"size\": 5,\n    \"number\": 0,\n    \"first\": true,\n    \"numberOfElements\": 1,\n    \"sort\": {\n        \"empty\": false,\n        \"sorted\": true,\n        \"unsorted\": false\n    },\n    \"empty\": false\n}"
        },
        {
          "name": "getEmployeeDetails",
          "originalRequest": {
            "method": "GET",
            "header": [
              {
                "key": "Authorization",
                "value": "Bearer {{json_web_token}}",
                "type": "text"
              }
            ],
            "body": {
              "mode": "raw",
              "raw": "",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": {
              "raw": "http://localhost:8080/api/employees",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "employees"
              ],
              "query": [
                {
                  "key": "page",
                  "value": "1",
                  "type": "text",
                  "disabled": true
                },
                {
                  "key": "size",
                  "value": "2",
                  "type": "text",
                  "disabled": true
                },
                {
                  "key": "sortBy",
                  "value": "empId",
                  "type": "text",
                  "disabled": true
                },
                {
                  "key": "sortDirection",
                  "value": "desc",
                  "type": "text",
                  "disabled": true
                }
              ]
            }
          },
          "status": "OK",
          "code": 200,
          "_postman_previewlanguage": "Text",
          "header": [
            {
              "key": "Vary",
              "value": "Origin"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Method"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Headers"
            },
            {
              "key": "X-Content-Type-Options",
              "value": "nosniff"
            },
            {
              "key": "X-XSS-Protection",
              "value": "0"
            },
            {
              "key": "Cache-Control",
              "value": "no-cache, no-store, max-age=0, must-revalidate"
            },
            {
              "key": "Pragma",
              "value": "no-cache"
            },
            {
              "key": "Expires",
              "value": "0"
            },
            {
              "key": "X-Frame-Options",
              "value": "DENY"
            },
            {
              "key": "Content-Type",
              "value": "application/json"
            },
            {
              "key": "Transfer-Encoding",
              "value": "chunked"
            },
            {
              "key": "Date",
              "value": "Wed, 04 Nov 2026 07:15:01 GMT"
            },
            {
              "key": "Keep-Alive",
              "value": "timeout=60"
            },
            {
              "key": "Connection",
              "value": "keep-alive"
            }
          ],
          "cookie": [],
          "body": "{\n    \"content\": [\n        {\n            \"createdDate\": \"2026-11-03T12:03:31.117557\",\n            \"createdBy\": 5,\n            \"lastModifiedDate\": \"2026-11-03T12:03:31.117557\",\n            \"lastModifiedBy\": 5,\n            \"empId\": 1,\n            \"empName\": \"Subash P\",\n            \"empEmail\": \"ictsubashsp@gmail.com\",\n            \"empPassword\": \"$2a$10$mjfJqmTjyPC32WHPi8owQuPyA9/BHzt9P/xajsjL2P8fFDNGInFP.\",\n            \"empNumber\": 7812800482,\n            \"empSalary\": 50000,\n            \"department\": \"Testing\",\n            \"empSkills\": [\n                \"HTML\",\n                \"CSS\",\n                \"JavaScript\",\n                \"Java\",\n                \"Spring Boot\",\n                \"PostgreSQL\"\n            ],\n            \"empAddress\": {\n                \"Area\": \"Anna nagar\",\n                \"Location\": \"Chennai\"\n            },\n            \"active\": true\n        },\n        {\n            \"createdDate\": \"2026-11-03T12:04:43.148364\",\n            \"createdBy\": 5,\n            \"lastModifiedDate\": \"2026-11-03T12:04:43.148364\",\n            \"lastModifiedBy\": 5,\n            \"empId\": 2,\n            \"empName\": \"Aravindhan P\",\n            \"empEmail\": \"arvind23204@gmail.com\",\n            \"empPassword\": \"$2a$10$LkvbDeX8meT2.v1lURqFxeOPaFK3U6sGue5iCxC05zixQKVnZwm0a\",\n            \"empNumber\": 6369670562,\n            \"empSalary\": 50000,\n            \"department\": \"Backend\",\n            \"empSkills\": [\n                \"Java\",\n                \"Spring Boot\",\n                \"PostgreSQL\"\n            ],\n            \"empAddress\": {\n                \"Area\": \"Anna nagar\",\n                \"Location\": \"Chennai\"\n            },\n            \"active\": true\n        },\n        {\n            \"createdDate\": \"2026-11-03T12:05:06.077693\",\n            \"createdBy\": 5,\n            \"lastModifiedDate\": \"2026-11-03T12:05:06.077693\",\n            \"lastModifiedBy\": 5,\n            \"empId\": 3,\n            \"empName\": \"Balu\",\n            \"empEmail\": \"balu123@gmail.com\",\n            \"empPassword\": \"$2a$10$0NMPfnGNrONtyQO5c/u.ReZhtemZudK2jqCBOExVt2XUlrBqEB3ue\",\n            \"empNumber\": 6369673562,\n            \"empSalary\": 50000,\n            \"department\": \"Backend\",\n            \"empSkills\": [\n                \"Java\",\n                \"Spring Boot\",\n                \"PostgreSQL\"\n            ],\n            \"empAddress\": {\n                \"Area\": \"Anna nagar\",\n                \"Location\": \"Chennai\"\n            },\n            \"active\": true\n        },\n        {\n            \"createdDate\": \"2026-11-03T12:06:01.42986\",\n            \"createdBy\": 5,\n            \"lastModifiedDate\": \"2026-11-03T12:06:01.42986\",\n            \"lastModifiedBy\": 5,\n            \"empId\": 4,\n            \"empName\": \"Veni\",\n            \"empEmail\": \"veni@gmail.com\",\n            \"empPassword\": \"$2a$10$tB0NNzZ6bGVXdy7ZPyuhMOZhikmYOLviIYVGG3KMQ2FeeKDCadSEq\",\n            \"empNumber\": 6329673562,\n            \"empSalary\": 20000,\n            \"department\": \"Frontend\",\n            \"empSkills\": [\n                \"HTML\",\n                \"CSS\",\n                \"JavaScript\"\n            ],\n            \"empAddress\": {\n                \"Area\": \"Anna nagar\",\n                \"Location\": \"Chennai\"\n            },\n            \"active\": true\n        },\n        {\n            \"createdDate\": \"2026-11-03T12:06:35.061558\",\n            \"createdBy\": 5,\n            \"lastModifiedDate\": \"2026-11-03T12:11:16.699592\",\n            \"lastModifiedBy\": 6,\n            \"empId\": 5,\n            \"empName\": \"Barath A\",\n            \"empEmail\": \"barath@gmail.com\",\n            \"empPassword\": \"$2a$10$qMbjwUA3241nMc7iQFe0mOpw.cwXo9t/f5BSYDZzWFNGwoOwm.CNO\",\n            \"empNumber\": 6329611562,\n            \"empSalary\": 20000,\n            \"department\": \"Frontend\",\n            \"empSkills\": [\n                \"HTML\",\n                \"CSS\",\n                \"JavaScript\"\n            ],\n            \"empAddress\": {\n                \"Area\": \"Anna nagar\",\n                \"Location\": \"Chennai\"\n            },\n            \"active\": true\n        }\n    ],\n    \"pageable\": {\n        \"pageNumber\": 0,\n        \"pageSize\": 5,\n        \"sort\": {\n            \"empty\": false,\n            \"sorted\": true,\n            \"unsorted\": false\n        },\n        \"offset\": 0,\n        \"paged\": true,\n        \"unpaged\": false\n    },\n    \"last\": false,\n    \"totalElements\": 8,\n    \"totalPages\": 2,\n    \"size\": 5,\n    \"number\": 0,\n    \"first\": true,\n    \"numberOfElements\": 5,\n    \"sort\": {\n        \"empty\": false,\n        \"sorted\": true,\n        \"unsorted\": false\n    },\n    \"empty\": false\n}"
        }
      ]
    },
    {
      "name": "getEmployeeById",
      "request": {
        "method": "GET",
        "header": [
          {
            "key": "Authorization",
            "value": "Bearer {{json_web_token}}",
            "type": "text"
          }
        ],
        "url": {
          "raw": "http://localhost:8080/api/employees/32",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8080",
          "path": [
            "api",
            "employees",
            "32"
          ]
        }
      },
      "response": [
        {
          "name": "getEmployeeById",
          "originalRequest": {
            "method": "GET",
            "header": [
              {
                "key": "Authorization",
                "value": "Bearer {{json_web_token}}",
                "type": "text"
              }
            ],
            "url": {
              "raw": "http://localhost:8080/api/employees/3",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "employees",
                "3"
              ]
            }
          },
          "status": "Not Found",
          "code": 404,
          "_postman_previewlanguage": "Text",
          "header": [
            {
              "key": "Vary",
              "value": "Origin"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Method"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Headers"
            },
            {
              "key": "X-Content-Type-Options",
              "value": "nosniff"
            },
            {
              "key": "X-XSS-Protection",
              "value": "0"
            },
            {
              "key": "Cache-Control",
              "value": "no-cache, no-store, max-age=0, must-revalidate"
            },
            {
              "key": "Pragma",
              "value": "no-cache"
            },
            {
              "key": "Expires",
              "value": "0"
            },
            {
              "key": "X-Frame-Options",
              "value": "DENY"
            },
            {
              "key": "Content-Type",
              "value": "text/plain;charset=UTF-8"
            },
            {
              "key": "Content-Length",
              "value": "47"
            },
            {
              "key": "Date",
              "value": "Wed, 04 Nov 2026 08:03:43 GMT"
            },
            {
              "key": "Keep-Alive",
              "value": "timeout=60"
            },
            {
              "key": "Connection",
              "value": "keep-alive"
            }
          ],
          "cookie": [],
          "body": "Employee Id not found, Please enter correct Id."
        },
        {
          "name": "getEmployeeById",
          "originalRequest": {
            "method": "GET",
            "header": [
              {
                "key": "Authorization",
                "value": "Bearer {{json_web_token}}",
                "type": "text"
              }
            ],
            "url": {
              "raw": "http://localhost:8080/api/employees/5",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "employees",
                "5"
              ]
            }
          },
          "status": "OK",
          "code": 200,
          "_postman_previewlanguage": "Text",
          "header": [
            {
              "key": "Vary",
              "value": "Origin"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Method"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Headers"
            },
            {
              "key": "X-Content-Type-Options",
              "value": "nosniff"
            },
            {
              "key": "X-XSS-Protection",
              "value": "0"
            },
            {
              "key": "Cache-Control",
              "value": "no-cache, no-store, max-age=0, must-revalidate"
            },
            {
              "key": "Pragma",
              "value": "no-cache"
            },
            {
              "key": "Expires",
              "value": "0"
            },
            {
              "key": "X-Frame-Options",
              "value": "DENY"
            },
            {
              "key": "Content-Type",
              "value": "application/json"
            },
            {
              "key": "Transfer-Encoding",
              "value": "chunked"
            },
            {
              "key": "Date",
              "value": "Wed, 04 Nov 2026 08:04:15 GMT"
            },
            {
              "key": "Keep-Alive",
              "value": "timeout=60"
            },
            {
              "key": "Connection",
              "value": "keep-alive"
            }
          ],
          "cookie": [],
          "body": "{\n    \"createdDate\": \"2026-11-03T12:06:35.061558\",\n    \"createdBy\": 5,\n    \"lastModifiedDate\": \"2026-11-04T13:19:03.156311\",\n    \"lastModifiedBy\": 6,\n    \"empId\": 5,\n    \"empName\": \"Barath A\",\n    \"empEmail\": \"barath@gmail.com\",\n    \"empPassword\": \"$2a$10$qMbjwUA3241nMc7iQFe0mOpw.cwXo9t/f5BSYDZzWFNGwoOwm.CNO\",\n    \"empNumber\": 6329611562,\n    \"empSalary\": 20000,\n    \"department\": \"Frontend\",\n    \"empSkills\": [\n        \"HTML\",\n        \"CSS\",\n        \"JavaScript\"\n    ],\n    \"empAddress\": {\n        \"Area\": \"Anna nagar\",\n        \"Location\": \"Chennai\"\n    },\n    \"active\": true\n}"
        }
      ]
    },
    {
      "name": "updateEmpData",
      "request": {
        "method": "PUT",
        "header": [
          {
            "key": "Authorization",
            "value": "Bearer {{json_web_token}}",
            "type": "text"
          }
        ],
        "body": {
          "mode": "raw",
          "raw": "",
          "options": {
            "raw": {
              "language": "json"
            }
          }
        },
        "url": {
          "raw": "http://localhost:8080/api/employees/emp-update/1",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8080",
          "path": [
            "api",
            "employees",
            "emp-update",
            "1"
          ]
        }
      },
      "response": [
        {
          "name": "updateEmpData",
          "originalRequest": {
            "method": "PUT",
            "header": [
              {
                "key": "Authorization",
                "value": "Bearer {{json_web_token}}",
                "type": "text"
              }
            ],
            "body": {
              "mode": "raw",
              "raw": "{\r\n    \"empName\":\"Ashok\",\r\n    \"empEmail\":\"ashok@gmail.com\",\r\n    \"empPassword\":\"ashok123\",\r\n    \"empNumber\":636911002,\r\n    \"empSalary\":20000,\r\n    \"department\":\"Backend\",\r\n    \"empSkills\":[\r\n        \"Python\"\r\n    ],\r\n    \"empAddress\":{\r\n        \"Area\":\"Kelambakkam\",\r\n        \"Location\":\"Chennai\"\r\n    },\r\n    \"status\":true\r\n    }\r\n\r\n",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": {
              "raw": "http://localhost:8080/api/employees/update/38",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "employees",
                "update",
                "38"
              ]
            }
          },
          "status": "OK",
          "code": 200,
          "_postman_previewlanguage": "Text",
          "header": [
            {
              "key": "Vary",
              "value": "Origin"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Method"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Headers"
            },
            {
              "key": "X-Content-Type-Options",
              "value": "nosniff"
            },
            {
              "key": "X-XSS-Protection",
              "value": "0"
            },
            {
              "key": "Cache-Control",
              "value": "no-cache, no-store, max-age=0, must-revalidate"
            },
            {
              "key": "Pragma",
              "value": "no-cache"
            },
            {
              "key": "Expires",
              "value": "0"
            },
            {
              "key": "X-Frame-Options",
              "value": "DENY"
            },
            {
              "key": "Content-Type",
              "value": "application/json"
            },
            {
              "key": "Transfer-Encoding",
              "value": "chunked"
            },
            {
              "key": "Date",
              "value": "Mon, 02 Nov 2026 05:57:47 GMT"
            },
            {
              "key": "Keep-Alive",
              "value": "timeout=60"
            },
            {
              "key": "Connection",
              "value": "keep-alive"
            }
          ],
          "cookie": [],
          "body": "{\n    \"createdDate\": \"2026-11-02T11:15:57.967352\",\n    \"createdBy\": \"Prakash\",\n    \"lastModifiedDate\": \"2026-11-02T11:27:47.5430188\",\n    \"lastModifiedBy\": \"Prakash\",\n    \"empId\": 38,\n    \"empName\": \"Ashok\",\n    \"empEmail\": \"krishna@gmail.com\",\n    \"empPassword\": \"ashok123\",\n    \"empNumber\": 636911002,\n    \"empSalary\": 20000,\n    \"department\": \"Backend\",\n    \"empSkills\": [\n        \"HTML\",\n        \"CSS\",\n        \"JavaScript\",\n        \"Java\",\n        \"Spring Boot\",\n        \"PostgreSQL\"\n    ],\n    \"empAddress\": {\n        \"Area\": \"Kelambakkam\",\n        \"Location\": \"Chennai\"\n    },\n    \"active\": true\n}"
        },
        {
          "name": "updateEmpData",
          "originalRequest": {
            "method": "PUT",
            "header": [
              {
                "key": "Authorization",
                "value": "Bearer {{json_web_token}}",
                "type": "text"
              }
            ],
            "body": {
              "mode": "raw",
              "raw": "{\r\n    \"empSalary\": 50000\r\n}",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": {
              "raw": "http://localhost:8080/api/employees/update/1",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "employees",
                "update",
                "1"
              ]
            }
          },
          "status": "OK",
          "code": 200,
          "_postman_previewlanguage": "Text",
          "header": [
            {
              "key": "Vary",
              "value": "Origin"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Method"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Headers"
            },
            {
              "key": "X-Content-Type-Options",
              "value": "nosniff"
            },
            {
              "key": "X-XSS-Protection",
              "value": "0"
            },
            {
              "key": "Cache-Control",
              "value": "no-cache, no-store, max-age=0, must-revalidate"
            },
            {
              "key": "Pragma",
              "value": "no-cache"
            },
            {
              "key": "Expires",
              "value": "0"
            },
            {
              "key": "X-Frame-Options",
              "value": "DENY"
            },
            {
              "key": "Content-Type",
              "value": "application/json"
            },
            {
              "key": "Transfer-Encoding",
              "value": "chunked"
            },
            {
              "key": "Date",
              "value": "Wed, 04 Nov 2026 07:18:10 GMT"
            },
            {
              "key": "Keep-Alive",
              "value": "timeout=60"
            },
            {
              "key": "Connection",
              "value": "keep-alive"
            }
          ],
          "cookie": [],
          "body": "{\n    \"createdDate\": \"2026-11-03T12:03:31.117557\",\n    \"createdBy\": 5,\n    \"lastModifiedDate\": \"2026-11-03T12:03:31.117557\",\n    \"lastModifiedBy\": 5,\n    \"empId\": 1,\n    \"empName\": \"Subash P\",\n    \"empEmail\": \"ictsubashsp@gmail.com\",\n    \"empPassword\": \"$2a$10$mjfJqmTjyPC32WHPi8owQuPyA9/BHzt9P/xajsjL2P8fFDNGInFP.\",\n    \"empNumber\": 7812800482,\n    \"empSalary\": 50000,\n    \"department\": \"Testing\",\n    \"empSkills\": [\n        \"HTML\",\n        \"CSS\",\n        \"JavaScript\",\n        \"Java\",\n        \"Spring Boot\",\n        \"PostgreSQL\"\n    ],\n    \"empAddress\": {\n        \"Area\": \"Anna nagar\",\n        \"Location\": \"Chennai\"\n    },\n    \"active\": true\n}"
        }
      ]
    },
    {
      "name": "deleteEmpData",
      "request": {
        "method": "DELETE",
        "header": [
          {
            "key": "Authorization",
            "value": "Bearer {{json_web_token}}",
            "type": "text"
          }
        ],
        "url": {
          "raw": "http://localhost:8080/api/employees/delete/3",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8080",
          "path": [
            "api",
            "employees",
            "delete",
            "3"
          ]
        }
      },
      "response": [
        {
          "name": "deleteEmpData",
          "originalRequest": {
            "method": "DELETE",
            "header": [
              {
                "key": "Authorization",
                "value": "Bearer {{json_web_token}}",
                "type": "text"
              }
            ],
            "url": {
              "raw": "http://localhost:8080/api/employees/delete/3",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "employees",
                "delete",
                "3"
              ]
            }
          },
          "status": "OK",
          "code": 200,
          "_postman_previewlanguage": "Text",
          "header": [
            {
              "key": "Vary",
              "value": "Origin"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Method"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Headers"
            },
            {
              "key": "X-Content-Type-Options",
              "value": "nosniff"
            },
            {
              "key": "X-XSS-Protection",
              "value": "0"
            },
            {
              "key": "Cache-Control",
              "value": "no-cache, no-store, max-age=0, must-revalidate"
            },
            {
              "key": "Pragma",
              "value": "no-cache"
            },
            {
              "key": "Expires",
              "value": "0"
            },
            {
              "key": "X-Frame-Options",
              "value": "DENY"
            },
            {
              "key": "Content-Type",
              "value": "application/json"
            },
            {
              "key": "Transfer-Encoding",
              "value": "chunked"
            },
            {
              "key": "Date",
              "value": "Wed, 04 Nov 2026 07:19:32 GMT"
            },
            {
              "key": "Keep-Alive",
              "value": "timeout=60"
            },
            {
              "key": "Connection",
              "value": "keep-alive"
            }
          ],
          "cookie": [],
          "body": "{\n    \"createdDate\": \"2026-11-03T12:05:06.077693\",\n    \"createdBy\": 5,\n    \"lastModifiedDate\": \"2026-11-03T12:05:06.077693\",\n    \"lastModifiedBy\": 5,\n    \"empId\": 3,\n    \"empName\": \"Balu\",\n    \"empEmail\": \"balu123@gmail.com\",\n    \"empPassword\": \"$2a$10$0NMPfnGNrONtyQO5c/u.ReZhtemZudK2jqCBOExVt2XUlrBqEB3ue\",\n    \"empNumber\": 6369673562,\n    \"empSalary\": 50000,\n    \"department\": \"Backend\",\n    \"empSkills\": [\n        \"Java\",\n        \"Spring Boot\",\n        \"PostgreSQL\"\n    ],\n    \"empAddress\": {\n        \"Area\": \"Anna nagar\",\n        \"Location\": \"Chennai\"\n    },\n    \"active\": true\n}"
        }
      ]
    },
    {
      "name": "softDelete",
      "request": {
        "method": "DELETE",
        "header": [
          {
            "key": "Authorization",
            "value": "Bearer {{json_web_token}}",
            "type": "text"
          }
        ],
        "url": {
          "raw": "http://localhost:8080/api/employees/softDelete/3",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8080",
          "path": [
            "api",
            "employees",
            "softDelete",
            "3"
          ]
        }
      },
      "response": [
        {
          "name": "softDelete",
          "originalRequest": {
            "method": "DELETE",
            "header": [
              {
                "key": "Authorization",
                "value": "Bearer {{json_web_token}}",
                "type": "text"
              }
            ],
            "url": {
              "raw": "http://localhost:8080/api/employees/softDelete/5",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "employees",
                "softDelete",
                "5"
              ]
            }
          },
          "status": "OK",
          "code": 200,
          "_postman_previewlanguage": "Text",
          "header": [
            {
              "key": "Vary",
              "value": "Origin"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Method"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Headers"
            },
            {
              "key": "X-Content-Type-Options",
              "value": "nosniff"
            },
            {
              "key": "X-XSS-Protection",
              "value": "0"
            },
            {
              "key": "Cache-Control",
              "value": "no-cache, no-store, max-age=0, must-revalidate"
            },
            {
              "key": "Pragma",
              "value": "no-cache"
            },
            {
              "key": "Expires",
              "value": "0"
            },
            {
              "key": "X-Frame-Options",
              "value": "DENY"
            },
            {
              "key": "Content-Type",
              "value": "application/json"
            },
            {
              "key": "Transfer-Encoding",
              "value": "chunked"
            },
            {
              "key": "Date",
              "value": "Wed, 04 Nov 2026 07:21:27 GMT"
            },
            {
              "key": "Keep-Alive",
              "value": "timeout=60"
            },
            {
              "key": "Connection",
              "value": "keep-alive"
            }
          ],
          "cookie": [],
          "body": "{\n    \"createdDate\": \"2026-11-03T12:06:35.061558\",\n    \"createdBy\": 5,\n    \"lastModifiedDate\": \"2026-11-04T12:51:27.7676593\",\n    \"lastModifiedBy\": 6,\n    \"empId\": 5,\n    \"empName\": \"Barath A\",\n    \"empEmail\": \"barath@gmail.com\",\n    \"empPassword\": \"$2a$10$qMbjwUA3241nMc7iQFe0mOpw.cwXo9t/f5BSYDZzWFNGwoOwm.CNO\",\n    \"empNumber\": 6329611562,\n    \"empSalary\": 20000,\n    \"department\": \"Frontend\",\n    \"empSkills\": [\n        \"HTML\",\n        \"CSS\",\n        \"JavaScript\"\n    ],\n    \"empAddress\": {\n        \"Area\": \"Anna nagar\",\n        \"Location\": \"Chennai\"\n    },\n    \"active\": false\n}"
        },
        {
          "name": "softDelete",
          "originalRequest": {
            "method": "DELETE",
            "header": [
              {
                "key": "Authorization",
                "value": "Bearer {{json_web_token}}",
                "type": "text"
              }
            ],
            "url": {
              "raw": "http://localhost:8080/api/employees/softDelete/7",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "employees",
                "softDelete",
                "7"
              ]
            }
          },
          "status": "OK",
          "code": 200,
          "_postman_previewlanguage": "Text",
          "header": [
            {
              "key": "Vary",
              "value": "Origin"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Method"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Headers"
            },
            {
              "key": "X-Content-Type-Options",
              "value": "nosniff"
            },
            {
              "key": "X-XSS-Protection",
              "value": "0"
            },
            {
              "key": "Cache-Control",
              "value": "no-cache, no-store, max-age=0, must-revalidate"
            },
            {
              "key": "Pragma",
              "value": "no-cache"
            },
            {
              "key": "Expires",
              "value": "0"
            },
            {
              "key": "X-Frame-Options",
              "value": "DENY"
            },
            {
              "key": "Content-Type",
              "value": "application/json"
            },
            {
              "key": "Transfer-Encoding",
              "value": "chunked"
            },
            {
              "key": "Date",
              "value": "Wed, 04 Nov 2026 07:22:27 GMT"
            },
            {
              "key": "Keep-Alive",
              "value": "timeout=60"
            },
            {
              "key": "Connection",
              "value": "keep-alive"
            }
          ],
          "cookie": [],
          "body": "{\n    \"createdDate\": \"2026-11-04T11:18:24.761346\",\n    \"createdBy\": 6,\n    \"lastModifiedDate\": \"2026-11-04T12:52:26.9550078\",\n    \"lastModifiedBy\": 6,\n    \"empId\": 7,\n    \"empName\": \"Aravindhan P\",\n    \"empEmail\": \"aravindjadeja807@gmail.com\",\n    \"empPassword\": \"$2a$10$.hbQ1GZQ8LlDsgIR1AE03OlyoLvNshaMwrJ.Zz2.leQaut3gOgsRy\",\n    \"empNumber\": 6329001502,\n    \"empSalary\": 20000,\n    \"department\": \"Frontend\",\n    \"empSkills\": [\n        \"HTML\",\n        \"CSS\",\n        \"JavaScript\"\n    ],\n    \"empAddress\": {\n        \"Area\": \"Anna nagar\",\n        \"Location\": \"Chennai\"\n    },\n    \"active\": false\n}"
        }
      ]
    },
    {
      "name": "restoreEmployee",
      "request": {
        "method": "PATCH",
        "header": [
          {
            "key": "Authorization",
            "value": "Bearer {{json_web_token}}",
            "type": "text"
          }
        ],
        "url": {
          "raw": "http://localhost:8080/api/employees/restore/4",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8080",
          "path": [
            "api",
            "employees",
            "restore",
            "4"
          ]
        }
      },
      "response": [
        {
          "name": "restoreEmployee",
          "originalRequest": {
            "method": "PATCH",
            "header": [
              {
                "key": "Authorization",
                "value": "Bearer {{json_web_token}}",
                "type": "text"
              },
              {
                "key": "",
                "value": "",
                "type": "text",
                "disabled": true
              }
            ],
            "url": {
              "raw": "http://localhost:8080/api/employees/restore/5",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "employees",
                "restore",
                "5"
              ]
            }
          },
          "status": "OK",
          "code": 200,
          "_postman_previewlanguage": "Text",
          "header": [
            {
              "key": "Vary",
              "value": "Origin"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Method"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Headers"
            },
            {
              "key": "X-Content-Type-Options",
              "value": "nosniff"
            },
            {
              "key": "X-XSS-Protection",
              "value": "0"
            },
            {
              "key": "Cache-Control",
              "value": "no-cache, no-store, max-age=0, must-revalidate"
            },
            {
              "key": "Pragma",
              "value": "no-cache"
            },
            {
              "key": "Expires",
              "value": "0"
            },
            {
              "key": "X-Frame-Options",
              "value": "DENY"
            },
            {
              "key": "Content-Type",
              "value": "text/plain;charset=UTF-8"
            },
            {
              "key": "Content-Length",
              "value": "22"
            },
            {
              "key": "Date",
              "value": "Wed, 04 Nov 2026 07:49:03 GMT"
            },
            {
              "key": "Keep-Alive",
              "value": "timeout=60"
            },
            {
              "key": "Connection",
              "value": "keep-alive"
            }
          ],
          "cookie": [],
          "body": "Employee is active now"
        }
      ]
    },
    {
      "name": "getByEmployeeKeyword",
      "request": {
        "method": "GET",
        "header": [
          {
            "key": "Authorization",
            "value": "Bearer {{json_web_token}}",
            "type": "text"
          }
        ],
        "url": {
          "raw": "http://localhost:8080/api/employees/keyword?empName=Vani",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8080",
          "path": [
            "api",
            "employees",
            "keyword"
          ],
          "query": [
            {
              "key": "empEmail",
              "value": "babub@gmail.com",
              "type": "text",
              "disabled": true
            },
            {
              "key": "empName",
              "value": "Vani",
              "type": "text"
            }
          ]
        }
      },
      "response": [
        {
          "name": "getByEmployeeKeyword",
          "originalRequest": {
            "method": "GET",
            "header": [
              {
                "key": "Authorization",
                "value": "Bearer {{json_web_token}}",
                "type": "text"
              }
            ],
            "url": {
              "raw": "http://localhost:8080/api/employees/key?name=aravind232004@gmail.com",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "employees",
                "key"
              ],
              "query": [
                {
                  "key": "name",
                  "value": "aravind232004@gmail.com"
                }
              ]
            }
          },
          "status": "OK",
          "code": 200,
          "_postman_previewlanguage": "Text",
          "header": [
            {
              "key": "Vary",
              "value": "Origin"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Method"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Headers"
            },
            {
              "key": "X-Content-Type-Options",
              "value": "nosniff"
            },
            {
              "key": "X-XSS-Protection",
              "value": "0"
            },
            {
              "key": "Cache-Control",
              "value": "no-cache, no-store, max-age=0, must-revalidate"
            },
            {
              "key": "Pragma",
              "value": "no-cache"
            },
            {
              "key": "Expires",
              "value": "0"
            },
            {
              "key": "X-Frame-Options",
              "value": "DENY"
            },
            {
              "key": "Content-Type",
              "value": "application/json"
            },
            {
              "key": "Transfer-Encoding",
              "value": "chunked"
            },
            {
              "key": "Date",
              "value": "Wed, 04 Nov 2026 07:54:11 GMT"
            },
            {
              "key": "Keep-Alive",
              "value": "timeout=60"
            },
            {
              "key": "Connection",
              "value": "keep-alive"
            }
          ],
          "cookie": [],
          "body": "{\n    \"createdDate\": \"2026-11-04T11:17:49.566884\",\n    \"createdBy\": 6,\n    \"lastModifiedDate\": \"2026-11-04T11:17:49.566884\",\n    \"lastModifiedBy\": 6,\n    \"empId\": 6,\n    \"empName\": \"Aravindhan P\",\n    \"empEmail\": \"aravind232004@gmail.com\",\n    \"empPassword\": \"$2a$10$0X2KJP25kAt3jRb90.zfSO8Q2EmKvwzcYoujqT2tooSwFIlaykpuS\",\n    \"empNumber\": 6329001562,\n    \"empSalary\": 20000,\n    \"department\": \"Frontend\",\n    \"empSkills\": [\n        \"HTML\",\n        \"CSS\",\n        \"JavaScript\"\n    ],\n    \"empAddress\": {\n        \"Area\": \"Anna nagar\",\n        \"Location\": \"Chennai\"\n    },\n    \"active\": true\n}"
        }
      ]
    },
    {
      "name": "Department",
      "request": {
        "method": "GET",
        "header": [],
        "url": {
          "raw": ""
        }
      },
      "response": [
        {
          "name": "Department",
          "originalRequest": {
            "method": "GET",
            "header": [
              {
                "key": "Authorization",
                "value": "Bearer {{json_web_token}}",
                "type": "text"
              }
            ],
            "body": {
              "mode": "raw",
              "raw": "",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": {
              "raw": "http://localhost:8080/api/employees/department/Frontend",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "employees",
                "department",
                "Frontend"
              ],
              "query": [
                {
                  "key": "department",
                  "value": "Backend",
                  "disabled": true
                }
              ]
            }
          },
          "status": "OK",
          "code": 200,
          "_postman_previewlanguage": "Text",
          "header": [
            {
              "key": "Vary",
              "value": "Origin"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Method"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Headers"
            },
            {
              "key": "X-Content-Type-Options",
              "value": "nosniff"
            },
            {
              "key": "X-XSS-Protection",
              "value": "0"
            },
            {
              "key": "Cache-Control",
              "value": "no-cache, no-store, max-age=0, must-revalidate"
            },
            {
              "key": "Pragma",
              "value": "no-cache"
            },
            {
              "key": "Expires",
              "value": "0"
            },
            {
              "key": "X-Frame-Options",
              "value": "DENY"
            },
            {
              "key": "Content-Type",
              "value": "application/json"
            },
            {
              "key": "Transfer-Encoding",
              "value": "chunked"
            },
            {
              "key": "Date",
              "value": "Wed, 04 Nov 2026 07:54:57 GMT"
            },
            {
              "key": "Keep-Alive",
              "value": "timeout=60"
            },
            {
              "key": "Connection",
              "value": "keep-alive"
            }
          ],
          "cookie": [],
          "body": "[\n    {\n        \"createdDate\": \"2026-11-03T12:06:01.42986\",\n        \"createdBy\": 5,\n        \"lastModifiedDate\": \"2026-11-03T12:06:01.42986\",\n        \"lastModifiedBy\": 5,\n        \"empId\": 4,\n        \"empName\": \"Veni\",\n        \"empEmail\": \"veni@gmail.com\",\n        \"empPassword\": \"$2a$10$tB0NNzZ6bGVXdy7ZPyuhMOZhikmYOLviIYVGG3KMQ2FeeKDCadSEq\",\n        \"empNumber\": 6329673562,\n        \"empSalary\": 20000,\n        \"department\": \"Frontend\",\n        \"empSkills\": [\n            \"HTML\",\n            \"CSS\",\n            \"JavaScript\"\n        ],\n        \"empAddress\": {\n            \"Area\": \"Anna nagar\",\n            \"Location\": \"Chennai\"\n        },\n        \"active\": true\n    },\n    {\n        \"createdDate\": \"2026-11-04T11:17:49.566884\",\n        \"createdBy\": 6,\n        \"lastModifiedDate\": \"2026-11-04T11:17:49.566884\",\n        \"lastModifiedBy\": 6,\n        \"empId\": 6,\n        \"empName\": \"Aravindhan P\",\n        \"empEmail\": \"aravind232004@gmail.com\",\n        \"empPassword\": \"$2a$10$0X2KJP25kAt3jRb90.zfSO8Q2EmKvwzcYoujqT2tooSwFIlaykpuS\",\n        \"empNumber\": 6329001562,\n        \"empSalary\": 20000,\n        \"department\": \"Frontend\",\n        \"empSkills\": [\n            \"HTML\",\n            \"CSS\",\n            \"JavaScript\"\n        ],\n        \"empAddress\": {\n            \"Area\": \"Anna nagar\",\n            \"Location\": \"Chennai\"\n        },\n        \"active\": true\n    },\n    {\n        \"createdDate\": \"2026-11-04T11:18:24.761346\",\n        \"createdBy\": 6,\n        \"lastModifiedDate\": \"2026-11-04T12:52:26.955008\",\n        \"lastModifiedBy\": 6,\n        \"empId\": 7,\n        \"empName\": \"Aravindhan P\",\n        \"empEmail\": \"aravindjadeja807@gmail.com\",\n        \"empPassword\": \"$2a$10$.hbQ1GZQ8LlDsgIR1AE03OlyoLvNshaMwrJ.Zz2.leQaut3gOgsRy\",\n        \"empNumber\": 6329001502,\n        \"empSalary\": 20000,\n        \"department\": \"Frontend\",\n        \"empSkills\": [\n            \"HTML\",\n            \"CSS\",\n            \"JavaScript\"\n        ],\n        \"empAddress\": {\n            \"Area\": \"Anna nagar\",\n            \"Location\": \"Chennai\"\n        },\n        \"active\": false\n    },\n    {\n        \"createdDate\": \"2026-11-03T12:06:35.061558\",\n        \"createdBy\": 5,\n        \"lastModifiedDate\": \"2026-11-04T13:19:03.156311\",\n        \"lastModifiedBy\": 6,\n        \"empId\": 5,\n        \"empName\": \"Barath A\",\n        \"empEmail\": \"barath@gmail.com\",\n        \"empPassword\": \"$2a$10$qMbjwUA3241nMc7iQFe0mOpw.cwXo9t/f5BSYDZzWFNGwoOwm.CNO\",\n        \"empNumber\": 6329611562,\n        \"empSalary\": 20000,\n        \"department\": \"Frontend\",\n        \"empSkills\": [\n            \"HTML\",\n            \"CSS\",\n            \"JavaScript\"\n        ],\n        \"empAddress\": {\n            \"Area\": \"Anna nagar\",\n            \"Location\": \"Chennai\"\n        },\n        \"active\": true\n    }\n]"
        },
        {
          "name": "Department",
          "originalRequest": {
            "method": "GET",
            "header": [
              {
                "key": "Authorization",
                "value": "Bearer {{json_web_token}}",
                "type": "text"
              }
            ],
            "body": {
              "mode": "raw",
              "raw": "",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": {
              "raw": "http://localhost:8080/api/employees/department/Testing",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "employees",
                "department",
                "Testing"
              ],
              "query": [
                {
                  "key": "department",
                  "value": "Backend",
                  "disabled": true
                }
              ]
            }
          },
          "status": "OK",
          "code": 200,
          "_postman_previewlanguage": "Text",
          "header": [
            {
              "key": "Vary",
              "value": "Origin"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Method"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Headers"
            },
            {
              "key": "X-Content-Type-Options",
              "value": "nosniff"
            },
            {
              "key": "X-XSS-Protection",
              "value": "0"
            },
            {
              "key": "Cache-Control",
              "value": "no-cache, no-store, max-age=0, must-revalidate"
            },
            {
              "key": "Pragma",
              "value": "no-cache"
            },
            {
              "key": "Expires",
              "value": "0"
            },
            {
              "key": "X-Frame-Options",
              "value": "DENY"
            },
            {
              "key": "Content-Type",
              "value": "application/json"
            },
            {
              "key": "Transfer-Encoding",
              "value": "chunked"
            },
            {
              "key": "Date",
              "value": "Wed, 04 Nov 2026 07:55:34 GMT"
            },
            {
              "key": "Keep-Alive",
              "value": "timeout=60"
            },
            {
              "key": "Connection",
              "value": "keep-alive"
            }
          ],
          "cookie": [],
          "body": "[\n    {\n        \"createdDate\": \"2026-11-03T12:03:31.117557\",\n        \"createdBy\": 5,\n        \"lastModifiedDate\": \"2026-11-03T12:03:31.117557\",\n        \"lastModifiedBy\": 5,\n        \"empId\": 1,\n        \"empName\": \"Subash P\",\n        \"empEmail\": \"ictsubashsp@gmail.com\",\n        \"empPassword\": \"$2a$10$mjfJqmTjyPC32WHPi8owQuPyA9/BHzt9P/xajsjL2P8fFDNGInFP.\",\n        \"empNumber\": 7812800482,\n        \"empSalary\": 50000,\n        \"department\": \"Testing\",\n        \"empSkills\": [\n            \"HTML\",\n            \"CSS\",\n            \"JavaScript\",\n            \"Java\",\n            \"Spring Boot\",\n            \"PostgreSQL\"\n        ],\n        \"empAddress\": {\n            \"Area\": \"Anna nagar\",\n            \"Location\": \"Chennai\"\n        },\n        \"active\": true\n    },\n    {\n        \"createdDate\": \"2026-11-04T12:39:57.590868\",\n        \"createdBy\": 6,\n        \"lastModifiedDate\": \"2026-11-04T12:39:57.590868\",\n        \"lastModifiedBy\": 6,\n        \"empId\": 8,\n        \"empName\": \"Joseph\",\n        \"empEmail\": \"josephjp@gmail.com\",\n        \"empPassword\": \"$2a$10$Ox7u/IglkcEhGbr5riAeh.QIxvSI9hR0h3kLx2BxiN0uqRsKuBSY2\",\n        \"empNumber\": 6322001502,\n        \"empSalary\": 30000,\n        \"department\": \"Testing\",\n        \"empSkills\": [\n            \"HTML\",\n            \"CSS\",\n            \"JavaScript\",\n            \"Java\",\n            \"Spring Boot\"\n        ],\n        \"empAddress\": {\n            \"Area\": \"Anna nagar\",\n            \"Location\": \"Chennai\"\n        },\n        \"active\": true\n    }\n]"
        }
      ]
    },
    {
      "name": "getEmployeeAdditionalInfo",
      "request": {
        "method": "GET",
        "header": [
          {
            "key": "Authorization",
            "value": "Bearer {{json_web_token}}",
            "type": "text"
          }
        ],
        "url": {
          "raw": "http://localhost:8080/api/employees/8/additional-details",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8080",
          "path": [
            "api",
            "employees",
            "8",
            "additional-details"
          ]
        }
      },
      "response": [
        {
          "name": "getEmployeeAdditionalInfo",
          "originalRequest": {
            "method": "GET",
            "header": [
              {
                "key": "Authorization",
                "value": "Bearer {{json_web_token}}",
                "type": "text"
              }
            ],
            "url": {
              "raw": "http://localhost:8080/api/employees/additional-details/8",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "employees",
                "additional-details",
                "8"
              ]
            }
          },
          "status": "OK",
          "code": 200,
          "_postman_previewlanguage": "Text",
          "header": [
            {
              "key": "Vary",
              "value": "Origin"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Method"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Headers"
            },
            {
              "key": "X-Content-Type-Options",
              "value": "nosniff"
            },
            {
              "key": "X-XSS-Protection",
              "value": "0"
            },
            {
              "key": "Cache-Control",
              "value": "no-cache, no-store, max-age=0, must-revalidate"
            },
            {
              "key": "Pragma",
              "value": "no-cache"
            },
            {
              "key": "Expires",
              "value": "0"
            },
            {
              "key": "X-Frame-Options",
              "value": "DENY"
            },
            {
              "key": "Content-Type",
              "value": "application/json"
            },
            {
              "key": "Transfer-Encoding",
              "value": "chunked"
            },
            {
              "key": "Date",
              "value": "Wed, 04 Nov 2026 07:59:06 GMT"
            },
            {
              "key": "Keep-Alive",
              "value": "timeout=60"
            },
            {
              "key": "Connection",
              "value": "keep-alive"
            }
          ],
          "cookie": [],
          "body": "{\n    \"address\": {\n        \"Area\": \"Anna nagar\",\n        \"Location\": \"Chennai\"\n    },\n    \"skills\": [\n        \"HTML\",\n        \"CSS\",\n        \"JavaScript\",\n        \"Java\",\n        \"Spring Boot\"\n    ]\n}"
        }
      ]
    },
    {
      "name": "updateEmployeeSkills",
      "request": {
        "method": "PATCH",
        "header": [
          {
            "key": "Authorization",
            "value": "Bearer {{json_web_token}}",
            "type": "text"
          }
        ],
        "body": {
          "mode": "raw",
          "raw": "[\r\n    \"Python\"\r\n]",
          "options": {
            "raw": {
              "language": "json"
            }
          }
        },
        "url": {
          "raw": "http://localhost:8080/api/employees/skills/1",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8080",
          "path": [
            "api",
            "employees",
            "skills",
            "1"
          ]
        }
      },
      "response": [
        {
          "name": "updateEmployeeSkills",
          "originalRequest": {
            "method": "PATCH",
            "header": [
              {
                "key": "Authorization",
                "value": "Bearer {{json_web_token}}",
                "type": "text"
              }
            ],
            "body": {
              "mode": "raw",
              "raw": "[\r\n    \"Python\"\r\n]",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": {
              "raw": "http://localhost:8080/api/employees/skills/1",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "employees",
                "skills",
                "1"
              ]
            }
          },
          "status": "OK",
          "code": 200,
          "_postman_previewlanguage": "Text",
          "header": [
            {
              "key": "Vary",
              "value": "Origin",
              "uuid": "dcf217f7-5b37-4475-aa94-18900f029420"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Method",
              "uuid": "dcf217f7-5b37-4475-aa94-18900f029420"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Headers",
              "uuid": "dcf217f7-5b37-4475-aa94-18900f029420"
            },
            {
              "key": "X-Content-Type-Options",
              "value": "nosniff",
              "uuid": "977c8510-f6f0-42a7-bea5-ea14cfbc5483"
            },
            {
              "key": "X-XSS-Protection",
              "value": "0",
              "uuid": "307286e5-248e-4e31-b006-f710eb0c32df"
            },
            {
              "key": "Cache-Control",
              "value": "no-cache, no-store, max-age=0, must-revalidate",
              "uuid": "ec10f8cc-10d4-4b1d-b14c-ff3e928dc0ca"
            },
            {
              "key": "Pragma",
              "value": "no-cache",
              "uuid": "b5d9fac2-93b6-4af7-8076-a2efe0838b46"
            },
            {
              "key": "Expires",
              "value": "0",
              "uuid": "8d046103-2d32-46a6-ae60-bc11b043a38d"
            },
            {
              "key": "X-Frame-Options",
              "value": "DENY",
              "uuid": "37fb026a-9c43-4999-bbcd-6252aa2a1c8b"
            },
            {
              "key": "Content-Type",
              "value": "application/json",
              "uuid": "48720b21-1c5a-4216-adc7-b0e5d5996fe4"
            },
            {
              "key": "Transfer-Encoding",
              "value": "chunked",
              "uuid": "b0f13c88-0d95-4967-b8ff-a9bd465e1daf"
            },
            {
              "key": "Date",
              "value": "Wed, 04 Nov 2026 08:01:26 GMT",
              "uuid": "3a689db7-87a9-49dc-9fe4-8ab35ceea372"
            },
            {
              "key": "Keep-Alive",
              "value": "timeout=60",
              "uuid": "1c8441a1-1a35-4096-93af-b38a0bef88db"
            },
            {
              "key": "Connection",
              "value": "keep-alive",
              "uuid": "bc3b2a1e-39df-4b78-8feb-aadebc3bacdd"
            }
          ],
          "cookie": [],
          "body": "{\n    \"createdDate\": \"2026-11-03T12:03:31.117557\",\n    \"createdBy\": 5,\n    \"lastModifiedDate\": \"2026-11-04T13:31:26.4371267\",\n    \"lastModifiedBy\": 6,\n    \"empId\": 1,\n    \"empName\": \"Subash P\",\n    \"empEmail\": \"ictsubashsp@gmail.com\",\n    \"empPassword\": \"$2a$10$mjfJqmTjyPC32WHPi8owQuPyA9/BHzt9P/xajsjL2P8fFDNGInFP.\",\n    \"empNumber\": 7812800482,\n    \"empSalary\": 50000,\n    \"department\": \"Testing\",\n    \"empSkills\": [\n        \"HTML\",\n        \"CSS\",\n        \"JavaScript\",\n        \"Java\",\n        \"Spring Boot\",\n        \"PostgreSQL\",\n        \"Python\"\n    ],\n    \"empAddress\": {\n        \"Area\": \"Anna nagar\",\n        \"Location\": \"Chennai\"\n    },\n    \"active\": true\n}"
        }
      ]
    },
    {
      "name": "updateEmployeeAddress",
      "request": {
        "method": "PATCH",
        "header": [
          {
            "key": "Authorization",
            "value": "Bearer {{json_web_token}}",
            "type": "text"
          }
        ],
        "body": {
          "mode": "raw",
          "raw": "",
          "options": {
            "raw": {
              "language": "json"
            }
          }
        },
        "url": {
          "raw": "http://localhost:8080/api/employees/address/16",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8080",
          "path": [
            "api",
            "employees",
            "address",
            "16"
          ]
        }
      },
      "response": [
        {
          "name": "updateEmployeeAddress",
          "originalRequest": {
            "method": "PATCH",
            "header": [
              {
                "key": "Authorization",
                "value": "Bearer {{json_web_token}}",
                "type": "text"
              }
            ],
            "body": {
              "mode": "raw",
              "raw": "{\r\n    \"Area\":\"T Nagar\"\r\n}",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": {
              "raw": "http://localhost:8080/api/employees/address/8",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "employees",
                "address",
                "8"
              ]
            }
          },
          "status": "OK",
          "code": 200,
          "_postman_previewlanguage": "Text",
          "header": [
            {
              "key": "Vary",
              "value": "Origin"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Method"
            },
            {
              "key": "Vary",
              "value": "Access-Control-Request-Headers"
            },
            {
              "key": "X-Content-Type-Options",
              "value": "nosniff"
            },
            {
              "key": "X-XSS-Protection",
              "value": "0"
            },
            {
              "key": "Cache-Control",
              "value": "no-cache, no-store, max-age=0, must-revalidate"
            },
            {
              "key": "Pragma",
              "value": "no-cache"
            },
            {
              "key": "Expires",
              "value": "0"
            },
            {
              "key": "X-Frame-Options",
              "value": "DENY"
            },
            {
              "key": "Content-Type",
              "value": "application/json"
            },
            {
              "key": "Transfer-Encoding",
              "value": "chunked"
            },
            {
              "key": "Date",
              "value": "Wed, 04 Nov 2026 08:00:15 GMT"
            },
            {
              "key": "Keep-Alive",
              "value": "timeout=60"
            },
            {
              "key": "Connection",
              "value": "keep-alive"
            }
          ],
          "cookie": [],
          "body": "{\n    \"createdDate\": \"2026-11-04T12:39:57.590868\",\n    \"createdBy\": 6,\n    \"lastModifiedDate\": \"2026-11-04T13:30:15.0755974\",\n    \"lastModifiedBy\": 6,\n    \"empId\": 8,\n    \"empName\": \"Joseph\",\n    \"empEmail\": \"josephjp@gmail.com\",\n    \"empPassword\": \"$2a$10$Ox7u/IglkcEhGbr5riAeh.QIxvSI9hR0h3kLx2BxiN0uqRsKuBSY2\",\n    \"empNumber\": 6322001502,\n    \"empSalary\": 30000,\n    \"department\": \"Testing\",\n    \"empSkills\": [\n        \"HTML\",\n        \"CSS\",\n        \"JavaScript\",\n        \"Java\",\n        \"Spring Boot\"\n    ],\n    \"empAddress\": {\n        \"Area\": \"T Nagar\",\n        \"Location\": \"Chennai\"\n    },\n    \"active\": true\n}"
        }
      ]
    }
  ]
}

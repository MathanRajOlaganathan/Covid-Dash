# Covid-Dashboard
A dashboard to track the  covid cases using Spring Boot and Java11 and I have used Travis CI for Continuous Integration and Continuous Deployment (CI/CD).

## Tech Stack

1. Java - 1.11

2. Maven - 3.x.x

3. Spring Boot - 2.3.X

4. BootStrap - 4.x.x

5. Thymeleaf

6. Jquery, Charts.js

## Requirements

* GitHub for code repository

* Docker Hub for publishing Docker images

* Travis CI for CI/CD

* Heroku for deploying the application

## Steps to Setup

**1. Clone the application**

```bash
https://github.com/MathanRajOlaganathan/Covid-Dash.git
```

**2. Build and run the app using maven**

```bash
cd Covid-Dash
mvn package
java -jar target/covid-dash-1.0.0.jar
```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```


**3. Run the app using docker**

```bash
docker pull mathanpointer/covid-ci-cd-process
docker run  -d -p 8080:8080  covid-ci-cd-process

```

The server will start at <http://localhost:8080>.

Running on Heroku https://covid19-dash-ci.herokuapp.com/

[![Build Status](https://travis-ci.com/MathanRajOlaganathan/Covid-Dash.svg?branch=master)](https://travis-ci.com/github/MathanRajOlaganathan/Covid-Dash)

I have used Travis CI for this project to do all the usual tasks such as:

* Checkout the latest code.
* Compile and run Junit and Integration Tests.
* Run JaCoCo code coverage.
* Built Docker image and publish it to Docker Hub.
* Deploy application on Heroku.


## Web APP Screenshots

**1.Login Screen**


![login](https://github.com/MathanRajOlaganathan/Covid-Dash/blob/master/src/main/resources/static/images/Login.jpg?raw=true)


**2.Register Screen**


![register](https://github.com/MathanRajOlaganathan/Covid-Dash/blob/master/src/main/resources/static/images/Register.jpg?raw=true)


**3.Dashboard**


![dashboard](https://github.com/MathanRajOlaganathan/Covid-Dash/blob/master/src/main/resources/static/images/Dash.jpg?raw=true)


**4.Charts**

![chart](https://github.com/MathanRajOlaganathan/Covid-Dash/blob/master/src/main/resources/static/images/Charts.jpg?raw=true)

**5.Symptoms**

![chart](https://github.com/MathanRajOlaganathan/Covid-Dash/blob/master/src/main/resources/static/images/Symptom.jpg?raw=true)






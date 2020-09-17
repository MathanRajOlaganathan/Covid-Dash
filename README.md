# Covid-Dashboard
A dashboard to track the  covid cases
## Requirements

1. Java - 1.11

2. Maven - 3.x.x

3. Spring Boot - 2.3.X

4. BootStrap - 4.x.x

5. Thymeleaf

6. Jquery, Charts.js

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

## Web APP Screenshots

**1.Login Screen**


![login](https://github.com/MathanRajOlaganathan/Covid-Dashboard/blob/master/src/main/resources/static/images/covid.jpg?raw=true)


**2.Register Screen**


![register](https://github.com/MathanRajOlaganathan/Covid-Dashboard/blob/master/src/main/resources/static/images/covid.jpg?raw=true)


**3.Dashboard**


![dashboard](https://github.com/MathanRajOlaganathan/Covid-Dashboard/blob/master/src/main/resources/static/images/covid.jpg?raw=true)


**4.Charts**

![chart](https://github.com/MathanRajOlaganathan/Covid-Dashboard/blob/master/src/main/resources/static/images/covid.jpg?raw=true)

**5.Symptoms**

![chart](https://github.com/MathanRajOlaganathan/Covid-Dashboard/blob/master/src/main/resources/static/images/covid.jpg?raw=true)






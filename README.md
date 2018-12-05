# open-credit

This project provides multiple APIs for accessing database.

## Getting Started

The following instruction will lead you how to use these APIs, whether you do it locally or remotely.

### Prerequisites

Install Java 8

```
brew tap caskroom/versions
```

```
brew cask install java8
```

## Using the APIs

The following will show the APIs we provided, and let you know how to try it.

### Health Check

```
curl -X GET "https://open-credit.herokuapp.com/"
```

Then, you would get the result like the following:

```
Backend Server is working...
```

### Get the shopping list

```
curl -X GET "https://open-credit.herokuapp.com/loan/{userId}/loan_model"
```

Then, you would get the result like the following:

```
[{"product":null,"apr":3.17,"fee":3000,"returnPrice":10605,"type":"vip"},{"product":null,"apr":3.17,"fee":3000,"returnPrice":10605,"type":"vip"},{"product":null,"apr":3.74,"fee":6000,"returnPrice":10778,"type":"vip"},{"product":null,"apr":3.2,"fee":2000,"returnPrice":10926,"type":"vip"},{"product":null,"apr":2.69,"fee":88,"returnPrice":10997,"type":"vip"}]
```
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

### Get basic information of user

```
curl -X GET "https://open-credit.herokuapp.com/loan/A123456789/basicInfo"
```

Then, you would get the result like the following:

```
{"identification":"A123456789","name":"快迪克","address":"台北市中山區民權東路一段 2 號11樓","bankList":[{"bankName":"上海商銀"},{"bankName":"王道銀行"},{"bankName":"渣打銀行"},{"bankName":"匯豐銀行"},{"bankName":"中國信託"}],"creditScore":""}
```

### Get the loan model list

```
curl -X GET "https://open-credit.herokuapp.com/loan/{userId}/loan_model"
```

Then, you would get the result like the following:

```
[{"product":"渣打銀行 尊爵專案 三師/公教/金融同業 客戶專屬","apr":3.17,"fee":3000,"returnPrice":10605,"type":"vip"},{"product":"渣打銀行 尊爵專案 Top 1,500績優企業 客戶專屬","apr":3.17,"fee":3000,"returnPrice":10605,"type":"vip"},{"product":"渣打銀行 優質客戶指數信貸","apr":3.74,"fee":6000,"returnPrice":10778,"type":"vip"},{"product":"上海銀行 優利貸","apr":3.2,"fee":2000,"returnPrice":10926,"type":"vip"},{"product":"王道銀行 科學園區獨享貸","apr":2.69,"fee":88,"returnPrice":10997,"type":"vip"}]
```
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

### Get bank list of user

```
curl -X GET "https://open-credit.herokuapp.com/loan/A123456789/banklist"
```

Then, you would get the result like the following:

```
{"banks":[{"bankName":"上海商銀"},{"bankName":"王道銀行"},{"bankName":"渣打銀行"},{"bankName":"匯豐銀行"},{"bankName":"中國信託"}]}
```

### Get loan history of user

```
curl -X GET "https://open-credit.herokuapp.com/loan/A123456789/loanHistory"
```

Then, you would get the result like the following:

```
{"loanHistorys":[{"identification":"A123456789","bank":"王道銀行","product":"王道銀行 科學園區獨享貸","apr":2.69,"fee":88,"returnPrice":10997,"totalPrice":500000,"repayStaging":10,"staging":24,"startDate":"20180215","endDate":"20190315","repaymentDateOfMonth":"15","repayRate":1.0,"commentFromBank":"","due":null},{"identification":"A123456789","bank":"上海商銀","product":"上海銀行 優利貸","apr":3.2,"fee":2000,"returnPrice":null,"totalPrice":600000,"repayStaging":69,"staging":72,"startDate":"20160111","endDate":"20190211","repaymentDateOfMonth":"11","repayRate":1.0,"commentFromBank":"Great customer","due":null},{"identification":"A123456789","bank":"匯豐銀行","product":"滙豐銀行 閃光0.1%專案","apr":2.86,"fee":3000,"returnPrice":4176,"totalPrice":50000,"repayStaging":1,"staging":6,"startDate":"201801119","endDate":"20190519","repaymentDateOfMonth":"19","repayRate":1.0,"commentFromBank":"","due":null}]}
```

### Get creditcard history of user

```
curl -X GET "https://open-credit.herokuapp.com/loan/A123456789/creditcard"
```

Then, you would get the result like the following:


```
{"creditcards":[{"identification":"A123456789","bank":"上海銀行","card":"現金回饋商務御璽卡","price":1000,"date":"20180709"},{"identification":"A123456789","bank":"上海銀行","card":"現金回饋商務御璽卡","price":190,"date":"201801209"},{"identification":"A123456789","bank":"上海銀行","card":"現金回饋商務御璽卡","price":90,"date":"201801219"},{"identification":"A123456789","bank":"上海銀行","card":"現金回饋商務御璽卡","price":880,"date":"201801203"}]}
```

### Get creditcard history of user with specified bank

```
curl -X GET "https://open-credit.herokuapp.com/loan/A123456789/bankCreditcard?bank=上海銀行"
```

Then, you would get the result like the following:


```
{"creditcards":[{"identification":"A123456789","bank":"上海銀行","card":"現金回饋商務御璽卡","price":1000,"date":"20180709"},{"identification":"A123456789","bank":"上海銀行","card":"現金回饋商務御璽卡","price":190,"date":"201801209"},{"identification":"A123456789","bank":"上海銀行","card":"現金回饋商務御璽卡","price":90,"date":"201801219"},{"identification":"A123456789","bank":"上海銀行","card":"現金回饋商務御璽卡","price":880,"date":"201801203"}]}
```

### Get deposite of user

```
curl -X GET "https://open-credit.herokuapp.com/loan/A123456789/depostie"
```

Then, you would get the result like the following:


```
346331
```

### Get deposte of user with specified bank

```
curl -X GET "https://open-credit.herokuapp.com/loan/A123456789/bankDeposite?bank=上海銀行"
```

Then, you would get the result like the following:


```
550
```


### Get the loan model list

```
curl -X GET "https://open-credit.herokuapp.com/loan/{userId}/loanModel"
```

Then, you would get the result like the following:

```
{"loanModels":[{"product":"上海銀行 優利貸","image":"https://upload.wikimedia.org/wikipedia/zh/thumb/6/64/Shanghai_Commercial_and_Savings_Bank.svg/600px-Shanghai_Commercial_and_Savings_Bank.svg.png?fbclid=IwAR21gV1zbkUwkwJ2n5L1PN7QJpnoxUIpsIG5m7HleEo10kGtpm0V2itM3X0","apr":3.2,"fee":2000,"returnPrice":10926,"rate":97.8,"type":"vip"},{"product":"渣打銀行 尊爵專案 三師/公教/金融同業 客戶專屬","image":"https://upload.wikimedia.org/wikipedia/zh/thumb/a/a9/Standard_Chartered_Bank.svg/1200px-Standard_Chartered_Bank.svg.png","apr":3.17,"fee":3000,"returnPrice":10605,"rate":93.7,"type":"vip"},{"product":"渣打銀行 尊爵專案 Top 1,500績優企業 客戶專屬","image":"https://upload.wikimedia.org/wikipedia/zh/thumb/a/a9/Standard_Chartered_Bank.svg/1200px-Standard_Chartered_Bank.svg.png","apr":3.17,"fee":3000,"returnPrice":10605,"rate":93.4,"type":"vip"},{"product":"渣打銀行 優質客戶指數信貸","image":"https://upload.wikimedia.org/wikipedia/zh/thumb/a/a9/Standard_Chartered_Bank.svg/1200px-Standard_Chartered_Bank.svg.png","apr":3.74,"fee":6000,"returnPrice":10778,"rate":96.8,"type":"vip"},{"product":"王道銀行 科學園區獨享貸","image":"https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/O-Bank_logo.svg/1200px-O-Bank_logo.svg.png","apr":2.69,"fee":88,"returnPrice":10997,"rate":92.1,"type":"vip"}]}
```

### Calculate loan before date yyyymmdd

```
curl -X GET "https://open-credit.herokuapp.com/loan/A123456789/calculateLoan?date=20180930"
```

Then, you would get the result like the following:

```
37337
```
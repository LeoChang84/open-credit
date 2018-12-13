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

### Get approved loan history of user

```
curl -X GET "https://open-credit.herokuapp.com/loan/A123456789/loanHistoryApproved"
```

Then, you would get the result like the following:

```
{"loanHistorys":[{"identification":"A123456789","loanModel":{"product":"渣打銀行限時優惠信貸專案","bank":"渣打銀行","image":"https://upload.wikimedia.org/wikipedia/zh/thumb/a/a9/Standard_Chartered_Bank.svg/1200px-Standard_Chartered_Bank.svg.png","apr":3.35,"fee":4000,"returnPrice":4175,"rate":96.9,"type":"normal"},"totalPrice":600000,"repayStaging":0,"staging":5,"startDate":"20181212","endDate":"20240112","repaymentDateOfMonth":"15","repayRate":1.0,"commentFromBank":"","due":false,"status":"approved"},{"identification":"A123456789","loanModel":{"product":"王道銀行科學園區獨享貸","bank":"王道銀行","image":"https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/O-Bank_logo.svg/1200px-O-Bank_logo.svg.png","apr":2.69,"fee":88,"returnPrice":10997,"rate":96.9,"type":"normal"},"totalPrice":500000,"repayStaging":0,"staging":2,"startDate":"20180215","endDate":"20190315","repaymentDateOfMonth":"7","repayRate":1.0,"commentFromBank":"","due":false,"status":"approved"},{"identification":"A123456789","loanModel":{"product":"上海銀行優利貸","bank":"上海商銀","image":"https://upload.wikimedia.org/wikipedia/zh/thumb/6/64/Shanghai_Commercial_and_Savings_Bank.svg/600px-Shanghai_Commercial_and_Savings_Bank.svg.png?fbclid=IwAR21gV1zbkUwkwJ2n5L1PN7QJpnoxUIpsIG5m7HleEo10kGtpm0V2itM3X0","apr":3.2,"fee":2000,"returnPrice":11082,"rate":96.9,"type":"normal"},"totalPrice":600000,"repayStaging":3,"staging":3,"startDate":"20110111","endDate":"20140211","repaymentDateOfMonth":"11","repayRate":1.0,"commentFromBank":"Great customer","due":true,"status":"approved"},{"identification":"A123456789","loanModel":{"product":"滙豐銀行閃光0.1%專案","bank":"匯豐銀行","image":"https://q-fa.bstatic.com/xdata/images/xphoto/1236x412/34604175.jpg?k=6b4819825ec6fed42ff8d9af5e0271d349312e4368d835502db8eeb7e7fe9a7f&o=","apr":2.86,"fee":3000,"returnPrice":4176,"rate":96.9,"type":"normal"},"totalPrice":50000,"repayStaging":1,"staging":2,"startDate":"201801119","endDate":"20191219","repaymentDateOfMonth":"11","repayRate":1.0,"commentFromBank":"","due":false,"status":"approved"}]}
```

### Get approved loan history of user

```
curl -X GET "https://open-credit.herokuapp.com/loan/A123456789/loanHistoryPending"
```

Then, you would get the result like the following:

```
{"loanHistorys":[{"identification":"A123456789","loanModel":{"product":"上海銀行優利貸","bank":"上海商銀","image":"https://upload.wikimedia.org/wikipedia/zh/thumb/6/64/Shanghai_Commercial_and_Savings_Bank.svg/600px-Shanghai_Commercial_and_Savings_Bank.svg.png?fbclid=IwAR21gV1zbkUwkwJ2n5L1PN7QJpnoxUIpsIG5m7HleEo10kGtpm0V2itM3X0","apr":3.2,"fee":2000,"returnPrice":11082,"rate":96.9,"type":"normal"},"totalPrice":500000,"repayStaging":0,"staging":3,"startDate":"20181211","endDate":"20210111","repaymentDateOfMonth":"11","repayRate":1.0,"commentFromBank":"","due":false,"status":"pending"}]}
```

### Get Due loan history of user

```
curl -X GET "https://open-credit.herokuapp.com/loan/A123456789/loanHistoryDue"
```

Then, you would get the result like the following:

```
{"loanHistorys":[{"identification":"A123456789","loanModel":{"product":"上海銀行優利貸","bank":"上海商銀","image":"https://upload.wikimedia.org/wikipedia/zh/thumb/6/64/Shanghai_Commercial_and_Savings_Bank.svg/600px-Shanghai_Commercial_and_Savings_Bank.svg.png?fbclid=IwAR21gV1zbkUwkwJ2n5L1PN7QJpnoxUIpsIG5m7HleEo10kGtpm0V2itM3X0","apr":3.2,"fee":2000,"returnPrice":11082,"rate":96.9,"type":"normal"},"totalPrice":600000,"repayStaging":3,"staging":3,"startDate":"20110111","endDate":"20140211","repaymentDateOfMonth":"11","repayRate":1.0,"commentFromBank":"Great customer","due":true,"status":"approved"}]}
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
curl -X GET "https://open-credit.herokuapp.com/loan/A123456789/deposite"
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
curl -X GET "https://open-credit.herokuapp.com/loan/{identfication}/loanModel"
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

### Pre calculate loan table for user

```
curl -X GET "https://open-credit.herokuapp.com/loan/perCalculateLoan?product=中國信託Online貸&loanPrice=600000&stage=5"
```

Then, you would get the result like the following:

```
{"product":"中國信託Online貸","preCalculateList":[{"stage":0,"loanBalance":600000,"principal":0,"interest":0,"payment":10791},{"stage":1,"loanBalance":590729,"principal":9271,"interest":1520,"payment":10791},{"stage":2,"loanBalance":581435,"principal":9294,"interest":1497,"payment":10791}
...
...
{"stage":51,"loanBalance":95956,"principal":10521,"interest":270,"payment":10791},{"stage":52,"loanBalance":85408,"principal":10548,"interest":243,"payment":10791},{"stage":53,"loanBalance":74833,"principal":10575,"interest":216,"payment":10791},{"stage":54,"loanBalance":64232,"principal":10601,"interest":190,"payment":10791},{"stage":55,"loanBalance":53604,"principal":10628,"interest":163,"payment":10791},{"stage":56,"loanBalance":42949,"principal":10655,"interest":136,"payment":10791},{"stage":57,"loanBalance":32267,"principal":10682,"interest":109,"payment":10791},{"stage":58,"loanBalance":21558,"principal":10709,"interest":82,"payment":10791},{"stage":59,"loanBalance":10822,"principal":10736,"interest":55,"payment":10791},{"stage":60,"loanBalance":58,"principal":10764,"interest":27,"payment":10791}]}
```

### Apply loan and send to bank

```
curl --header "Content-Type: application/json" --request POST --data \
'{
    "identification": "A123456789",
    "loanModel": {
        "product": "渣打銀行限時優惠信貸專案",
        "bank": "渣打銀行",
        "image":"https://upload.wikimedia.org/wikipedia/zh/thumb/a/a9/Standard_Chartered_Bank.svg/1200px-Standard_Chartered_Bank.svg.png",
        "apr": 3.35,
        "fee": 4000,
        "returnPrice": 4175,
        "rate": 96.9,
        "type": "normal"
    },
    "totalPrice": 600000,
    "repayStaging": 0,
    "staging": 5,
    "startDate": "20181212",
    "endDate": "20240112",    
    "repaymentDateOfMonth": 15,
    "repayRate": 1,
    "commentFromBank": "",
    "due": "false",
    "status": "pending"
}' https://open-credit.herokuapp.com/loan/A123456789/applyLoan
```

Then, you would get the result like the following:

```
Recieve data
```

### Approve/Reject loan by bank

```
curl --header "Content-Type: application/json" --request POST --data \
'{
    "identification": "A123456789",
    "loanModel": {
        "product": "渣打銀行限時優惠信貸專案",
        "bank": "渣打銀行",
        "image":"https://upload.wikimedia.org/wikipedia/zh/thumb/a/a9/Standard_Chartered_Bank.svg/1200px-Standard_Chartered_Bank.svg.png",
        "apr": 3.35,
        "fee": 4000,
        "returnPrice": 4175,
        "rate": 96.9,
        "type": "normal"
    },
    "totalPrice": 600000,
    "repayStaging": 0,
    "staging": 5,
    "startDate": "20181212",
    "endDate": "20240112",    
    "repaymentDateOfMonth": 15,
    "repayRate": 1,
    "commentFromBank": "",
    "due": "false",
    "status": "reject"
}' https://open-credit.herokuapp.com/loan/A123456789/modifyLoanStatus
```

Then, you would get the result like the following:

```
Modified data
```

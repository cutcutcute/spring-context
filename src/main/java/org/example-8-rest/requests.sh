read -p $'\nPress any key to send request for api/pay with {amount:1000}\n'
curl -v -X POST http://localhost:8080/api/pay -d "{\"amount\": 1000}" -H "Content-Type: application/json"
read -p $'\nPress any key to send request for api/payment and raised exception\n'
curl -X POST http://localhost:8080/api/payment
read -p $'\nPress any key to send request for api/buy and raised exception\n'
curl -X POST http://localhost:8080/api/buy
read -p $'\nPress any key to continue\n'
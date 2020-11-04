# billing-sample

Please use below command to run the springboot app


mvnw spring-boot:run

Once the application starts, please use below swagger UI to get the billing service.

http://localhost:8080/swagger-ui/index.html

The sample req payload is below.


{
  "orderId": "ORD1234",  
  "purchasedItemList": [  
    {    
      "itemName": "Cola",      
      "quantity": 3
      
    },
    
    {
    
      "itemName": "Coffee",
      
      "quantity": 2
      
    },
    
    {
    
      "itemName": "Cheese-Sandwich",
      
      "quantity": 2
      
    },
    
    {
    
      "itemName": "Steak-Sandwich",
      
      "quantity": 3
      
    }
    
  ],
  
  "tableNumber": "TAB0012"
  
}

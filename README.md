# order_api
order_api

## :pushpin: Environment
+ Spring Boot
+ maven
+ JDK 1.8
+ h2 database
+ JPA

## :pushpin: Entity
+ Category
+ Item
  + Clothes
  + Food
+ Order
+ Request


## :pushpin: Requirements
:small_orange_diamond: 주문

1. 사용자 주문 요청
2. 서버 해당 id 있는지 확인  
  2.1 없을경우 "아이템 없음" 반환  
3. 서버 해당 id의 재고 수량 차감  
  3.1 재고 10 미만일 경우 입고요청  
  3.2 재고가 0 이하일 경우 "재고 없음" 반환  
4. 최종적으로 주문 테이블에 주문 정보 저장

## :pushpin: Issues
```
1. item table 매핑 id값 컨트롤 실패오류 (clothes테이블과 food테이블 pk값 item에서 하나로 연동)
2. 재고수량 차감 확인
3. 주문 정보 저장 확인

```

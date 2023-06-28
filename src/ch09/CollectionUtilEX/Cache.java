package ch09.CollectionUtilEX;

// 임시저장소( 좀 빠른 임시저장소)
// 일반 RDBMS는 좀 느린데, 응답성능이 한 10ms
// 캐시 저장소는, 응답성능이 한 1ms
//클래스 이름: Cache
public class Cache <T>{

private T data;

public T getData() {
    return this.data;
}
public  void setData(T data){
    this.data = data;

}

}
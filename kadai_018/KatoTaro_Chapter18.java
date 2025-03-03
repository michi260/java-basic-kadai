package kadai_018;

class KatoTaro_Chapter18 extends Kato_Chapter18 {  
    public KatoTaro_Chapter18() {
        // setGivenName();  // コンストラクタからsetGivenNameを削除
    }
    
    public void setGivenName() {     
        givenName = "太郎";
    }

    
    public void eachIntroduce(){
        System.out.println("私はJavaが得意です"); 
    }
}

package kadai_018;

class KatoIchiro_Chapter18 extends Kato_Chapter18 {  
    public KatoIchiro_Chapter18() {
        // setGivenName();  // コンストラクタからsetGivenNameを削除
    }
    
    public void setGivenName() {     
        givenName = "一郎";
    }

    @Override 
    public void eachIntroduce(){
        System.out.println("好きな食べ物はリンゴです"); 
    }
}
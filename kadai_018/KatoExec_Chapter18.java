package kadai_018;

abstract class KatoExec_Chapter18 {
    public static void main(String[] args) {           
        KatoTaro_Chapter18 taro = new KatoTaro_Chapter18(); 
        taro.setGivenName();        // setGivenNameをここで呼び出す
        taro.execIntroduce();         

        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18(); 
        ichiro.setGivenName();      // setGivenNameをここで呼び出す
        ichiro.execIntroduce();

        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18(); 
        hanako.setGivenName();      // setGivenNameをここで呼び出す
        hanako.execIntroduce();
        
        System.out.println(); 
    }
}
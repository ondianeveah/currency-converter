public class NewCurrencyConverter {
   private double uniCurrency, amount, usDollar, ausDollar, canDollar, singDollar,
            pound, code, euro, yen, ringgit, rupee, franc, renminbi;

   public NewCurrencyConverter(){

   }
   public NewCurrencyConverter( double uniCurrency, double amount, double usDollar, double ausDollar, double canDollar, double singDollar,
                               double pound, double code, double euro, double yen, double ringgit, double rupee, double franc, double renminbi){
       this.uniCurrency = uniCurrency;
       this.amount = amount;
       this.usDollar = usDollar;
       this.ausDollar = ausDollar;
       this.canDollar = canDollar;
       this.singDollar = singDollar;
       this.code = code;
       this.euro = euro;
       this.yen = yen;
       this.pound = pound;
       this.franc = franc;
       this.ringgit = ringgit;
       this.rupee = rupee;
       this.renminbi = renminbi;

   }
}

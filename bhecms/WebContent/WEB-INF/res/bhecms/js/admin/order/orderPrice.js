function IsNumeric(sText){
   var ValidChars = "0123456789.";
   var IsNumber=true;
   var Char;

 
   for (i = 0; i < sText.length && IsNumber == true; i++) 
      { 
      Char = sText.charAt(i); 
      if (ValidChars.indexOf(Char) == -1) 
         {
         IsNumber = false;
         }
      }
   return IsNumber;
   
};

/**
 * 计算合计
 */
function calcProdSubTotal() {
    
    var prodSubTotal = 0;

    $("td.js-subtotal").each(function(){
    
        var valString = $(this).text() || 0;
        
        prodSubTotal += parseInt(valString);
                    
    });
        
    $("td.js-allPrice").text(prodSubTotal);

};

/**
 * 合计数量
 */
function calcTotalPallets() {

    var totalPallets = 0;

    $("input.js-pallets-input").each(function() {
    
        var thisValue = $(this).val();
    
        if ( (IsNumeric(thisValue)) &&  (thisValue != '') ) {
        
            totalPallets += parseInt(thisValue);
        
        };
    
    });
    
    $("td.js-allCount").text(totalPallets);

};


$(function(){

	//计算每一行的总价
    $('.js-pallets-input').blur(function(){
    
        var $this = $(this);
    
        var numPallets = $this.val();
        var multiplier = $this
                            .parent()
                            .next("td")
                            .text();
        
        if ( (IsNumeric(numPallets)) && (numPallets != '') ) {
            
            var rowTotal = numPallets * multiplier;
            
            $this
                .css("background-color", "white")
                .parent().parent()
                .find("td.js-subtotal")
                .text(rowTotal);                    
            
        } else {
        
            $this.css("background-color", "#ffdcdc"); 
                        
        };
        
        calcProdSubTotal();
        calcTotalPallets();
    
    });

});
/* Notes:
   -Switch = Nested IF statement
   String ans
   int d = <some value>;
   if(d ==0){
      ans = "sun";
   }else if (d ==1){
      ans = "Mon";
   }
   .
   .
   .
   cont.
   }else{
      ans = "Error";
   }
   USE THIS:

   switch(d){
       case 0:
          ans = "Sun";
          break;
       case 1:
          ans = "Mon";
          break;
       .
       .
       .
       case 6:
          ans = "Sat";
       default:
          ans = "error";
     }
-You sohuld have a default case.
without a break, you'll run the rest of the other branches.
control_expression should be an int,byte, or string.
switch(control_expression){
    case constant1:branch1
    case constant2:branch2
    case constant3:branch3
    default:branchN
}
Multiple Case Lines:
switch(control_expression){

    case 1: case 2: case 3: ans = "dsifbd";(if x == 1 || x == 2 || x == 3) 
    case 4:
    ...
    default: ans = "error";
}

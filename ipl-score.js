function calculate(){
     name1 = document.getElementById('name1').value;
     score1 = document.getElementById('score1').value;
     name2 = document.getElementById('name2').value;
     score2 = document.getElementById('score2').value;
     if(name1==''||name2==''||score1==''||score2==''){
        alert("No field should be empty");
     }
     
     else if(name1==name2){
    alert("invalid input ");
     }
     else{
    s1 = score1.split('/');
    s2 = score2.split('/');
    if(s1[1]>10 || s2[1]>10){
        alert("Wickets cannot be greater than 10");
        
    }
    else{
    if(s1[0]>s2[0]){
        alert(name1 + " Won");
    }
    else if (s1[0]==s2[0]){
        alert("The match is tied");
    }
    else{
        alert(name2 + " Won");
    }
}
    
     }
    
}
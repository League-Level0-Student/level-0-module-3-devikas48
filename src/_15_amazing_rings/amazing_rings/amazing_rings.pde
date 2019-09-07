int x1 = 300;
int x2 = 500;
void setup(){
size(800,800);
}

void draw(){
  background(#B490DB);
  for(int i=14; i>0; i--){

if (i%2==0){
noFill();
} else {
 noFill();
}
 ellipse(x1,100,i*10, i*10);
}
x1++;
if(x1==800){
  x1=0;
}




for(int i=14; i>0; i--){

if (i%2==0){
noFill();
} else {
 noFill();
}
 ellipse(x2,100,i*10, i*10);
}
x2--;

if(x2==0){
  x2=800;
}


}

  
  
  
  
  
  
  
  
  
  

  

//////// What am I trying to do???
//////// What is my name?  (CST 112; today's date?)

//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 740,680);
  horizon=  height/3;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( 100,150,200 );                // sky
  fill( 255,255,0 );
  ellipse( width*3/4, height/8, 40,40 );    // sun
  // Grass
  fill( 200,150,100);
  rect( 115,horizon/1.3,30,80);
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  
  /* INSERT YOUR CODE HERE! */
  
  triangle( 150,horizon/2, 80,horizon-50, 180,horizon-50  );  // tree
  triangle( 120,horizon/2.5, 80,horizon-50, 180,horizon-50  );
  fill(255,200,200);
  text( "strawberry fields", 150,horizon );
                                            // house

  fill(0);
  text( "My name is Mahmoud", 10,height-20 );                                          
                                            
  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;
  
  //// SHOW:  display the creature at (x,y)

  /* INSERT YOUR CODE HERE! */
  stroke(0);
  fill( 130,120,80);
  ellipse(x+10,y-13,30,25);
  fill(255,80,140); rect( x,y, 20,60 );        /* REPLACE THIS WITH YOUR OWN CODE! */
  fill( 130,120,80);
  ellipse(x+10,y+70,30,25);
  fill(255,0,0);
  text( "Bond", x+30,y+30 );

}


//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -6, +6 );                  // random speed.
  dy=  random( -4, +4 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
}
   

import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * The AnimatedActor class serves as a superclass for other, more specific
 * Actor classes. It provides a mechanism to give actors an animated image.
 * 
 * I got this class from the Greenfoot website's "support class" section
 * http://www.greenfoot.org/programming/classes/AnimatedActor.java
 * 
 * @author mik
 * @version 1.0
 */
public class AnimatedActor extends Creature
{
    private GreenfootImage[] images;
    private int currentImage = 0;
    
    public AnimatedActor(String basename, String suffix, int noOfImages)
    {
        images = new GreenfootImage[noOfImages];
        for(int i=0; i < noOfImages; i++) {
            images[i] = new GreenfootImage(basename + i + suffix);
        }
        setImage(images[currentImage]);
    }
    

    public void act() 
    {
        currentImage = (currentImage + 1) % images.length;
        setImage(images[currentImage]);
    }
}
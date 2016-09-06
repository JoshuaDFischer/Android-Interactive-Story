package com.example.joshuadf.interactivestory.model.page;

import com.example.joshuadf.interactivestory.R;

/**
 * Created by Joshuadf on 8/9/2016.
 */
public class Story {

    private Page[] mPages;

    public Story() {
        mPages = new Page[14 ];

        mPages[0] = new Page(
                R.drawable.page0,
                "You are on a camping trip with your friend Mia. In the middle of the night you wake up to the sound of people screaming. You turn to look for Mia but she is not there.",
                new Choice("Go back to sleep", 1),
                new Choice("Go outside to find Mia", 2));

        mPages[1] = new Page(
                R.drawable.page1,
                "You try to go back to sleep, but you hear the screaming again. This time you also hear a loud rattling sound. \"%1$s come out quickly \" Mia screams. Jumping out of the tent you find Mia chasing a pack of racoons who are destroying your camp site.",
                new Choice("Ask Mia what’s going on", 2),
                new Choice("Chase off those pesky raccoons", 4));

        mPages[2] = new Page(
                R.drawable.page2,
                "Outside you see Mia. She says that she was super hungry and when she came out side she found raccoons getting into the snacks. We don’t even have enough marsh mellows left to play chubby bunny. Suddenly  something happens!",
                new Choice("You hear another loud scream", 3),
                new Choice("You see strange lights in the sky", 13));

        mPages[3] = new Page(
                R.drawable.page3,
                "That noise was weird should we go check it out?",
                new Choice("Yea I am ready for an adventure", 4),
                new Choice("No, lets use the last of the snacks to make s’mores", 11));

        mPages[4] = new Page(
                R.drawable.page4,
                "Walking through the woods towards the scary sounds and now weird lights you hear footsteps behind you.",
                new Choice("Run", 5),
                new Choice("Spin around with a round house kick", 10));
        mPages[5] = new Page(
                R.drawable.page5,
                "As you are running through the woods, away from the footsteps, and towards the screams you trip on something.",
                new Choice("Trip on an old tire", 7),
                new Choice("Trip on a crazy raccoon", 6));

        mPages[6] = new Page(
                R.drawable.page6,
                "The raccoon bites Mia. It turns out the steps behind you were some kid campers playing. Mia gets mad and says she wants to go home. As you head back to camp you hear the screams again. \"The adventure is over\" Mia says. You return home and always wonder about those mysterious screams.");

        mPages[7] = new Page(
                R.drawable.page7,
                "The tire hurts your knee but the strange sounds are so interesting you have to find out what it is. You come to a big wooden fence and know that all the sounds are just on the other side. You see a sign that says \"No Trespassing\".",
                new Choice("Try to climb", 8),
                new Choice("Follow the rules and go back to camp.", 9));
        mPages[8] = new Page(
                R.drawable.page8,
                "You hop over the fence and land in the Wild Adventures camp ground. It turns out the camp ground is right next door. The screaming and rattling was coming from the roller coasters. You and mia have an aswome time at the special late time concert inside the park.");

        mPages[9] = new Page(
                R.drawable.page9,
                "The sounds continue to worry you. So you and Mia decide to go home. As you drive away from the camp ground you start to doze off back to sleep. Right before you drift to sleep you see a sign on the side of the road that says Wild Adventures Amusement Park. It turns out the campground was right next door.");

        mPages[10] = new Page(
                R.drawable.page10,
                "When you turn around you see a pack of cub scouts running your way. They are carrying bathing suits and maps to Wild Adventure amusement park. Hey %1$s lets get out of here this is crazy” says Mia. As you leave you still wonder what those screams where.");


        mPages[11] = new Page(
                R.drawable.page11,
                "You try to find the marsh mellows but the raccoons ate them all. Instead you have to snack on.",
                new Choice("crickets", 12),
                new Choice("warms", 12));

        mPages[12] = new Page(
                R.drawable.page12,
                "\"%1$s ! That’s gross\" , I’m getting out of here. This camping trip is over. You will always wonder what those screams where.");

        mPages[13] = new Page(
                R.drawable.page13,
                "Lets go check out those lights. \"Don’t be a scary-cat %1$s!\" ",
                new Choice("Ok lets go", 4),
                new Choice("I’m freaked out lets get out of here", 9));
    }

    public Page getPage(int pageNumber){
        return mPages[pageNumber];
    }
}

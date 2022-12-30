import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Latar extends World
{
    private int jeda=0;
    private int score;
    private int nyawa=3;
    private int tersentuh = 0;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Latar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1); 
        tampilnyawa();
        tampilscore();
        addObject (new Rintangan(),100,462);
        addObject (new Akang(),40,327);
        prepare();
    }

    public void updatenyawa(int point)
    {
        nyawa = nyawa + point;
        tampilnyawa();
        if(nyawa == 0)
        {
            Greenfoot.stop();
            addObject(new Kalah(),450,250);
            Greenfoot.playSound("turu.wav");
        }
    }

    public void tampilnyawa()
    {
        showText("Nyawa :"+nyawa, 800,25);
    }

    public void addscore (int points)
    {
        score = score + points;
        tampilscore();
    }

    private void tampilscore()
    {
        showText ("Score :"+score, 100, 25);
    }
    
    public void endGame()
    {
        if(score == 160 && tersentuh==0){
            Greenfoot.stop();
            addObject(new Menang(), 450, 250);
        }
    }

    

    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //Greenfoot.playSound("son.mp3");
        Rintangan rintangan = new Rintangan(50, 100);
        addObject(rintangan,726,241);
        removeObject(rintangan);
        Rintangan rintangan1 = new Rintangan(100, 50);
        addObject(rintangan,704,236);
        rintangan.setLocation(707,194);
        removeObject(rintangan);
        Rintangan rintangan2 = new Rintangan(100, 20);
        addObject(rintangan2,712,214);
        rintangan.setLocation(696,245);
        Rintangan rintangan3 = new Rintangan(100, 20);
        addObject(rintangan3,895,183);
        rintangan2.setLocation(895,180);
        Rintangan rintangan4 = new Rintangan(50, 20);
        addObject(rintangan4,525,142);
        rintangan3.setLocation(525,169);
        Rintangan rintangan5 = new Rintangan(30, 20);
        addObject(rintangan5,1078,143);
        rintangan5.setLocation(1082,143);
        rintangan5.setLocation(1086,145);
        rintangan3.setLocation(723,238);
        rintangan3.setLocation(533,360);
        rintangan4.setLocation(383,306);
        rintangan2.setLocation(736,286);
        rintangan5.setLocation(852,194);
        rintangan2.setLocation(743,280);
        rintangan5.setLocation(857,196);
        Rintangan rintangan6 = new Rintangan(200, 100);
        addObject(rintangan6,797,448);
        rintangan6.setLocation(809,463);
        rintangan6.setLocation(874,469);
        rintangan4.setLocation(318,250);
        rintangan3.setLocation(492,332);
        rintangan4.setLocation(298,202);
        rintangan3.setLocation(427,283);
        rintangan2.setLocation(685,247);
        rintangan5.setLocation(834,103);
        Rintangan rintangan7 = new Rintangan(50, 100);
        addObject(rintangan7,567,124);
        rintangan7.setLocation(546,135);
        removeObject(rintangan7);
        Rintangan rintangan8 = new Rintangan(30, 30);
        addObject(rintangan8,555,123);
        rintangan7.setLocation(544,126);
        rintangan7.setLocation(550,117);
        rintangan8.setLocation(169,149);
        removeObject(rintangan8);
        Rintangan rintangan10 = new Rintangan(50, 50);
        addObject(rintangan10,143,110);
        removeObject(rintangan8);
        Rintangan rintangan11 = new Rintangan(100, 20);
        addObject(rintangan8,171,135);
        rintangan8.setLocation(395,93);
        rintangan8.setLocation(395,93);
        rintangan4.setLocation(233,209);
        rintangan8.setLocation(356,101);
        rintangan6.setLocation(814,453);
        rintangan6.setLocation(767,472);
        rintangan8.setLocation(541,113);
        removeObject(rintangan10);
        Rintangan rintangan9 = new Rintangan(100, 20);
        addObject(rintangan9,361,113);
        rintangan9.setLocation(356,114);
        rintangan6.setLocation(785,462);
        rintangan6.setLocation(865,482);
        rintangan6.setLocation(866,460);
        Cilok cilok = new Cilok();
        addObject(cilok,505,222);
        cilok.setLocation(422,258);
        Cilok cilok2 = new Cilok();
        addObject(cilok2,522,240);
        cilok2.setLocation(459,260);
        cilok.setLocation(428,261);
        cilok2.setLocation(463,260);
        Cilok cilok3 = new Cilok();
        addObject(cilok3,152,122);
        cilok3.setLocation(219,181);
        Cilok cilok4 = new Cilok();
        addObject(cilok4,249,191);
        cilok4.setLocation(245,179);
        Cilok cilok5 = new Cilok();
        addObject(cilok5,433,101);
        cilok5.setLocation(328,88);
        Cilok cilok6 = new Cilok();
        addObject(cilok6,360,66);
        cilok6.setLocation(365,88);
        Cilok cilok7 = new Cilok();
        addObject(cilok7,418,45);
        cilok7.setLocation(379,89);
        cilok6.setLocation(395,90);
        cilok7.setLocation(349,81);
        cilok7.setLocation(399,89);
        cilok5.setLocation(322,84);
        cilok6.setLocation(357,94);
        cilok7.setLocation(398,83);
        Cilok cilok8 = new Cilok();
        addObject(cilok8,591,86);
        cilok8.setLocation(543,83);
        cilok8.setLocation(541,83);
        Cilok cilok9 = new Cilok();
        addObject(cilok9,690,203);
        cilok9.setLocation(645,220);
        Cilok cilok10 = new Cilok();
        addObject(cilok10,714,215);
        cilok10.setLocation(691,219);
        Cilok cilok11 = new Cilok();
        addObject(cilok11,756,211);
        cilok11.setLocation(730,219);
        cilok11.setLocation(731,216);
        cilok10.setLocation(691,216);
        cilok11.setLocation(724,214);
        Cilok cilok12 = new Cilok();
        addObject(cilok12,855,46);
        cilok12.setLocation(831,76);
        Cilok cilok13 = new Cilok();
        addObject(cilok13,376,249);
        cilok13.setLocation(393,258);
        cilok.setLocation(426,258);
        cilok2.setLocation(463,259);
        cilok9.setLocation(637,218);
        cilok10.setLocation(683,213);
        cilok11.setLocation(724,216);
        cilok6.setLocation(358,84);
        Musuh musuh = new Musuh();
        addObject(musuh,744,169);
        musuh.setLocation(727,195);
        cilok7.setLocation(388,77);
        Musuh musuh2 = new Musuh();
        addObject(musuh2,388,77);
        cilok7.setLocation(383,58);
        musuh2.setLocation(384,81);
        musuh2.setLocation(435,71);
        cilok7.setLocation(392,80);
        musuh2.setLocation(398,71);
        cilok7.setLocation(390,67);
        musuh2.setLocation(394,77);
        cilok7.setLocation(387,62);
        cilok7.setLocation(389,65);
        cilok7.setLocation(402,80);
        musuh2.setLocation(387,70);
        Resep resep = new Resep();
        addObject(resep,768,322);
        resep.setLocation(863,385);
        removeObject(rintangan6);
        resep.setLocation(851,363);
        resep.setLocation(850,360);
        resep.setLocation(861,359);
        resep.setLocation(832,365);
        resep.setLocation(854,376);
        resep.setLocation(883,371);
        resep.setLocation(881,357);
        resep.setLocation(845,368);
        Kalah kalah = new Kalah();
        addObject(kalah,456,240);
        musuh.setLocation(721,275);
        kalah.setLocation(544,164);
        kalah.setLocation(436,320);
        kalah.setLocation(425,290);
        kalah.setLocation(465,294);
        kalah.setLocation(487,294);
        kalah.setLocation(307,314);
        kalah.setLocation(431,228);
        removeObject(kalah);
        musuh.setLocation(690,209);
        cilok9.setLocation(648,222);
        cilok7.setLocation(290,129);
        cilok7.setLocation(395,81);
        cilok10.setLocation(681,212);
        removeObject(cilok12);
        removeObject(rintangan5);
        rintangan8.setLocation(731,140);
        removeObject(rintangan8);
        removeObject(cilok8);
        cilok7.setLocation(455,322);
        rintangan3.setLocation(433,246);
        musuh2.setLocation(435,249);
        cilok.setLocation(424,238);
        rintangan10.setLocation(368,96);
        rintangan10.setLocation(521,106);
        cilok7.setLocation(558,82);
        cilok7.setLocation(548,84);
        cilok7.setLocation(546,83);
        cilok7.setLocation(546,83);
        cilok7.setLocation(545,83);
        cilok6.setLocation(511,87);
        cilok5.setLocation(484,83);
        cilok5.setLocation(474,78);
        cilok5.setLocation(471,79);
        cilok6.setLocation(533,88);
        cilok6.setLocation(541,88);
        cilok6.setLocation(512,87);
        cilok7.setLocation(556,85);
        cilok5.setLocation(334,92);
        cilok5.setLocation(324,92);
        cilok5.setLocation(322,92);
        cilok6.setLocation(336,70);
        cilok5.setLocation(374,85);
        cilok7.setLocation(320,69);
        cilok5.setLocation(394,93);
        cilok.setLocation(548,285);
        rintangan3.setLocation(410,201);
        cilok.setLocation(423,218);
        cilok2.setLocation(461,222);
        musuh2.setLocation(431,210);
        cilok6.setLocation(330,88);
        cilok6.setLocation(343,71);
        cilok6.setLocation(362,87);
        cilok5.setLocation(377,82);
        rintangan10.setLocation(345,89);
        cilok5.setLocation(374,85);
        cilok5.setLocation(392,67);
        cilok7.setLocation(320,89);
        cilok5.setLocation(397,93);
        cilok5.setLocation(398,76);
        cilok5.setLocation(400,95);
        cilok5.setLocation(397,91);
        cilok5.setLocation(395,85);
        rintangan3.setLocation(479,311);
        cilok13.setLocation(373,175);
        cilok.setLocation(415,182);
        cilok2.setLocation(448,179);
        rintangan3.setLocation(396,208);
        rintangan3.setLocation(415,174);
        rintangan3.setLocation(410,276);
        rintangan3.setLocation(367,177);
        rintangan3.setLocation(375,209);
        cilok.setLocation(421,183);
        cilok13.setLocation(373,174);
        cilok.setLocation(409,179);
        musuh2.setLocation(410,138);
        rintangan3.setLocation(416,201);
        musuh2.setLocation(424,163);
        cilok13.setLocation(370,177);
        cilok13.setLocation(367,168);
        cilok13.setLocation(373,172);
        cilok13.setLocation(376,184);
        rintangan3.setLocation(373,186);
        Cilok cilok14 = new Cilok();
        addObject(cilok14,570,378);
        Cilok cilok15 = new Cilok();
        addObject(cilok15,606,378);
        rintangan3.setLocation(374,189);
        rintangan3.setLocation(385,205);
        cilok2.setLocation(434,186);
        rintangan3.setLocation(336,191);
        cilok.setLocation(361,182);
        rintangan3.setLocation(411,215);
        cilok.setLocation(394,181);
        cilok.setLocation(409,186);
        cilok.setLocation(381,184);
        cilok2.setLocation(417,189);
        cilok.setLocation(406,188);
        cilok2.setLocation(424,189);
        cilok2.setLocation(419,189);
        cilok.setLocation(398,182);
        cilok.setLocation(444,186);
        cilok.setLocation(389,186);
        musuh2.setLocation(470,176);
        cilok13.setLocation(420,182);
        musuh2.setLocation(416,157);
        cilok2.setLocation(427,179);
        cilok2.setLocation(408,169);
        cilok2.setLocation(424,167);
        cilok2.setLocation(401,191);
        rintangan3.setLocation(527,198);
        rintangan3.setLocation(544,189);
        musuh2.setLocation(510,153);
        cilok2.setLocation(567,151);
        cilok.setLocation(540,155);
        cilok.setLocation(509,158);
        cilok13.setLocation(535,160);
        cilok2.setLocation(559,146);
        cilok2.setLocation(590,163);
        cilok2.setLocation(565,161);
        cilok.setLocation(546,147);
        musuh2.setLocation(512,156);
        cilok13.setLocation(560,156);
        cilok.setLocation(415,357);
        rintangan3.setLocation(560,192);
        rintangan3.setLocation(637,123);
        rintangan3.setLocation(557,192);
        cilok.setLocation(550,154);
        cilok2.setLocation(597,169);
        cilok.setLocation(694,139);
        rintangan3.setLocation(516,190);
        cilok13.setLocation(563,145);
        cilok13.setLocation(565,151);
        cilok13.setLocation(566,134);
        cilok13.setLocation(561,131);
        cilok2.setLocation(581,151);
        cilok2.setLocation(569,168);
        cilok2.setLocation(596,171);
        cilok2.setLocation(520,165);
        cilok.setLocation(468,202);
        rintangan3.setLocation(471,195);
        rintangan3.setLocation(475,194);
        rintangan3.setLocation(475,197);
        rintangan3.setLocation(472,198);
        rintangan3.setLocation(472,198);
        cilok.setLocation(476,200);
        cilok.setLocation(478,170);
        cilok13.setLocation(536,377);
        rintangan3.setLocation(487,191);
        rintangan3.setLocation(500,202);
        musuh.setLocation(687,257);
        rintangan2.setLocation(703,249);
        musuh.setLocation(697,222);
        cilok10.setLocation(698,216);
        rintangan4.setLocation(237,217);
        rintangan2 rintangan22 = new rintangan2();
        addObject(rintangan22,237,217);
        rintangan10.setLocation(348,123);
        rintangan2 rintangan23 = new rintangan2();
        addObject(rintangan23,348,123);
        rintangan23.setLocation(386,127);
        rintangan10.setLocation(342,116);
        rintangan10.setLocation(367,111);
        cilok5.setLocation(436,84);
        cilok6.setLocation(395,90);
        cilok7.setLocation(351,100);
        cilok7.setLocation(342,77);
        cilok7.setLocation(348,95);
        cilok5.setLocation(439,87);
        cilok6.setLocation(398,90);
        rintangan10.setLocation(308,113);
        rintangan23.setLocation(367,171);
        removeObject(rintangan10);
        rintangan23.setLocation(351,142);
        cilok7.setLocation(323,106);
        cilok6.setLocation(375,109);
        cilok5.setLocation(424,105);
        rintangan10.setLocation(259,106);
        rintangan10.setLocation(433,71);
        removeObject(rintangan10);
        cilok7.setLocation(261,91);
        removeObject(rintangan10);
        removeObject(rintangan10);
        rintangan10.setLocation(438,54);
        rintangan23.setLocation(375,112);
        cilok5.setLocation(400,71);
        cilok6.setLocation(363,80);
        cilok7.setLocation(311,84);
        cilok6.setLocation(365,70);
        cilok5.setLocation(413,82);
        cilok6.setLocation(383,84);
        cilok7.setLocation(328,76);
        cilok6.setLocation(371,77);
        cilok5.setLocation(420,78);
        cilok10.setLocation(703,210);
        cilok9.setLocation(663,217);
        cilok11.setLocation(735,223);
        cilok11.setLocation(729,208);
        cilok11.setLocation(733,221);
        musuh.setLocation(688,148);
        musuh.setLocation(701,216);
        rintangan2.setLocation(665,235);
        rintangan2.setLocation(664,236);
        rintangan2.setLocation(665,242);
        rintangan2.setLocation(664,234);
        rintangan2.setLocation(684,178);
        cilok10.setLocation(718,127);
        rintangan2.setLocation(661,185);
        musuh.setLocation(674,130);
        musuh.setLocation(658,158);
        musuh.setLocation(610,150);
        musuh.setLocation(677,137);
        cilok10.setLocation(706,133);
        cilok10.setLocation(694,161);
        cilok11.setLocation(663,157);
        cilok9.setLocation(626,153);
        cilok9.setLocation(613,150);
        cilok9.setLocation(626,160);
        cilok3.setLocation(236,174);
        cilok3.setLocation(237,172);
        cilok3.setLocation(220,178);
        Musuh musuh3 = new Musuh();
        addObject(musuh3,374,34);
        musuh3.setLocation(371,63);
        removeObject(cilok13);
        removeObject(cilok14);
        removeObject(cilok15);
        cilok3.setLocation(255,184);
        cilok3.setLocation(223,182);
    }
}

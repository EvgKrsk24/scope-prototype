package ru.spring.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Neil Alishev
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // Music music = context.getBean("musicBean", Music.class);
        // MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparsion = firstMusicPlayer==secondMusicPlayer; // по ссылке
        //musicPlayer.playMusic();

        System.out.println(comparsion);

        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume(15);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

        //System.out.println(musicPlayer.getName());
        //System.out.println(musicPlayer.getVolume());

        context.close();
    }
}

package com.ruzhan.jsonfile.data;

import com.ruzhan.jsonfile.model.Introduce;
import com.ruzhan.jsonfile.model.Movie;
import com.ruzhan.jsonfile.model.MovieDetail;
import com.ruzhan.jsonfile.model.Video;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ruzhan123 on 2018/7/3.
 */
public class DevinWilliams {

    private static final int ID = 1403;
    private static final String PLAY_COUNT = "10";

    private static final String TITLE = "篮球训练纪录片10000小时";
    private static final String TAG = "体育·篮球·纪录片";

    private static final String IMAGE = "https://raw.githubusercontent.com/ruzhan123/Lion/master/json/api/image/devin-williams.jpg";

    private static final String DESC = "一部篮球训练纪录片。其中的10000小时精神值得所有热爱篮球的人思考。";

    public static final Movie movie = new Movie();
    public static final MovieDetail movieDetail = new MovieDetail();

    private static final List<Introduce> introduceList = new ArrayList<>();
    private static final List<Video> videoList = new ArrayList<>();

    static {
        introduceList.add(new Introduce(Introduce.TEXT,
                "德文·威廉姆斯，在youtube炙手可热的美国训练师和视频剪辑师，创造了篮球纪录片《10000小时》和训练系列片《in the lab》等，实战水平相当高。", ""));

        introduceList.add(new Introduce(Introduce.TEXT,
                DESC, ""));

        introduceList.add(new Introduce(Introduce.IMAGE, "",
                "https://raw.githubusercontent.com/ruzhan123/Lion/master/json/api/image/devin-williams01.jpg"));

        introduceList.add(new Introduce(Introduce.TEXT,
                "谁能想象，一个膝盖有伤，之前完全不会剪辑的街头球手能成为红火于youtube和业余篮球圈的篮球训练师? DW做到了。", ""));

        introduceList.add(new Introduce(Introduce.TEXT,
                "在一个偶然的契机下，他被两个华裔小子缠着教授运球，在反省自己对生活的态度后，他不辞辛劳的帮助兄弟俩matty和kyle训练，从未停歇。只要有时间，一周大部分时间，dw都带着兄弟俩练习各种篮球技术和身体训练，不练吐绝不停歇！", ""));

        introduceList.add(new Introduce(Introduce.TEXT,
                "在见到兄弟俩前，DW正过着不好的生活，他在大学里弄伤了自己的膝盖，对生活颓废，终日以大麻来蒙蔽自己，直到教授这两个华裔孩子，用他自己的话来说就是“我努力的保护着火种”。", ""));

        introduceList.add(new Introduce(Introduce.TEXT,
                "就这样《10000小时》系列诞生了，成为了经典的励志篮球训练纪录片。", ""));


        videoList.add(new Video(String.valueOf(ID + 11),
                "1，篮球训练纪录片10000小时", IMAGE, PLAY_COUNT, 1, "第一集",
                "http://player.bilibili.com/player.html?aid=26018197&cid=44588349&page=1"));

        videoList.add(new Video(String.valueOf(ID + 12),
                "2，篮球训练纪录片10000小时", IMAGE, PLAY_COUNT, 2, "第二集",
                "http://player.bilibili.com/player.html?aid=26020618&cid=44595701&page=1"));

        videoList.add(new Video(String.valueOf(ID + 13),
                "3，篮球训练纪录片10000小时", IMAGE, PLAY_COUNT, 3, "第三集",
                "http://player.bilibili.com/player.html?aid=26022794&cid=44600090&page=1"));

        videoList.add(new Video(String.valueOf(ID + 14),
                "4，篮球训练纪录片10000小时", IMAGE, PLAY_COUNT, 4, "第四集",
                "http://player.bilibili.com/player.html?aid=26022852&cid=44600143&page=1"));

        videoList.add(new Video(String.valueOf(ID + 15),
                "5，篮球训练纪录片10000小时", IMAGE, PLAY_COUNT, 5, "第五集",
                "http://player.bilibili.com/player.html?aid=26023084&cid=44600604&page=1"));

        videoList.add(new Video(String.valueOf(ID + 16),
                "6，篮球训练纪录片10000小时", IMAGE, PLAY_COUNT, 6, "第六集",
                "http://player.bilibili.com/player.html?aid=26023215&cid=44601502&page=1"));

        videoList.add(new Video(String.valueOf(ID + 16),
                "7，篮球训练纪录片10000小时", IMAGE, PLAY_COUNT, 6, "第七集",
                "http://player.bilibili.com/player.html?aid=26023344&cid=44602039&page=1"));

        videoList.add(new Video(String.valueOf(ID + 16),
                "8，篮球训练纪录片10000小时", IMAGE, PLAY_COUNT, 6, "第八集",
                "http://player.bilibili.com/player.html?aid=26023561&cid=44602501&page=1"));

        videoList.add(new Video(String.valueOf(ID + 16),
                "9，篮球训练纪录片10000小时", IMAGE, PLAY_COUNT, 6, "第九集",
                "http://player.bilibili.com/player.html?aid=26023991&cid=44603241&page=1"));

        videoList.add(new Video(String.valueOf(ID + 16),
                "10，篮球训练纪录片10000小时", IMAGE, PLAY_COUNT, 6, "第十集",
                "http://player.bilibili.com/player.html?aid=26024547&cid=44604081&page=1"));


        movie.id = String.valueOf(ID);
        movie.title = TITLE;
        movie.tag = TAG;
        movie.desc = DESC;
        movie.image = IMAGE;

        movieDetail.id = String.valueOf(ID + 3);
        movieDetail.movieId = String.valueOf(ID);
        movieDetail.title = TITLE;
        movieDetail.tag = TAG;
        movieDetail.desc = DESC;
        movieDetail.image = IMAGE;

        movieDetail.introduces = new ArrayList<>();
        movieDetail.introduces.addAll(introduceList);

        movieDetail.videos = new ArrayList<>();
        movieDetail.videos.addAll(videoList);
    }
}
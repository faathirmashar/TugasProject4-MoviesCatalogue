package com.faathir.tugasproject4.repository;

import com.faathir.tugasproject4.model.CastAndCrew;
import com.faathir.tugasproject4.model.Movies;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private static MovieRepository instance;
    private List<Movies> list = new ArrayList<>();

    public static MovieRepository getInstance(){
        if (instance == null){
            instance = new MovieRepository();
        }

        return instance;
    }

    public List<CastAndCrew> getHarryPotter2001(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/k5ROulKM24IJtv0jcRj1berhd8I.jpg", "Daniel Radcliffe"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iFlkpTaOF6fGLqxz8b0PhI0i0zN.jpg", "Rupert Grint"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hMOMOLbYXU2V2JINEXzAb6zXWI0.jpg", "Emma Watson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/51wDHVFNqrYgvUBMOcACAt4sJU9.jpg", "Richard Harris"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/7tADZs4ILE93oJ5pAh6mKQFEq2m.jpg", "Alan Rickman"));
        return al;
    }

    public List<CastAndCrew> getHarryPotter2001_part1(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/k5ROulKM24IJtv0jcRj1berhd8I.jpg", "Daniel Radcliffe"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iFlkpTaOF6fGLqxz8b0PhI0i0zN.jpg", "Rupert Grint"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hMOMOLbYXU2V2JINEXzAb6zXWI0.jpg", "Emma Watson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/akArncggHnusP5jxzMBKmJDRrMo.jpg", "Hugh Laurie"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iRVpNCEUDXfjaVqDrIkukUrMHH.jpg", "J.K. Rowling"));
        return al;
    }

    public List<CastAndCrew> getHarryPotter2002(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/k5ROulKM24IJtv0jcRj1berhd8I.jpg", "Daniel Radcliffe"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iFlkpTaOF6fGLqxz8b0PhI0i0zN.jpg", "Rupert Grint"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hMOMOLbYXU2V2JINEXzAb6zXWI0.jpg", "Emma Watson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/51wDHVFNqrYgvUBMOcACAt4sJU9.jpg", "Richard Harris"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/7tADZs4ILE93oJ5pAh6mKQFEq2m.jpg", "Alan Rickman"));
        return al;
    }

    public List<CastAndCrew> getHarryPotter2004(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/k5ROulKM24IJtv0jcRj1berhd8I.jpg", "Daniel Radcliffe"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iFlkpTaOF6fGLqxz8b0PhI0i0zN.jpg", "Rupert Grint"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hMOMOLbYXU2V2JINEXzAb6zXWI0.jpg", "Emma Watson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/ioVNfh5m8IyoM1DXRIiOU658RXm.jpg", "Gary Oldman"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/lWCGcTKvr4QUi8MvFBleMw8xY8.jpg", "David Thewlis"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/7tADZs4ILE93oJ5pAh6mKQFEq2m.jpg", "Alan Rickman"));
        return al;
    }

    public List<CastAndCrew> getHarryPotter2005(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/k5ROulKM24IJtv0jcRj1berhd8I.jpg", "Daniel Radcliffe"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iFlkpTaOF6fGLqxz8b0PhI0i0zN.jpg", "Rupert Grint"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hMOMOLbYXU2V2JINEXzAb6zXWI0.jpg", "Emma Watson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/l2UUoxIpskRxc3LjnIoeYG5wYtA.jpg", "Ralph Fiennes"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/blSvhjedLYFh0JrLPuOmHG1sjUu.jpg", "Michael Gambon"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/7tADZs4ILE93oJ5pAh6mKQFEq2m.jpg", "Alan Rickman"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/jOHs3xvlwRiiG2CLtso5zzmGCXg.jpg", "Robbie Coltrane"));
        return al;
    }

    public List<CastAndCrew> getHarryPotter2007(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/k5ROulKM24IJtv0jcRj1berhd8I.jpg", "Daniel Radcliffe"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iFlkpTaOF6fGLqxz8b0PhI0i0zN.jpg", "Rupert Grint"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hMOMOLbYXU2V2JINEXzAb6zXWI0.jpg", "Emma Watson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/l2UUoxIpskRxc3LjnIoeYG5wYtA.jpg", "Ralph Fiennes"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/blSvhjedLYFh0JrLPuOmHG1sjUu.jpg", "Michael Gambon"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/7tADZs4ILE93oJ5pAh6mKQFEq2m.jpg", "Alan Rickman"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/jOHs3xvlwRiiG2CLtso5zzmGCXg.jpg", "Robbie Coltrane"));
        return al;
    }

    public List<CastAndCrew> getHarryPotter2009(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/k5ROulKM24IJtv0jcRj1berhd8I.jpg", "Daniel Radcliffe"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iFlkpTaOF6fGLqxz8b0PhI0i0zN.jpg", "Rupert Grint"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hMOMOLbYXU2V2JINEXzAb6zXWI0.jpg", "Emma Watson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/bg5TcioIqc5Kt6CE609wXziZ9Cm.jpg", "Tom Felton"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/blSvhjedLYFh0JrLPuOmHG1sjUu.jpg", "Michael Gambon"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/8ovAhq8t8d4Z0ldERz3x0pylvDJ.jpg", "Jim Broadbent"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iaBdrPPVtBSai04xbwKPOSYJKTB.jpg", "Helena Bonham Carter"));
        return al;
    }

    public List<CastAndCrew> getHarryPotter2010_part1(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/k5ROulKM24IJtv0jcRj1berhd8I.jpg", "Daniel Radcliffe"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iFlkpTaOF6fGLqxz8b0PhI0i0zN.jpg", "Rupert Grint"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hMOMOLbYXU2V2JINEXzAb6zXWI0.jpg", "Emma Watson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/blSvhjedLYFh0JrLPuOmHG1sjUu.jpg", "Michael Gambon"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/7tADZs4ILE93oJ5pAh6mKQFEq2m.jpg", "Alan Rickman"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/l2UUoxIpskRxc3LjnIoeYG5wYtA.jpg", "Ralph Fiennes"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iaBdrPPVtBSai04xbwKPOSYJKTB.jpg", "Helena Bonham Carter"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/xrMzXXR201n5u32OCS1UTLjGrQv.jpg", "Bill Nighy"));
        return al;
    }

    public List<CastAndCrew> getHarryPotter2011_part2(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/k5ROulKM24IJtv0jcRj1berhd8I.jpg", "Daniel Radcliffe"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iFlkpTaOF6fGLqxz8b0PhI0i0zN.jpg", "Rupert Grint"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hMOMOLbYXU2V2JINEXzAb6zXWI0.jpg", "Emma Watson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/7tADZs4ILE93oJ5pAh6mKQFEq2m.jpg", "Alan Rickman"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/l2UUoxIpskRxc3LjnIoeYG5wYtA.jpg", "Ralph Fiennes"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/xuqPZ9Go8qe3G35tVhtRX1QvN21.jpg", "Maggie Smith"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iaBdrPPVtBSai04xbwKPOSYJKTB.jpg", "Helena Bonham Carter"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/xQGPeaIQ6KJXUFbPPW70xKCR5Ee.jpg", "Bonnie Wright"));
        return al;
    }

    public List<CastAndCrew> getHarryPotter2011(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/k5ROulKM24IJtv0jcRj1berhd8I.jpg", "Daniel Radcliffe"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iFlkpTaOF6fGLqxz8b0PhI0i0zN.jpg", "Rupert Grint"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hMOMOLbYXU2V2JINEXzAb6zXWI0.jpg", "Emma Watson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/jOHs3xvlwRiiG2CLtso5zzmGCXg.jpg", "Robbie Coltrane"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/AqzmmXnlMervwvb9pHlvOZbC1xs.jpg", "Julie Walters"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/gdlEDhxSmPv3hWHbpTuwCI5Jrtk.jpg", "Mark Williams"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iRVpNCEUDXfjaVqDrIkukUrMHH.jpg", "J.K. Rowling"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/nlim5RpNgpNcN0BWhhOCWmaMEHI.jpg", "Jason Isaacs"));
        return al;
    }

    public List<CastAndCrew> getHarryPotter2017(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/tABRYOHUQeaUCAqrelJV5ZHjl1W.jpg", "Imelda Staunton"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iRVpNCEUDXfjaVqDrIkukUrMHH.jpg", "J.K. Rowling"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/lWCGcTKvr4QUi8MvFBleMw8xY8.jpg", "David Thewlis"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/etcnzREze1PTIYhml6DwgvG5zbA.jpg", "Warwick Davis"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/m926T7P8YZBlb1qa6TnIlAMaoZg.jpg", "Evanna Lynch"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/aYvGgFGj9lFyrCd9yT6M8XZojGB.jpg", "Miriam Margolyes"));
        return al;
    }

    public List<CastAndCrew> getHarryPotter2018(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/k5ROulKM24IJtv0jcRj1berhd8I.jpg", "Daniel Radcliffe"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iFlkpTaOF6fGLqxz8b0PhI0i0zN.jpg", "Rupert Grint"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hMOMOLbYXU2V2JINEXzAb6zXWI0.jpg", "Emma Watson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/tABRYOHUQeaUCAqrelJV5ZHjl1W.jpg", "Imelda Staunton"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iRVpNCEUDXfjaVqDrIkukUrMHH.jpg", "J.K. Rowling"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/lWCGcTKvr4QUi8MvFBleMw8xY8.jpg", "David Thewlis"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/etcnzREze1PTIYhml6DwgvG5zbA.jpg", "Warwick Davis"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/m926T7P8YZBlb1qa6TnIlAMaoZg.jpg", "Evanna Lynch"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/aYvGgFGj9lFyrCd9yT6M8XZojGB.jpg", "Miriam Margolyes"));
        return al;
    }

    public List<CastAndCrew> getHarryPotter2010_part3(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/k5ROulKM24IJtv0jcRj1berhd8I.jpg", "Daniel Radcliffe"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iFlkpTaOF6fGLqxz8b0PhI0i0zN.jpg", "Rupert Grint"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hMOMOLbYXU2V2JINEXzAb6zXWI0.jpg", "Emma Watson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/oDF0GxbLmbuZurVwdXvGn8vc78v.jpg", "Matthew Lewis"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/m926T7P8YZBlb1qa6TnIlAMaoZg.jpg", "Evanna Lynch"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/jOHs3xvlwRiiG2CLtso5zzmGCXg.jpg", "Robbie Coltrane"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/4XvTIzPlJL4Oi6OvzVimlYwgbXw.jpg", "Toby Jones"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/lWCGcTKvr4QUi8MvFBleMw8xY8.jpg", "David Thewlis"));
        return al;
    }

    public List<CastAndCrew> getHarryPotter2009_part2(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/k5ROulKM24IJtv0jcRj1berhd8I.jpg", "Daniel Radcliffe"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iFlkpTaOF6fGLqxz8b0PhI0i0zN.jpg", "Rupert Grint"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hMOMOLbYXU2V2JINEXzAb6zXWI0.jpg", "Emma Watson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/jOHs3xvlwRiiG2CLtso5zzmGCXg.jpg", "Robbie Coltrane"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/bg5TcioIqc5Kt6CE609wXziZ9Cm.jpg", "Tom Felton"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/gdlEDhxSmPv3hWHbpTuwCI5Jrtk.jpg", "Mark Williams"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/AqzmmXnlMervwvb9pHlvOZbC1xs.jpg", "Julie Walters"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/kLW1Q53NRuB0EihduBFX3Lbtcl6.jpg", "John Hurt"));
        return al;
    }

    public List<CastAndCrew> getHarryPotter2011_part6(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/k5ROulKM24IJtv0jcRj1berhd8I.jpg", "Daniel Radcliffe"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iFlkpTaOF6fGLqxz8b0PhI0i0zN.jpg", "Rupert Grint"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hMOMOLbYXU2V2JINEXzAb6zXWI0.jpg", "Emma Watson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/jOHs3xvlwRiiG2CLtso5zzmGCXg.jpg", "Robbie Coltrane"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/bg5TcioIqc5Kt6CE609wXziZ9Cm.jpg", "Tom Felton"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/gdlEDhxSmPv3hWHbpTuwCI5Jrtk.jpg", "Mark Williams"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/AqzmmXnlMervwvb9pHlvOZbC1xs.jpg", "Julie Walters"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/kLW1Q53NRuB0EihduBFX3Lbtcl6.jpg", "John Hurt"));
        return al;
    }

    public List<CastAndCrew> getHarryPotter2011_part5(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/k5ROulKM24IJtv0jcRj1berhd8I.jpg", "Daniel Radcliffe"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iFlkpTaOF6fGLqxz8b0PhI0i0zN.jpg", "Rupert Grint"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hMOMOLbYXU2V2JINEXzAb6zXWI0.jpg", "Emma Watson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/jOHs3xvlwRiiG2CLtso5zzmGCXg.jpg", "Robbie Coltrane"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/bg5TcioIqc5Kt6CE609wXziZ9Cm.jpg", "Tom Felton"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/gdlEDhxSmPv3hWHbpTuwCI5Jrtk.jpg", "Mark Williams"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/AqzmmXnlMervwvb9pHlvOZbC1xs.jpg", "Julie Walters"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/kLW1Q53NRuB0EihduBFX3Lbtcl6.jpg", "John Hurt"));
        return al;
    }

    public List<CastAndCrew> getHarryPotter2012_part8(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/k5ROulKM24IJtv0jcRj1berhd8I.jpg", "Daniel Radcliffe"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iFlkpTaOF6fGLqxz8b0PhI0i0zN.jpg", "Rupert Grint"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hMOMOLbYXU2V2JINEXzAb6zXWI0.jpg", "Emma Watson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/jOHs3xvlwRiiG2CLtso5zzmGCXg.jpg", "Robbie Coltrane"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/bg5TcioIqc5Kt6CE609wXziZ9Cm.jpg", "Tom Felton"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/gdlEDhxSmPv3hWHbpTuwCI5Jrtk.jpg", "Mark Williams"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/AqzmmXnlMervwvb9pHlvOZbC1xs.jpg", "Julie Walters"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/kLW1Q53NRuB0EihduBFX3Lbtcl6.jpg", "John Hurt"));
        return al;
    }

    public List<CastAndCrew> getHarryPotter2009_part1(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/k5ROulKM24IJtv0jcRj1berhd8I.jpg", "Daniel Radcliffe"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iFlkpTaOF6fGLqxz8b0PhI0i0zN.jpg", "Rupert Grint"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hMOMOLbYXU2V2JINEXzAb6zXWI0.jpg", "Emma Watson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/51wDHVFNqrYgvUBMOcACAt4sJU9.jpg", "Richard Harris"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/7tADZs4ILE93oJ5pAh6mKQFEq2m.jpg", "Alan Rickman"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/xuqPZ9Go8qe3G35tVhtRX1QvN21.jpg", "Maggie Smith"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/jOHs3xvlwRiiG2CLtso5zzmGCXg.jpg", "Robbie Coltrane"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/bg5TcioIqc5Kt6CE609wXziZ9Cm.jpg", "Tom Felton"));
        return al;
    }

    public List<CastAndCrew> getHarryPotter2012_part7(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/k5ROulKM24IJtv0jcRj1berhd8I.jpg", "Daniel Radcliffe"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iFlkpTaOF6fGLqxz8b0PhI0i0zN.jpg", "Rupert Grint"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hMOMOLbYXU2V2JINEXzAb6zXWI0.jpg", "Emma Watson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/jOHs3xvlwRiiG2CLtso5zzmGCXg.jpg", "Robbie Coltrane"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/bg5TcioIqc5Kt6CE609wXziZ9Cm.jpg", "Tom Felton"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/gdlEDhxSmPv3hWHbpTuwCI5Jrtk.jpg", "Mark Williams"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/AqzmmXnlMervwvb9pHlvOZbC1xs.jpg", "Julie Walters"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/kLW1Q53NRuB0EihduBFX3Lbtcl6.jpg", "John Hurt"));
        return al;
    }

    public List<CastAndCrew> getHarryPotter2010_part4(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/k5ROulKM24IJtv0jcRj1berhd8I.jpg", "Daniel Radcliffe"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iFlkpTaOF6fGLqxz8b0PhI0i0zN.jpg", "Rupert Grint"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hMOMOLbYXU2V2JINEXzAb6zXWI0.jpg", "Emma Watson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/oDF0GxbLmbuZurVwdXvGn8vc78v.jpg", "Matthew Lewis"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/xQGPeaIQ6KJXUFbPPW70xKCR5Ee.jpg", "Bonnie Wright"));
        return al;
    }

    public void init(){
        list.clear();
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/wuMc08IPKEatf9rnMNXvIDxqP4W.jpg","Harry Potter and the Philosopher's Stone (2001)","Harry Potter has lived under the stairs at his aunt and uncle's house his whole life. But on his 11th birthday, he learns he's a powerful wizard -- with a place waiting for him at the Hogwarts School of Witchcraft and Wizardry. As he learns to harness his newfound powers with the help of the school's kindly headmaster, Harry uncovers the truth about his parents' deaths -- and about the villain who's to blame.","Adventure, Fantasy, Family","2h 32m","Chris Columbus","2001", getHarryPotter2001()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/csOv5H7R2zdnKaYuTrGVWohmo8d.jpg","Harry Potter and the Chamber of Secrets (2002)","Cars fly, trees fight back, and a mysterious house-elf comes to warn Harry Potter at the start of his second year at Hogwarts. Adventure and danger await when bloody writing on a wall announces: The Chamber Of Secrets Has Been Opened. To save Hogwarts will require all of Harry, Ron and Hermione’s magical abilities and courage.","Adventure, Fantasy","2h 41m","Chris Columbus","2002", getHarryPotter2002()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/uDQibffYgssdiqx7izO57wdLc6.jpg","Harry Potter and the Prisoner of Azkaban (2004)","Harry, Ron and Hermione return to Hogwarts for another magic-filled year. Harry comes face to face with danger yet again, this time in the form of escaped convict, Sirius Black—and turns to sympathetic Professor Lupin for help.","Adventure, Fantasy","2h 21m","Alfonso Cuarón","2004", getHarryPotter2004()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/fECBtHlr0RB3foNHDiCBXeg9Bv9.jpg","Harry Potter and the Goblet of Fire (2005)","Harry starts his fourth year at Hogwarts, competes in the treacherous Triwizard Tournament and faces the evil Lord Voldemort. Ron and Hermione help Harry manage the pressure – but Voldemort lurks, awaiting his chance to destroy Harry and all that he stands for.","Adventure, Fantasy, Family","2h 37m","Mike Newell","2005", getHarryPotter2005()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/g6n8G0xPnBVUIKKK41sNmbZB5h4.jpg","Harry Potter and the Order of the Phoenix (2007)","Returning for his fifth year of study at Hogwarts, Harry is stunned to find that his warnings about the return of Lord Voldemort have been ignored. Left with no choice, Harry takes matters into his own hands, training a small group of students – dubbed 'Dumbledore's Army' – to defend themselves against the dark arts.","Adventure, Fantasy, Mystery","2h 18m","David Yates","2007", getHarryPotter2007()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/Ag21otqbeynZPGjEbzyr3X5Us0j.jpg","Harry Potter and the Half-Blood Prince (2009)","As Harry begins his sixth year at Hogwarts, he discovers an old book marked as 'Property of the Half-Blood Prince', and begins to learn more about Lord Voldemort's dark past.","Adventure, Fantasy","2h 33m","David Yates","2009", getHarryPotter2009()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iGoXIpQb7Pot00EEdwpwPajheZ5.jpg","Harry Potter and the Deathly Hallows: Part 1 (2010)","Harry, Ron and Hermione walk away from their last year at Hogwarts to find and destroy the remaining Horcruxes, putting an end to Voldemort's bid for immortality. But with Harry's beloved Dumbledore dead and Voldemort's unscrupulous Death Eaters on the loose, the world is more dangerous than ever.","Adventure, Fantasy","2h 26m","David Yates","2010", getHarryPotter2010_part1()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/c54HpQmuwXjHq2C9wmoACjxoom3.jpg","Harry Potter and the Deathly Hallows: Part 2 (2011)","Harry, Ron and Hermione continue their quest to vanquish the evil Voldemort once and for all. Just as things begin to look hopeless for the young wizards, Harry discovers a trio of magical objects that endow him with powers to rival Voldemort's formidable skills.","Fantasy, Adventure","2h 10m","David Yates","2011", getHarryPotter2011_part2()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/peJehrEiA5xD9sFBuL61MQdFY0n.jpg","Harry Potter - A History Of Magic (2017)","A thrilling journey through legends, belief and folklore, this film goes behind the scenes with the British Library as they search to tell that story through objects in their collection, in an ambitious new exhibition: Harry Potter: A History Of Magic. J.K. Rowling, who is lending unseen manuscripts, drawings and drafts from her private archives (which will sit alongside treasures from the British Library, as well as original drafts and drawings from Jim Kay) talks about some of the personal items she has lent to the exhibition and gives new insight into her writing, looking at some of the objects from the exhibition that have fired her imagination.","Documentary","1h","Alex Harding","2017", getHarryPotter2017()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/g1xiBoLD6v3ZaXPa4QtuXiQeYKW.jpg","50 Greatest Harry Potter Moments (2011)","To mark the release two weeks ago of the eighth and final movie in the series, Robbie Coltrane narrates a countdown of the movie franchise's best moments. From Harry's first meeting with Ron and Hermione aboard the Hogwarts Express through to magical mysteries. We don't have any crew added to this movie. You can help by adding some!","Documentary","1h 33m","","2011", getHarryPotter2011()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/yLpnOqKw3ZycFu8t5Gil1BqTbnB.jpg","Discovering the Real World of Harry Potter (2001)","Explore the myths and legends that inhabit the real world of Harry Potter. Follow award-winning documentary filmmakers as they offer insights to witches, wizards, Greek gods, ancient Celts, ghosts, magical creatures, alchemy, and ancient spells. Narrated by British actor Hugh Laurie, this fascinating documentary brings new dimensions to the historical and scientific world behind the Harry Potter series.","Family, Documentary","1h 12m","Shaun Trevisick","2001", getHarryPotter2001_part1()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/s0FRUpp9nsM0N8F2S7hdIgeAkHy.jpg","The Story of Harry Potter (2018)","A three-part documentary series by Mikey Neumann exploring the behind-the-scenes stories of the eight core Harry Potter films, as well as deconstructing their themes and messages.","Documentary","1h 27m","Mikey Neumann","2018", getHarryPotter2018()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/v3ODn1gs59phQVICGnV44hWbVnE.jpg","Creating the World of Harry Potter, Part 3: Creatures (2010)","Soar on the back of Buckbeak. Battle a Hungarian Horntail. Trace Voldemort’s terrifying transformation from grotesque infant-like creature to Dark Lord. Fascinating footage lets you experience the Harry Potter world of creatures through new eyes with this revealing look at a new group of wizards: the artists who create the monsters and marvels. Roam the Creature Shop, where actors turn into beasts and sketches turn into animatronic wonders. Join Daniel Radcliffe, Rupert Grint and Emma Watson as they share stories about acting opposite everything from tiny computer-generated pixies to a four-ton mechanical spider (and guess which young star is really afraid of spiders?). New discoveries and new revelations all make your journeys into Harry’s world even more thrilling!","Documentary, Fantasy","1h 3m","Mike Newell","2010", getHarryPotter2010_part3()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/2FWEkiVZkHkEpU8YTgl1oraX2MP.jpg","Creating the World of Harry Potter, Part 2: Characters (2009)","“We really do look at the story and characters first,” producer David Heyman says. “That's the heart and that's the soul of the film.” And that's the heart and soul of this incisive, decade-spanning exploration of how the series' actors bring the beloved Harry Potter characters to life. Discover which parts of the J.K. Rowling books helped Daniel Radcliffe, Rupert Grint, Emma Watson, and more stars make their roles leap from page to screen. See screen tests, including Evanna Lynch (Luna Lovegood) and Jessie Cave (Lavender Brown) working with the established stars. Learn why so many of Britain's acting greats wanted to be part of Harry Potter's world... and which ones became mentors to the young stars. Share each director's vision as you watch Daniel, Rupert and Emma grow up with Harry, Ron and Hermione. Your journey into Harry’s world continues.","Documentary, Fantasy","1h 20m","Chris Columbus","2009", getHarryPotter2009_part2()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/72wzHtfjNnDicCdRtQwuvWH93ba.jpg","Creating the World of Harry Potter, Part 6: Magical Effects (2011)","In Harry Potter's world, portraits come to life, potions transform, time reverses, Quidditch players soar, dragons attack and magic is everywhere. Explore the movie making magic that created the wizardry and wonder of the Harry Potter film series. Now, fascinating insights, interviews and watch-it-happen footage let you experience the triumphs of the technical wizards who conjured up an awe-inspiring alternate reality. Share the fun as Daniel Radcliffe, Emma Watson, and Rupert Grint negotiate the moving stairs. Marvel as an oversized water tank transforms into the depths of the black lake for the Triwizard Tournament. Discover which amazing sequence was filmed entirely using computer-generated imagery. Watch as blue and green screen backgrounds transform into towering structures and endless landscapes. You don't know the magic until you've seen Magical Effects.","Documentary, Fantasy","1h 4m","J.K. Rowling","2011", getHarryPotter2011_part6()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/5YnYNMpMP0qYgMwCkSZybVbPyBg.jpg","Creating the World of Harry Potter, Part 5: Evolution (2011)","Deeper. Bolder. Darker. As the eight Harry Potter films trace Harry's journey from innocent schoolboy to selfless hero, the series undergoes a transformation. Evolution - packed with exclusive content - takes you along for every exciting step of the 10-year film making odyssey. Join the four directors and key members of the crew and cast, including Daniel Radcliffe, Rupert Grint and Emma Watson, as they explore how the creative vision for the films evolved to maintain the integrity and increasing intensity of J.K. Rowling's expansive literary series. From the ever-changing architecture of Hogwarts castle and growing landscape of the wizarding world, to the darkening palette of each successive film, to the young actors maturing along with their characters, it is a wondrous and spectacular adventure to experience.","Documentary, Fantasy","57m","J.K. Rowling","2011", getHarryPotter2011_part5()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/xqiGg8V17f40voMQAFhNqPpOHbD.jpg","Creating the World of Harry Potter, Part 8: Growing Up (2012)","By the time the final film wrapped, the young stars of Harry Potter had spent nearly half their lives on set. In Growing Up, new and vintage interviews show how the actors have grown over the course of the series, while behind-the-scenes footage gives an exclusive look at their lives. Watch how their ideas of acting, fame, their characters, and themselves have changed. Finally, say farewell to the series with Daniel Radcliffe as he delivers an emotionally charged speech to the cast and crew.","Documentary, Fantasy","49m","J.K. Rowling","2012", getHarryPotter2012_part8()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/rMDSrALDxq6IP6GBYwejKFzPbUS.jpg","Creating the World of Harry Potter, Part 1: The Magic Begins (2009)","The magic begins. The choices, the breakthroughs, the early decisions that impacted all the films are explored here via rare footage, cast and crew reminiscences and more. Learn about the extensive search by producer David Heyman and director Chris Columbus for the perfect actors to portray Harry, Ron and Hermione and see the earliest meeting of Daniel Radcliffe, Rupert Grint and Emma Watson. Be on the scene as imagination and know-how combine to create a look that's distinctly wizardly. From details tiny (what about Hermione's buckteeth?) to huge (Quidditch, anyone?), this is the fun and fascinating opening of a whole new portal into Harry's world.","Documentary, Fantasy","1h 3m","Chris Columbus","2009", getHarryPotter2009_part1()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/blUbVQHbRoYAJeckElbpXhCklli.jpg","Creating the World of Harry Potter, Part 7: Story (2012)","Over the course of ten years, screenwriter Steve Kloves worked tirelessly with author J.K. Rowling to develop her magical books into films. From the beginning, Kloves had to decide what to keep, what to change, and what to cut, all while staying true to Rowling's vision, initially without even knowing how the series ended! Learn the story behind the stories as they sit down together for an intimate, free-flowing conversation.","Documentary, Fantasy","47m","James Wan","2012", getHarryPotter2012_part7()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/rS2rK4NQyuO97zLMR35OSNYhJ0z.jpg","Creating the World of Harry Potter, Part 4: Sound and Music (2010)","Can you imagine the Yule Ball without the Potter Waltz? Quidditch without the whoooosh of flying? Or any Harry Potter film without the iconic Hedwig’s Theme? Now, riveting interviews and behind-the- scenes glimpses let you share the vision of composers, sound experts, and others who make the Harry Potter films enchantment for the ears as well as the eyes. Experience sound and music that magnify triumph and fear, joy and suspense, while transporting viewers on an emotional journey alongside the on-screen characters. Learn how specially created musical motifs identify individual characters and places. Watch as Foley artists use unusual techniques to replicate everyday sounds. Discover a whole new way to look at – and listen to – Harry’s world.","Documentary, Fantasy","54m","Chris Columbus","2010", getHarryPotter2010_part4()));
    }

    public List<Movies> getData(){
        return list;
    }

    public void removeIndex(int index){
        getData().remove(index);
    }

    public void clearData(){
        list.clear();
    }
}

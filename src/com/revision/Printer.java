package com.revision;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
      this.duplex = duplex;
        if (tonerLevel >-1 && tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel=-1;
        }
        this.pagesPrinted =0;
    }



    public int addToner(int tonerAmount){
        if (tonerAmount>=0 && tonerAmount<=100){
            if ((tonerAmount+this.tonerLevel)>100){
                return -1;
            }else {
                this.tonerLevel+=tonerAmount;
                return this.tonerLevel;
            }
        }else {
            return -1;
        }
    }


    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = (pages/2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        pages += pagesToPrint;
        return pagesToPrint;
    }
//
//    public int printPages(int pages){
//        int pagesToPrint = pages;
//        if (duplex=true){
//            pagesPrinted+=pagesToPrint;
//        }
//        return pagesToPrint;
//    }


    public int getPagesPrinted(){
        return pagesPrinted;
    }



}

package pl.sz.bunin.mihail.phone.phone;

import pl.sz.bunin.mihail.phone.model.IPhone;
import pl.sz.bunin.mihail.phone.model.SamsungPhone;

public class Main {
    public static void main(String[] args) {
        IPhone iphone=new IPhone("Iphone",13,5.5,512,1000);
        iphone.aboutPhone();
        iphone.call();
        iphone.sendMessage();
        iphone.makePhoto();
        iphone.makeVideo();

        SamsungPhone samsung=new SamsungPhone("Samsung",20,6,256,800);
        samsung.aboutPhone();
        samsung.call();
        samsung.sendMessage();

    }
    }






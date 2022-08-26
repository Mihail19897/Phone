package pl.sz.bunin.mihail.phone.model;

import pl.sz.bunin.mihail.phone.phone.Phone;
import pl.sz.bunin.mihail.phone.phone.PhoneConnection;
import pl.sz.bunin.mihail.phone.phone.PhoneMedia;

public class IPhone extends Phone implements PhoneConnection, PhoneMedia {


    public IPhone(String label, int model, double display, int memory, int price) {
        super(label, model, display, memory, price);
    }

    @Override
    public void aboutPhone() {
       System.out.println("Характеристики телефона: \n * Марка телефона - "+ getLabel()+"\n * Модель - "+getModel()+"\n * Дисплэй - "+getDisplay()+"\n * Объем памяти - "+getMemory()+" ГБ"+"\n * Цена - "+getPrice()+" у.е.");
    }

    @Override
    public void call() {
        System.out.println("........Идет соединение ........");

    }

    @Override
    public void sendMessage() {
        System.out.println("........Отправка СМС........");
    }

    @Override
    public void makePhoto() {
        System.out.println("........Камера включена........");

    }

    @Override
    public void makeVideo() {
        System.out.println("........Идет видеозапись........");

    }
}


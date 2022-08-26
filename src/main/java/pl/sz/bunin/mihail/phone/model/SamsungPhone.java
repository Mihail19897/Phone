package pl.sz.bunin.mihail.phone.model;

import pl.sz.bunin.mihail.phone.phone.Phone;
import pl.sz.bunin.mihail.phone.phone.PhoneConnection;

public class SamsungPhone extends Phone implements PhoneConnection {
    public SamsungPhone(String label, int model, double display, int memory, int price) {
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
}

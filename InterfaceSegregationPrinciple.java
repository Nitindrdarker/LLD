interface Device {
}

interface CallingDevice extends Device {
    void call();
}

interface CameraDevice extends Device {
    void takePhoto();
}

interface PrintingDevice extends Device {
    void print();
}

class SmartPhone implements CallingDevice, CameraDevice {

    @Override
    public void call() {
        System.out.println("SmartPhone is making a call");
    }

    @Override
    public void takePhoto() {
        System.out.println("SmartPhone is taking a photo");
    }
}

class SmartWatch implements CallingDevice {

    @Override
    public void call() {
        System.out.println("SmartWatch is making a call");
    }
}

class Printer implements PrintingDevice {

    @Override
    public void print() {
        System.out.println("Printer is printing a document");
    }
}

class InterfaceSegregationPrinciple {
    public static void main(String[] args) {

        CallingDevice phone = new SmartPhone();
        phone.call();

        CameraDevice camera = new SmartPhone();
        camera.takePhoto();

        CallingDevice watch = new SmartWatch();
        watch.call();

        PrintingDevice printer = new Printer();
        printer.print();
    }
}
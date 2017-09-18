package net.address;

class App {
    public static void main(String[] args) {
        try {
            if(args.length != 2) {
                throw new Exception(Constants.ERROR_MAP.get(ErrorType.INVALID_NUMBER_OF_PARAMETERS));
            }

            Address ipAddress = new Address(args[0]);
            Address maskAddress = new Address(args[1]);
            Integer[] netAddress = Address.getNetAddress(ipAddress, maskAddress);
            printAddress(netAddress);
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
    }

  public static void printAddress(Integer[] netAddress) {
        System.out.printf("Net Address: %d.%d.%d.%d\n",netAddress[0], netAddress[1], netAddress[2], netAddress[3]);
        ;
    }
}
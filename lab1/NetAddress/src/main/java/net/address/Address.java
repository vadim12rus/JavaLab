package net.address;

class Address {
    public Address(String strAddress) throws Exception {
        ip = Parser.ipParser(strAddress);
    }

    public static Integer[] getNetAddress(Address ipAddress, Address maskAddress) {
        Integer[] ip = ipAddress.ip;
        Integer[] mask = maskAddress.ip;
        Integer[] netAddress = new Integer[ip.length];
        for(int i = 0; i < ip.length; ++i) {
            netAddress[i] = ip[i] & mask[i];
        }
        return netAddress;
    }

    private Integer[] ip;
}
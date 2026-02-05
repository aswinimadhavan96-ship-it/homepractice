class CityBus extends Transport {
    @Override
    void calculateFare() {
        fare = distance * 5;
    }
}

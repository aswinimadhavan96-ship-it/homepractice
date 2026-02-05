class LuxuryBus extends Transport {
    @Override
    void calculateFare() {
        fare = (distance * 10) + 200;
    }
}

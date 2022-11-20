package org.example;

public abstract class IPayment {
    private float charge;

    public void setCharge(float charge) {
        this.charge = charge;
    }
    public float getCharge() {
        return charge;
    }

    public abstract float payment(float amount);

    public abstract float offers( float amount, float offer);

}

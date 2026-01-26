package defpackage;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:ai.class */
public final class ai {
    public int eF;
    public int eG;
    public int gh;
    public int gi;

    public ai() {
    }

    public ai(int i, int i2, int i3, int i4) {
        this.eF = i;
        this.eG = i2;
        this.gh = i3;
        this.gi = i4;
    }

    public final void c(int i, int i2, int i3, int i4) {
        this.eF = i;
        this.eG = i2;
        this.gh = i3;
        this.gi = i4;
    }

    public final void h(ai aiVar) {
        this.eF = aiVar.eF;
        this.eG = aiVar.eG;
        this.gh = aiVar.gh;
        this.gi = aiVar.gi;
    }

    public final void aT() {
        this.gi = 0;
        this.gh = 0;
        this.eG = 0;
        this.eF = 0;
    }

    public final boolean c(ai aiVar) {
        if (aiVar.eF >= this.eF + this.gh || aiVar.eG >= this.eG + this.gi || this.eF >= aiVar.eF + aiVar.gh || this.eG >= aiVar.eG + aiVar.gi) {
            this.gi = 0;
            this.gh = 0;
            this.eG = 0;
            this.eF = 0;
            return false;
        }
        if (this.eF < aiVar.eF) {
            this.gh -= aiVar.eF - this.eF;
            this.eF = aiVar.eF;
        }
        if (this.eG < aiVar.eG) {
            this.gi -= aiVar.eG - this.eG;
            this.eG = aiVar.eG;
        }
        if (this.eF + this.gh > aiVar.eF + aiVar.gh) {
            this.gh = (aiVar.eF + aiVar.gh) - this.eF;
        }
        if (this.eG + this.gi > aiVar.eG + aiVar.gi) {
            this.gi = (aiVar.eG + aiVar.gi) - this.eG;
        }
        return this.gh > 0 && this.gi > 0;
    }

    public final void i(ai aiVar) {
        d(aiVar.eF, aiVar.eG, aiVar.gh, aiVar.gi);
    }

    private void d(int i, int i2, int i3, int i4) {
        int i5 = this.eF + this.gh;
        int i6 = i + i3;
        if (i < this.eF) {
            this.eF = i;
        }
        if (i5 > i6) {
            this.gh = i5 - this.eF;
        } else {
            this.gh = i6 - this.eF;
        }
        int i7 = this.eG + this.gi;
        int i8 = i2 + i4;
        if (i2 < this.eG) {
            this.eG = i2;
        }
        if (i7 > i8) {
            this.gi = i7 - this.eG;
        } else {
            this.gi = i8 - this.eG;
        }
    }

    public final String toString() {
        return new String(new StringBuffer().append("{ x=").append(this.eF).append(" y=").append(this.eG).append(" dx=").append(this.gh).append(" dy=").append(this.gi).append(" }").toString());
    }
}

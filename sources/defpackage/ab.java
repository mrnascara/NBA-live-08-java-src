package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:ab.class */
public final class ab {
    private static int[] V = new int[3];
    public int eF;
    public int eG;
    public int eH;

    public ab() {
        this.eH = 0;
    }

    public ab(ab abVar) {
        this.eF = abVar.eF;
        this.eG = abVar.eG;
        this.eH = abVar.eH;
    }

    public ab(int i, int i2, int i3) {
        this.eF = i;
        this.eG = i2;
        this.eH = i3;
    }

    public final void B(int i, int i2) {
        this.eF = i;
        this.eG = i2;
    }

    public final void h(int i, int i2, int i3) {
        this.eF = i;
        this.eG = i2;
        this.eH = i3;
    }

    public final void c(ab abVar) {
        this.eF = abVar.eF;
        this.eG = abVar.eG;
        this.eH = abVar.eH;
    }

    public final void aT() {
        this.eF = 0;
        this.eG = 0;
        this.eH = 0;
    }

    public final void d(ab abVar) {
        this.eF += abVar.eF;
        this.eG += abVar.eG;
        this.eH += abVar.eH;
    }

    public final void a(ab abVar, ab abVar2) {
        this.eF = abVar.eF + abVar2.eF;
        this.eG = abVar.eG + abVar2.eG;
        this.eH = abVar.eH + abVar2.eH;
    }

    public final void e(ab abVar) {
        this.eF -= abVar.eF;
        this.eG -= abVar.eG;
        this.eH -= abVar.eH;
    }

    public final void b(ab abVar, ab abVar2) {
        this.eF = abVar.eF - abVar2.eF;
        this.eG = abVar.eG - abVar2.eG;
        this.eH = abVar.eH - abVar2.eH;
    }

    public final void R(int i) {
        this.eF = t.e(this.eF, i);
        this.eG = t.e(this.eG, i);
        this.eH = t.e(this.eH, i);
    }

    public final void c(ab abVar, int i) {
        this.eF = t.e(abVar.eF, i);
        this.eG = t.e(abVar.eG, i);
        this.eH = t.e(abVar.eH, i);
    }

    public final void d(ab abVar, int i) {
        this.eF += t.e(abVar.eF, i);
        this.eG += t.e(abVar.eG, i);
        this.eH += t.e(abVar.eH, i);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static int m11a(ab abVar, ab abVar2) {
        return t.e(abVar.eF, abVar2.eF) + t.e(abVar.eG, abVar2.eG) + t.e(abVar.eH, abVar2.eH);
    }

    /* renamed from: b, reason: collision with other method in class */
    public static int m12b(ab abVar, ab abVar2) {
        return t.e(abVar.eF, abVar2.eF) + t.e(abVar.eG, abVar2.eG);
    }

    public final int length() {
        return t.c(this.eF, this.eG, this.eH);
    }

    public final int F() {
        return (int) t.a(this.eF, this.eG, this.eH);
    }

    public final int G() {
        int iA = t.a(this.eF, this.eG, this.eH, V);
        this.eF = V[0];
        this.eG = V[1];
        this.eH = V[2];
        return iA;
    }

    public final int get(int i) {
        return i == 0 ? this.eF : i == 1 ? this.eG : this.eH;
    }

    public final void C(int i, int i2) {
        if (i == 0) {
            this.eF = i2;
        } else if (i == 1) {
            this.eG = i2;
        } else {
            this.eH = i2;
        }
    }

    public final void a(DataInputStream dataInputStream) throws IOException {
        this.eF = dataInputStream.readInt();
        this.eG = dataInputStream.readInt();
        this.eH = dataInputStream.readInt();
    }

    public final void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.eF);
        dataOutputStream.writeInt(this.eG);
        dataOutputStream.writeInt(this.eH);
    }
}

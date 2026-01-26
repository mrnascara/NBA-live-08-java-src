package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:r.class */
public final class r {
    private Image t;
    private int[] w = null;
    public int cx = 0;
    public int cy = 0;
    public int cz = 0;

    public r(Image image) {
        this.t = null;
        this.t = image;
    }

    public final void f(DataInputStream dataInputStream) throws IOException {
        dataInputStream.readUnsignedByte();
        this.cx = dataInputStream.readUnsignedByte();
        this.cy = dataInputStream.readUnsignedByte();
        this.cz = dataInputStream.readUnsignedByte();
        this.w = new int[223];
        for (int i = 0; i < 223; i++) {
            this.w[i] = dataInputStream.readInt();
        }
    }

    private static int e(int i) {
        return i & 255;
    }

    private static int f(int i) {
        return (i & 65280) >> 8;
    }

    private static int g(int i) {
        return (i & 4128768) >> 16;
    }

    private static int h(int i) {
        return (i & 130023424) >> 22;
    }

    private static int i(int i) {
        return (i & (-134217728)) >>> 27;
    }

    public final int stringWidth(String str) {
        return substringWidth(str, 0, str.length());
    }

    private int substringWidth(String str, int i, int i2) {
        int iG = 0;
        int i3 = i + i2;
        int length = i3;
        if (i3 > str.length()) {
            length = str.length();
        }
        for (int i4 = i; i4 < length; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt >= '!') {
                int i5 = this.w[cCharAt - '!'];
                if (i5 != -1) {
                    iG += g(i5) + this.cy;
                }
            } else {
                iG += this.cz;
            }
        }
        return iG;
    }

    public final void a(af afVar, String str, int i, int i2) {
        for (int i3 = 0; i3 != str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt >= '!') {
                int i4 = this.w[cCharAt - '!'];
                if (i4 != -1) {
                    afVar.a(this.t, i, i2 + i(i4), g(i4), h(i4), e(i4), f(i4));
                    i += g(i4) + this.cy;
                }
            } else {
                i += this.cz;
            }
        }
    }
}

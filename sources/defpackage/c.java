package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:c.class */
public class c {
    public DataInputStream a;

    /* renamed from: a, reason: collision with other field name */
    private RecordStore f54a;

    /* renamed from: a, reason: collision with other field name */
    private ByteArrayInputStream f55a;

    public c(v vVar) {
    }

    public final DataInputStream a(String str) {
        try {
            this.f54a = RecordStore.openRecordStore(str, false);
            if (this.f54a != null) {
                this.f55a = new ByteArrayInputStream(this.f54a.getRecord(1));
                this.a = new DataInputStream(this.f55a);
            }
        } catch (Exception unused) {
            c();
        }
        return this.a;
    }

    public final void c() {
        if (this.f54a != null) {
            try {
                this.f54a.closeRecordStore();
            } catch (RecordStoreException unused) {
            }
        }
        if (this.a != null) {
            t.a(this.a);
        }
        if (this.f55a != null) {
            t.a(this.f55a);
        }
        this.f55a = null;
        this.a = null;
        this.f54a = null;
    }

    public final byte[] a() {
        if (this.f55a == null) {
            return null;
        }
        byte[] bArr = new byte[this.f55a.available()];
        this.f55a.read(bArr, 0, bArr.length);
        return bArr;
    }
}

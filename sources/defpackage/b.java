package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:b.class */
public class b {
    private DataOutputStream a;

    /* renamed from: a, reason: collision with other field name */
    private RecordStore f52a;

    /* renamed from: a, reason: collision with other field name */
    private ByteArrayOutputStream f53a;

    public b(v vVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final DataOutputStream a(String str, boolean z) {
        byte[] record;
        try {
            this.f52a = RecordStore.openRecordStore(str, z);
            if (this.f52a != null) {
                try {
                    record = this.f52a.getRecord(1);
                } catch (InvalidRecordIDException unused) {
                    record = null;
                }
                int length = record == null ? 0 : record.length;
                if (length > 0) {
                    this.f53a = new ByteArrayOutputStream(length);
                } else {
                    this.f53a = new ByteArrayOutputStream();
                }
                if (record != null) {
                    this.f53a.write(record, 0, length);
                }
                this.a = new DataOutputStream(this.f53a);
            }
        } catch (Exception e) {
            printStackTrace();
            if (this.f52a != null) {
                try {
                    this.f52a.closeRecordStore();
                } catch (RecordStoreException unused2) {
                }
            }
            if (this.a != null) {
                t.a(this.a);
            }
            if (this.f53a != null) {
                t.a(this.f53a);
            }
            this.f53a = null;
            this.a = null;
            this.f52a = null;
        }
        return this.a;
    }

    public final void c() {
        if (this.f52a != null) {
            try {
                String name = this.f52a.getName();
                byte[] byteArray = this.f53a.toByteArray();
                this.f52a.closeRecordStore();
                this.f52a = null;
                RecordStore.deleteRecordStore(name);
                this.f52a = RecordStore.openRecordStore(name, true);
                this.f52a.addRecord(byteArray, 0, byteArray.length);
                try {
                    this.f52a.closeRecordStore();
                } catch (RecordStoreException unused) {
                }
            } catch (RecordStoreException unused2) {
            }
        }
        if (this.a != null) {
            t.a(this.a);
        }
        if (this.f53a != null) {
            t.a(this.f53a);
        }
        this.f53a = null;
        this.a = null;
        this.f52a = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable] */
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f53a != null) {
            byte[] byteArray = this.f53a.toByteArray();
            int length = byteArray.length;
            int i3 = i + i2;
            ?? r0 = i3;
            if (i3 > length) {
                int i4 = length - i;
                i2 = i4;
                r0 = i4;
            }
            try {
                r0 = bArr;
                System.arraycopy(r0, 0, byteArray, i, i2);
            } catch (Exception e) {
                r0.printStackTrace();
            }
            this.f53a.reset();
            this.f53a.write(byteArray, 0, length);
        }
    }
}

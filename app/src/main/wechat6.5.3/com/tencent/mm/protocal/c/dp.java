package com.tencent.mm.protocal.c;

import a.a.a.b;
import com.tencent.mm.ba.a;
import java.util.LinkedList;

public final class dp extends a {
    public are mev;
    public nr mew;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.mev == null) {
                throw new b("Not all required fields were included: AesEncryptKey");
            }
            if (this.mev != null) {
                aVar.dX(2, this.mev.aHr());
                this.mev.a(aVar);
            }
            if (this.mew == null) {
                return 0;
            }
            aVar.dX(3, this.mew.aHr());
            this.mew.a(aVar);
            return 0;
        } else if (i == 1) {
            if (this.mev != null) {
                r0 = a.a.a.a.dU(2, this.mev.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.mew != null) {
                r0 += a.a.a.a.dU(3, this.mew.aHr());
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mev != null) {
                return 0;
            }
            throw new b("Not all required fields were included: AesEncryptKey");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            dp dpVar = (dp) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            byte[] bArr;
            a com_tencent_mm_protocal_c_are;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 2:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        com_tencent_mm_protocal_c_are = new are();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_are.a(aVar4, com_tencent_mm_protocal_c_are, a.a(aVar4))) {
                        }
                        dpVar.mev = com_tencent_mm_protocal_c_are;
                    }
                    return 0;
                case 3:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        com_tencent_mm_protocal_c_are = new nr();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_are.a(aVar4, com_tencent_mm_protocal_c_are, a.a(aVar4))) {
                        }
                        dpVar.mew = com_tencent_mm_protocal_c_are;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}

package AceptaElReto;

 public final class FastScanner {

    private final byte[] BUFFER;
    private int ptr = 0, len = 0;

    FastScanner(java.io.InputStream is) {
        byte[] tmp = new byte[0];
        int totalLen = 0;
        try {
// read all bytes from stdin into buffer once
            java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
            byte[] bufTmp = new byte[1 << 16];
            int r;
            while ((r = is.read(bufTmp)) != -1) {
                baos.write(bufTmp, 0, r);
            }
            tmp = baos.toByteArray();
            totalLen = tmp.length;
        } catch (java.io.IOException e) {
// On IO error, fallback to empty buffer so scanner behaves as EOF
            tmp = new byte[0];
            totalLen = 0;
        }
        this.BUFFER = tmp;
        this.len = totalLen;
        this.ptr = 0;
    }

// Parse next integer, return Integer.MIN_VALUE on EOF (no further IO calls)
    final int nextInt() {
        int localPtr = ptr;
        int localLen = len;
        if (localPtr >= localLen) {
            return Integer.MIN_VALUE;
        }
        int c = BUFFER[localPtr++] & 0xFF;
// skip whitespace
        while (c <= ' ') {
            if (localPtr >= localLen) {
                ptr = localPtr;
                return Integer.MIN_VALUE;
            }
            c = BUFFER[localPtr++] & 0xFF;
        }
        int sign = 1;
        if (c == '-') {
            sign = -1;
            if (localPtr >= localLen) {
                ptr = localPtr;
                return Integer.MIN_VALUE;
            }
            c = BUFFER[localPtr++] & 0xFF;
        }
        int val = 0;
        while (c >= '0' && c <= '9') {
            val = val * 10 + (c - '0');
            if (localPtr >= localLen) {
                ptr = localPtr;
                break;
            }
            c = BUFFER[localPtr++] & 0xFF;
        }
        ptr = localPtr;
        return sign * val;
    }

// Return next token (non-whitespace) or null at EOF
    final String nextToken() {
        int localPtr = ptr;
        int localLen = len;
        if (localPtr >= localLen) {
            return null;
        }
        int c = BUFFER[localPtr] & 0xFF;
// skip whitespace
        while (c <= ' ') {
            localPtr++;
            if (localPtr >= localLen) {
                ptr = localPtr;
                return null;
            }
            c = BUFFER[localPtr] & 0xFF;
        }
        int start = localPtr;
        while (localPtr < localLen && (BUFFER[localPtr] & 0xFF) > ' ') {
            localPtr++;
        }
        int end = localPtr;
        ptr = localPtr;
        return new String(BUFFER, start, end - start, java.nio.charset.StandardCharsets.US_ASCII);
    }

// Return next int as Integer or null at EOF
    final Integer nextIntMaybeEOF() {
        int v = nextInt();
        return v == Integer.MIN_VALUE ? null : Integer.valueOf(v);
    }

// Skip k integer tokens quickly (from buffer)
    final void skipInts(int k) {
        int localPtr = ptr;
        int localLen = len;
        int c;
        for (int t = 0; t < k; t++) {
            if (localPtr >= localLen) {
                ptr = localPtr;
                return;
            }
            c = BUFFER[localPtr++] & 0xFF;
            while (c <= ' ') {
                if (localPtr >= localLen) {
                    ptr = localPtr;
                    return;
                }
                c = BUFFER[localPtr++] & 0xFF;
            }
            if (c == '+' || c == '-') {
                if (localPtr >= localLen) {
                    ptr = localPtr;
                    return;
                }
                c = BUFFER[localPtr++] & 0xFF;
            }
            while (c >= '0' && c <= '9') {
                if (localPtr >= localLen) {
                    localPtr = localLen;
                    break;
                }
                c = BUFFER[localPtr++] & 0xFF;
            }
        }
        ptr = localPtr;
    }

// Process n*n integers and check identity matri
}


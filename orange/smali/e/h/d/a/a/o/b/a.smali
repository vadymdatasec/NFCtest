.class public Le/h/d/a/a/o/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [B

    .line 1
    sput-object v0, Le/h/d/a/a/o/b/a;->a:[B

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 2

    const/4 v0, 0x1

    const-string v1, "AES/CBC/NoPadding"

    .line 1
    invoke-virtual {p0, p1, p2, v0, v1}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;ILjava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;ILjava/lang/String;)Lfr/mbs/binary/Octets;
    .locals 2

    .line 2
    :try_start_0
    invoke-static {p4}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object p4

    .line 3
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toBytes()[B

    move-result-object p1

    const-string v1, "AES"

    invoke-direct {v0, p1, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 4
    new-instance p1, Ljavax/crypto/spec/IvParameterSpec;

    sget-object v1, Le/h/d/a/a/o/b/a;->a:[B

    invoke-direct {p1, v1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    invoke-virtual {p4, p3, v0, p1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 5
    invoke-virtual {p2}, Lfr/mbs/binary/Octets;->toBytes()[B

    move-result-object p1

    invoke-virtual {p4, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    invoke-static {p1}, Lfr/mbs/binary/Octets;->createOctets([B)Lfr/mbs/binary/Octets;

    move-result-object p1
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 6
    new-instance p2, Ljava/lang/RuntimeException;

    const-string p3, "Problem ciphering"

    invoke-direct {p2, p3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 2

    const/4 v0, 0x1

    const-string v1, "AES/CBC/PKCS5Padding"

    .line 1
    invoke-virtual {p0, p1, p2, v0, v1}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;ILjava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method

.method public c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 2

    const/4 v0, 0x2

    const-string v1, "AES/CBC/NoPadding"

    .line 1
    invoke-virtual {p0, p1, p2, v0, v1}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;ILjava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method

.method public d(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 2

    const/4 v0, 0x2

    const-string v1, "AES/CBC/PKCS5Padding"

    .line 1
    invoke-virtual {p0, p1, p2, v0, v1}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;ILjava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method

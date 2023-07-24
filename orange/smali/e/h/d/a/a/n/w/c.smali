.class public Le/h/d/a/a/n/w/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:[B


# instance fields
.field public final a:[B

.field public final b:Le/h/d/a/a/n/w/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [B

    .line 1
    sput-object v0, Le/h/d/a/a/n/w/c;->c:[B

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ZZ)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, 0x17

    const/4 v4, 0x0

    if-lt v0, v3, :cond_3

    :try_start_0
    const-string v0, "AndroidKeyStore"

    .line 3
    invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v0

    .line 4
    invoke-virtual {v0, v4}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p2, :cond_0

    const-string v5, "NFCO"

    goto :goto_0

    :cond_0
    const-string v5, "UNSECURED_NFCO"

    .line 5
    :goto_0
    :try_start_1
    invoke-virtual {v0, v5}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    new-instance v0, Le/h/d/a/a/n/w/e;

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v4, v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-direct {v0, p1, p3, p2, v1}, Le/h/d/a/a/n/w/e;-><init>(Landroid/content/Context;ZZZ)V

    invoke-virtual {v0}, Le/h/d/a/a/n/w/e;->a()[B

    move-result-object p1

    iput-object p1, p0, Le/h/d/a/a/n/w/c;->a:[B

    .line 7
    invoke-static {p2, p1}, Le/h/d/a/a/n/w/a;->a(Z[B)Le/h/d/a/a/n/w/a;

    move-result-object p1

    iput-object p1, p0, Le/h/d/a/a/n/w/c;->b:Le/h/d/a/a/n/w/a;

    goto :goto_4

    .line 8
    :cond_2
    iput-object v4, p0, Le/h/d/a/a/n/w/c;->a:[B

    .line 9
    invoke-static {p2, v4}, Le/h/d/a/a/n/w/a;->a(Z[B)Le/h/d/a/a/n/w/a;

    move-result-object p1

    iput-object p1, p0, Le/h/d/a/a/n/w/c;->b:Le/h/d/a/a/n/w/a;
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    .line 10
    :goto_2
    new-instance p2, Lcom/orange/oab/contactless/packid/g/u/e;

    invoke-direct {p2, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V

    throw p2

    .line 11
    :cond_3
    new-instance v5, Le/h/d/a/a/n/w/e;

    if-ge v0, v3, :cond_4

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    invoke-direct {v5, p1, p3, p2, v1}, Le/h/d/a/a/n/w/e;-><init>(Landroid/content/Context;ZZZ)V

    invoke-virtual {v5}, Le/h/d/a/a/n/w/e;->a()[B

    move-result-object p1

    iput-object p1, p0, Le/h/d/a/a/n/w/c;->a:[B

    .line 12
    iput-object v4, p0, Le/h/d/a/a/n/w/c;->b:Le/h/d/a/a/n/w/a;

    :goto_4
    return-void
.end method

.method public static a(Landroid/content/Context;Z)Le/h/d/a/a/n/w/c;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 1
    new-instance v0, Le/h/d/a/a/n/w/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Le/h/d/a/a/n/w/c;-><init>(Landroid/content/Context;ZZ)V

    return-object v0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    const-string v0, "packid.Encryptor"

    const-string v1, "reset"

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-static {p0}, Le/h/d/a/a/n/w/e;->a(Landroid/content/Context;)V

    .line 4
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x17

    if-lt p0, v0, :cond_0

    .line 5
    invoke-static {}, Le/h/d/a/a/n/w/a;->a()V

    :cond_0
    return-void
.end method

.method public static b(Landroid/content/Context;)Le/h/d/a/a/n/w/c;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-static {p0, v0}, Le/h/d/a/a/n/w/c;->a(Landroid/content/Context;Z)Le/h/d/a/a/n/w/c;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Z)Z
    .locals 3

    const-string v0, "====================="

    .line 2
    :try_start_0
    new-instance v1, Le/h/d/a/a/n/w/c;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Le/h/d/a/a/n/w/c;-><init>(Landroid/content/Context;ZZ)V

    .line 3
    new-instance p1, Le/h/d/a/a/r/a;

    invoke-direct {p1, p0}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Le/h/d/a/a/r/a;->a()V
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/g/u/b; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    :catch_0
    move-exception p1

    .line 4
    invoke-static {p0}, Le/h/d/a/a/n/u;->a(Landroid/content/Context;)V

    .line 5
    new-instance v1, Le/h/d/a/a/r/a;

    invoke-direct {v1, p0}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    sget v2, Le/h/d/a/a/c;->error_security_configuration_modified:I

    invoke-virtual {v1, v2, p1}, Le/h/d/a/a/r/a;->a(ILjava/lang/Exception;)V

    const-string v1, "user deleted by EncryptorException"

    .line 6
    invoke-static {p0, v1}, Lcom/orange/oab/contactless/packid/service/LogManager;->writeToPersistentLog(Landroid/content/Context;Ljava/lang/String;)V

    .line 7
    invoke-static {p0, p1}, Lcom/orange/oab/contactless/packid/service/LogManager;->writeToPersistentLog(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 8
    invoke-static {p0, v0}, Lcom/orange/oab/contactless/packid/service/LogManager;->writeToPersistentLog(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception p1

    .line 9
    invoke-static {p0}, Le/h/d/a/a/n/u;->a(Landroid/content/Context;)V

    .line 10
    new-instance v1, Le/h/d/a/a/r/a;

    invoke-direct {v1, p0}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    sget v2, Le/h/d/a/a/c;->security_policy_not_satisfied:I

    invoke-virtual {v1, v2, p1}, Le/h/d/a/a/r/a;->a(ILjava/lang/Exception;)V

    const-string v1, "user deleted by AndroidKeystoreNotSecuredException"

    .line 11
    invoke-static {p0, v1}, Lcom/orange/oab/contactless/packid/service/LogManager;->writeToPersistentLog(Landroid/content/Context;Ljava/lang/String;)V

    .line 12
    invoke-static {p0, p1}, Lcom/orange/oab/contactless/packid/service/LogManager;->writeToPersistentLog(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 13
    invoke-static {p0, v0}, Lcom/orange/oab/contactless/packid/service/LogManager;->writeToPersistentLog(Landroid/content/Context;Ljava/lang/String;)V

    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static c(Landroid/content/Context;)Le/h/d/a/a/n/w/c;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0}, Le/h/d/a/a/n/w/c;->a(Landroid/content/Context;Z)Le/h/d/a/a/n/w/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 6
    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toBytes()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Le/h/d/a/a/n/w/c;->a([B)[B

    move-result-object p1

    invoke-static {p1}, Lfr/mbs/binary/Octets;->createOctets([B)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method

.method public a([B)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    const-string v0, "packid.Encryptor"

    .line 7
    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-lt v1, v2, :cond_0

    iget-object v1, p0, Le/h/d/a/a/n/w/c;->b:Le/h/d/a/a/n/w/a;

    if-eqz v1, :cond_0

    const-string v1, "Using new cypher"

    .line 8
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    iget-object v1, p0, Le/h/d/a/a/n/w/c;->b:Le/h/d/a/a/n/w/a;

    invoke-virtual {v1, p1}, Le/h/d/a/a/n/w/a;->a([B)[B

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v1, 0x1

    .line 10
    invoke-virtual {p0, p1, v1}, Le/h/d/a/a/n/w/c;->a([BI)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v1, "Ciphering exception"

    .line 11
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 12
    new-instance v0, Lcom/orange/oab/contactless/packid/g/u/e;

    invoke-direct {v0, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V

    throw v0
.end method

.method public final a([BI)[B
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 13
    new-instance v0, Ljavax/crypto/spec/IvParameterSpec;

    sget-object v1, Le/h/d/a/a/n/w/c;->c:[B

    invoke-direct {v0, v1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    const-string v1, "AES/CBC/PKCS5Padding"

    .line 14
    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v1

    .line 15
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    iget-object v3, p0, Le/h/d/a/a/n/w/c;->a:[B

    const-string v4, "AES"

    invoke-direct {v2, v3, v4}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 16
    invoke-virtual {v1, p2, v2, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 17
    invoke-virtual {v1, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    return-object p1
.end method

.method public b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 14
    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toBytes()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Le/h/d/a/a/n/w/c;->b([B)[B

    move-result-object p1

    invoke-static {p1}, Lfr/mbs/binary/Octets;->createOctets([B)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method

.method public b([B)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    const-string v0, "packid.Encryptor"

    .line 15
    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-lt v1, v2, :cond_0

    iget-object v1, p0, Le/h/d/a/a/n/w/c;->b:Le/h/d/a/a/n/w/a;

    if-eqz v1, :cond_0

    const-string v1, "Using new cypher"

    .line 16
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    iget-object v1, p0, Le/h/d/a/a/n/w/c;->b:Le/h/d/a/a/n/w/a;

    invoke-virtual {v1, p1}, Le/h/d/a/a/n/w/a;->b([B)[B

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v1, 0x2

    .line 18
    invoke-virtual {p0, p1, v1}, Le/h/d/a/a/n/w/c;->a([BI)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v1, "Unciphering exception"

    .line 19
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 20
    new-instance v0, Lcom/orange/oab/contactless/packid/g/u/e;

    invoke-direct {v0, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V

    throw v0
.end method

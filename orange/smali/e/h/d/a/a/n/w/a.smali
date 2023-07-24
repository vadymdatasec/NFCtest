.class public Le/h/d/a/a/n/w/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:[B


# instance fields
.field public a:Ljava/security/KeyStore;

.field public b:Ljava/security/KeyStore$SecretKeyEntry;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [B

    .line 1
    sput-object v0, Le/h/d/a/a/n/w/a;->c:[B

    return-void
.end method

.method public constructor <init>(Ljava/security/KeyStore;Ljava/lang/String;[B)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/n/w/a;->a:Ljava/security/KeyStore;

    .line 3
    :try_start_0
    invoke-static {}, Le/h/d/a/a/n/w/d;->c()Le/h/d/a/a/n/w/d;

    move-result-object p1

    iget-object v0, p0, Le/h/d/a/a/n/w/a;->a:Ljava/security/KeyStore;

    invoke-virtual {p1, v0, p2, p3}, Le/h/d/a/a/n/w/d;->a(Ljava/security/KeyStore;Ljava/lang/String;[B)Ljava/security/KeyStore$SecretKeyEntry;

    move-result-object p1

    iput-object p1, p0, Le/h/d/a/a/n/w/a;->b:Ljava/security/KeyStore$SecretKeyEntry;
    :try_end_0
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/UnrecoverableEntryException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    goto :goto_0

    :catch_3
    move-exception p1

    .line 4
    :goto_0
    new-instance p2, Lcom/orange/oab/contactless/packid/g/u/e;

    invoke-direct {p2, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V

    throw p2
.end method

.method public static a(Z[B)Le/h/d/a/a/n/w/a;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    if-eqz p0, :cond_0

    const-string p0, "PACKID"

    goto :goto_0

    :cond_0
    const-string p0, "UNSECURED_PACKID"

    .line 1
    :goto_0
    :try_start_0
    invoke-static {}, Le/h/d/a/a/n/w/d;->c()Le/h/d/a/a/n/w/d;

    move-result-object v0

    invoke-virtual {v0}, Le/h/d/a/a/n/w/d;->a()Ljava/security/KeyStore;

    move-result-object v0

    .line 2
    new-instance v1, Le/h/d/a/a/n/w/a;

    invoke-direct {v1, v0, p0, p1}, Le/h/d/a/a/n/w/a;-><init>(Ljava/security/KeyStore;Ljava/lang/String;[B)V
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    .line 3
    :goto_1
    new-instance p1, Lcom/orange/oab/contactless/packid/g/u/e;

    invoke-direct {p1, p0}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V

    throw p1
.end method

.method public static a()V
    .locals 3

    const-string v0, "packid.AESEncryptor"

    :try_start_0
    const-string v1, "reset AES keys"

    .line 9
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    invoke-static {}, Le/h/d/a/a/n/w/d;->c()Le/h/d/a/a/n/w/d;

    move-result-object v1

    invoke-virtual {v1}, Le/h/d/a/a/n/w/d;->b()V
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    :goto_0
    const-string v2, "Fail to reset SecretKeyRepository"

    .line 11
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    return-void
.end method


# virtual methods
.method public a([B)[B
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    :try_start_0
    const-string v0, "AES/CBC/PKCS7Padding"

    .line 4
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    const/4 v1, 0x1

    .line 5
    iget-object v2, p0, Le/h/d/a/a/n/w/a;->b:Ljava/security/KeyStore$SecretKeyEntry;

    invoke-virtual {v2}, Ljava/security/KeyStore$SecretKeyEntry;->getSecretKey()Ljavax/crypto/SecretKey;

    move-result-object v2

    new-instance v3, Ljavax/crypto/spec/IvParameterSpec;

    sget-object v4, Le/h/d/a/a/n/w/a;->c:[B

    invoke-direct {v3, v4}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    invoke-virtual {v0, v1, v2, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 6
    invoke-virtual {v0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v0, "packid.AESEncryptor"

    const-string v1, "Ciphering exception"

    .line 7
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 8
    new-instance v0, Lcom/orange/oab/contactless/packid/g/u/e;

    invoke-direct {v0, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V

    throw v0
.end method

.method public b([B)[B
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    :try_start_0
    const-string v0, "AES/CBC/PKCS7Padding"

    .line 1
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    const/4 v1, 0x2

    .line 2
    iget-object v2, p0, Le/h/d/a/a/n/w/a;->b:Ljava/security/KeyStore$SecretKeyEntry;

    invoke-virtual {v2}, Ljava/security/KeyStore$SecretKeyEntry;->getSecretKey()Ljavax/crypto/SecretKey;

    move-result-object v2

    new-instance v3, Ljavax/crypto/spec/IvParameterSpec;

    sget-object v4, Le/h/d/a/a/n/w/a;->c:[B

    invoke-direct {v3, v4}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    invoke-virtual {v0, v1, v2, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 3
    invoke-virtual {v0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v0, "packid.AESEncryptor"

    const-string v1, "Unciphering exception"

    .line 4
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 5
    new-instance v0, Lcom/orange/oab/contactless/packid/g/u/e;

    invoke-direct {v0, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V

    throw v0
.end method
